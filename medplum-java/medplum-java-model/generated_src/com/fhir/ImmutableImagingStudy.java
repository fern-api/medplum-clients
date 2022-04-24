//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImagingStudy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImagingStudy.builder()}.
 */
@org.immutables.value.Generated(from = "ImagingStudy", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImagingStudy implements com.fhir.ImagingStudy {
  private final @javax.annotation.Nullable com.fhir.ImagingstudyStatus status;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> modality;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.unsignedInt numberOfSeries;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> procedureCode;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.unsignedInt numberOfInstances;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
  private final @javax.annotation.Nullable com.fhir.Reference referrer;
  private final @javax.annotation.Nullable com.fhir.Reference procedureReference;
  private final @javax.annotation.Nullable com.fhir.dateTime started;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> interpreter;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Series> series;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableImagingStudy(
      @javax.annotation.Nullable com.fhir.ImagingstudyStatus status,
      com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.Narrative text,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> modality,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.unsignedInt numberOfSeries,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> procedureCode,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.unsignedInt numberOfInstances,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint,
      @javax.annotation.Nullable com.fhir.Reference referrer,
      @javax.annotation.Nullable com.fhir.Reference procedureReference,
      @javax.annotation.Nullable com.fhir.dateTime started,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> interpreter,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Series> series,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.status = status;
    this.subject = subject;
    this.text = text;
    this.resourceType = resourceType;
    this.modality = modality;
    this.note = note;
    this.reasonReference = reasonReference;
    this.numberOfSeries = numberOfSeries;
    this.procedureCode = procedureCode;
    this.meta = meta;
    this.contained = contained;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.numberOfInstances = numberOfInstances;
    this.language = language;
    this.reasonCode = reasonCode;
    this.endpoint = endpoint;
    this.referrer = referrer;
    this.procedureReference = procedureReference;
    this.started = started;
    this.basedOn = basedOn;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.interpreter = interpreter;
    this.encounter = encounter;
    this.id = id;
    this.series = series;
    this.location = location;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ImagingstudyStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code modality} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modality")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> modality() {
    return java.util.Optional.ofNullable(modality);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
  }

  /**
   * @return The value of the {@code numberOfSeries} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("numberOfSeries")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> numberOfSeries() {
    return java.util.Optional.ofNullable(numberOfSeries);
  }

  /**
   * @return The value of the {@code procedureCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("procedureCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> procedureCode() {
    return java.util.Optional.ofNullable(procedureCode);
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
   * @return The value of the {@code numberOfInstances} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("numberOfInstances")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> numberOfInstances() {
    return java.util.Optional.ofNullable(numberOfInstances);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() {
    return java.util.Optional.ofNullable(endpoint);
  }

  /**
   * @return The value of the {@code referrer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referrer")
  @Override
  public java.util.Optional<com.fhir.Reference> referrer() {
    return java.util.Optional.ofNullable(referrer);
  }

  /**
   * @return The value of the {@code procedureReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("procedureReference")
  @Override
  public java.util.Optional<com.fhir.Reference> procedureReference() {
    return java.util.Optional.ofNullable(procedureReference);
  }

  /**
   * @return The value of the {@code started} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("started")
  @Override
  public java.util.Optional<com.fhir.dateTime> started() {
    return java.util.Optional.ofNullable(started);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code interpreter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("interpreter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> interpreter() {
    return java.util.Optional.ofNullable(interpreter);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code series} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("series")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ImagingStudy_Series>> series() {
    return java.util.Optional.ofNullable(series);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.Reference> location() {
    return java.util.Optional.ofNullable(location);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withStatus(com.fhir.ImagingstudyStatus value) {
    @javax.annotation.Nullable com.fhir.ImagingstudyStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableImagingStudy(
        newValue,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withStatus(java.util.Optional<? extends com.fhir.ImagingstudyStatus> optional) {
    @javax.annotation.Nullable com.fhir.ImagingstudyStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableImagingStudy(
        value,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableImagingStudy(
        this.status,
        newValue,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        newValue,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        value,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        newValue,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#modality() modality} attribute.
   * @param value The value for modality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withModality(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "modality");
    if (this.modality == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        newValue,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#modality() modality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withModality(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.modality == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        value,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        newValue,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        value,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        newValue,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        value,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#numberOfSeries() numberOfSeries} attribute.
   * @param value The value for numberOfSeries
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withNumberOfSeries(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "numberOfSeries");
    if (this.numberOfSeries == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        newValue,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#numberOfSeries() numberOfSeries} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfSeries
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withNumberOfSeries(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.numberOfSeries == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        value,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#procedureCode() procedureCode} attribute.
   * @param value The value for procedureCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withProcedureCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "procedureCode");
    if (this.procedureCode == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        newValue,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#procedureCode() procedureCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withProcedureCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.procedureCode == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        value,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        newValue,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        value,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        newValue,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        value,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        newValue,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        value,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        newValue,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        value,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#numberOfInstances() numberOfInstances} attribute.
   * @param value The value for numberOfInstances
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withNumberOfInstances(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "numberOfInstances");
    if (this.numberOfInstances == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        newValue,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#numberOfInstances() numberOfInstances} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfInstances
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withNumberOfInstances(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.numberOfInstances == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        value,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        newValue,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        value,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        newValue,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        value,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withEndpoint(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        newValue,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        value,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#referrer() referrer} attribute.
   * @param value The value for referrer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withReferrer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "referrer");
    if (this.referrer == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        newValue,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#referrer() referrer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referrer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withReferrer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.referrer == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        value,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#procedureReference() procedureReference} attribute.
   * @param value The value for procedureReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withProcedureReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "procedureReference");
    if (this.procedureReference == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        newValue,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#procedureReference() procedureReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withProcedureReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.procedureReference == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        value,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#started() started} attribute.
   * @param value The value for started
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withStarted(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "started");
    if (this.started == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        newValue,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#started() started} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for started
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withStarted(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.started == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        value,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        newValue,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        value,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        newValue,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        value,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        newValue,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        value,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#interpreter() interpreter} attribute.
   * @param value The value for interpreter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withInterpreter(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "interpreter");
    if (this.interpreter == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        newValue,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#interpreter() interpreter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interpreter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withInterpreter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.interpreter == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        value,
        this.encounter,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        newValue,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        value,
        this.id,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        newValue,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        value,
        this.series,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#series() series} attribute.
   * @param value The value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withSeries(java.util.List<com.fhir.ImagingStudy_Series> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Series> newValue = java.util.Objects.requireNonNull(value, "series");
    if (this.series == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        newValue,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#series() series} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for series
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withSeries(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Series>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Series> value = optional.orElse(null);
    if (this.series == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        value,
        this.location,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImagingStudy(
        this.status,
        this.subject,
        this.text,
        this.resourceType,
        this.modality,
        this.note,
        this.reasonReference,
        this.numberOfSeries,
        this.procedureCode,
        this.meta,
        this.contained,
        this.identifier,
        this.implicitRules,
        this.numberOfInstances,
        this.language,
        this.reasonCode,
        this.endpoint,
        this.referrer,
        this.procedureReference,
        this.started,
        this.basedOn,
        this.modifierExtension,
        this.description,
        this.interpreter,
        this.encounter,
        this.id,
        this.series,
        this.location,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImagingStudy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImagingStudy
        && equalTo((ImmutableImagingStudy) another);
  }

  private boolean equalTo(ImmutableImagingStudy another) {
    return java.util.Objects.equals(status, another.status)
        && subject.equals(another.subject)
        && java.util.Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(modality, another.modality)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(numberOfSeries, another.numberOfSeries)
        && java.util.Objects.equals(procedureCode, another.procedureCode)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(numberOfInstances, another.numberOfInstances)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(referrer, another.referrer)
        && java.util.Objects.equals(procedureReference, another.procedureReference)
        && java.util.Objects.equals(started, another.started)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(interpreter, another.interpreter)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(series, another.series)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code subject}, {@code text}, {@code resourceType}, {@code modality}, {@code note}, {@code reasonReference}, {@code numberOfSeries}, {@code procedureCode}, {@code meta}, {@code contained}, {@code identifier}, {@code implicitRules}, {@code numberOfInstances}, {@code language}, {@code reasonCode}, {@code endpoint}, {@code referrer}, {@code procedureReference}, {@code started}, {@code basedOn}, {@code modifierExtension}, {@code description}, {@code interpreter}, {@code encounter}, {@code id}, {@code series}, {@code location}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modality);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(numberOfSeries);
    h += (h << 5) + java.util.Objects.hashCode(procedureCode);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(numberOfInstances);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(referrer);
    h += (h << 5) + java.util.Objects.hashCode(procedureReference);
    h += (h << 5) + java.util.Objects.hashCode(started);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(interpreter);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(series);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImagingStudy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImagingStudy{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("subject=").append(subject);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modality != null) {
      builder.append(", ");
      builder.append("modality=").append(modality);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (numberOfSeries != null) {
      builder.append(", ");
      builder.append("numberOfSeries=").append(numberOfSeries);
    }
    if (procedureCode != null) {
      builder.append(", ");
      builder.append("procedureCode=").append(procedureCode);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (numberOfInstances != null) {
      builder.append(", ");
      builder.append("numberOfInstances=").append(numberOfInstances);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (endpoint != null) {
      builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (referrer != null) {
      builder.append(", ");
      builder.append("referrer=").append(referrer);
    }
    if (procedureReference != null) {
      builder.append(", ");
      builder.append("procedureReference=").append(procedureReference);
    }
    if (started != null) {
      builder.append(", ");
      builder.append("started=").append(started);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (interpreter != null) {
      builder.append(", ");
      builder.append("interpreter=").append(interpreter);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (series != null) {
      builder.append(", ");
      builder.append("series=").append(series);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
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
  @org.immutables.value.Generated(from = "ImagingStudy", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImagingStudy {
    @javax.annotation.Nullable java.util.Optional<com.fhir.ImagingstudyStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> modality = java.util.Optional.empty();
    boolean modalityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> numberOfSeries = java.util.Optional.empty();
    boolean numberOfSeriesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> procedureCode = java.util.Optional.empty();
    boolean procedureCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> numberOfInstances = java.util.Optional.empty();
    boolean numberOfInstancesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> referrer = java.util.Optional.empty();
    boolean referrerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> procedureReference = java.util.Optional.empty();
    boolean procedureReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> started = java.util.Optional.empty();
    boolean startedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> interpreter = java.util.Optional.empty();
    boolean interpreterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ImagingStudy_Series>> series = java.util.Optional.empty();
    boolean seriesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ImagingstudyStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
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
    @com.fasterxml.jackson.annotation.JsonProperty("modality")
    public void setModality(java.util.Optional<java.util.List<com.fhir.Coding>> modality) {
      this.modality = modality;
      this.modalityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfSeries")
    public void setNumberOfSeries(java.util.Optional<com.fhir.unsignedInt> numberOfSeries) {
      this.numberOfSeries = numberOfSeries;
      this.numberOfSeriesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("procedureCode")
    public void setProcedureCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> procedureCode) {
      this.procedureCode = procedureCode;
      this.procedureCodeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfInstances")
    public void setNumberOfInstances(java.util.Optional<com.fhir.unsignedInt> numberOfInstances) {
      this.numberOfInstances = numberOfInstances;
      this.numberOfInstancesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<java.util.List<com.fhir.Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    public void setReferrer(java.util.Optional<com.fhir.Reference> referrer) {
      this.referrer = referrer;
      this.referrerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("procedureReference")
    public void setProcedureReference(java.util.Optional<com.fhir.Reference> procedureReference) {
      this.procedureReference = procedureReference;
      this.procedureReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("started")
    public void setStarted(java.util.Optional<com.fhir.dateTime> started) {
      this.started = started;
      this.startedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("interpreter")
    public void setInterpreter(java.util.Optional<java.util.List<com.fhir.Reference>> interpreter) {
      this.interpreter = interpreter;
      this.interpreterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("series")
    public void setSeries(java.util.Optional<java.util.List<com.fhir.ImagingStudy_Series>> series) {
      this.series = series;
      this.seriesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.ImagingstudyStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> modality() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> numberOfSeries() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> procedureCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> numberOfInstances() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> referrer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> procedureReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> started() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> interpreter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ImagingStudy_Series>> series() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImagingStudy fromJson(Json json) {
    ImmutableImagingStudy.Builder builder = ((ImmutableImagingStudy.Builder) ImmutableImagingStudy.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modalityIsSet) {
      builder.modality(json.modality);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.numberOfSeriesIsSet) {
      builder.numberOfSeries(json.numberOfSeries);
    }
    if (json.procedureCodeIsSet) {
      builder.procedureCode(json.procedureCode);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.numberOfInstancesIsSet) {
      builder.numberOfInstances(json.numberOfInstances);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.referrerIsSet) {
      builder.referrer(json.referrer);
    }
    if (json.procedureReferenceIsSet) {
      builder.procedureReference(json.procedureReference);
    }
    if (json.startedIsSet) {
      builder.started(json.started);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.interpreterIsSet) {
      builder.interpreter(json.interpreter);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.seriesIsSet) {
      builder.series(json.series);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableImagingStudy) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImagingStudy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImagingStudy instance
   */
  public static ImagingStudy copyOf(ImagingStudy instance) {
    if (instance instanceof ImmutableImagingStudy) {
      return (ImmutableImagingStudy) instance;
    }
    return ((ImmutableImagingStudy.Builder) ImmutableImagingStudy.builder())
        .status(instance.status())
        .subject(instance.subject())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .modality(instance.modality())
        .note(instance.note())
        .reasonReference(instance.reasonReference())
        .numberOfSeries(instance.numberOfSeries())
        .procedureCode(instance.procedureCode())
        .meta(instance.meta())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .numberOfInstances(instance.numberOfInstances())
        .language(instance.language())
        .reasonCode(instance.reasonCode())
        .endpoint(instance.endpoint())
        .referrer(instance.referrer())
        .procedureReference(instance.procedureReference())
        .started(instance.started())
        .basedOn(instance.basedOn())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .interpreter(instance.interpreter())
        .encounter(instance.encounter())
        .id(instance.id())
        .series(instance.series())
        .location(instance.location())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ImagingStudy ImagingStudy}.
   * <pre>
   * ImmutableImagingStudy.builder()
   *    .status(com.fhir.ImagingstudyStatus) // optional {@link ImagingStudy#status() status}
   *    .subject(com.fhir.Reference) // required {@link ImagingStudy#subject() subject}
   *    .text(com.fhir.Narrative) // optional {@link ImagingStudy#text() text}
   *    .resourceType(String) // required {@link ImagingStudy#resourceType() resourceType}
   *    .modality(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link ImagingStudy#modality() modality}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link ImagingStudy#note() note}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ImagingStudy#reasonReference() reasonReference}
   *    .numberOfSeries(com.fhir.unsignedInt) // optional {@link ImagingStudy#numberOfSeries() numberOfSeries}
   *    .procedureCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ImagingStudy#procedureCode() procedureCode}
   *    .meta(com.fhir.Meta) // optional {@link ImagingStudy#meta() meta}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ImagingStudy#contained() contained}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ImagingStudy#identifier() identifier}
   *    .implicitRules(com.fhir.uri) // optional {@link ImagingStudy#implicitRules() implicitRules}
   *    .numberOfInstances(com.fhir.unsignedInt) // optional {@link ImagingStudy#numberOfInstances() numberOfInstances}
   *    .language(com.fhir.code) // optional {@link ImagingStudy#language() language}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ImagingStudy#reasonCode() reasonCode}
   *    .endpoint(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ImagingStudy#endpoint() endpoint}
   *    .referrer(com.fhir.Reference) // optional {@link ImagingStudy#referrer() referrer}
   *    .procedureReference(com.fhir.Reference) // optional {@link ImagingStudy#procedureReference() procedureReference}
   *    .started(com.fhir.dateTime) // optional {@link ImagingStudy#started() started}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ImagingStudy#basedOn() basedOn}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImagingStudy#modifierExtension() modifierExtension}
   *    .description(String) // optional {@link ImagingStudy#description() description}
   *    .interpreter(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ImagingStudy#interpreter() interpreter}
   *    .encounter(com.fhir.Reference) // optional {@link ImagingStudy#encounter() encounter}
   *    .id(com.fhir.id) // optional {@link ImagingStudy#id() id}
   *    .series(List&amp;lt;com.fhir.ImagingStudy_Series&amp;gt;) // optional {@link ImagingStudy#series() series}
   *    .location(com.fhir.Reference) // optional {@link ImagingStudy#location() location}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImagingStudy#extension() extension}
   *    .build();
   * </pre>
   * @return A new ImagingStudy builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableImagingStudy.Builder();
  }

  /**
   * Builds instances of type {@link ImagingStudy ImagingStudy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ImagingStudy", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_MODALITY = 0x4L;
    private static final long OPT_BIT_NOTE = 0x8L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x10L;
    private static final long OPT_BIT_NUMBER_OF_SERIES = 0x20L;
    private static final long OPT_BIT_PROCEDURE_CODE = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400L;
    private static final long OPT_BIT_NUMBER_OF_INSTANCES = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_REASON_CODE = 0x2000L;
    private static final long OPT_BIT_ENDPOINT = 0x4000L;
    private static final long OPT_BIT_REFERRER = 0x8000L;
    private static final long OPT_BIT_PROCEDURE_REFERENCE = 0x10000L;
    private static final long OPT_BIT_STARTED = 0x20000L;
    private static final long OPT_BIT_BASED_ON = 0x40000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000L;
    private static final long OPT_BIT_DESCRIPTION = 0x100000L;
    private static final long OPT_BIT_INTERPRETER = 0x200000L;
    private static final long OPT_BIT_ENCOUNTER = 0x400000L;
    private static final long OPT_BIT_ID = 0x800000L;
    private static final long OPT_BIT_SERIES = 0x1000000L;
    private static final long OPT_BIT_LOCATION = 0x2000000L;
    private static final long OPT_BIT_EXTENSION = 0x4000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.ImagingstudyStatus status;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> modality;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.unsignedInt numberOfSeries;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> procedureCode;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.unsignedInt numberOfInstances;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
    private @javax.annotation.Nullable com.fhir.Reference referrer;
    private @javax.annotation.Nullable com.fhir.Reference procedureReference;
    private @javax.annotation.Nullable com.fhir.dateTime started;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> interpreter;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ImagingStudy_Series> series;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImagingStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ImagingstudyStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ImagingstudyStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link ImagingStudy#subject() subject} attribute.
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
     * Initializes the optional value {@link ImagingStudy#text() text} to text.
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
     * Initializes the optional value {@link ImagingStudy#text() text} to text.
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
     * Initializes the value for the {@link ImagingStudy#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ImagingStudy#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for chained invocation
     */
    public final Builder modality(java.util.List<com.fhir.Coding> modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = java.util.Objects.requireNonNull(modality, "modality");
      optBits |= OPT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modality")
    public final Builder modality(java.util.Optional<? extends java.util.List<com.fhir.Coding>> modality) {
      checkNotIsSet(modalityIsSet(), "modality");
      this.modality = modality.orElse(null);
      optBits |= OPT_BIT_MODALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#note() note} to note.
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
     * Initializes the optional value {@link ImagingStudy#note() note} to note.
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
     * Initializes the optional value {@link ImagingStudy#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(java.util.List<com.fhir.Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = java.util.Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public final Builder reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfSeries() numberOfSeries} to numberOfSeries.
     * @param numberOfSeries The value for numberOfSeries
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfSeries(com.fhir.unsignedInt numberOfSeries) {
      checkNotIsSet(numberOfSeriesIsSet(), "numberOfSeries");
      this.numberOfSeries = java.util.Objects.requireNonNull(numberOfSeries, "numberOfSeries");
      optBits |= OPT_BIT_NUMBER_OF_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfSeries() numberOfSeries} to numberOfSeries.
     * @param numberOfSeries The value for numberOfSeries
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfSeries")
    public final Builder numberOfSeries(java.util.Optional<? extends com.fhir.unsignedInt> numberOfSeries) {
      checkNotIsSet(numberOfSeriesIsSet(), "numberOfSeries");
      this.numberOfSeries = numberOfSeries.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#procedureCode() procedureCode} to procedureCode.
     * @param procedureCode The value for procedureCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureCode(java.util.List<com.fhir.CodeableConcept> procedureCode) {
      checkNotIsSet(procedureCodeIsSet(), "procedureCode");
      this.procedureCode = java.util.Objects.requireNonNull(procedureCode, "procedureCode");
      optBits |= OPT_BIT_PROCEDURE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#procedureCode() procedureCode} to procedureCode.
     * @param procedureCode The value for procedureCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procedureCode")
    public final Builder procedureCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> procedureCode) {
      checkNotIsSet(procedureCodeIsSet(), "procedureCode");
      this.procedureCode = procedureCode.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#meta() meta} to meta.
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
     * Initializes the optional value {@link ImagingStudy#meta() meta} to meta.
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
     * Initializes the optional value {@link ImagingStudy#contained() contained} to contained.
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
     * Initializes the optional value {@link ImagingStudy#contained() contained} to contained.
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
     * Initializes the optional value {@link ImagingStudy#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ImagingStudy#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ImagingStudy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImagingStudy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImagingStudy#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfInstances(com.fhir.unsignedInt numberOfInstances) {
      checkNotIsSet(numberOfInstancesIsSet(), "numberOfInstances");
      this.numberOfInstances = java.util.Objects.requireNonNull(numberOfInstances, "numberOfInstances");
      optBits |= OPT_BIT_NUMBER_OF_INSTANCES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfInstances")
    public final Builder numberOfInstances(java.util.Optional<? extends com.fhir.unsignedInt> numberOfInstances) {
      checkNotIsSet(numberOfInstancesIsSet(), "numberOfInstances");
      this.numberOfInstances = numberOfInstances.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_INSTANCES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#language() language} to language.
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
     * Initializes the optional value {@link ImagingStudy#language() language} to language.
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
     * Initializes the optional value {@link ImagingStudy#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = java.util.Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public final Builder reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(java.util.List<com.fhir.Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public final Builder endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#referrer() referrer} to referrer.
     * @param referrer The value for referrer
     * @return {@code this} builder for chained invocation
     */
    public final Builder referrer(com.fhir.Reference referrer) {
      checkNotIsSet(referrerIsSet(), "referrer");
      this.referrer = java.util.Objects.requireNonNull(referrer, "referrer");
      optBits |= OPT_BIT_REFERRER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#referrer() referrer} to referrer.
     * @param referrer The value for referrer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    public final Builder referrer(java.util.Optional<? extends com.fhir.Reference> referrer) {
      checkNotIsSet(referrerIsSet(), "referrer");
      this.referrer = referrer.orElse(null);
      optBits |= OPT_BIT_REFERRER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureReference(com.fhir.Reference procedureReference) {
      checkNotIsSet(procedureReferenceIsSet(), "procedureReference");
      this.procedureReference = java.util.Objects.requireNonNull(procedureReference, "procedureReference");
      optBits |= OPT_BIT_PROCEDURE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procedureReference")
    public final Builder procedureReference(java.util.Optional<? extends com.fhir.Reference> procedureReference) {
      checkNotIsSet(procedureReferenceIsSet(), "procedureReference");
      this.procedureReference = procedureReference.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for chained invocation
     */
    public final Builder started(com.fhir.dateTime started) {
      checkNotIsSet(startedIsSet(), "started");
      this.started = java.util.Objects.requireNonNull(started, "started");
      optBits |= OPT_BIT_STARTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("started")
    public final Builder started(java.util.Optional<? extends com.fhir.dateTime> started) {
      checkNotIsSet(startedIsSet(), "started");
      this.started = started.orElse(null);
      optBits |= OPT_BIT_STARTED;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(java.util.List<com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy#description() description} to description.
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
     * Initializes the optional value {@link ImagingStudy#description() description} to description.
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
     * Initializes the optional value {@link ImagingStudy#interpreter() interpreter} to interpreter.
     * @param interpreter The value for interpreter
     * @return {@code this} builder for chained invocation
     */
    public final Builder interpreter(java.util.List<com.fhir.Reference> interpreter) {
      checkNotIsSet(interpreterIsSet(), "interpreter");
      this.interpreter = java.util.Objects.requireNonNull(interpreter, "interpreter");
      optBits |= OPT_BIT_INTERPRETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#interpreter() interpreter} to interpreter.
     * @param interpreter The value for interpreter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interpreter")
    public final Builder interpreter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> interpreter) {
      checkNotIsSet(interpreterIsSet(), "interpreter");
      this.interpreter = interpreter.orElse(null);
      optBits |= OPT_BIT_INTERPRETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ImagingStudy#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ImagingStudy#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    public final Builder series(java.util.List<com.fhir.ImagingStudy_Series> series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = java.util.Objects.requireNonNull(series, "series");
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("series")
    public final Builder series(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Series>> series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = series.orElse(null);
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy#extension() extension} to extension.
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
     * Builds a new {@link ImagingStudy ImagingStudy}.
     * @return An immutable instance of ImagingStudy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImagingStudy build() {
      checkRequiredAttributes();
      return new ImmutableImagingStudy(
          status,
          subject,
          text,
          resourceType,
          modality,
          note,
          reasonReference,
          numberOfSeries,
          procedureCode,
          meta,
          contained,
          identifier,
          implicitRules,
          numberOfInstances,
          language,
          reasonCode,
          endpoint,
          referrer,
          procedureReference,
          started,
          basedOn,
          modifierExtension,
          description,
          interpreter,
          encounter,
          id,
          series,
          location,
          extension);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modalityIsSet() {
      return (optBits & OPT_BIT_MODALITY) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean numberOfSeriesIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_SERIES) != 0;
    }

    private boolean procedureCodeIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_CODE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean numberOfInstancesIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_INSTANCES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean referrerIsSet() {
      return (optBits & OPT_BIT_REFERRER) != 0;
    }

    private boolean procedureReferenceIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_REFERENCE) != 0;
    }

    private boolean startedIsSet() {
      return (optBits & OPT_BIT_STARTED) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean interpreterIsSet() {
      return (optBits & OPT_BIT_INTERPRETER) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean seriesIsSet() {
      return (optBits & OPT_BIT_SERIES) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImagingStudy is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ImagingStudy, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImagingStudy", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "ImagingStudy", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ImagingStudy", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImagingStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ImagingstudyStatus status);

    /**
     * Initializes the optional value {@link ImagingStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ImagingstudyStatus> status);

    /**
     * Initializes the optional value {@link ImagingStudy#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ImagingStudy#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ImagingStudy#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modality(java.util.List<com.fhir.Coding> modality);

    /**
     * Initializes the optional value {@link ImagingStudy#modality() modality} to modality.
     * @param modality The value for modality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modality(java.util.Optional<? extends java.util.List<com.fhir.Coding>> modality);

    /**
     * Initializes the optional value {@link ImagingStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link ImagingStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link ImagingStudy#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link ImagingStudy#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfSeries() numberOfSeries} to numberOfSeries.
     * @param numberOfSeries The value for numberOfSeries
     * @return {@code this} builder for chained invocation
     */
    BuildFinal numberOfSeries(com.fhir.unsignedInt numberOfSeries);

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfSeries() numberOfSeries} to numberOfSeries.
     * @param numberOfSeries The value for numberOfSeries
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal numberOfSeries(java.util.Optional<? extends com.fhir.unsignedInt> numberOfSeries);

    /**
     * Initializes the optional value {@link ImagingStudy#procedureCode() procedureCode} to procedureCode.
     * @param procedureCode The value for procedureCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedureCode(java.util.List<com.fhir.CodeableConcept> procedureCode);

    /**
     * Initializes the optional value {@link ImagingStudy#procedureCode() procedureCode} to procedureCode.
     * @param procedureCode The value for procedureCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedureCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> procedureCode);

    /**
     * Initializes the optional value {@link ImagingStudy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ImagingStudy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ImagingStudy#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ImagingStudy#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ImagingStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ImagingStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ImagingStudy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ImagingStudy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for chained invocation
     */
    BuildFinal numberOfInstances(com.fhir.unsignedInt numberOfInstances);

    /**
     * Initializes the optional value {@link ImagingStudy#numberOfInstances() numberOfInstances} to numberOfInstances.
     * @param numberOfInstances The value for numberOfInstances
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal numberOfInstances(java.util.Optional<? extends com.fhir.unsignedInt> numberOfInstances);

    /**
     * Initializes the optional value {@link ImagingStudy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ImagingStudy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ImagingStudy#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link ImagingStudy#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link ImagingStudy#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(java.util.List<com.fhir.Reference> endpoint);

    /**
     * Initializes the optional value {@link ImagingStudy#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint);

    /**
     * Initializes the optional value {@link ImagingStudy#referrer() referrer} to referrer.
     * @param referrer The value for referrer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referrer(com.fhir.Reference referrer);

    /**
     * Initializes the optional value {@link ImagingStudy#referrer() referrer} to referrer.
     * @param referrer The value for referrer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referrer(java.util.Optional<? extends com.fhir.Reference> referrer);

    /**
     * Initializes the optional value {@link ImagingStudy#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedureReference(com.fhir.Reference procedureReference);

    /**
     * Initializes the optional value {@link ImagingStudy#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedureReference(java.util.Optional<? extends com.fhir.Reference> procedureReference);

    /**
     * Initializes the optional value {@link ImagingStudy#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for chained invocation
     */
    BuildFinal started(com.fhir.dateTime started);

    /**
     * Initializes the optional value {@link ImagingStudy#started() started} to started.
     * @param started The value for started
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal started(java.util.Optional<? extends com.fhir.dateTime> started);

    /**
     * Initializes the optional value {@link ImagingStudy#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link ImagingStudy#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link ImagingStudy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link ImagingStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link ImagingStudy#interpreter() interpreter} to interpreter.
     * @param interpreter The value for interpreter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal interpreter(java.util.List<com.fhir.Reference> interpreter);

    /**
     * Initializes the optional value {@link ImagingStudy#interpreter() interpreter} to interpreter.
     * @param interpreter The value for interpreter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal interpreter(java.util.Optional<? extends java.util.List<com.fhir.Reference>> interpreter);

    /**
     * Initializes the optional value {@link ImagingStudy#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link ImagingStudy#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link ImagingStudy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ImagingStudy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ImagingStudy#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    BuildFinal series(java.util.List<com.fhir.ImagingStudy_Series> series);

    /**
     * Initializes the optional value {@link ImagingStudy#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal series(java.util.Optional<? extends java.util.List<com.fhir.ImagingStudy_Series>> series);

    /**
     * Initializes the optional value {@link ImagingStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link ImagingStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link ImagingStudy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImagingStudy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Builds a new {@link ImagingStudy ImagingStudy}.
     * @return An immutable instance of ImagingStudy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImagingStudy build();
  }
}
