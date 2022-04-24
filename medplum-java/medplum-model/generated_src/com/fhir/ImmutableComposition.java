//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Composition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComposition.builder()}.
 */
@org.immutables.value.Generated(from = "Composition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableComposition implements com.fhir.Composition {
  private final com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> section;
  private final @javax.annotation.Nullable com.fhir.Reference custodian;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Composition_RelatesTo> relatesTo;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Composition_Event> event;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CompositionStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Composition_Attester> attester;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.code confidentiality;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final java.util.List<com.fhir.Reference> author;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;

  private ImmutableComposition(
      com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> section,
      @javax.annotation.Nullable com.fhir.Reference custodian,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.util.List<com.fhir.Composition_RelatesTo> relatesTo,
      @javax.annotation.Nullable java.util.List<com.fhir.Composition_Event> event,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CompositionStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.Composition_Attester> attester,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.code confidentiality,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      java.util.List<com.fhir.Reference> author,
      @javax.annotation.Nullable com.fhir.uri implicitRules) {
    this.type = type;
    this.section = section;
    this.custodian = custodian;
    this.encounter = encounter;
    this.extension = extension;
    this.category = category;
    this.relatesTo = relatesTo;
    this.event = event;
    this.meta = meta;
    this.status = status;
    this.contained = contained;
    this.title = title;
    this.attester = attester;
    this.subject = subject;
    this.date = date;
    this.confidentiality = confidentiality;
    this.language = language;
    this.id = id;
    this.text = text;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
    this.author = author;
    this.implicitRules = implicitRules;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public com.fhir.CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code section} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("section")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Composition_Section>> section() {
    return java.util.Optional.ofNullable(section);
  }

  /**
   * @return The value of the {@code custodian} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("custodian")
  @Override
  public java.util.Optional<com.fhir.Reference> custodian() {
    return java.util.Optional.ofNullable(custodian);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code relatesTo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatesTo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Composition_RelatesTo>> relatesTo() {
    return java.util.Optional.ofNullable(relatesTo);
  }

  /**
   * @return The value of the {@code event} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("event")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Composition_Event>> event() {
    return java.util.Optional.ofNullable(event);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.CompositionStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code attester} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("attester")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Composition_Attester>> attester() {
    return java.util.Optional.ofNullable(attester);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code confidentiality} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("confidentiality")
  @Override
  public java.util.Optional<com.fhir.code> confidentiality() {
    return java.util.Optional.ofNullable(confidentiality);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.List<com.fhir.Reference> author() {
    return author;
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
   * Copy the current immutable object by setting a value for the {@link Composition#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableComposition withType(com.fhir.CodeableConcept value) {
    if (this.type == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutableComposition(
        newValue,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#section() section} attribute.
   * @param value The value for section
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withSection(java.util.List<com.fhir.Composition_Section> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> newValue = java.util.Objects.requireNonNull(value, "section");
    if (this.section == newValue) return this;
    return new ImmutableComposition(
        this.type,
        newValue,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#section() section} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for section
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withSection(java.util.Optional<? extends java.util.List<com.fhir.Composition_Section>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> value = optional.orElse(null);
    if (this.section == value) return this;
    return new ImmutableComposition(
        this.type,
        value,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#custodian() custodian} attribute.
   * @param value The value for custodian
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withCustodian(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "custodian");
    if (this.custodian == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        newValue,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#custodian() custodian} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for custodian
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withCustodian(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.custodian == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        value,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        newValue,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        value,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        newValue,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        value,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        newValue,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        value,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#relatesTo() relatesTo} attribute.
   * @param value The value for relatesTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withRelatesTo(java.util.List<com.fhir.Composition_RelatesTo> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_RelatesTo> newValue = java.util.Objects.requireNonNull(value, "relatesTo");
    if (this.relatesTo == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        newValue,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#relatesTo() relatesTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatesTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withRelatesTo(java.util.Optional<? extends java.util.List<com.fhir.Composition_RelatesTo>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_RelatesTo> value = optional.orElse(null);
    if (this.relatesTo == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        value,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#event() event} attribute.
   * @param value The value for event
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withEvent(java.util.List<com.fhir.Composition_Event> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_Event> newValue = java.util.Objects.requireNonNull(value, "event");
    if (this.event == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        newValue,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#event() event} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for event
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withEvent(java.util.Optional<? extends java.util.List<com.fhir.Composition_Event>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_Event> value = optional.orElse(null);
    if (this.event == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        value,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        newValue,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        value,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withStatus(com.fhir.CompositionStatus value) {
    @javax.annotation.Nullable com.fhir.CompositionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        newValue,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withStatus(java.util.Optional<? extends com.fhir.CompositionStatus> optional) {
    @javax.annotation.Nullable com.fhir.CompositionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        value,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        newValue,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        value,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        newValue,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        value,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#attester() attester} attribute.
   * @param value The value for attester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withAttester(java.util.List<com.fhir.Composition_Attester> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_Attester> newValue = java.util.Objects.requireNonNull(value, "attester");
    if (this.attester == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        newValue,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#attester() attester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withAttester(java.util.Optional<? extends java.util.List<com.fhir.Composition_Attester>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Composition_Attester> value = optional.orElse(null);
    if (this.attester == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        value,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        newValue,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        value,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        newValue,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        value,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#confidentiality() confidentiality} attribute.
   * @param value The value for confidentiality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withConfidentiality(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "confidentiality");
    if (this.confidentiality == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        newValue,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#confidentiality() confidentiality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for confidentiality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withConfidentiality(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.confidentiality == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        value,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        newValue,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        value,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        newValue,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        value,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        newValue,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        value,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Composition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableComposition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        newValue,
        this.modifierExtension,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        newValue,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        value,
        this.identifier,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        newValue,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        value,
        this.author,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Composition#author() author}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withAuthor(com.fhir.Reference... elements) {
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Composition#author() author}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of author elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withAuthor(Iterable<? extends com.fhir.Reference> elements) {
    if (this.author == elements) return this;
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableComposition(
        this.type,
        this.section,
        this.custodian,
        this.encounter,
        this.extension,
        this.category,
        this.relatesTo,
        this.event,
        this.meta,
        this.status,
        this.contained,
        this.title,
        this.attester,
        this.subject,
        this.date,
        this.confidentiality,
        this.language,
        this.id,
        this.text,
        this.resourceType,
        this.modifierExtension,
        this.identifier,
        this.author,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComposition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComposition
        && equalTo((ImmutableComposition) another);
  }

  private boolean equalTo(ImmutableComposition another) {
    return type.equals(another.type)
        && java.util.Objects.equals(section, another.section)
        && java.util.Objects.equals(custodian, another.custodian)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(relatesTo, another.relatesTo)
        && java.util.Objects.equals(event, another.event)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(attester, another.attester)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(confidentiality, another.confidentiality)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(identifier, another.identifier)
        && author.equals(another.author)
        && java.util.Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code section}, {@code custodian}, {@code encounter}, {@code extension}, {@code category}, {@code relatesTo}, {@code event}, {@code meta}, {@code status}, {@code contained}, {@code title}, {@code attester}, {@code subject}, {@code date}, {@code confidentiality}, {@code language}, {@code id}, {@code text}, {@code resourceType}, {@code modifierExtension}, {@code identifier}, {@code author}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(section);
    h += (h << 5) + java.util.Objects.hashCode(custodian);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(relatesTo);
    h += (h << 5) + java.util.Objects.hashCode(event);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(attester);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(confidentiality);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + author.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code Composition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Composition{");
    builder.append("type=").append(type);
    if (section != null) {
      builder.append(", ");
      builder.append("section=").append(section);
    }
    if (custodian != null) {
      builder.append(", ");
      builder.append("custodian=").append(custodian);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (relatesTo != null) {
      builder.append(", ");
      builder.append("relatesTo=").append(relatesTo);
    }
    if (event != null) {
      builder.append(", ");
      builder.append("event=").append(event);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (attester != null) {
      builder.append(", ");
      builder.append("attester=").append(attester);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (confidentiality != null) {
      builder.append(", ");
      builder.append("confidentiality=").append(confidentiality);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("author=").append(author);
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
  @org.immutables.value.Generated(from = "Composition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Composition {
    @javax.annotation.Nullable com.fhir.CodeableConcept type;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Composition_Section>> section = java.util.Optional.empty();
    boolean sectionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> custodian = java.util.Optional.empty();
    boolean custodianIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Composition_RelatesTo>> relatesTo = java.util.Optional.empty();
    boolean relatesToIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Composition_Event>> event = java.util.Optional.empty();
    boolean eventIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CompositionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Composition_Attester>> attester = java.util.Optional.empty();
    boolean attesterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> confidentiality = java.util.Optional.empty();
    boolean confidentialityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> author = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.CodeableConcept type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("section")
    public void setSection(java.util.Optional<java.util.List<com.fhir.Composition_Section>> section) {
      this.section = section;
      this.sectionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("custodian")
    public void setCustodian(java.util.Optional<com.fhir.Reference> custodian) {
      this.custodian = custodian;
      this.custodianIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatesTo")
    public void setRelatesTo(java.util.Optional<java.util.List<com.fhir.Composition_RelatesTo>> relatesTo) {
      this.relatesTo = relatesTo;
      this.relatesToIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("event")
    public void setEvent(java.util.Optional<java.util.List<com.fhir.Composition_Event>> event) {
      this.event = event;
      this.eventIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CompositionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("attester")
    public void setAttester(java.util.Optional<java.util.List<com.fhir.Composition_Attester>> attester) {
      this.attester = attester;
      this.attesterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("confidentiality")
    public void setConfidentiality(java.util.Optional<com.fhir.code> confidentiality) {
      this.confidentiality = confidentiality;
      this.confidentialityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.List<com.fhir.Reference> author) {
      this.author = author;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public com.fhir.CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Composition_Section>> section() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> custodian() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Composition_RelatesTo>> relatesTo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Composition_Event>> event() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CompositionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Composition_Attester>> attester() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> confidentiality() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
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
  static ImmutableComposition fromJson(Json json) {
    ImmutableComposition.Builder builder = ((ImmutableComposition.Builder) ImmutableComposition.builder());
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.sectionIsSet) {
      builder.section(json.section);
    }
    if (json.custodianIsSet) {
      builder.custodian(json.custodian);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.relatesToIsSet) {
      builder.relatesTo(json.relatesTo);
    }
    if (json.eventIsSet) {
      builder.event(json.event);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.attesterIsSet) {
      builder.attester(json.attester);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.confidentialityIsSet) {
      builder.confidentiality(json.confidentiality);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.author != null) {
      builder.addAllAuthor(json.author);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableComposition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Composition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Composition instance
   */
  public static Composition copyOf(Composition instance) {
    if (instance instanceof ImmutableComposition) {
      return (ImmutableComposition) instance;
    }
    return ((ImmutableComposition.Builder) ImmutableComposition.builder())
        .type(instance.type())
        .section(instance.section())
        .custodian(instance.custodian())
        .encounter(instance.encounter())
        .extension(instance.extension())
        .category(instance.category())
        .relatesTo(instance.relatesTo())
        .event(instance.event())
        .meta(instance.meta())
        .status(instance.status())
        .contained(instance.contained())
        .title(instance.title())
        .attester(instance.attester())
        .subject(instance.subject())
        .date(instance.date())
        .confidentiality(instance.confidentiality())
        .language(instance.language())
        .id(instance.id())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .addAllAuthor(instance.author())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link Composition Composition}.
   * <pre>
   * ImmutableComposition.builder()
   *    .type(com.fhir.CodeableConcept) // required {@link Composition#type() type}
   *    .section(List&amp;lt;com.fhir.Composition_Section&amp;gt;) // optional {@link Composition#section() section}
   *    .custodian(com.fhir.Reference) // optional {@link Composition#custodian() custodian}
   *    .encounter(com.fhir.Reference) // optional {@link Composition#encounter() encounter}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Composition#extension() extension}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Composition#category() category}
   *    .relatesTo(List&amp;lt;com.fhir.Composition_RelatesTo&amp;gt;) // optional {@link Composition#relatesTo() relatesTo}
   *    .event(List&amp;lt;com.fhir.Composition_Event&amp;gt;) // optional {@link Composition#event() event}
   *    .meta(com.fhir.Meta) // optional {@link Composition#meta() meta}
   *    .status(com.fhir.CompositionStatus) // optional {@link Composition#status() status}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Composition#contained() contained}
   *    .title(String) // optional {@link Composition#title() title}
   *    .attester(List&amp;lt;com.fhir.Composition_Attester&amp;gt;) // optional {@link Composition#attester() attester}
   *    .subject(com.fhir.Reference) // optional {@link Composition#subject() subject}
   *    .date(com.fhir.dateTime) // optional {@link Composition#date() date}
   *    .confidentiality(com.fhir.code) // optional {@link Composition#confidentiality() confidentiality}
   *    .language(com.fhir.code) // optional {@link Composition#language() language}
   *    .id(com.fhir.id) // optional {@link Composition#id() id}
   *    .text(com.fhir.Narrative) // optional {@link Composition#text() text}
   *    .resourceType(String) // required {@link Composition#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Composition#modifierExtension() modifierExtension}
   *    .identifier(com.fhir.Identifier) // optional {@link Composition#identifier() identifier}
   *    .addAuthor|addAllAuthor(com.fhir.Reference) // {@link Composition#author() author} elements
   *    .implicitRules(com.fhir.uri) // optional {@link Composition#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new Composition builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableComposition.Builder();
  }

  /**
   * Builds instances of type {@link Composition Composition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Composition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements TypeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_SECTION = 0x1L;
    private static final long OPT_BIT_CUSTODIAN = 0x2L;
    private static final long OPT_BIT_ENCOUNTER = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_CATEGORY = 0x10L;
    private static final long OPT_BIT_RELATES_TO = 0x20L;
    private static final long OPT_BIT_EVENT = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_STATUS = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_TITLE = 0x400L;
    private static final long OPT_BIT_ATTESTER = 0x800L;
    private static final long OPT_BIT_SUBJECT = 0x1000L;
    private static final long OPT_BIT_DATE = 0x2000L;
    private static final long OPT_BIT_CONFIDENTIALITY = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_TEXT = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Composition_Section> section;
    private @javax.annotation.Nullable com.fhir.Reference custodian;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.util.List<com.fhir.Composition_RelatesTo> relatesTo;
    private @javax.annotation.Nullable java.util.List<com.fhir.Composition_Event> event;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CompositionStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.Composition_Attester> attester;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.code confidentiality;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private final java.util.List<com.fhir.Reference> author = new java.util.ArrayList<com.fhir.Reference>();
    private @javax.annotation.Nullable com.fhir.uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Composition#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for chained invocation
     */
    public final Builder section(java.util.List<com.fhir.Composition_Section> section) {
      checkNotIsSet(sectionIsSet(), "section");
      this.section = java.util.Objects.requireNonNull(section, "section");
      optBits |= OPT_BIT_SECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("section")
    public final Builder section(java.util.Optional<? extends java.util.List<com.fhir.Composition_Section>> section) {
      checkNotIsSet(sectionIsSet(), "section");
      this.section = section.orElse(null);
      optBits |= OPT_BIT_SECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    public final Builder custodian(com.fhir.Reference custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = java.util.Objects.requireNonNull(custodian, "custodian");
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("custodian")
    public final Builder custodian(java.util.Optional<? extends com.fhir.Reference> custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = custodian.orElse(null);
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Composition#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Composition#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition#category() category} to category.
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
     * Initializes the optional value {@link Composition#category() category} to category.
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
     * Initializes the optional value {@link Composition#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatesTo(java.util.List<com.fhir.Composition_RelatesTo> relatesTo) {
      checkNotIsSet(relatesToIsSet(), "relatesTo");
      this.relatesTo = java.util.Objects.requireNonNull(relatesTo, "relatesTo");
      optBits |= OPT_BIT_RELATES_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatesTo")
    public final Builder relatesTo(java.util.Optional<? extends java.util.List<com.fhir.Composition_RelatesTo>> relatesTo) {
      checkNotIsSet(relatesToIsSet(), "relatesTo");
      this.relatesTo = relatesTo.orElse(null);
      optBits |= OPT_BIT_RELATES_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    public final Builder event(java.util.List<com.fhir.Composition_Event> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = java.util.Objects.requireNonNull(event, "event");
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("event")
    public final Builder event(java.util.Optional<? extends java.util.List<com.fhir.Composition_Event>> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = event.orElse(null);
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#meta() meta} to meta.
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
     * Initializes the optional value {@link Composition#meta() meta} to meta.
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
     * Initializes the optional value {@link Composition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CompositionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CompositionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#contained() contained} to contained.
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
     * Initializes the optional value {@link Composition#contained() contained} to contained.
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
     * Initializes the optional value {@link Composition#title() title} to title.
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
     * Initializes the optional value {@link Composition#title() title} to title.
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
     * Initializes the optional value {@link Composition#attester() attester} to attester.
     * @param attester The value for attester
     * @return {@code this} builder for chained invocation
     */
    public final Builder attester(java.util.List<com.fhir.Composition_Attester> attester) {
      checkNotIsSet(attesterIsSet(), "attester");
      this.attester = java.util.Objects.requireNonNull(attester, "attester");
      optBits |= OPT_BIT_ATTESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#attester() attester} to attester.
     * @param attester The value for attester
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attester")
    public final Builder attester(java.util.Optional<? extends java.util.List<com.fhir.Composition_Attester>> attester) {
      checkNotIsSet(attesterIsSet(), "attester");
      this.attester = attester.orElse(null);
      optBits |= OPT_BIT_ATTESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#subject() subject} to subject.
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
     * Initializes the optional value {@link Composition#subject() subject} to subject.
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
     * Initializes the optional value {@link Composition#date() date} to date.
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
     * Initializes the optional value {@link Composition#date() date} to date.
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
     * Initializes the optional value {@link Composition#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for chained invocation
     */
    public final Builder confidentiality(com.fhir.code confidentiality) {
      checkNotIsSet(confidentialityIsSet(), "confidentiality");
      this.confidentiality = java.util.Objects.requireNonNull(confidentiality, "confidentiality");
      optBits |= OPT_BIT_CONFIDENTIALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("confidentiality")
    public final Builder confidentiality(java.util.Optional<? extends com.fhir.code> confidentiality) {
      checkNotIsSet(confidentialityIsSet(), "confidentiality");
      this.confidentiality = confidentiality.orElse(null);
      optBits |= OPT_BIT_CONFIDENTIALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#language() language} to language.
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
     * Initializes the optional value {@link Composition#language() language} to language.
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
     * Initializes the optional value {@link Composition#id() id} to id.
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
     * Initializes the optional value {@link Composition#id() id} to id.
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
     * Initializes the optional value {@link Composition#text() text} to text.
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
     * Initializes the optional value {@link Composition#text() text} to text.
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
     * Initializes the value for the {@link Composition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Composition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Adds one element to {@link Composition#author() author} list.
     * @param element A author element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAuthor(com.fhir.Reference element) {
      this.author.add(java.util.Objects.requireNonNull(element, "author element"));
      return this;
    }

    /**
     * Adds elements to {@link Composition#author() author} list.
     * @param elements An array of author elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAuthor(com.fhir.Reference... elements) {
      for (com.fhir.Reference element : elements) {
        this.author.add(java.util.Objects.requireNonNull(element, "author element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Composition#author() author} list.
     * @param elements An iterable of author elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAuthor(Iterable<? extends com.fhir.Reference> elements) {
      for (com.fhir.Reference element : elements) {
        this.author.add(java.util.Objects.requireNonNull(element, "author element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Composition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Composition#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link Composition Composition}.
     * @return An immutable instance of Composition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Composition build() {
      checkRequiredAttributes();
      return new ImmutableComposition(
          type,
          section,
          custodian,
          encounter,
          extension,
          category,
          relatesTo,
          event,
          meta,
          status,
          contained,
          title,
          attester,
          subject,
          date,
          confidentiality,
          language,
          id,
          text,
          resourceType,
          modifierExtension,
          identifier,
          createUnmodifiableList(true, author),
          implicitRules);
    }

    private boolean sectionIsSet() {
      return (optBits & OPT_BIT_SECTION) != 0;
    }

    private boolean custodianIsSet() {
      return (optBits & OPT_BIT_CUSTODIAN) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean relatesToIsSet() {
      return (optBits & OPT_BIT_RELATES_TO) != 0;
    }

    private boolean eventIsSet() {
      return (optBits & OPT_BIT_EVENT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean attesterIsSet() {
      return (optBits & OPT_BIT_ATTESTER) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean confidentialityIsSet() {
      return (optBits & OPT_BIT_CONFIDENTIALITY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Composition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Composition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Composition", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Composition#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage type(com.fhir.CodeableConcept type);
  }

  @org.immutables.value.Generated(from = "Composition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Composition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Composition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Composition#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for chained invocation
     */
    BuildFinal section(java.util.List<com.fhir.Composition_Section> section);

    /**
     * Initializes the optional value {@link Composition#section() section} to section.
     * @param section The value for section
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal section(java.util.Optional<? extends java.util.List<com.fhir.Composition_Section>> section);

    /**
     * Initializes the optional value {@link Composition#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    BuildFinal custodian(com.fhir.Reference custodian);

    /**
     * Initializes the optional value {@link Composition#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal custodian(java.util.Optional<? extends com.fhir.Reference> custodian);

    /**
     * Initializes the optional value {@link Composition#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Composition#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link Composition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Composition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Composition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link Composition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Composition#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatesTo(java.util.List<com.fhir.Composition_RelatesTo> relatesTo);

    /**
     * Initializes the optional value {@link Composition#relatesTo() relatesTo} to relatesTo.
     * @param relatesTo The value for relatesTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatesTo(java.util.Optional<? extends java.util.List<com.fhir.Composition_RelatesTo>> relatesTo);

    /**
     * Initializes the optional value {@link Composition#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    BuildFinal event(java.util.List<com.fhir.Composition_Event> event);

    /**
     * Initializes the optional value {@link Composition#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal event(java.util.Optional<? extends java.util.List<com.fhir.Composition_Event>> event);

    /**
     * Initializes the optional value {@link Composition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Composition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Composition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.CompositionStatus status);

    /**
     * Initializes the optional value {@link Composition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.CompositionStatus> status);

    /**
     * Initializes the optional value {@link Composition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Composition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Composition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link Composition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link Composition#attester() attester} to attester.
     * @param attester The value for attester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal attester(java.util.List<com.fhir.Composition_Attester> attester);

    /**
     * Initializes the optional value {@link Composition#attester() attester} to attester.
     * @param attester The value for attester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal attester(java.util.Optional<? extends java.util.List<com.fhir.Composition_Attester>> attester);

    /**
     * Initializes the optional value {@link Composition#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link Composition#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Composition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link Composition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link Composition#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal confidentiality(com.fhir.code confidentiality);

    /**
     * Initializes the optional value {@link Composition#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal confidentiality(java.util.Optional<? extends com.fhir.code> confidentiality);

    /**
     * Initializes the optional value {@link Composition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Composition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Composition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Composition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Composition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Composition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Composition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Composition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Composition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link Composition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Adds one element to {@link Composition#author() author} list.
     * @param element A author element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAuthor(com.fhir.Reference element);

    /**
     * Adds elements to {@link Composition#author() author} list.
     * @param elements An array of author elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAuthor(com.fhir.Reference... elements);

    /**
     * Adds elements to {@link Composition#author() author} list.
     * @param elements An iterable of author elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAuthor(Iterable<? extends com.fhir.Reference> elements);

    /**
     * Initializes the optional value {@link Composition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Composition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Builds a new {@link Composition Composition}.
     * @return An immutable instance of Composition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Composition build();
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
