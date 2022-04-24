//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RiskAssessment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskAssessment.builder()}.
 */
@org.immutables.value.Generated(from = "RiskAssessment", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskAssessment implements com.fhir.RiskAssessment {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RiskAssessment_Prediction> prediction;
  private final @javax.annotation.Nullable com.fhir.Reference basedOn;
  private final @javax.annotation.Nullable com.fhir.Reference parent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basis;
  private final @javax.annotation.Nullable java.lang.String mitigation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept method;
  private final @javax.annotation.Nullable com.fhir.Reference performer;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Reference condition;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.lang.String occurrenceDateTime;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.id id;

  private ImmutableRiskAssessment(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.RiskAssessment_Prediction> prediction,
      @javax.annotation.Nullable com.fhir.Reference basedOn,
      @javax.annotation.Nullable com.fhir.Reference parent,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basis,
      @javax.annotation.Nullable java.lang.String mitigation,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Period occurrencePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.CodeableConcept method,
      @javax.annotation.Nullable com.fhir.Reference performer,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Reference condition,
      com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.lang.String occurrenceDateTime,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.id id) {
    this.modifierExtension = modifierExtension;
    this.prediction = prediction;
    this.basedOn = basedOn;
    this.parent = parent;
    this.basis = basis;
    this.mitigation = mitigation;
    this.extension = extension;
    this.reasonReference = reasonReference;
    this.meta = meta;
    this.occurrencePeriod = occurrencePeriod;
    this.reasonCode = reasonCode;
    this.language = language;
    this.text = text;
    this.code = code;
    this.contained = contained;
    this.status = status;
    this.method = method;
    this.performer = performer;
    this.resourceType = resourceType;
    this.condition = condition;
    this.subject = subject;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.note = note;
    this.occurrenceDateTime = occurrenceDateTime;
    this.encounter = encounter;
    this.id = id;
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
   * @return The value of the {@code prediction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("prediction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RiskAssessment_Prediction>> prediction() {
    return java.util.Optional.ofNullable(prediction);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<com.fhir.Reference> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code parent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parent")
  @Override
  public java.util.Optional<com.fhir.Reference> parent() {
    return java.util.Optional.ofNullable(parent);
  }

  /**
   * @return The value of the {@code basis} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basis")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basis() {
    return java.util.Optional.ofNullable(basis);
  }

  /**
   * @return The value of the {@code mitigation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mitigation")
  @Override
  public java.util.Optional<java.lang.String> mitigation() {
    return java.util.Optional.ofNullable(mitigation);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> occurrencePeriod() {
    return java.util.Optional.ofNullable(occurrencePeriod);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("method")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> method() {
    return java.util.Optional.ofNullable(method);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("condition")
  @Override
  public java.util.Optional<com.fhir.Reference> condition() {
    return java.util.Optional.ofNullable(condition);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
  @Override
  public java.util.Optional<java.lang.String> occurrenceDateTime() {
    return java.util.Optional.ofNullable(occurrenceDateTime);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskAssessment(
        newValue,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskAssessment(
        value,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#prediction() prediction} attribute.
   * @param value The value for prediction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withPrediction(java.util.List<com.fhir.RiskAssessment_Prediction> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RiskAssessment_Prediction> newValue = java.util.Objects.requireNonNull(value, "prediction");
    if (this.prediction == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        newValue,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#prediction() prediction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prediction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withPrediction(java.util.Optional<? extends java.util.List<com.fhir.RiskAssessment_Prediction>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RiskAssessment_Prediction> value = optional.orElse(null);
    if (this.prediction == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        value,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withBasedOn(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        newValue,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withBasedOn(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        value,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withParent(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        newValue,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withParent(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        value,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#basis() basis} attribute.
   * @param value The value for basis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withBasis(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basis");
    if (this.basis == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        newValue,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#basis() basis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withBasis(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basis == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        value,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#mitigation() mitigation} attribute.
   * @param value The value for mitigation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withMitigation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "mitigation");
    if (java.util.Objects.equals(this.mitigation, newValue)) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        newValue,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#mitigation() mitigation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mitigation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withMitigation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.mitigation, value)) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        value,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        newValue,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        value,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        newValue,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        value,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        newValue,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        value,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withOccurrencePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        newValue,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withOccurrencePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        value,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        newValue,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        value,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        newValue,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        value,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        newValue,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        value,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        newValue,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        value,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        newValue,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        value,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        newValue,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        value,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withMethod(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        newValue,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withMethod(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        value,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withPerformer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        newValue,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withPerformer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        value,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskAssessment#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskAssessment withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        newValue,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withCondition(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        newValue,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withCondition(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        value,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskAssessment#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskAssessment withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        newValue,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        newValue,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        value,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        newValue,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        value,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        newValue,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        value,
        this.occurrenceDateTime,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withOccurrenceDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (java.util.Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        newValue,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withOccurrenceDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        value,
        this.encounter,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskAssessment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskAssessment withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskAssessment#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskAssessment withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableRiskAssessment(
        this.modifierExtension,
        this.prediction,
        this.basedOn,
        this.parent,
        this.basis,
        this.mitigation,
        this.extension,
        this.reasonReference,
        this.meta,
        this.occurrencePeriod,
        this.reasonCode,
        this.language,
        this.text,
        this.code,
        this.contained,
        this.status,
        this.method,
        this.performer,
        this.resourceType,
        this.condition,
        this.subject,
        this.identifier,
        this.implicitRules,
        this.note,
        this.occurrenceDateTime,
        this.encounter,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskAssessment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskAssessment
        && equalTo((ImmutableRiskAssessment) another);
  }

  private boolean equalTo(ImmutableRiskAssessment another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(prediction, another.prediction)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(parent, another.parent)
        && java.util.Objects.equals(basis, another.basis)
        && java.util.Objects.equals(mitigation, another.mitigation)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(method, another.method)
        && java.util.Objects.equals(performer, another.performer)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(condition, another.condition)
        && subject.equals(another.subject)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code prediction}, {@code basedOn}, {@code parent}, {@code basis}, {@code mitigation}, {@code extension}, {@code reasonReference}, {@code meta}, {@code occurrencePeriod}, {@code reasonCode}, {@code language}, {@code text}, {@code code}, {@code contained}, {@code status}, {@code method}, {@code performer}, {@code resourceType}, {@code condition}, {@code subject}, {@code identifier}, {@code implicitRules}, {@code note}, {@code occurrenceDateTime}, {@code encounter}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(prediction);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(parent);
    h += (h << 5) + java.util.Objects.hashCode(basis);
    h += (h << 5) + java.util.Objects.hashCode(mitigation);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(occurrencePeriod);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(method);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(condition);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskAssessment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RiskAssessment{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (prediction != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("prediction=").append(prediction);
    }
    if (basedOn != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (parent != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (basis != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("basis=").append(basis);
    }
    if (mitigation != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("mitigation=").append(mitigation);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (reasonReference != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (meta != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (occurrencePeriod != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (reasonCode != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (language != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (code != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (contained != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (method != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (performer != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (condition != null) {
      builder.append(", ");
      builder.append("condition=").append(condition);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RiskAssessment", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RiskAssessment {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RiskAssessment_Prediction>> prediction = java.util.Optional.empty();
    boolean predictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> parent = java.util.Optional.empty();
    boolean parentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basis = java.util.Optional.empty();
    boolean basisIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> mitigation = java.util.Optional.empty();
    boolean mitigationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> occurrencePeriod = java.util.Optional.empty();
    boolean occurrencePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> method = java.util.Optional.empty();
    boolean methodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> condition = java.util.Optional.empty();
    boolean conditionIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("prediction")
    public void setPrediction(java.util.Optional<java.util.List<com.fhir.RiskAssessment_Prediction>> prediction) {
      this.prediction = prediction;
      this.predictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<com.fhir.Reference> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public void setParent(java.util.Optional<com.fhir.Reference> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basis")
    public void setBasis(java.util.Optional<java.util.List<com.fhir.Reference>> basis) {
      this.basis = basis;
      this.basisIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mitigation")
    public void setMitigation(java.util.Optional<java.lang.String> mitigation) {
      this.mitigation = mitigation;
      this.mitigationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(java.util.Optional<com.fhir.Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public void setMethod(java.util.Optional<com.fhir.CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<com.fhir.Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public void setCondition(java.util.Optional<com.fhir.Reference> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
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
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
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
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RiskAssessment_Prediction>> prediction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> parent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basis() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> mitigation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> condition() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRiskAssessment fromJson(Json json) {
    ImmutableRiskAssessment.Builder builder = ((ImmutableRiskAssessment.Builder) ImmutableRiskAssessment.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.predictionIsSet) {
      builder.prediction(json.prediction);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.basisIsSet) {
      builder.basis(json.basis);
    }
    if (json.mitigationIsSet) {
      builder.mitigation(json.mitigation);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableRiskAssessment) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskAssessment} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskAssessment instance
   */
  public static RiskAssessment copyOf(RiskAssessment instance) {
    if (instance instanceof ImmutableRiskAssessment) {
      return (ImmutableRiskAssessment) instance;
    }
    return ((ImmutableRiskAssessment.Builder) ImmutableRiskAssessment.builder())
        .modifierExtension(instance.modifierExtension())
        .prediction(instance.prediction())
        .basedOn(instance.basedOn())
        .parent(instance.parent())
        .basis(instance.basis())
        .mitigation(instance.mitigation())
        .extension(instance.extension())
        .reasonReference(instance.reasonReference())
        .meta(instance.meta())
        .occurrencePeriod(instance.occurrencePeriod())
        .reasonCode(instance.reasonCode())
        .language(instance.language())
        .text(instance.text())
        .code(instance.code())
        .contained(instance.contained())
        .status(instance.status())
        .method(instance.method())
        .performer(instance.performer())
        .resourceType(instance.resourceType())
        .condition(instance.condition())
        .subject(instance.subject())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .note(instance.note())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .encounter(instance.encounter())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link RiskAssessment RiskAssessment}.
   * <pre>
   * ImmutableRiskAssessment.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskAssessment#modifierExtension() modifierExtension}
   *    .prediction(List&amp;lt;com.fhir.RiskAssessment_Prediction&amp;gt;) // optional {@link RiskAssessment#prediction() prediction}
   *    .basedOn(com.fhir.Reference) // optional {@link RiskAssessment#basedOn() basedOn}
   *    .parent(com.fhir.Reference) // optional {@link RiskAssessment#parent() parent}
   *    .basis(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link RiskAssessment#basis() basis}
   *    .mitigation(String) // optional {@link RiskAssessment#mitigation() mitigation}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskAssessment#extension() extension}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link RiskAssessment#reasonReference() reasonReference}
   *    .meta(com.fhir.Meta) // optional {@link RiskAssessment#meta() meta}
   *    .occurrencePeriod(com.fhir.Period) // optional {@link RiskAssessment#occurrencePeriod() occurrencePeriod}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link RiskAssessment#reasonCode() reasonCode}
   *    .language(com.fhir.code) // optional {@link RiskAssessment#language() language}
   *    .text(com.fhir.Narrative) // optional {@link RiskAssessment#text() text}
   *    .code(com.fhir.CodeableConcept) // optional {@link RiskAssessment#code() code}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link RiskAssessment#contained() contained}
   *    .status(com.fhir.code) // optional {@link RiskAssessment#status() status}
   *    .method(com.fhir.CodeableConcept) // optional {@link RiskAssessment#method() method}
   *    .performer(com.fhir.Reference) // optional {@link RiskAssessment#performer() performer}
   *    .resourceType(String) // required {@link RiskAssessment#resourceType() resourceType}
   *    .condition(com.fhir.Reference) // optional {@link RiskAssessment#condition() condition}
   *    .subject(com.fhir.Reference) // required {@link RiskAssessment#subject() subject}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link RiskAssessment#identifier() identifier}
   *    .implicitRules(com.fhir.uri) // optional {@link RiskAssessment#implicitRules() implicitRules}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link RiskAssessment#note() note}
   *    .occurrenceDateTime(String) // optional {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime}
   *    .encounter(com.fhir.Reference) // optional {@link RiskAssessment#encounter() encounter}
   *    .id(com.fhir.id) // optional {@link RiskAssessment#id() id}
   *    .build();
   * </pre>
   * @return A new RiskAssessment builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableRiskAssessment.Builder();
  }

  /**
   * Builds instances of type {@link RiskAssessment RiskAssessment}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "RiskAssessment", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_PREDICTION = 0x2L;
    private static final long OPT_BIT_BASED_ON = 0x4L;
    private static final long OPT_BIT_PARENT = 0x8L;
    private static final long OPT_BIT_BASIS = 0x10L;
    private static final long OPT_BIT_MITIGATION = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x200L;
    private static final long OPT_BIT_REASON_CODE = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_CODE = 0x2000L;
    private static final long OPT_BIT_CONTAINED = 0x4000L;
    private static final long OPT_BIT_STATUS = 0x8000L;
    private static final long OPT_BIT_METHOD = 0x10000L;
    private static final long OPT_BIT_PERFORMER = 0x20000L;
    private static final long OPT_BIT_CONDITION = 0x40000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100000L;
    private static final long OPT_BIT_NOTE = 0x200000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x400000L;
    private static final long OPT_BIT_ENCOUNTER = 0x800000L;
    private static final long OPT_BIT_ID = 0x1000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.RiskAssessment_Prediction> prediction;
    private @javax.annotation.Nullable com.fhir.Reference basedOn;
    private @javax.annotation.Nullable com.fhir.Reference parent;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basis;
    private @javax.annotation.Nullable java.lang.String mitigation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.CodeableConcept method;
    private @javax.annotation.Nullable com.fhir.Reference performer;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference condition;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.lang.String occurrenceDateTime;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskAssessment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskAssessment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskAssessment#prediction() prediction} to prediction.
     * @param prediction The value for prediction
     * @return {@code this} builder for chained invocation
     */
    public final Builder prediction(java.util.List<com.fhir.RiskAssessment_Prediction> prediction) {
      checkNotIsSet(predictionIsSet(), "prediction");
      this.prediction = java.util.Objects.requireNonNull(prediction, "prediction");
      optBits |= OPT_BIT_PREDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#prediction() prediction} to prediction.
     * @param prediction The value for prediction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prediction")
    public final Builder prediction(java.util.Optional<? extends java.util.List<com.fhir.RiskAssessment_Prediction>> prediction) {
      checkNotIsSet(predictionIsSet(), "prediction");
      this.prediction = prediction.orElse(null);
      optBits |= OPT_BIT_PREDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(com.fhir.Reference basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(com.fhir.Reference parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = java.util.Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    public final Builder parent(java.util.Optional<? extends com.fhir.Reference> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for chained invocation
     */
    public final Builder basis(java.util.List<com.fhir.Reference> basis) {
      checkNotIsSet(basisIsSet(), "basis");
      this.basis = java.util.Objects.requireNonNull(basis, "basis");
      optBits |= OPT_BIT_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basis")
    public final Builder basis(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basis) {
      checkNotIsSet(basisIsSet(), "basis");
      this.basis = basis.orElse(null);
      optBits |= OPT_BIT_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for chained invocation
     */
    public final Builder mitigation(java.lang.String mitigation) {
      checkNotIsSet(mitigationIsSet(), "mitigation");
      this.mitigation = java.util.Objects.requireNonNull(mitigation, "mitigation");
      optBits |= OPT_BIT_MITIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mitigation")
    public final Builder mitigation(java.util.Optional<java.lang.String> mitigation) {
      checkNotIsSet(mitigationIsSet(), "mitigation");
      this.mitigation = mitigation.orElse(null);
      optBits |= OPT_BIT_MITIGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskAssessment#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskAssessment#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link RiskAssessment#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link RiskAssessment#meta() meta} to meta.
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
     * Initializes the optional value {@link RiskAssessment#meta() meta} to meta.
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
     * Initializes the optional value {@link RiskAssessment#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrencePeriod(com.fhir.Period occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = java.util.Objects.requireNonNull(occurrencePeriod, "occurrencePeriod");
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public final Builder occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = occurrencePeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link RiskAssessment#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link RiskAssessment#language() language} to language.
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
     * Initializes the optional value {@link RiskAssessment#language() language} to language.
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
     * Initializes the optional value {@link RiskAssessment#text() text} to text.
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
     * Initializes the optional value {@link RiskAssessment#text() text} to text.
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
     * Initializes the optional value {@link RiskAssessment#code() code} to code.
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
     * Initializes the optional value {@link RiskAssessment#code() code} to code.
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
     * Initializes the optional value {@link RiskAssessment#contained() contained} to contained.
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
     * Initializes the optional value {@link RiskAssessment#contained() contained} to contained.
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
     * Initializes the optional value {@link RiskAssessment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(com.fhir.CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = java.util.Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public final Builder method(java.util.Optional<? extends com.fhir.CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#performer() performer} to performer.
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
     * Initializes the optional value {@link RiskAssessment#performer() performer} to performer.
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
     * Initializes the value for the {@link RiskAssessment#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link RiskAssessment#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(com.fhir.Reference condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = java.util.Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public final Builder condition(java.util.Optional<? extends com.fhir.Reference> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the value for the {@link RiskAssessment#subject() subject} attribute.
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
     * Initializes the optional value {@link RiskAssessment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RiskAssessment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RiskAssessment#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RiskAssessment#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RiskAssessment#note() note} to note.
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
     * Initializes the optional value {@link RiskAssessment#note() note} to note.
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
     * Initializes the optional value {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(java.lang.String occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = java.util.Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskAssessment#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link RiskAssessment#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link RiskAssessment#id() id} to id.
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
     * Initializes the optional value {@link RiskAssessment#id() id} to id.
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
     * Builds a new {@link RiskAssessment RiskAssessment}.
     * @return An immutable instance of RiskAssessment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RiskAssessment build() {
      checkRequiredAttributes();
      return new ImmutableRiskAssessment(
          modifierExtension,
          prediction,
          basedOn,
          parent,
          basis,
          mitigation,
          extension,
          reasonReference,
          meta,
          occurrencePeriod,
          reasonCode,
          language,
          text,
          code,
          contained,
          status,
          method,
          performer,
          resourceType,
          condition,
          subject,
          identifier,
          implicitRules,
          note,
          occurrenceDateTime,
          encounter,
          id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean predictionIsSet() {
      return (optBits & OPT_BIT_PREDICTION) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean basisIsSet() {
      return (optBits & OPT_BIT_BASIS) != 0;
    }

    private boolean mitigationIsSet() {
      return (optBits & OPT_BIT_MITIGATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RiskAssessment is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!subjectIsSet()) attributes.add("subject");
      return "Cannot build RiskAssessment, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "RiskAssessment", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link RiskAssessment#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "RiskAssessment", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link RiskAssessment#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "RiskAssessment", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link RiskAssessment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link RiskAssessment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link RiskAssessment#prediction() prediction} to prediction.
     * @param prediction The value for prediction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal prediction(java.util.List<com.fhir.RiskAssessment_Prediction> prediction);

    /**
     * Initializes the optional value {@link RiskAssessment#prediction() prediction} to prediction.
     * @param prediction The value for prediction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal prediction(java.util.Optional<? extends java.util.List<com.fhir.RiskAssessment_Prediction>> prediction);

    /**
     * Initializes the optional value {@link RiskAssessment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(com.fhir.Reference basedOn);

    /**
     * Initializes the optional value {@link RiskAssessment#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link RiskAssessment#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(com.fhir.Reference parent);

    /**
     * Initializes the optional value {@link RiskAssessment#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(java.util.Optional<? extends com.fhir.Reference> parent);

    /**
     * Initializes the optional value {@link RiskAssessment#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basis(java.util.List<com.fhir.Reference> basis);

    /**
     * Initializes the optional value {@link RiskAssessment#basis() basis} to basis.
     * @param basis The value for basis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basis(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basis);

    /**
     * Initializes the optional value {@link RiskAssessment#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal mitigation(java.lang.String mitigation);

    /**
     * Initializes the optional value {@link RiskAssessment#mitigation() mitigation} to mitigation.
     * @param mitigation The value for mitigation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal mitigation(java.util.Optional<java.lang.String> mitigation);

    /**
     * Initializes the optional value {@link RiskAssessment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link RiskAssessment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link RiskAssessment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link RiskAssessment#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link RiskAssessment#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link RiskAssessment#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link RiskAssessment#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(com.fhir.Period occurrencePeriod);

    /**
     * Initializes the optional value {@link RiskAssessment#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link RiskAssessment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link RiskAssessment#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link RiskAssessment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link RiskAssessment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link RiskAssessment#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link RiskAssessment#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link RiskAssessment#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link RiskAssessment#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link RiskAssessment#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link RiskAssessment#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link RiskAssessment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link RiskAssessment#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link RiskAssessment#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    BuildFinal method(com.fhir.CodeableConcept method);

    /**
     * Initializes the optional value {@link RiskAssessment#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal method(java.util.Optional<? extends com.fhir.CodeableConcept> method);

    /**
     * Initializes the optional value {@link RiskAssessment#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(com.fhir.Reference performer);

    /**
     * Initializes the optional value {@link RiskAssessment#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link RiskAssessment#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal condition(com.fhir.Reference condition);

    /**
     * Initializes the optional value {@link RiskAssessment#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(java.util.Optional<? extends com.fhir.Reference> condition);

    /**
     * Initializes the optional value {@link RiskAssessment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link RiskAssessment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link RiskAssessment#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link RiskAssessment#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link RiskAssessment#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link RiskAssessment#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(java.lang.String occurrenceDateTime);

    /**
     * Initializes the optional value {@link RiskAssessment#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link RiskAssessment#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link RiskAssessment#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link RiskAssessment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link RiskAssessment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Builds a new {@link RiskAssessment RiskAssessment}.
     * @return An immutable instance of RiskAssessment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RiskAssessment build();
  }
}
