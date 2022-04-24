//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link List}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableList.builder()}.
 */
@org.immutables.value.Generated(from = "List", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableList implements com.fhir.List {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.Reference source;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept orderedBy;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept emptyReason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.List_Entry> entry;
  private final @javax.annotation.Nullable com.fhir.ListMode mode;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.ListStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;

  private ImmutableList(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.Reference source,
      @javax.annotation.Nullable com.fhir.CodeableConcept orderedBy,
      @javax.annotation.Nullable com.fhir.CodeableConcept emptyReason,
      @javax.annotation.Nullable java.util.List<com.fhir.List_Entry> entry,
      @javax.annotation.Nullable com.fhir.ListMode mode,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.ListStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.uri implicitRules) {
    this.modifierExtension = modifierExtension;
    this.text = text;
    this.code = code;
    this.encounter = encounter;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.id = id;
    this.subject = subject;
    this.source = source;
    this.orderedBy = orderedBy;
    this.emptyReason = emptyReason;
    this.entry = entry;
    this.mode = mode;
    this.title = title;
    this.date = date;
    this.extension = extension;
    this.language = language;
    this.status = status;
    this.note = note;
    this.meta = meta;
    this.contained = contained;
    this.implicitRules = implicitRules;
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<com.fhir.Reference> source() {
    return java.util.Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code orderedBy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("orderedBy")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> orderedBy() {
    return java.util.Optional.ofNullable(orderedBy);
  }

  /**
   * @return The value of the {@code emptyReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("emptyReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> emptyReason() {
    return java.util.Optional.ofNullable(emptyReason);
  }

  /**
   * @return The value of the {@code entry} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("entry")
  @Override
  public java.util.Optional<java.util.List<com.fhir.List_Entry>> entry() {
    return java.util.Optional.ofNullable(entry);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mode")
  @Override
  public java.util.Optional<com.fhir.ListMode> mode() {
    return java.util.Optional.ofNullable(mode);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ListStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableList(
        newValue,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableList(
        value,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        newValue,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        value,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        newValue,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        value,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        newValue,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        value,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link List#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableList withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        newValue,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        newValue,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        value,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        newValue,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        value,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        newValue,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        value,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withSource(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        newValue,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withSource(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        value,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#orderedBy() orderedBy} attribute.
   * @param value The value for orderedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withOrderedBy(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "orderedBy");
    if (this.orderedBy == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        newValue,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#orderedBy() orderedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withOrderedBy(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.orderedBy == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        value,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#emptyReason() emptyReason} attribute.
   * @param value The value for emptyReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withEmptyReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "emptyReason");
    if (this.emptyReason == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        newValue,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#emptyReason() emptyReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for emptyReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withEmptyReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.emptyReason == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        value,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#entry() entry} attribute.
   * @param value The value for entry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withEntry(java.util.List<com.fhir.List_Entry> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.List_Entry> newValue = java.util.Objects.requireNonNull(value, "entry");
    if (this.entry == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        newValue,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#entry() entry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withEntry(java.util.Optional<? extends java.util.List<com.fhir.List_Entry>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.List_Entry> value = optional.orElse(null);
    if (this.entry == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        value,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withMode(com.fhir.ListMode value) {
    @javax.annotation.Nullable com.fhir.ListMode newValue = java.util.Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        newValue,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withMode(java.util.Optional<? extends com.fhir.ListMode> optional) {
    @javax.annotation.Nullable com.fhir.ListMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        value,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        newValue,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        value,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        newValue,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        value,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        newValue,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        value,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        newValue,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        value,
        this.status,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withStatus(com.fhir.ListStatus value) {
    @javax.annotation.Nullable com.fhir.ListStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        newValue,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withStatus(java.util.Optional<? extends com.fhir.ListStatus> optional) {
    @javax.annotation.Nullable com.fhir.ListStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        value,
        this.note,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        newValue,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        value,
        this.meta,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        newValue,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        value,
        this.contained,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        value,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link List#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableList withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link List#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableList withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableList(
        this.modifierExtension,
        this.text,
        this.code,
        this.encounter,
        this.resourceType,
        this.identifier,
        this.id,
        this.subject,
        this.source,
        this.orderedBy,
        this.emptyReason,
        this.entry,
        this.mode,
        this.title,
        this.date,
        this.extension,
        this.language,
        this.status,
        this.note,
        this.meta,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableList} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableList
        && equalTo((ImmutableList) another);
  }

  private boolean equalTo(ImmutableList another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(encounter, another.encounter)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(orderedBy, another.orderedBy)
        && java.util.Objects.equals(emptyReason, another.emptyReason)
        && java.util.Objects.equals(entry, another.entry)
        && java.util.Objects.equals(mode, another.mode)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code text}, {@code code}, {@code encounter}, {@code resourceType}, {@code identifier}, {@code id}, {@code subject}, {@code source}, {@code orderedBy}, {@code emptyReason}, {@code entry}, {@code mode}, {@code title}, {@code date}, {@code extension}, {@code language}, {@code status}, {@code note}, {@code meta}, {@code contained}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(orderedBy);
    h += (h << 5) + java.util.Objects.hashCode(emptyReason);
    h += (h << 5) + java.util.Objects.hashCode(entry);
    h += (h << 5) + java.util.Objects.hashCode(mode);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code List} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("List{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (text != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (code != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (encounter != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    if (orderedBy != null) {
      builder.append(", ");
      builder.append("orderedBy=").append(orderedBy);
    }
    if (emptyReason != null) {
      builder.append(", ");
      builder.append("emptyReason=").append(emptyReason);
    }
    if (entry != null) {
      builder.append(", ");
      builder.append("entry=").append(entry);
    }
    if (mode != null) {
      builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "List", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.List {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> orderedBy = java.util.Optional.empty();
    boolean orderedByIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> emptyReason = java.util.Optional.empty();
    boolean emptyReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.List_Entry>> entry = java.util.Optional.empty();
    boolean entryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ListMode> mode = java.util.Optional.empty();
    boolean modeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ListStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<com.fhir.Reference> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("orderedBy")
    public void setOrderedBy(java.util.Optional<com.fhir.CodeableConcept> orderedBy) {
      this.orderedBy = orderedBy;
      this.orderedByIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("emptyReason")
    public void setEmptyReason(java.util.Optional<com.fhir.CodeableConcept> emptyReason) {
      this.emptyReason = emptyReason;
      this.emptyReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("entry")
    public void setEntry(java.util.Optional<java.util.List<com.fhir.List_Entry>> entry) {
      this.entry = entry;
      this.entryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public void setMode(java.util.Optional<com.fhir.ListMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ListStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> orderedBy() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> emptyReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.List_Entry>> entry() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ListMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ListStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableList fromJson(Json json) {
    ImmutableList.Builder builder = ((ImmutableList.Builder) ImmutableList.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
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
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.orderedByIsSet) {
      builder.orderedBy(json.orderedBy);
    }
    if (json.emptyReasonIsSet) {
      builder.emptyReason(json.emptyReason);
    }
    if (json.entryIsSet) {
      builder.entry(json.entry);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableList) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link List} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable List instance
   */
  public static List copyOf(List instance) {
    if (instance instanceof ImmutableList) {
      return (ImmutableList) instance;
    }
    return ((ImmutableList.Builder) ImmutableList.builder())
        .modifierExtension(instance.modifierExtension())
        .text(instance.text())
        .code(instance.code())
        .encounter(instance.encounter())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .id(instance.id())
        .subject(instance.subject())
        .source(instance.source())
        .orderedBy(instance.orderedBy())
        .emptyReason(instance.emptyReason())
        .entry(instance.entry())
        .mode(instance.mode())
        .title(instance.title())
        .date(instance.date())
        .extension(instance.extension())
        .language(instance.language())
        .status(instance.status())
        .note(instance.note())
        .meta(instance.meta())
        .contained(instance.contained())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link List List}.
   * <pre>
   * ImmutableList.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link List#modifierExtension() modifierExtension}
   *    .text(com.fhir.Narrative) // optional {@link List#text() text}
   *    .code(com.fhir.CodeableConcept) // optional {@link List#code() code}
   *    .encounter(com.fhir.Reference) // optional {@link List#encounter() encounter}
   *    .resourceType(String) // required {@link List#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link List#identifier() identifier}
   *    .id(com.fhir.id) // optional {@link List#id() id}
   *    .subject(com.fhir.Reference) // optional {@link List#subject() subject}
   *    .source(com.fhir.Reference) // optional {@link List#source() source}
   *    .orderedBy(com.fhir.CodeableConcept) // optional {@link List#orderedBy() orderedBy}
   *    .emptyReason(com.fhir.CodeableConcept) // optional {@link List#emptyReason() emptyReason}
   *    .entry(List&amp;lt;com.fhir.List_Entry&amp;gt;) // optional {@link List#entry() entry}
   *    .mode(com.fhir.ListMode) // optional {@link List#mode() mode}
   *    .title(String) // optional {@link List#title() title}
   *    .date(com.fhir.dateTime) // optional {@link List#date() date}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link List#extension() extension}
   *    .language(com.fhir.code) // optional {@link List#language() language}
   *    .status(com.fhir.ListStatus) // optional {@link List#status() status}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link List#note() note}
   *    .meta(com.fhir.Meta) // optional {@link List#meta() meta}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link List#contained() contained}
   *    .implicitRules(com.fhir.uri) // optional {@link List#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new List builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableList.Builder();
  }

  /**
   * Builds instances of type {@link List List}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "List", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_ENCOUNTER = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_SUBJECT = 0x40L;
    private static final long OPT_BIT_SOURCE = 0x80L;
    private static final long OPT_BIT_ORDERED_BY = 0x100L;
    private static final long OPT_BIT_EMPTY_REASON = 0x200L;
    private static final long OPT_BIT_ENTRY = 0x400L;
    private static final long OPT_BIT_MODE = 0x800L;
    private static final long OPT_BIT_TITLE = 0x1000L;
    private static final long OPT_BIT_DATE = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_NOTE = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private static final long OPT_BIT_CONTAINED = 0x80000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.Reference source;
    private @javax.annotation.Nullable com.fhir.CodeableConcept orderedBy;
    private @javax.annotation.Nullable com.fhir.CodeableConcept emptyReason;
    private @javax.annotation.Nullable java.util.List<com.fhir.List_Entry> entry;
    private @javax.annotation.Nullable com.fhir.ListMode mode;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.ListStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link List#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link List#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link List#text() text} to text.
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
     * Initializes the optional value {@link List#text() text} to text.
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
     * Initializes the optional value {@link List#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link List#encounter() encounter} to encounter.
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
     * Initializes the value for the {@link List#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link List#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link List#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link List#id() id} to id.
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
     * Initializes the optional value {@link List#id() id} to id.
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
     * Initializes the optional value {@link List#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link List#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link List#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(com.fhir.Reference source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends com.fhir.Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder orderedBy(com.fhir.CodeableConcept orderedBy) {
      checkNotIsSet(orderedByIsSet(), "orderedBy");
      this.orderedBy = java.util.Objects.requireNonNull(orderedBy, "orderedBy");
      optBits |= OPT_BIT_ORDERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link List#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderedBy")
    public final Builder orderedBy(java.util.Optional<? extends com.fhir.CodeableConcept> orderedBy) {
      checkNotIsSet(orderedByIsSet(), "orderedBy");
      this.orderedBy = orderedBy.orElse(null);
      optBits |= OPT_BIT_ORDERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link List#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder emptyReason(com.fhir.CodeableConcept emptyReason) {
      checkNotIsSet(emptyReasonIsSet(), "emptyReason");
      this.emptyReason = java.util.Objects.requireNonNull(emptyReason, "emptyReason");
      optBits |= OPT_BIT_EMPTY_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link List#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emptyReason")
    public final Builder emptyReason(java.util.Optional<? extends com.fhir.CodeableConcept> emptyReason) {
      checkNotIsSet(emptyReasonIsSet(), "emptyReason");
      this.emptyReason = emptyReason.orElse(null);
      optBits |= OPT_BIT_EMPTY_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link List#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    public final Builder entry(java.util.List<com.fhir.List_Entry> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = java.util.Objects.requireNonNull(entry, "entry");
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link List#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entry")
    public final Builder entry(java.util.Optional<? extends java.util.List<com.fhir.List_Entry>> entry) {
      checkNotIsSet(entryIsSet(), "entry");
      this.entry = entry.orElse(null);
      optBits |= OPT_BIT_ENTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link List#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(com.fhir.ListMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = java.util.Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public final Builder mode(java.util.Optional<? extends com.fhir.ListMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(java.lang.String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = java.util.Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public final Builder title(java.util.Optional<java.lang.String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#extension() extension} to extension.
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
     * Initializes the optional value {@link List#extension() extension} to extension.
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
     * Initializes the optional value {@link List#language() language} to language.
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
     * Initializes the optional value {@link List#language() language} to language.
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
     * Initializes the optional value {@link List#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ListStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link List#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ListStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link List#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link List#meta() meta} to meta.
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
     * Initializes the optional value {@link List#meta() meta} to meta.
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
     * Initializes the optional value {@link List#contained() contained} to contained.
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
     * Initializes the optional value {@link List#contained() contained} to contained.
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
     * Initializes the optional value {@link List#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link List#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link List List}.
     * @return An immutable instance of List
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.List build() {
      checkRequiredAttributes();
      return new ImmutableList(
          modifierExtension,
          text,
          code,
          encounter,
          resourceType,
          identifier,
          id,
          subject,
          source,
          orderedBy,
          emptyReason,
          entry,
          mode,
          title,
          date,
          extension,
          language,
          status,
          note,
          meta,
          contained,
          implicitRules);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean orderedByIsSet() {
      return (optBits & OPT_BIT_ORDERED_BY) != 0;
    }

    private boolean emptyReasonIsSet() {
      return (optBits & OPT_BIT_EMPTY_REASON) != 0;
    }

    private boolean entryIsSet() {
      return (optBits & OPT_BIT_ENTRY) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of List is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build List, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "List", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link List#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "List", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link List#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link List#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link List#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link List#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link List#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link List#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link List#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link List#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link List#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link List#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link List#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link List#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link List#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link List#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link List#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(com.fhir.Reference source);

    /**
     * Initializes the optional value {@link List#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(java.util.Optional<? extends com.fhir.Reference> source);

    /**
     * Initializes the optional value {@link List#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal orderedBy(com.fhir.CodeableConcept orderedBy);

    /**
     * Initializes the optional value {@link List#orderedBy() orderedBy} to orderedBy.
     * @param orderedBy The value for orderedBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal orderedBy(java.util.Optional<? extends com.fhir.CodeableConcept> orderedBy);

    /**
     * Initializes the optional value {@link List#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal emptyReason(com.fhir.CodeableConcept emptyReason);

    /**
     * Initializes the optional value {@link List#emptyReason() emptyReason} to emptyReason.
     * @param emptyReason The value for emptyReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal emptyReason(java.util.Optional<? extends com.fhir.CodeableConcept> emptyReason);

    /**
     * Initializes the optional value {@link List#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for chained invocation
     */
    BuildFinal entry(java.util.List<com.fhir.List_Entry> entry);

    /**
     * Initializes the optional value {@link List#entry() entry} to entry.
     * @param entry The value for entry
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal entry(java.util.Optional<? extends java.util.List<com.fhir.List_Entry>> entry);

    /**
     * Initializes the optional value {@link List#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mode(com.fhir.ListMode mode);

    /**
     * Initializes the optional value {@link List#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mode(java.util.Optional<? extends com.fhir.ListMode> mode);

    /**
     * Initializes the optional value {@link List#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link List#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link List#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link List#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link List#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link List#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link List#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link List#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link List#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ListStatus status);

    /**
     * Initializes the optional value {@link List#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ListStatus> status);

    /**
     * Initializes the optional value {@link List#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link List#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link List#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link List#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link List#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link List#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link List#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link List#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Builds a new {@link List List}.
     * @return An immutable instance of List
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    List build();
  }
}
