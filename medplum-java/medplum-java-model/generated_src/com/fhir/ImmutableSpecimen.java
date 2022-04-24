//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Specimen}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimen.builder()}.
 */
@org.immutables.value.Generated(from = "Specimen", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimen implements com.fhir.Specimen {
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> condition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.Identifier accessionIdentifier;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Container> container;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> parent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Processing> processing;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.dateTime receivedTime;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.SpecimenStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> request;
  private final @javax.annotation.Nullable com.fhir.Specimen_Collection collection;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableSpecimen(
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> condition,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.Identifier accessionIdentifier,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Container> container,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> parent,
      @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Processing> processing,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.dateTime receivedTime,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.SpecimenStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> request,
      @javax.annotation.Nullable com.fhir.Specimen_Collection collection,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.condition = condition;
    this.note = note;
    this.accessionIdentifier = accessionIdentifier;
    this.meta = meta;
    this.type = type;
    this.container = container;
    this.id = id;
    this.parent = parent;
    this.processing = processing;
    this.implicitRules = implicitRules;
    this.text = text;
    this.subject = subject;
    this.receivedTime = receivedTime;
    this.resourceType = resourceType;
    this.extension = extension;
    this.identifier = identifier;
    this.status = status;
    this.contained = contained;
    this.request = request;
    this.collection = collection;
    this.language = language;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("condition")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> condition() {
    return java.util.Optional.ofNullable(condition);
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
   * @return The value of the {@code accessionIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("accessionIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> accessionIdentifier() {
    return java.util.Optional.ofNullable(accessionIdentifier);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code container} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("container")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Specimen_Container>> container() {
    return java.util.Optional.ofNullable(container);
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
   * @return The value of the {@code parent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parent")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> parent() {
    return java.util.Optional.ofNullable(parent);
  }

  /**
   * @return The value of the {@code processing} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("processing")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Specimen_Processing>> processing() {
    return java.util.Optional.ofNullable(processing);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code receivedTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("receivedTime")
  @Override
  public java.util.Optional<com.fhir.dateTime> receivedTime() {
    return java.util.Optional.ofNullable(receivedTime);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.SpecimenStatus> status() {
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
   * @return The value of the {@code request} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("request")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> request() {
    return java.util.Optional.ofNullable(request);
  }

  /**
   * @return The value of the {@code collection} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("collection")
  @Override
  public java.util.Optional<com.fhir.Specimen_Collection> collection() {
    return java.util.Optional.ofNullable(collection);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withCondition(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableSpecimen(
        newValue,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withCondition(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableSpecimen(
        value,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        newValue,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        value,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#accessionIdentifier() accessionIdentifier} attribute.
   * @param value The value for accessionIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withAccessionIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "accessionIdentifier");
    if (this.accessionIdentifier == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        newValue,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#accessionIdentifier() accessionIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accessionIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withAccessionIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.accessionIdentifier == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        value,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        newValue,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        value,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        newValue,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        value,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#container() container} attribute.
   * @param value The value for container
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withContainer(java.util.List<com.fhir.Specimen_Container> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Container> newValue = java.util.Objects.requireNonNull(value, "container");
    if (this.container == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        newValue,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#container() container} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for container
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withContainer(java.util.Optional<? extends java.util.List<com.fhir.Specimen_Container>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Container> value = optional.orElse(null);
    if (this.container == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        value,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        newValue,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        value,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withParent(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        newValue,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withParent(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        value,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#processing() processing} attribute.
   * @param value The value for processing
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withProcessing(java.util.List<com.fhir.Specimen_Processing> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Processing> newValue = java.util.Objects.requireNonNull(value, "processing");
    if (this.processing == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        newValue,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#processing() processing} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processing
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withProcessing(java.util.Optional<? extends java.util.List<com.fhir.Specimen_Processing>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Processing> value = optional.orElse(null);
    if (this.processing == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        value,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        newValue,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        value,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        newValue,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        value,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        newValue,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        value,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#receivedTime() receivedTime} attribute.
   * @param value The value for receivedTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withReceivedTime(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "receivedTime");
    if (this.receivedTime == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        newValue,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#receivedTime() receivedTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receivedTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withReceivedTime(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.receivedTime == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        value,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Specimen#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecimen withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        newValue,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        newValue,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        value,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        newValue,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        value,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withStatus(com.fhir.SpecimenStatus value) {
    @javax.annotation.Nullable com.fhir.SpecimenStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        newValue,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withStatus(java.util.Optional<? extends com.fhir.SpecimenStatus> optional) {
    @javax.annotation.Nullable com.fhir.SpecimenStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        value,
        this.contained,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        newValue,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        value,
        this.request,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withRequest(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        newValue,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        value,
        this.collection,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#collection() collection} attribute.
   * @param value The value for collection
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withCollection(com.fhir.Specimen_Collection value) {
    @javax.annotation.Nullable com.fhir.Specimen_Collection newValue = java.util.Objects.requireNonNull(value, "collection");
    if (this.collection == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        newValue,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#collection() collection} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for collection
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withCollection(java.util.Optional<? extends com.fhir.Specimen_Collection> optional) {
    @javax.annotation.Nullable com.fhir.Specimen_Collection value = optional.orElse(null);
    if (this.collection == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        value,
        this.language,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimen(
        this.condition,
        this.note,
        this.accessionIdentifier,
        this.meta,
        this.type,
        this.container,
        this.id,
        this.parent,
        this.processing,
        this.implicitRules,
        this.text,
        this.subject,
        this.receivedTime,
        this.resourceType,
        this.extension,
        this.identifier,
        this.status,
        this.contained,
        this.request,
        this.collection,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimen} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimen
        && equalTo((ImmutableSpecimen) another);
  }

  private boolean equalTo(ImmutableSpecimen another) {
    return java.util.Objects.equals(condition, another.condition)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(accessionIdentifier, another.accessionIdentifier)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(container, another.container)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(parent, another.parent)
        && java.util.Objects.equals(processing, another.processing)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(receivedTime, another.receivedTime)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(request, another.request)
        && java.util.Objects.equals(collection, another.collection)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code condition}, {@code note}, {@code accessionIdentifier}, {@code meta}, {@code type}, {@code container}, {@code id}, {@code parent}, {@code processing}, {@code implicitRules}, {@code text}, {@code subject}, {@code receivedTime}, {@code resourceType}, {@code extension}, {@code identifier}, {@code status}, {@code contained}, {@code request}, {@code collection}, {@code language}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(condition);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(accessionIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(container);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(parent);
    h += (h << 5) + java.util.Objects.hashCode(processing);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(receivedTime);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + java.util.Objects.hashCode(collection);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Specimen} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Specimen{");
    if (condition != null) {
      builder.append("condition=").append(condition);
    }
    if (note != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (accessionIdentifier != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("accessionIdentifier=").append(accessionIdentifier);
    }
    if (meta != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (type != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (container != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("container=").append(container);
    }
    if (id != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (parent != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (processing != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("processing=").append(processing);
    }
    if (implicitRules != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (subject != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (receivedTime != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("receivedTime=").append(receivedTime);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (collection != null) {
      builder.append(", ");
      builder.append("collection=").append(collection);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Specimen", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Specimen {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> condition = java.util.Optional.empty();
    boolean conditionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> accessionIdentifier = java.util.Optional.empty();
    boolean accessionIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Specimen_Container>> container = java.util.Optional.empty();
    boolean containerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> parent = java.util.Optional.empty();
    boolean parentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Specimen_Processing>> processing = java.util.Optional.empty();
    boolean processingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> receivedTime = java.util.Optional.empty();
    boolean receivedTimeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SpecimenStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Specimen_Collection> collection = java.util.Optional.empty();
    boolean collectionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public void setCondition(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("accessionIdentifier")
    public void setAccessionIdentifier(java.util.Optional<com.fhir.Identifier> accessionIdentifier) {
      this.accessionIdentifier = accessionIdentifier;
      this.accessionIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("container")
    public void setContainer(java.util.Optional<java.util.List<com.fhir.Specimen_Container>> container) {
      this.container = container;
      this.containerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public void setParent(java.util.Optional<java.util.List<com.fhir.Reference>> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("processing")
    public void setProcessing(java.util.Optional<java.util.List<com.fhir.Specimen_Processing>> processing) {
      this.processing = processing;
      this.processingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("receivedTime")
    public void setReceivedTime(java.util.Optional<com.fhir.dateTime> receivedTime) {
      this.receivedTime = receivedTime;
      this.receivedTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.SpecimenStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<java.util.List<com.fhir.Reference>> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("collection")
    public void setCollection(java.util.Optional<com.fhir.Specimen_Collection> collection) {
      this.collection = collection;
      this.collectionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> accessionIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Specimen_Container>> container() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> parent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Specimen_Processing>> processing() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> receivedTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SpecimenStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Specimen_Collection> collection() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimen fromJson(Json json) {
    ImmutableSpecimen.Builder builder = ((ImmutableSpecimen.Builder) ImmutableSpecimen.builder());
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.accessionIdentifierIsSet) {
      builder.accessionIdentifier(json.accessionIdentifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.containerIsSet) {
      builder.container(json.container);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.processingIsSet) {
      builder.processing(json.processing);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.receivedTimeIsSet) {
      builder.receivedTime(json.receivedTime);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.collectionIsSet) {
      builder.collection(json.collection);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableSpecimen) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Specimen} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Specimen instance
   */
  public static Specimen copyOf(Specimen instance) {
    if (instance instanceof ImmutableSpecimen) {
      return (ImmutableSpecimen) instance;
    }
    return ((ImmutableSpecimen.Builder) ImmutableSpecimen.builder())
        .condition(instance.condition())
        .note(instance.note())
        .accessionIdentifier(instance.accessionIdentifier())
        .meta(instance.meta())
        .type(instance.type())
        .container(instance.container())
        .id(instance.id())
        .parent(instance.parent())
        .processing(instance.processing())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .subject(instance.subject())
        .receivedTime(instance.receivedTime())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .status(instance.status())
        .contained(instance.contained())
        .request(instance.request())
        .collection(instance.collection())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Specimen Specimen}.
   * <pre>
   * ImmutableSpecimen.builder()
   *    .condition(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Specimen#condition() condition}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Specimen#note() note}
   *    .accessionIdentifier(com.fhir.Identifier) // optional {@link Specimen#accessionIdentifier() accessionIdentifier}
   *    .meta(com.fhir.Meta) // optional {@link Specimen#meta() meta}
   *    .type(com.fhir.CodeableConcept) // optional {@link Specimen#type() type}
   *    .container(List&amp;lt;com.fhir.Specimen_Container&amp;gt;) // optional {@link Specimen#container() container}
   *    .id(com.fhir.id) // optional {@link Specimen#id() id}
   *    .parent(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Specimen#parent() parent}
   *    .processing(List&amp;lt;com.fhir.Specimen_Processing&amp;gt;) // optional {@link Specimen#processing() processing}
   *    .implicitRules(com.fhir.uri) // optional {@link Specimen#implicitRules() implicitRules}
   *    .text(com.fhir.Narrative) // optional {@link Specimen#text() text}
   *    .subject(com.fhir.Reference) // optional {@link Specimen#subject() subject}
   *    .receivedTime(com.fhir.dateTime) // optional {@link Specimen#receivedTime() receivedTime}
   *    .resourceType(String) // required {@link Specimen#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Specimen#extension() extension}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Specimen#identifier() identifier}
   *    .status(com.fhir.SpecimenStatus) // optional {@link Specimen#status() status}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Specimen#contained() contained}
   *    .request(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Specimen#request() request}
   *    .collection(com.fhir.Specimen_Collection) // optional {@link Specimen#collection() collection}
   *    .language(com.fhir.code) // optional {@link Specimen#language() language}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Specimen#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Specimen builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSpecimen.Builder();
  }

  /**
   * Builds instances of type {@link Specimen Specimen}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Specimen", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONDITION = 0x1L;
    private static final long OPT_BIT_NOTE = 0x2L;
    private static final long OPT_BIT_ACCESSION_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_CONTAINER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_PARENT = 0x80L;
    private static final long OPT_BIT_PROCESSING = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_SUBJECT = 0x800L;
    private static final long OPT_BIT_RECEIVED_TIME = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_STATUS = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_REQUEST = 0x20000L;
    private static final long OPT_BIT_COLLECTION = 0x40000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> condition;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.Identifier accessionIdentifier;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Container> container;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> parent;
    private @javax.annotation.Nullable java.util.List<com.fhir.Specimen_Processing> processing;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.dateTime receivedTime;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.SpecimenStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> request;
    private @javax.annotation.Nullable com.fhir.Specimen_Collection collection;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Specimen#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(java.util.List<com.fhir.CodeableConcept> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = java.util.Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public final Builder condition(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#note() note} to note.
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
     * Initializes the optional value {@link Specimen#note() note} to note.
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
     * Initializes the optional value {@link Specimen#accessionIdentifier() accessionIdentifier} to accessionIdentifier.
     * @param accessionIdentifier The value for accessionIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder accessionIdentifier(com.fhir.Identifier accessionIdentifier) {
      checkNotIsSet(accessionIdentifierIsSet(), "accessionIdentifier");
      this.accessionIdentifier = java.util.Objects.requireNonNull(accessionIdentifier, "accessionIdentifier");
      optBits |= OPT_BIT_ACCESSION_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#accessionIdentifier() accessionIdentifier} to accessionIdentifier.
     * @param accessionIdentifier The value for accessionIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessionIdentifier")
    public final Builder accessionIdentifier(java.util.Optional<? extends com.fhir.Identifier> accessionIdentifier) {
      checkNotIsSet(accessionIdentifierIsSet(), "accessionIdentifier");
      this.accessionIdentifier = accessionIdentifier.orElse(null);
      optBits |= OPT_BIT_ACCESSION_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#meta() meta} to meta.
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
     * Initializes the optional value {@link Specimen#meta() meta} to meta.
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
     * Initializes the optional value {@link Specimen#type() type} to type.
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
     * Initializes the optional value {@link Specimen#type() type} to type.
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
     * Initializes the optional value {@link Specimen#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for chained invocation
     */
    public final Builder container(java.util.List<com.fhir.Specimen_Container> container) {
      checkNotIsSet(containerIsSet(), "container");
      this.container = java.util.Objects.requireNonNull(container, "container");
      optBits |= OPT_BIT_CONTAINER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("container")
    public final Builder container(java.util.Optional<? extends java.util.List<com.fhir.Specimen_Container>> container) {
      checkNotIsSet(containerIsSet(), "container");
      this.container = container.orElse(null);
      optBits |= OPT_BIT_CONTAINER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#id() id} to id.
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
     * Initializes the optional value {@link Specimen#id() id} to id.
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
     * Initializes the optional value {@link Specimen#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(java.util.List<com.fhir.Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = java.util.Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public final Builder parent(java.util.Optional<? extends java.util.List<com.fhir.Reference>> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for chained invocation
     */
    public final Builder processing(java.util.List<com.fhir.Specimen_Processing> processing) {
      checkNotIsSet(processingIsSet(), "processing");
      this.processing = java.util.Objects.requireNonNull(processing, "processing");
      optBits |= OPT_BIT_PROCESSING;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processing")
    public final Builder processing(java.util.Optional<? extends java.util.List<com.fhir.Specimen_Processing>> processing) {
      checkNotIsSet(processingIsSet(), "processing");
      this.processing = processing.orElse(null);
      optBits |= OPT_BIT_PROCESSING;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Specimen#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Specimen#text() text} to text.
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
     * Initializes the optional value {@link Specimen#text() text} to text.
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
     * Initializes the optional value {@link Specimen#subject() subject} to subject.
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
     * Initializes the optional value {@link Specimen#subject() subject} to subject.
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
     * Initializes the optional value {@link Specimen#receivedTime() receivedTime} to receivedTime.
     * @param receivedTime The value for receivedTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder receivedTime(com.fhir.dateTime receivedTime) {
      checkNotIsSet(receivedTimeIsSet(), "receivedTime");
      this.receivedTime = java.util.Objects.requireNonNull(receivedTime, "receivedTime");
      optBits |= OPT_BIT_RECEIVED_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#receivedTime() receivedTime} to receivedTime.
     * @param receivedTime The value for receivedTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("receivedTime")
    public final Builder receivedTime(java.util.Optional<? extends com.fhir.dateTime> receivedTime) {
      checkNotIsSet(receivedTimeIsSet(), "receivedTime");
      this.receivedTime = receivedTime.orElse(null);
      optBits |= OPT_BIT_RECEIVED_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link Specimen#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Specimen#extension() extension} to extension.
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
     * Initializes the optional value {@link Specimen#extension() extension} to extension.
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
     * Initializes the optional value {@link Specimen#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Specimen#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Specimen#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.SpecimenStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.SpecimenStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#contained() contained} to contained.
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
     * Initializes the optional value {@link Specimen#contained() contained} to contained.
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
     * Initializes the optional value {@link Specimen#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(java.util.List<com.fhir.Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = java.util.Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public final Builder request(java.util.Optional<? extends java.util.List<com.fhir.Reference>> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    public final Builder collection(com.fhir.Specimen_Collection collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = java.util.Objects.requireNonNull(collection, "collection");
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collection")
    public final Builder collection(java.util.Optional<? extends com.fhir.Specimen_Collection> collection) {
      checkNotIsSet(collectionIsSet(), "collection");
      this.collection = collection.orElse(null);
      optBits |= OPT_BIT_COLLECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen#language() language} to language.
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
     * Initializes the optional value {@link Specimen#language() language} to language.
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
     * Initializes the optional value {@link Specimen#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Specimen#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Specimen Specimen}.
     * @return An immutable instance of Specimen
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Specimen build() {
      checkRequiredAttributes();
      return new ImmutableSpecimen(
          condition,
          note,
          accessionIdentifier,
          meta,
          type,
          container,
          id,
          parent,
          processing,
          implicitRules,
          text,
          subject,
          receivedTime,
          resourceType,
          extension,
          identifier,
          status,
          contained,
          request,
          collection,
          language,
          modifierExtension);
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean accessionIdentifierIsSet() {
      return (optBits & OPT_BIT_ACCESSION_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean containerIsSet() {
      return (optBits & OPT_BIT_CONTAINER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean processingIsSet() {
      return (optBits & OPT_BIT_PROCESSING) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean receivedTimeIsSet() {
      return (optBits & OPT_BIT_RECEIVED_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean collectionIsSet() {
      return (optBits & OPT_BIT_COLLECTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Specimen is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Specimen, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Specimen", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Specimen#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Specimen", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Specimen#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal condition(java.util.List<com.fhir.CodeableConcept> condition);

    /**
     * Initializes the optional value {@link Specimen#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> condition);

    /**
     * Initializes the optional value {@link Specimen#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Specimen#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Specimen#accessionIdentifier() accessionIdentifier} to accessionIdentifier.
     * @param accessionIdentifier The value for accessionIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal accessionIdentifier(com.fhir.Identifier accessionIdentifier);

    /**
     * Initializes the optional value {@link Specimen#accessionIdentifier() accessionIdentifier} to accessionIdentifier.
     * @param accessionIdentifier The value for accessionIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal accessionIdentifier(java.util.Optional<? extends com.fhir.Identifier> accessionIdentifier);

    /**
     * Initializes the optional value {@link Specimen#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Specimen#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Specimen#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link Specimen#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Specimen#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for chained invocation
     */
    BuildFinal container(java.util.List<com.fhir.Specimen_Container> container);

    /**
     * Initializes the optional value {@link Specimen#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal container(java.util.Optional<? extends java.util.List<com.fhir.Specimen_Container>> container);

    /**
     * Initializes the optional value {@link Specimen#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Specimen#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Specimen#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(java.util.List<com.fhir.Reference> parent);

    /**
     * Initializes the optional value {@link Specimen#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(java.util.Optional<? extends java.util.List<com.fhir.Reference>> parent);

    /**
     * Initializes the optional value {@link Specimen#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processing(java.util.List<com.fhir.Specimen_Processing> processing);

    /**
     * Initializes the optional value {@link Specimen#processing() processing} to processing.
     * @param processing The value for processing
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processing(java.util.Optional<? extends java.util.List<com.fhir.Specimen_Processing>> processing);

    /**
     * Initializes the optional value {@link Specimen#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Specimen#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Specimen#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Specimen#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Specimen#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link Specimen#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Specimen#receivedTime() receivedTime} to receivedTime.
     * @param receivedTime The value for receivedTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal receivedTime(com.fhir.dateTime receivedTime);

    /**
     * Initializes the optional value {@link Specimen#receivedTime() receivedTime} to receivedTime.
     * @param receivedTime The value for receivedTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal receivedTime(java.util.Optional<? extends com.fhir.dateTime> receivedTime);

    /**
     * Initializes the optional value {@link Specimen#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Specimen#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Specimen#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Specimen#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Specimen#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.SpecimenStatus status);

    /**
     * Initializes the optional value {@link Specimen#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.SpecimenStatus> status);

    /**
     * Initializes the optional value {@link Specimen#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Specimen#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Specimen#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(java.util.List<com.fhir.Reference> request);

    /**
     * Initializes the optional value {@link Specimen#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(java.util.Optional<? extends java.util.List<com.fhir.Reference>> request);

    /**
     * Initializes the optional value {@link Specimen#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for chained invocation
     */
    BuildFinal collection(com.fhir.Specimen_Collection collection);

    /**
     * Initializes the optional value {@link Specimen#collection() collection} to collection.
     * @param collection The value for collection
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal collection(java.util.Optional<? extends com.fhir.Specimen_Collection> collection);

    /**
     * Initializes the optional value {@link Specimen#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Specimen#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Specimen#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Specimen#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link Specimen Specimen}.
     * @return An immutable instance of Specimen
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Specimen build();
  }
}
