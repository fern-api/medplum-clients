//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link GuidanceResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGuidanceResponse.builder()}.
 */
@org.immutables.value.Generated(from = "GuidanceResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGuidanceResponse implements com.fhir.GuidanceResponse {
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.GuidanceresponseStatus status;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> evaluationMessage;
  private final @javax.annotation.Nullable com.fhir.Reference performer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept moduleCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference outputParameters;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.dateTime occurrenceDateTime;
  private final @javax.annotation.Nullable java.lang.String moduleCanonical;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.lang.String moduleUri;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Identifier requestIdentifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> dataRequirement;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Reference result;

  private ImmutableGuidanceResponse(
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.GuidanceresponseStatus status,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> evaluationMessage,
      @javax.annotation.Nullable com.fhir.Reference performer,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept moduleCodeableConcept,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference outputParameters,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.dateTime occurrenceDateTime,
      @javax.annotation.Nullable java.lang.String moduleCanonical,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.lang.String moduleUri,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Identifier requestIdentifier,
      @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> dataRequirement,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Reference result) {
    this.reasonCode = reasonCode;
    this.encounter = encounter;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.meta = meta;
    this.evaluationMessage = evaluationMessage;
    this.performer = performer;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.moduleCodeableConcept = moduleCodeableConcept;
    this.text = text;
    this.outputParameters = outputParameters;
    this.resourceType = resourceType;
    this.note = note;
    this.id = id;
    this.language = language;
    this.occurrenceDateTime = occurrenceDateTime;
    this.moduleCanonical = moduleCanonical;
    this.subject = subject;
    this.moduleUri = moduleUri;
    this.extension = extension;
    this.requestIdentifier = requestIdentifier;
    this.dataRequirement = dataRequirement;
    this.contained = contained;
    this.reasonReference = reasonReference;
    this.result = result;
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
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.GuidanceresponseStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code evaluationMessage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("evaluationMessage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> evaluationMessage() {
    return java.util.Optional.ofNullable(evaluationMessage);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<com.fhir.Reference> performer() {
    return java.util.Optional.ofNullable(performer);
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
   * @return The value of the {@code moduleCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("moduleCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> moduleCodeableConcept() {
    return java.util.Optional.ofNullable(moduleCodeableConcept);
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
   * @return The value of the {@code outputParameters} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outputParameters")
  @Override
  public java.util.Optional<com.fhir.Reference> outputParameters() {
    return java.util.Optional.ofNullable(outputParameters);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
  @Override
  public java.util.Optional<com.fhir.dateTime> occurrenceDateTime() {
    return java.util.Optional.ofNullable(occurrenceDateTime);
  }

  /**
   * @return The value of the {@code moduleCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("moduleCanonical")
  @Override
  public java.util.Optional<java.lang.String> moduleCanonical() {
    return java.util.Optional.ofNullable(moduleCanonical);
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
   * @return The value of the {@code moduleUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("moduleUri")
  @Override
  public java.util.Optional<java.lang.String> moduleUri() {
    return java.util.Optional.ofNullable(moduleUri);
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
   * @return The value of the {@code requestIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> requestIdentifier() {
    return java.util.Optional.ofNullable(requestIdentifier);
  }

  /**
   * @return The value of the {@code dataRequirement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dataRequirement")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DataRequirement>> dataRequirement() {
    return java.util.Optional.ofNullable(dataRequirement);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
  }

  /**
   * @return The value of the {@code result} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("result")
  @Override
  public java.util.Optional<com.fhir.Reference> result() {
    return java.util.Optional.ofNullable(result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableGuidanceResponse(
        newValue,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableGuidanceResponse(
        value,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        newValue,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        value,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        newValue,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        value,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withStatus(com.fhir.GuidanceresponseStatus value) {
    @javax.annotation.Nullable com.fhir.GuidanceresponseStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        newValue,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withStatus(java.util.Optional<? extends com.fhir.GuidanceresponseStatus> optional) {
    @javax.annotation.Nullable com.fhir.GuidanceresponseStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        value,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        newValue,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        value,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#evaluationMessage() evaluationMessage} attribute.
   * @param value The value for evaluationMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withEvaluationMessage(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "evaluationMessage");
    if (this.evaluationMessage == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        newValue,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#evaluationMessage() evaluationMessage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for evaluationMessage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withEvaluationMessage(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.evaluationMessage == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        value,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withPerformer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        newValue,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withPerformer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        value,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        newValue,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        value,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        newValue,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        value,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} attribute.
   * @param value The value for moduleCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "moduleCodeableConcept");
    if (this.moduleCodeableConcept == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        newValue,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for moduleCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withModuleCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.moduleCodeableConcept == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        value,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        newValue,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        value,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#outputParameters() outputParameters} attribute.
   * @param value The value for outputParameters
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withOutputParameters(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "outputParameters");
    if (this.outputParameters == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        newValue,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#outputParameters() outputParameters} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outputParameters
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withOutputParameters(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.outputParameters == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        value,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GuidanceResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGuidanceResponse withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        newValue,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        newValue,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        value,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        newValue,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        value,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        newValue,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        value,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withOccurrenceDateTime(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (this.occurrenceDateTime == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        newValue,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withOccurrenceDateTime(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.occurrenceDateTime == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        value,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#moduleCanonical() moduleCanonical} attribute.
   * @param value The value for moduleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleCanonical(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "moduleCanonical");
    if (java.util.Objects.equals(this.moduleCanonical, newValue)) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        newValue,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#moduleCanonical() moduleCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for moduleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleCanonical(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.moduleCanonical, value)) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        value,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        newValue,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        value,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#moduleUri() moduleUri} attribute.
   * @param value The value for moduleUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "moduleUri");
    if (java.util.Objects.equals(this.moduleUri, newValue)) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        newValue,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#moduleUri() moduleUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for moduleUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.moduleUri, value)) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        value,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        newValue,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        value,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#requestIdentifier() requestIdentifier} attribute.
   * @param value The value for requestIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withRequestIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "requestIdentifier");
    if (this.requestIdentifier == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        newValue,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#requestIdentifier() requestIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withRequestIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.requestIdentifier == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        value,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#dataRequirement() dataRequirement} attribute.
   * @param value The value for dataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withDataRequirement(java.util.List<com.fhir.DataRequirement> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> newValue = java.util.Objects.requireNonNull(value, "dataRequirement");
    if (this.dataRequirement == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        newValue,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#dataRequirement() dataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withDataRequirement(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> value = optional.orElse(null);
    if (this.dataRequirement == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        value,
        this.contained,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        newValue,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        value,
        this.reasonReference,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        newValue,
        this.result);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        value,
        this.result);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#result() result} attribute.
   * @param value The value for result
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withResult(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "result");
    if (this.result == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#result() result} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for result
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withResult(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.result == value) return this;
    return new ImmutableGuidanceResponse(
        this.reasonCode,
        this.encounter,
        this.modifierExtension,
        this.status,
        this.meta,
        this.evaluationMessage,
        this.performer,
        this.identifier,
        this.implicitRules,
        this.moduleCodeableConcept,
        this.text,
        this.outputParameters,
        this.resourceType,
        this.note,
        this.id,
        this.language,
        this.occurrenceDateTime,
        this.moduleCanonical,
        this.subject,
        this.moduleUri,
        this.extension,
        this.requestIdentifier,
        this.dataRequirement,
        this.contained,
        this.reasonReference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGuidanceResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGuidanceResponse
        && equalTo((ImmutableGuidanceResponse) another);
  }

  private boolean equalTo(ImmutableGuidanceResponse another) {
    return java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(evaluationMessage, another.evaluationMessage)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(moduleCodeableConcept, another.moduleCodeableConcept)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(outputParameters, another.outputParameters)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && java.util.Objects.equals(moduleCanonical, another.moduleCanonical)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(moduleUri, another.moduleUri)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(requestIdentifier, another.requestIdentifier)
        && java.util.Objects.equals(dataRequirement, another.dataRequirement)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(result, another.result);
  }

  /**
   * Computes a hash code from attributes: {@code reasonCode}, {@code encounter}, {@code modifierExtension}, {@code status}, {@code meta}, {@code evaluationMessage}, {@code performer}, {@code identifier}, {@code implicitRules}, {@code moduleCodeableConcept}, {@code text}, {@code outputParameters}, {@code resourceType}, {@code note}, {@code id}, {@code language}, {@code occurrenceDateTime}, {@code moduleCanonical}, {@code subject}, {@code moduleUri}, {@code extension}, {@code requestIdentifier}, {@code dataRequirement}, {@code contained}, {@code reasonReference}, {@code result}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(evaluationMessage);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(moduleCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(outputParameters);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + java.util.Objects.hashCode(moduleCanonical);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(moduleUri);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(requestIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(dataRequirement);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(result);
    return h;
  }

  /**
   * Prints the immutable value {@code GuidanceResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("GuidanceResponse{");
    if (reasonCode != null) {
      builder.append("reasonCode=").append(reasonCode);
    }
    if (encounter != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (meta != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (evaluationMessage != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("evaluationMessage=").append(evaluationMessage);
    }
    if (performer != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (identifier != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (moduleCodeableConcept != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("moduleCodeableConcept=").append(moduleCodeableConcept);
    }
    if (text != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (outputParameters != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("outputParameters=").append(outputParameters);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (moduleCanonical != null) {
      builder.append(", ");
      builder.append("moduleCanonical=").append(moduleCanonical);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (moduleUri != null) {
      builder.append(", ");
      builder.append("moduleUri=").append(moduleUri);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (requestIdentifier != null) {
      builder.append(", ");
      builder.append("requestIdentifier=").append(requestIdentifier);
    }
    if (dataRequirement != null) {
      builder.append(", ");
      builder.append("dataRequirement=").append(dataRequirement);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (result != null) {
      builder.append(", ");
      builder.append("result=").append(result);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "GuidanceResponse", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.GuidanceResponse {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.GuidanceresponseStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> evaluationMessage = java.util.Optional.empty();
    boolean evaluationMessageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> moduleCodeableConcept = java.util.Optional.empty();
    boolean moduleCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> outputParameters = java.util.Optional.empty();
    boolean outputParametersIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> moduleCanonical = java.util.Optional.empty();
    boolean moduleCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> moduleUri = java.util.Optional.empty();
    boolean moduleUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> requestIdentifier = java.util.Optional.empty();
    boolean requestIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DataRequirement>> dataRequirement = java.util.Optional.empty();
    boolean dataRequirementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> result = java.util.Optional.empty();
    boolean resultIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.GuidanceresponseStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("evaluationMessage")
    public void setEvaluationMessage(java.util.Optional<java.util.List<com.fhir.Reference>> evaluationMessage) {
      this.evaluationMessage = evaluationMessage;
      this.evaluationMessageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<com.fhir.Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("moduleCodeableConcept")
    public void setModuleCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> moduleCodeableConcept) {
      this.moduleCodeableConcept = moduleCodeableConcept;
      this.moduleCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outputParameters")
    public void setOutputParameters(java.util.Optional<com.fhir.Reference> outputParameters) {
      this.outputParameters = outputParameters;
      this.outputParametersIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<com.fhir.dateTime> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("moduleCanonical")
    public void setModuleCanonical(java.util.Optional<java.lang.String> moduleCanonical) {
      this.moduleCanonical = moduleCanonical;
      this.moduleCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("moduleUri")
    public void setModuleUri(java.util.Optional<java.lang.String> moduleUri) {
      this.moduleUri = moduleUri;
      this.moduleUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestIdentifier")
    public void setRequestIdentifier(java.util.Optional<com.fhir.Identifier> requestIdentifier) {
      this.requestIdentifier = requestIdentifier;
      this.requestIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dataRequirement")
    public void setDataRequirement(java.util.Optional<java.util.List<com.fhir.DataRequirement>> dataRequirement) {
      this.dataRequirement = dataRequirement;
      this.dataRequirementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    public void setResult(java.util.Optional<com.fhir.Reference> result) {
      this.result = result;
      this.resultIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.GuidanceresponseStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> evaluationMessage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> moduleCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> outputParameters() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> moduleCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> moduleUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> requestIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DataRequirement>> dataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> result() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableGuidanceResponse fromJson(Json json) {
    ImmutableGuidanceResponse.Builder builder = ((ImmutableGuidanceResponse.Builder) ImmutableGuidanceResponse.builder());
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.evaluationMessageIsSet) {
      builder.evaluationMessage(json.evaluationMessage);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.moduleCodeableConceptIsSet) {
      builder.moduleCodeableConcept(json.moduleCodeableConcept);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.outputParametersIsSet) {
      builder.outputParameters(json.outputParameters);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.moduleCanonicalIsSet) {
      builder.moduleCanonical(json.moduleCanonical);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.moduleUriIsSet) {
      builder.moduleUri(json.moduleUri);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.requestIdentifierIsSet) {
      builder.requestIdentifier(json.requestIdentifier);
    }
    if (json.dataRequirementIsSet) {
      builder.dataRequirement(json.dataRequirement);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    return (ImmutableGuidanceResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GuidanceResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GuidanceResponse instance
   */
  public static GuidanceResponse copyOf(GuidanceResponse instance) {
    if (instance instanceof ImmutableGuidanceResponse) {
      return (ImmutableGuidanceResponse) instance;
    }
    return ((ImmutableGuidanceResponse.Builder) ImmutableGuidanceResponse.builder())
        .reasonCode(instance.reasonCode())
        .encounter(instance.encounter())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .meta(instance.meta())
        .evaluationMessage(instance.evaluationMessage())
        .performer(instance.performer())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .moduleCodeableConcept(instance.moduleCodeableConcept())
        .text(instance.text())
        .outputParameters(instance.outputParameters())
        .resourceType(instance.resourceType())
        .note(instance.note())
        .id(instance.id())
        .language(instance.language())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .moduleCanonical(instance.moduleCanonical())
        .subject(instance.subject())
        .moduleUri(instance.moduleUri())
        .extension(instance.extension())
        .requestIdentifier(instance.requestIdentifier())
        .dataRequirement(instance.dataRequirement())
        .contained(instance.contained())
        .reasonReference(instance.reasonReference())
        .result(instance.result())
        .build();
  }

  /**
   * Creates a builder for {@link GuidanceResponse GuidanceResponse}.
   * <pre>
   * ImmutableGuidanceResponse.builder()
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link GuidanceResponse#reasonCode() reasonCode}
   *    .encounter(com.fhir.Reference) // optional {@link GuidanceResponse#encounter() encounter}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link GuidanceResponse#modifierExtension() modifierExtension}
   *    .status(com.fhir.GuidanceresponseStatus) // optional {@link GuidanceResponse#status() status}
   *    .meta(com.fhir.Meta) // optional {@link GuidanceResponse#meta() meta}
   *    .evaluationMessage(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link GuidanceResponse#evaluationMessage() evaluationMessage}
   *    .performer(com.fhir.Reference) // optional {@link GuidanceResponse#performer() performer}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link GuidanceResponse#identifier() identifier}
   *    .implicitRules(com.fhir.uri) // optional {@link GuidanceResponse#implicitRules() implicitRules}
   *    .moduleCodeableConcept(com.fhir.CodeableConcept) // optional {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept}
   *    .text(com.fhir.Narrative) // optional {@link GuidanceResponse#text() text}
   *    .outputParameters(com.fhir.Reference) // optional {@link GuidanceResponse#outputParameters() outputParameters}
   *    .resourceType(String) // required {@link GuidanceResponse#resourceType() resourceType}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link GuidanceResponse#note() note}
   *    .id(com.fhir.id) // optional {@link GuidanceResponse#id() id}
   *    .language(com.fhir.code) // optional {@link GuidanceResponse#language() language}
   *    .occurrenceDateTime(com.fhir.dateTime) // optional {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime}
   *    .moduleCanonical(String) // optional {@link GuidanceResponse#moduleCanonical() moduleCanonical}
   *    .subject(com.fhir.Reference) // optional {@link GuidanceResponse#subject() subject}
   *    .moduleUri(String) // optional {@link GuidanceResponse#moduleUri() moduleUri}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link GuidanceResponse#extension() extension}
   *    .requestIdentifier(com.fhir.Identifier) // optional {@link GuidanceResponse#requestIdentifier() requestIdentifier}
   *    .dataRequirement(List&amp;lt;com.fhir.DataRequirement&amp;gt;) // optional {@link GuidanceResponse#dataRequirement() dataRequirement}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link GuidanceResponse#contained() contained}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link GuidanceResponse#reasonReference() reasonReference}
   *    .result(com.fhir.Reference) // optional {@link GuidanceResponse#result() result}
   *    .build();
   * </pre>
   * @return A new GuidanceResponse builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableGuidanceResponse.Builder();
  }

  /**
   * Builds instances of type {@link GuidanceResponse GuidanceResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "GuidanceResponse", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_REASON_CODE = 0x1L;
    private static final long OPT_BIT_ENCOUNTER = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_EVALUATION_MESSAGE = 0x20L;
    private static final long OPT_BIT_PERFORMER = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_MODULE_CODEABLE_CONCEPT = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_OUTPUT_PARAMETERS = 0x800L;
    private static final long OPT_BIT_NOTE = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x8000L;
    private static final long OPT_BIT_MODULE_CANONICAL = 0x10000L;
    private static final long OPT_BIT_SUBJECT = 0x20000L;
    private static final long OPT_BIT_MODULE_URI = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_REQUEST_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_DATA_REQUIREMENT = 0x200000L;
    private static final long OPT_BIT_CONTAINED = 0x400000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x800000L;
    private static final long OPT_BIT_RESULT = 0x1000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.GuidanceresponseStatus status;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> evaluationMessage;
    private @javax.annotation.Nullable com.fhir.Reference performer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept moduleCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference outputParameters;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.dateTime occurrenceDateTime;
    private @javax.annotation.Nullable java.lang.String moduleCanonical;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.lang.String moduleUri;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Identifier requestIdentifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> dataRequirement;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Reference result;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link GuidanceResponse#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link GuidanceResponse#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link GuidanceResponse#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link GuidanceResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GuidanceResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GuidanceResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.GuidanceresponseStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.GuidanceresponseStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link GuidanceResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link GuidanceResponse#evaluationMessage() evaluationMessage} to evaluationMessage.
     * @param evaluationMessage The value for evaluationMessage
     * @return {@code this} builder for chained invocation
     */
    public final Builder evaluationMessage(java.util.List<com.fhir.Reference> evaluationMessage) {
      checkNotIsSet(evaluationMessageIsSet(), "evaluationMessage");
      this.evaluationMessage = java.util.Objects.requireNonNull(evaluationMessage, "evaluationMessage");
      optBits |= OPT_BIT_EVALUATION_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#evaluationMessage() evaluationMessage} to evaluationMessage.
     * @param evaluationMessage The value for evaluationMessage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evaluationMessage")
    public final Builder evaluationMessage(java.util.Optional<? extends java.util.List<com.fhir.Reference>> evaluationMessage) {
      checkNotIsSet(evaluationMessageIsSet(), "evaluationMessage");
      this.evaluationMessage = evaluationMessage.orElse(null);
      optBits |= OPT_BIT_EVALUATION_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(com.fhir.Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends com.fhir.Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link GuidanceResponse#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link GuidanceResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link GuidanceResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} to moduleCodeableConcept.
     * @param moduleCodeableConcept The value for moduleCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder moduleCodeableConcept(com.fhir.CodeableConcept moduleCodeableConcept) {
      checkNotIsSet(moduleCodeableConceptIsSet(), "moduleCodeableConcept");
      this.moduleCodeableConcept = java.util.Objects.requireNonNull(moduleCodeableConcept, "moduleCodeableConcept");
      optBits |= OPT_BIT_MODULE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} to moduleCodeableConcept.
     * @param moduleCodeableConcept The value for moduleCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleCodeableConcept")
    public final Builder moduleCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> moduleCodeableConcept) {
      checkNotIsSet(moduleCodeableConceptIsSet(), "moduleCodeableConcept");
      this.moduleCodeableConcept = moduleCodeableConcept.orElse(null);
      optBits |= OPT_BIT_MODULE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#text() text} to text.
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
     * Initializes the optional value {@link GuidanceResponse#text() text} to text.
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
     * Initializes the optional value {@link GuidanceResponse#outputParameters() outputParameters} to outputParameters.
     * @param outputParameters The value for outputParameters
     * @return {@code this} builder for chained invocation
     */
    public final Builder outputParameters(com.fhir.Reference outputParameters) {
      checkNotIsSet(outputParametersIsSet(), "outputParameters");
      this.outputParameters = java.util.Objects.requireNonNull(outputParameters, "outputParameters");
      optBits |= OPT_BIT_OUTPUT_PARAMETERS;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#outputParameters() outputParameters} to outputParameters.
     * @param outputParameters The value for outputParameters
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outputParameters")
    public final Builder outputParameters(java.util.Optional<? extends com.fhir.Reference> outputParameters) {
      checkNotIsSet(outputParametersIsSet(), "outputParameters");
      this.outputParameters = outputParameters.orElse(null);
      optBits |= OPT_BIT_OUTPUT_PARAMETERS;
      return this;
    }

    /**
     * Initializes the value for the {@link GuidanceResponse#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link GuidanceResponse#note() note} to note.
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
     * Initializes the optional value {@link GuidanceResponse#note() note} to note.
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
     * Initializes the optional value {@link GuidanceResponse#id() id} to id.
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
     * Initializes the optional value {@link GuidanceResponse#id() id} to id.
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
     * Initializes the optional value {@link GuidanceResponse#language() language} to language.
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
     * Initializes the optional value {@link GuidanceResponse#language() language} to language.
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
     * Initializes the optional value {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(com.fhir.dateTime occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = java.util.Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(java.util.Optional<? extends com.fhir.dateTime> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCanonical() moduleCanonical} to moduleCanonical.
     * @param moduleCanonical The value for moduleCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder moduleCanonical(java.lang.String moduleCanonical) {
      checkNotIsSet(moduleCanonicalIsSet(), "moduleCanonical");
      this.moduleCanonical = java.util.Objects.requireNonNull(moduleCanonical, "moduleCanonical");
      optBits |= OPT_BIT_MODULE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCanonical() moduleCanonical} to moduleCanonical.
     * @param moduleCanonical The value for moduleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleCanonical")
    public final Builder moduleCanonical(java.util.Optional<java.lang.String> moduleCanonical) {
      checkNotIsSet(moduleCanonicalIsSet(), "moduleCanonical");
      this.moduleCanonical = moduleCanonical.orElse(null);
      optBits |= OPT_BIT_MODULE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#subject() subject} to subject.
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
     * Initializes the optional value {@link GuidanceResponse#subject() subject} to subject.
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
     * Initializes the optional value {@link GuidanceResponse#moduleUri() moduleUri} to moduleUri.
     * @param moduleUri The value for moduleUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder moduleUri(java.lang.String moduleUri) {
      checkNotIsSet(moduleUriIsSet(), "moduleUri");
      this.moduleUri = java.util.Objects.requireNonNull(moduleUri, "moduleUri");
      optBits |= OPT_BIT_MODULE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleUri() moduleUri} to moduleUri.
     * @param moduleUri The value for moduleUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleUri")
    public final Builder moduleUri(java.util.Optional<java.lang.String> moduleUri) {
      checkNotIsSet(moduleUriIsSet(), "moduleUri");
      this.moduleUri = moduleUri.orElse(null);
      optBits |= OPT_BIT_MODULE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link GuidanceResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link GuidanceResponse#requestIdentifier() requestIdentifier} to requestIdentifier.
     * @param requestIdentifier The value for requestIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestIdentifier(com.fhir.Identifier requestIdentifier) {
      checkNotIsSet(requestIdentifierIsSet(), "requestIdentifier");
      this.requestIdentifier = java.util.Objects.requireNonNull(requestIdentifier, "requestIdentifier");
      optBits |= OPT_BIT_REQUEST_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#requestIdentifier() requestIdentifier} to requestIdentifier.
     * @param requestIdentifier The value for requestIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestIdentifier")
    public final Builder requestIdentifier(java.util.Optional<? extends com.fhir.Identifier> requestIdentifier) {
      checkNotIsSet(requestIdentifierIsSet(), "requestIdentifier");
      this.requestIdentifier = requestIdentifier.orElse(null);
      optBits |= OPT_BIT_REQUEST_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataRequirement(java.util.List<com.fhir.DataRequirement> dataRequirement) {
      checkNotIsSet(dataRequirementIsSet(), "dataRequirement");
      this.dataRequirement = java.util.Objects.requireNonNull(dataRequirement, "dataRequirement");
      optBits |= OPT_BIT_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataRequirement")
    public final Builder dataRequirement(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> dataRequirement) {
      checkNotIsSet(dataRequirementIsSet(), "dataRequirement");
      this.dataRequirement = dataRequirement.orElse(null);
      optBits |= OPT_BIT_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link GuidanceResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link GuidanceResponse#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link GuidanceResponse#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link GuidanceResponse#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    public final Builder result(com.fhir.Reference result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = java.util.Objects.requireNonNull(result, "result");
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    public final Builder result(java.util.Optional<? extends com.fhir.Reference> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = result.orElse(null);
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Builds a new {@link GuidanceResponse GuidanceResponse}.
     * @return An immutable instance of GuidanceResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.GuidanceResponse build() {
      checkRequiredAttributes();
      return new ImmutableGuidanceResponse(
          reasonCode,
          encounter,
          modifierExtension,
          status,
          meta,
          evaluationMessage,
          performer,
          identifier,
          implicitRules,
          moduleCodeableConcept,
          text,
          outputParameters,
          resourceType,
          note,
          id,
          language,
          occurrenceDateTime,
          moduleCanonical,
          subject,
          moduleUri,
          extension,
          requestIdentifier,
          dataRequirement,
          contained,
          reasonReference,
          result);
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean evaluationMessageIsSet() {
      return (optBits & OPT_BIT_EVALUATION_MESSAGE) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean moduleCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MODULE_CODEABLE_CONCEPT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean outputParametersIsSet() {
      return (optBits & OPT_BIT_OUTPUT_PARAMETERS) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean moduleCanonicalIsSet() {
      return (optBits & OPT_BIT_MODULE_CANONICAL) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean moduleUriIsSet() {
      return (optBits & OPT_BIT_MODULE_URI) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean requestIdentifierIsSet() {
      return (optBits & OPT_BIT_REQUEST_IDENTIFIER) != 0;
    }

    private boolean dataRequirementIsSet() {
      return (optBits & OPT_BIT_DATA_REQUIREMENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean resultIsSet() {
      return (optBits & OPT_BIT_RESULT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of GuidanceResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build GuidanceResponse, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "GuidanceResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link GuidanceResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "GuidanceResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link GuidanceResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link GuidanceResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link GuidanceResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link GuidanceResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link GuidanceResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.GuidanceresponseStatus status);

    /**
     * Initializes the optional value {@link GuidanceResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.GuidanceresponseStatus> status);

    /**
     * Initializes the optional value {@link GuidanceResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link GuidanceResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link GuidanceResponse#evaluationMessage() evaluationMessage} to evaluationMessage.
     * @param evaluationMessage The value for evaluationMessage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal evaluationMessage(java.util.List<com.fhir.Reference> evaluationMessage);

    /**
     * Initializes the optional value {@link GuidanceResponse#evaluationMessage() evaluationMessage} to evaluationMessage.
     * @param evaluationMessage The value for evaluationMessage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal evaluationMessage(java.util.Optional<? extends java.util.List<com.fhir.Reference>> evaluationMessage);

    /**
     * Initializes the optional value {@link GuidanceResponse#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(com.fhir.Reference performer);

    /**
     * Initializes the optional value {@link GuidanceResponse#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link GuidanceResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link GuidanceResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link GuidanceResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link GuidanceResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} to moduleCodeableConcept.
     * @param moduleCodeableConcept The value for moduleCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal moduleCodeableConcept(com.fhir.CodeableConcept moduleCodeableConcept);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} to moduleCodeableConcept.
     * @param moduleCodeableConcept The value for moduleCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal moduleCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> moduleCodeableConcept);

    /**
     * Initializes the optional value {@link GuidanceResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link GuidanceResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link GuidanceResponse#outputParameters() outputParameters} to outputParameters.
     * @param outputParameters The value for outputParameters
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outputParameters(com.fhir.Reference outputParameters);

    /**
     * Initializes the optional value {@link GuidanceResponse#outputParameters() outputParameters} to outputParameters.
     * @param outputParameters The value for outputParameters
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outputParameters(java.util.Optional<? extends com.fhir.Reference> outputParameters);

    /**
     * Initializes the optional value {@link GuidanceResponse#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link GuidanceResponse#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link GuidanceResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link GuidanceResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link GuidanceResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link GuidanceResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(com.fhir.dateTime occurrenceDateTime);

    /**
     * Initializes the optional value {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<? extends com.fhir.dateTime> occurrenceDateTime);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCanonical() moduleCanonical} to moduleCanonical.
     * @param moduleCanonical The value for moduleCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal moduleCanonical(java.lang.String moduleCanonical);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCanonical() moduleCanonical} to moduleCanonical.
     * @param moduleCanonical The value for moduleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal moduleCanonical(java.util.Optional<java.lang.String> moduleCanonical);

    /**
     * Initializes the optional value {@link GuidanceResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link GuidanceResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleUri() moduleUri} to moduleUri.
     * @param moduleUri The value for moduleUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal moduleUri(java.lang.String moduleUri);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleUri() moduleUri} to moduleUri.
     * @param moduleUri The value for moduleUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal moduleUri(java.util.Optional<java.lang.String> moduleUri);

    /**
     * Initializes the optional value {@link GuidanceResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link GuidanceResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link GuidanceResponse#requestIdentifier() requestIdentifier} to requestIdentifier.
     * @param requestIdentifier The value for requestIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestIdentifier(com.fhir.Identifier requestIdentifier);

    /**
     * Initializes the optional value {@link GuidanceResponse#requestIdentifier() requestIdentifier} to requestIdentifier.
     * @param requestIdentifier The value for requestIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestIdentifier(java.util.Optional<? extends com.fhir.Identifier> requestIdentifier);

    /**
     * Initializes the optional value {@link GuidanceResponse#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataRequirement(java.util.List<com.fhir.DataRequirement> dataRequirement);

    /**
     * Initializes the optional value {@link GuidanceResponse#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataRequirement(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> dataRequirement);

    /**
     * Initializes the optional value {@link GuidanceResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link GuidanceResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link GuidanceResponse#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    BuildFinal result(com.fhir.Reference result);

    /**
     * Initializes the optional value {@link GuidanceResponse#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal result(java.util.Optional<? extends com.fhir.Reference> result);

    /**
     * Builds a new {@link GuidanceResponse GuidanceResponse}.
     * @return An immutable instance of GuidanceResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    GuidanceResponse build();
  }
}
