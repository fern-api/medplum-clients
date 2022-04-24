//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Procedure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProcedure.builder()}.
 */
@org.immutables.value.Generated(from = "Procedure", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProcedure implements com.fhir.Procedure {
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable java.lang.String performedDateTime;
  private final @javax.annotation.Nullable com.fhir.Period performedPeriod;
  private final @javax.annotation.Nullable com.fhir.Age performedAge;
  private final @javax.annotation.Nullable com.fhir.Range performedRange;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept category;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> usedReference;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable com.fhir.Reference recorder;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> followUp;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> complication;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Procedure_Performer> performer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> report;
  private final @javax.annotation.Nullable java.lang.String performedString;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Procedure_FocalDevice> focalDevice;
  private final @javax.annotation.Nullable com.fhir.Reference asserter;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept outcome;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> usedCode;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> complicationDetail;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;

  private ImmutableProcedure(
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReason,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable java.lang.String performedDateTime,
      @javax.annotation.Nullable com.fhir.Period performedPeriod,
      @javax.annotation.Nullable com.fhir.Age performedAge,
      @javax.annotation.Nullable com.fhir.Range performedRange,
      @javax.annotation.Nullable com.fhir.CodeableConcept category,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> usedReference,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable com.fhir.Reference recorder,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> followUp,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> complication,
      @javax.annotation.Nullable java.util.List<com.fhir.Procedure_Performer> performer,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> report,
      @javax.annotation.Nullable java.lang.String performedString,
      com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Procedure_FocalDevice> focalDevice,
      @javax.annotation.Nullable com.fhir.Reference asserter,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept outcome,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> usedCode,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> complicationDetail,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode) {
    this.instantiatesCanonical = instantiatesCanonical;
    this.statusReason = statusReason;
    this.basedOn = basedOn;
    this.contained = contained;
    this.code = code;
    this.encounter = encounter;
    this.performedDateTime = performedDateTime;
    this.performedPeriod = performedPeriod;
    this.performedAge = performedAge;
    this.performedRange = performedRange;
    this.category = category;
    this.resourceType = resourceType;
    this.text = text;
    this.meta = meta;
    this.extension = extension;
    this.id = id;
    this.partOf = partOf;
    this.usedReference = usedReference;
    this.location = location;
    this.recorder = recorder;
    this.reasonReference = reasonReference;
    this.followUp = followUp;
    this.status = status;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
    this.complication = complication;
    this.performer = performer;
    this.report = report;
    this.performedString = performedString;
    this.subject = subject;
    this.note = note;
    this.focalDevice = focalDevice;
    this.asserter = asserter;
    this.language = language;
    this.outcome = outcome;
    this.instantiatesUri = instantiatesUri;
    this.bodySite = bodySite;
    this.usedCode = usedCode;
    this.implicitRules = implicitRules;
    this.complicationDetail = complicationDetail;
    this.reasonCode = reasonCode;
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code performedDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performedDateTime")
  @Override
  public java.util.Optional<java.lang.String> performedDateTime() {
    return java.util.Optional.ofNullable(performedDateTime);
  }

  /**
   * @return The value of the {@code performedPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performedPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> performedPeriod() {
    return java.util.Optional.ofNullable(performedPeriod);
  }

  /**
   * @return The value of the {@code performedAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performedAge")
  @Override
  public java.util.Optional<com.fhir.Age> performedAge() {
    return java.util.Optional.ofNullable(performedAge);
  }

  /**
   * @return The value of the {@code performedRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performedRange")
  @Override
  public java.util.Optional<com.fhir.Range> performedRange() {
    return java.util.Optional.ofNullable(performedRange);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code usedReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("usedReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> usedReference() {
    return java.util.Optional.ofNullable(usedReference);
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
   * @return The value of the {@code recorder} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recorder")
  @Override
  public java.util.Optional<com.fhir.Reference> recorder() {
    return java.util.Optional.ofNullable(recorder);
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
   * @return The value of the {@code followUp} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("followUp")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> followUp() {
    return java.util.Optional.ofNullable(followUp);
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
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code complication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("complication")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> complication() {
    return java.util.Optional.ofNullable(complication);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Procedure_Performer>> performer() {
    return java.util.Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code report} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("report")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> report() {
    return java.util.Optional.ofNullable(report);
  }

  /**
   * @return The value of the {@code performedString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performedString")
  @Override
  public java.util.Optional<java.lang.String> performedString() {
    return java.util.Optional.ofNullable(performedString);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code focalDevice} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("focalDevice")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Procedure_FocalDevice>> focalDevice() {
    return java.util.Optional.ofNullable(focalDevice);
  }

  /**
   * @return The value of the {@code asserter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("asserter")
  @Override
  public java.util.Optional<com.fhir.Reference> asserter() {
    return java.util.Optional.ofNullable(asserter);
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
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> outcome() {
    return java.util.Optional.ofNullable(outcome);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite() {
    return java.util.Optional.ofNullable(bodySite);
  }

  /**
   * @return The value of the {@code usedCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("usedCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> usedCode() {
    return java.util.Optional.ofNullable(usedCode);
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
   * @return The value of the {@code complicationDetail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("complicationDetail")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> complicationDetail() {
    return java.util.Optional.ofNullable(complicationDetail);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableProcedure(
        newValue,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableProcedure(
        value,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withStatusReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        newValue,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withStatusReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        value,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        newValue,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        value,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        newValue,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        value,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        newValue,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        value,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        newValue,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        value,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedDateTime() performedDateTime} attribute.
   * @param value The value for performedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "performedDateTime");
    if (java.util.Objects.equals(this.performedDateTime, newValue)) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        newValue,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedDateTime() performedDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.performedDateTime, value)) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        value,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedPeriod() performedPeriod} attribute.
   * @param value The value for performedPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "performedPeriod");
    if (this.performedPeriod == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        newValue,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedPeriod() performedPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPerformedPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.performedPeriod == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        value,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedAge() performedAge} attribute.
   * @param value The value for performedAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "performedAge");
    if (this.performedAge == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        newValue,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedAge() performedAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPerformedAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.performedAge == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        value,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedRange() performedRange} attribute.
   * @param value The value for performedRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "performedRange");
    if (this.performedRange == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        newValue,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedRange() performedRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPerformedRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.performedRange == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        value,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withCategory(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        newValue,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withCategory(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        value,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Procedure#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProcedure withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        newValue,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        newValue,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        value,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        newValue,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        value,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        newValue,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        value,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        newValue,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        value,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        newValue,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        value,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#usedReference() usedReference} attribute.
   * @param value The value for usedReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withUsedReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "usedReference");
    if (this.usedReference == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        newValue,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#usedReference() usedReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withUsedReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.usedReference == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        value,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        newValue,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        value,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withRecorder(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        newValue,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withRecorder(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        value,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        newValue,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        value,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#followUp() followUp} attribute.
   * @param value The value for followUp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withFollowUp(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "followUp");
    if (this.followUp == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        newValue,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#followUp() followUp} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for followUp
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withFollowUp(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.followUp == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        value,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        newValue,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        value,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        newValue,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        value,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        newValue,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        value,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#complication() complication} attribute.
   * @param value The value for complication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withComplication(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "complication");
    if (this.complication == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        newValue,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#complication() complication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for complication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withComplication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.complication == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        value,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformer(java.util.List<com.fhir.Procedure_Performer> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Procedure_Performer> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        newValue,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withPerformer(java.util.Optional<? extends java.util.List<com.fhir.Procedure_Performer>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Procedure_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        value,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#report() report} attribute.
   * @param value The value for report
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withReport(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "report");
    if (this.report == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        newValue,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#report() report} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for report
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withReport(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.report == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        value,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#performedString() performedString} attribute.
   * @param value The value for performedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "performedString");
    if (java.util.Objects.equals(this.performedString, newValue)) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        newValue,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#performedString() performedString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performedString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withPerformedString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.performedString, value)) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        value,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Procedure#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProcedure withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        newValue,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        newValue,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        value,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#focalDevice() focalDevice} attribute.
   * @param value The value for focalDevice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withFocalDevice(java.util.List<com.fhir.Procedure_FocalDevice> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Procedure_FocalDevice> newValue = java.util.Objects.requireNonNull(value, "focalDevice");
    if (this.focalDevice == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        newValue,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#focalDevice() focalDevice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focalDevice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withFocalDevice(java.util.Optional<? extends java.util.List<com.fhir.Procedure_FocalDevice>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Procedure_FocalDevice> value = optional.orElse(null);
    if (this.focalDevice == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        value,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#asserter() asserter} attribute.
   * @param value The value for asserter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withAsserter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "asserter");
    if (this.asserter == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        newValue,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#asserter() asserter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asserter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withAsserter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.asserter == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        value,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        newValue,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        value,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withOutcome(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        newValue,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withOutcome(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        value,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        newValue,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        value,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withBodySite(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        newValue,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withBodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        value,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#usedCode() usedCode} attribute.
   * @param value The value for usedCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withUsedCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "usedCode");
    if (this.usedCode == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        newValue,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#usedCode() usedCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usedCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withUsedCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.usedCode == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        value,
        this.implicitRules,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        newValue,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        value,
        this.complicationDetail,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#complicationDetail() complicationDetail} attribute.
   * @param value The value for complicationDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withComplicationDetail(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "complicationDetail");
    if (this.complicationDetail == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        newValue,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#complicationDetail() complicationDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for complicationDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withComplicationDetail(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.complicationDetail == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        value,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableProcedure(
        this.instantiatesCanonical,
        this.statusReason,
        this.basedOn,
        this.contained,
        this.code,
        this.encounter,
        this.performedDateTime,
        this.performedPeriod,
        this.performedAge,
        this.performedRange,
        this.category,
        this.resourceType,
        this.text,
        this.meta,
        this.extension,
        this.id,
        this.partOf,
        this.usedReference,
        this.location,
        this.recorder,
        this.reasonReference,
        this.followUp,
        this.status,
        this.modifierExtension,
        this.identifier,
        this.complication,
        this.performer,
        this.report,
        this.performedString,
        this.subject,
        this.note,
        this.focalDevice,
        this.asserter,
        this.language,
        this.outcome,
        this.instantiatesUri,
        this.bodySite,
        this.usedCode,
        this.implicitRules,
        this.complicationDetail,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProcedure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProcedure
        && equalTo((ImmutableProcedure) another);
  }

  private boolean equalTo(ImmutableProcedure another) {
    return java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(performedDateTime, another.performedDateTime)
        && java.util.Objects.equals(performedPeriod, another.performedPeriod)
        && java.util.Objects.equals(performedAge, another.performedAge)
        && java.util.Objects.equals(performedRange, another.performedRange)
        && java.util.Objects.equals(category, another.category)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(usedReference, another.usedReference)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(recorder, another.recorder)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(followUp, another.followUp)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(complication, another.complication)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(report, another.report)
        && java.util.Objects.equals(performedString, another.performedString)
        && subject.equals(another.subject)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(focalDevice, another.focalDevice)
        && java.util.Objects.equals(asserter, another.asserter)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(usedCode, another.usedCode)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(complicationDetail, another.complicationDetail)
        && java.util.Objects.equals(reasonCode, another.reasonCode);
  }

  /**
   * Computes a hash code from attributes: {@code instantiatesCanonical}, {@code statusReason}, {@code basedOn}, {@code contained}, {@code code}, {@code encounter}, {@code performedDateTime}, {@code performedPeriod}, {@code performedAge}, {@code performedRange}, {@code category}, {@code resourceType}, {@code text}, {@code meta}, {@code extension}, {@code id}, {@code partOf}, {@code usedReference}, {@code location}, {@code recorder}, {@code reasonReference}, {@code followUp}, {@code status}, {@code modifierExtension}, {@code identifier}, {@code complication}, {@code performer}, {@code report}, {@code performedString}, {@code subject}, {@code note}, {@code focalDevice}, {@code asserter}, {@code language}, {@code outcome}, {@code instantiatesUri}, {@code bodySite}, {@code usedCode}, {@code implicitRules}, {@code complicationDetail}, {@code reasonCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(performedDateTime);
    h += (h << 5) + java.util.Objects.hashCode(performedPeriod);
    h += (h << 5) + java.util.Objects.hashCode(performedAge);
    h += (h << 5) + java.util.Objects.hashCode(performedRange);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(usedReference);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(recorder);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(followUp);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(complication);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(report);
    h += (h << 5) + java.util.Objects.hashCode(performedString);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(focalDevice);
    h += (h << 5) + java.util.Objects.hashCode(asserter);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(usedCode);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(complicationDetail);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    return h;
  }

  /**
   * Prints the immutable value {@code Procedure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Procedure{");
    if (instantiatesCanonical != null) {
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (statusReason != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (basedOn != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (contained != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (code != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (encounter != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (performedDateTime != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("performedDateTime=").append(performedDateTime);
    }
    if (performedPeriod != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("performedPeriod=").append(performedPeriod);
    }
    if (performedAge != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("performedAge=").append(performedAge);
    }
    if (performedRange != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("performedRange=").append(performedRange);
    }
    if (category != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (usedReference != null) {
      builder.append(", ");
      builder.append("usedReference=").append(usedReference);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (recorder != null) {
      builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (followUp != null) {
      builder.append(", ");
      builder.append("followUp=").append(followUp);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (complication != null) {
      builder.append(", ");
      builder.append("complication=").append(complication);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (report != null) {
      builder.append(", ");
      builder.append("report=").append(report);
    }
    if (performedString != null) {
      builder.append(", ");
      builder.append("performedString=").append(performedString);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (focalDevice != null) {
      builder.append(", ");
      builder.append("focalDevice=").append(focalDevice);
    }
    if (asserter != null) {
      builder.append(", ");
      builder.append("asserter=").append(asserter);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (usedCode != null) {
      builder.append(", ");
      builder.append("usedCode=").append(usedCode);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (complicationDetail != null) {
      builder.append(", ");
      builder.append("complicationDetail=").append(complicationDetail);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Procedure", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Procedure {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> performedDateTime = java.util.Optional.empty();
    boolean performedDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> performedPeriod = java.util.Optional.empty();
    boolean performedPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> performedAge = java.util.Optional.empty();
    boolean performedAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> performedRange = java.util.Optional.empty();
    boolean performedRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> usedReference = java.util.Optional.empty();
    boolean usedReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> recorder = java.util.Optional.empty();
    boolean recorderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> followUp = java.util.Optional.empty();
    boolean followUpIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> complication = java.util.Optional.empty();
    boolean complicationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Procedure_Performer>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> report = java.util.Optional.empty();
    boolean reportIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> performedString = java.util.Optional.empty();
    boolean performedStringIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Procedure_FocalDevice>> focalDevice = java.util.Optional.empty();
    boolean focalDeviceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> asserter = java.util.Optional.empty();
    boolean asserterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> usedCode = java.util.Optional.empty();
    boolean usedCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> complicationDetail = java.util.Optional.empty();
    boolean complicationDetailIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<com.fhir.CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("performedDateTime")
    public void setPerformedDateTime(java.util.Optional<java.lang.String> performedDateTime) {
      this.performedDateTime = performedDateTime;
      this.performedDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performedPeriod")
    public void setPerformedPeriod(java.util.Optional<com.fhir.Period> performedPeriod) {
      this.performedPeriod = performedPeriod;
      this.performedPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performedAge")
    public void setPerformedAge(java.util.Optional<com.fhir.Age> performedAge) {
      this.performedAge = performedAge;
      this.performedAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performedRange")
    public void setPerformedRange(java.util.Optional<com.fhir.Range> performedRange) {
      this.performedRange = performedRange;
      this.performedRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("usedReference")
    public void setUsedReference(java.util.Optional<java.util.List<com.fhir.Reference>> usedReference) {
      this.usedReference = usedReference;
      this.usedReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recorder")
    public void setRecorder(java.util.Optional<com.fhir.Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("followUp")
    public void setFollowUp(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> followUp) {
      this.followUp = followUp;
      this.followUpIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("complication")
    public void setComplication(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> complication) {
      this.complication = complication;
      this.complicationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.Procedure_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("report")
    public void setReport(java.util.Optional<java.util.List<com.fhir.Reference>> report) {
      this.report = report;
      this.reportIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performedString")
    public void setPerformedString(java.util.Optional<java.lang.String> performedString) {
      this.performedString = performedString;
      this.performedStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("focalDevice")
    public void setFocalDevice(java.util.Optional<java.util.List<com.fhir.Procedure_FocalDevice>> focalDevice) {
      this.focalDevice = focalDevice;
      this.focalDeviceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("asserter")
    public void setAsserter(java.util.Optional<com.fhir.Reference> asserter) {
      this.asserter = asserter;
      this.asserterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.CodeableConcept> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("usedCode")
    public void setUsedCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> usedCode) {
      this.usedCode = usedCode;
      this.usedCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("complicationDetail")
    public void setComplicationDetail(java.util.Optional<java.util.List<com.fhir.Reference>> complicationDetail) {
      this.complicationDetail = complicationDetail;
      this.complicationDetailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> performedDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> performedPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> performedAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> performedRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> usedReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> followUp() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> complication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Procedure_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> report() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> performedString() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Procedure_FocalDevice>> focalDevice() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> asserter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> usedCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> complicationDetail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableProcedure fromJson(Json json) {
    ImmutableProcedure.Builder builder = ((ImmutableProcedure.Builder) ImmutableProcedure.builder());
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.performedDateTimeIsSet) {
      builder.performedDateTime(json.performedDateTime);
    }
    if (json.performedPeriodIsSet) {
      builder.performedPeriod(json.performedPeriod);
    }
    if (json.performedAgeIsSet) {
      builder.performedAge(json.performedAge);
    }
    if (json.performedRangeIsSet) {
      builder.performedRange(json.performedRange);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.usedReferenceIsSet) {
      builder.usedReference(json.usedReference);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.followUpIsSet) {
      builder.followUp(json.followUp);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.complicationIsSet) {
      builder.complication(json.complication);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.reportIsSet) {
      builder.report(json.report);
    }
    if (json.performedStringIsSet) {
      builder.performedString(json.performedString);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.focalDeviceIsSet) {
      builder.focalDevice(json.focalDevice);
    }
    if (json.asserterIsSet) {
      builder.asserter(json.asserter);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.usedCodeIsSet) {
      builder.usedCode(json.usedCode);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.complicationDetailIsSet) {
      builder.complicationDetail(json.complicationDetail);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    return (ImmutableProcedure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Procedure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Procedure instance
   */
  public static Procedure copyOf(Procedure instance) {
    if (instance instanceof ImmutableProcedure) {
      return (ImmutableProcedure) instance;
    }
    return ((ImmutableProcedure.Builder) ImmutableProcedure.builder())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .statusReason(instance.statusReason())
        .basedOn(instance.basedOn())
        .contained(instance.contained())
        .code(instance.code())
        .encounter(instance.encounter())
        .performedDateTime(instance.performedDateTime())
        .performedPeriod(instance.performedPeriod())
        .performedAge(instance.performedAge())
        .performedRange(instance.performedRange())
        .category(instance.category())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .meta(instance.meta())
        .extension(instance.extension())
        .id(instance.id())
        .partOf(instance.partOf())
        .usedReference(instance.usedReference())
        .location(instance.location())
        .recorder(instance.recorder())
        .reasonReference(instance.reasonReference())
        .followUp(instance.followUp())
        .status(instance.status())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .complication(instance.complication())
        .performer(instance.performer())
        .report(instance.report())
        .performedString(instance.performedString())
        .subject(instance.subject())
        .note(instance.note())
        .focalDevice(instance.focalDevice())
        .asserter(instance.asserter())
        .language(instance.language())
        .outcome(instance.outcome())
        .instantiatesUri(instance.instantiatesUri())
        .bodySite(instance.bodySite())
        .usedCode(instance.usedCode())
        .implicitRules(instance.implicitRules())
        .complicationDetail(instance.complicationDetail())
        .reasonCode(instance.reasonCode())
        .build();
  }

  /**
   * Creates a builder for {@link Procedure Procedure}.
   * <pre>
   * ImmutableProcedure.builder()
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link Procedure#instantiatesCanonical() instantiatesCanonical}
   *    .statusReason(com.fhir.CodeableConcept) // optional {@link Procedure#statusReason() statusReason}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Procedure#basedOn() basedOn}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Procedure#contained() contained}
   *    .code(com.fhir.CodeableConcept) // optional {@link Procedure#code() code}
   *    .encounter(com.fhir.Reference) // optional {@link Procedure#encounter() encounter}
   *    .performedDateTime(String) // optional {@link Procedure#performedDateTime() performedDateTime}
   *    .performedPeriod(com.fhir.Period) // optional {@link Procedure#performedPeriod() performedPeriod}
   *    .performedAge(com.fhir.Age) // optional {@link Procedure#performedAge() performedAge}
   *    .performedRange(com.fhir.Range) // optional {@link Procedure#performedRange() performedRange}
   *    .category(com.fhir.CodeableConcept) // optional {@link Procedure#category() category}
   *    .resourceType(String) // required {@link Procedure#resourceType() resourceType}
   *    .text(com.fhir.Narrative) // optional {@link Procedure#text() text}
   *    .meta(com.fhir.Meta) // optional {@link Procedure#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Procedure#extension() extension}
   *    .id(com.fhir.id) // optional {@link Procedure#id() id}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Procedure#partOf() partOf}
   *    .usedReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Procedure#usedReference() usedReference}
   *    .location(com.fhir.Reference) // optional {@link Procedure#location() location}
   *    .recorder(com.fhir.Reference) // optional {@link Procedure#recorder() recorder}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Procedure#reasonReference() reasonReference}
   *    .followUp(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#followUp() followUp}
   *    .status(com.fhir.code) // optional {@link Procedure#status() status}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Procedure#modifierExtension() modifierExtension}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Procedure#identifier() identifier}
   *    .complication(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#complication() complication}
   *    .performer(List&amp;lt;com.fhir.Procedure_Performer&amp;gt;) // optional {@link Procedure#performer() performer}
   *    .report(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Procedure#report() report}
   *    .performedString(String) // optional {@link Procedure#performedString() performedString}
   *    .subject(com.fhir.Reference) // required {@link Procedure#subject() subject}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Procedure#note() note}
   *    .focalDevice(List&amp;lt;com.fhir.Procedure_FocalDevice&amp;gt;) // optional {@link Procedure#focalDevice() focalDevice}
   *    .asserter(com.fhir.Reference) // optional {@link Procedure#asserter() asserter}
   *    .language(com.fhir.code) // optional {@link Procedure#language() language}
   *    .outcome(com.fhir.CodeableConcept) // optional {@link Procedure#outcome() outcome}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link Procedure#instantiatesUri() instantiatesUri}
   *    .bodySite(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#bodySite() bodySite}
   *    .usedCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#usedCode() usedCode}
   *    .implicitRules(com.fhir.uri) // optional {@link Procedure#implicitRules() implicitRules}
   *    .complicationDetail(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Procedure#complicationDetail() complicationDetail}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Procedure#reasonCode() reasonCode}
   *    .build();
   * </pre>
   * @return A new Procedure builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableProcedure.Builder();
  }

  /**
   * Builds instances of type {@link Procedure Procedure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Procedure", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x1L;
    private static final long OPT_BIT_STATUS_REASON = 0x2L;
    private static final long OPT_BIT_BASED_ON = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_ENCOUNTER = 0x20L;
    private static final long OPT_BIT_PERFORMED_DATE_TIME = 0x40L;
    private static final long OPT_BIT_PERFORMED_PERIOD = 0x80L;
    private static final long OPT_BIT_PERFORMED_AGE = 0x100L;
    private static final long OPT_BIT_PERFORMED_RANGE = 0x200L;
    private static final long OPT_BIT_CATEGORY = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_PART_OF = 0x8000L;
    private static final long OPT_BIT_USED_REFERENCE = 0x10000L;
    private static final long OPT_BIT_LOCATION = 0x20000L;
    private static final long OPT_BIT_RECORDER = 0x40000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x80000L;
    private static final long OPT_BIT_FOLLOW_UP = 0x100000L;
    private static final long OPT_BIT_STATUS = 0x200000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400000L;
    private static final long OPT_BIT_IDENTIFIER = 0x800000L;
    private static final long OPT_BIT_COMPLICATION = 0x1000000L;
    private static final long OPT_BIT_PERFORMER = 0x2000000L;
    private static final long OPT_BIT_REPORT = 0x4000000L;
    private static final long OPT_BIT_PERFORMED_STRING = 0x8000000L;
    private static final long OPT_BIT_NOTE = 0x10000000L;
    private static final long OPT_BIT_FOCAL_DEVICE = 0x20000000L;
    private static final long OPT_BIT_ASSERTER = 0x40000000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000000L;
    private static final long OPT_BIT_OUTCOME = 0x100000000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x200000000L;
    private static final long OPT_BIT_BODY_SITE = 0x400000000L;
    private static final long OPT_BIT_USED_CODE = 0x800000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000000000L;
    private static final long OPT_BIT_COMPLICATION_DETAIL = 0x2000000000L;
    private static final long OPT_BIT_REASON_CODE = 0x4000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.lang.String performedDateTime;
    private @javax.annotation.Nullable com.fhir.Period performedPeriod;
    private @javax.annotation.Nullable com.fhir.Age performedAge;
    private @javax.annotation.Nullable com.fhir.Range performedRange;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> usedReference;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable com.fhir.Reference recorder;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> followUp;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> complication;
    private @javax.annotation.Nullable java.util.List<com.fhir.Procedure_Performer> performer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> report;
    private @javax.annotation.Nullable java.lang.String performedString;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Procedure_FocalDevice> focalDevice;
    private @javax.annotation.Nullable com.fhir.Reference asserter;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept outcome;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> usedCode;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> complicationDetail;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Procedure#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = java.util.Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(com.fhir.CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = java.util.Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public final Builder statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Procedure#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Procedure#contained() contained} to contained.
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
     * Initializes the optional value {@link Procedure#contained() contained} to contained.
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
     * Initializes the optional value {@link Procedure#code() code} to code.
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
     * Initializes the optional value {@link Procedure#code() code} to code.
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
     * Initializes the optional value {@link Procedure#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Procedure#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Procedure#performedDateTime() performedDateTime} to performedDateTime.
     * @param performedDateTime The value for performedDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedDateTime(java.lang.String performedDateTime) {
      checkNotIsSet(performedDateTimeIsSet(), "performedDateTime");
      this.performedDateTime = java.util.Objects.requireNonNull(performedDateTime, "performedDateTime");
      optBits |= OPT_BIT_PERFORMED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedDateTime() performedDateTime} to performedDateTime.
     * @param performedDateTime The value for performedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performedDateTime")
    public final Builder performedDateTime(java.util.Optional<java.lang.String> performedDateTime) {
      checkNotIsSet(performedDateTimeIsSet(), "performedDateTime");
      this.performedDateTime = performedDateTime.orElse(null);
      optBits |= OPT_BIT_PERFORMED_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedPeriod() performedPeriod} to performedPeriod.
     * @param performedPeriod The value for performedPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedPeriod(com.fhir.Period performedPeriod) {
      checkNotIsSet(performedPeriodIsSet(), "performedPeriod");
      this.performedPeriod = java.util.Objects.requireNonNull(performedPeriod, "performedPeriod");
      optBits |= OPT_BIT_PERFORMED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedPeriod() performedPeriod} to performedPeriod.
     * @param performedPeriod The value for performedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performedPeriod")
    public final Builder performedPeriod(java.util.Optional<? extends com.fhir.Period> performedPeriod) {
      checkNotIsSet(performedPeriodIsSet(), "performedPeriod");
      this.performedPeriod = performedPeriod.orElse(null);
      optBits |= OPT_BIT_PERFORMED_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedAge() performedAge} to performedAge.
     * @param performedAge The value for performedAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedAge(com.fhir.Age performedAge) {
      checkNotIsSet(performedAgeIsSet(), "performedAge");
      this.performedAge = java.util.Objects.requireNonNull(performedAge, "performedAge");
      optBits |= OPT_BIT_PERFORMED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedAge() performedAge} to performedAge.
     * @param performedAge The value for performedAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performedAge")
    public final Builder performedAge(java.util.Optional<? extends com.fhir.Age> performedAge) {
      checkNotIsSet(performedAgeIsSet(), "performedAge");
      this.performedAge = performedAge.orElse(null);
      optBits |= OPT_BIT_PERFORMED_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedRange() performedRange} to performedRange.
     * @param performedRange The value for performedRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedRange(com.fhir.Range performedRange) {
      checkNotIsSet(performedRangeIsSet(), "performedRange");
      this.performedRange = java.util.Objects.requireNonNull(performedRange, "performedRange");
      optBits |= OPT_BIT_PERFORMED_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedRange() performedRange} to performedRange.
     * @param performedRange The value for performedRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performedRange")
    public final Builder performedRange(java.util.Optional<? extends com.fhir.Range> performedRange) {
      checkNotIsSet(performedRangeIsSet(), "performedRange");
      this.performedRange = performedRange.orElse(null);
      optBits |= OPT_BIT_PERFORMED_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(com.fhir.CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the value for the {@link Procedure#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Procedure#text() text} to text.
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
     * Initializes the optional value {@link Procedure#text() text} to text.
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
     * Initializes the optional value {@link Procedure#meta() meta} to meta.
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
     * Initializes the optional value {@link Procedure#meta() meta} to meta.
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
     * Initializes the optional value {@link Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link Procedure#id() id} to id.
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
     * Initializes the optional value {@link Procedure#id() id} to id.
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
     * Initializes the optional value {@link Procedure#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(java.util.List<com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#usedReference() usedReference} to usedReference.
     * @param usedReference The value for usedReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder usedReference(java.util.List<com.fhir.Reference> usedReference) {
      checkNotIsSet(usedReferenceIsSet(), "usedReference");
      this.usedReference = java.util.Objects.requireNonNull(usedReference, "usedReference");
      optBits |= OPT_BIT_USED_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#usedReference() usedReference} to usedReference.
     * @param usedReference The value for usedReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedReference")
    public final Builder usedReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> usedReference) {
      checkNotIsSet(usedReferenceIsSet(), "usedReference");
      this.usedReference = usedReference.orElse(null);
      optBits |= OPT_BIT_USED_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#location() location} to location.
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
     * Initializes the optional value {@link Procedure#location() location} to location.
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
     * Initializes the optional value {@link Procedure#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorder(com.fhir.Reference recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = java.util.Objects.requireNonNull(recorder, "recorder");
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recorder")
    public final Builder recorder(java.util.Optional<? extends com.fhir.Reference> recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = recorder.orElse(null);
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Procedure#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Procedure#followUp() followUp} to followUp.
     * @param followUp The value for followUp
     * @return {@code this} builder for chained invocation
     */
    public final Builder followUp(java.util.List<com.fhir.CodeableConcept> followUp) {
      checkNotIsSet(followUpIsSet(), "followUp");
      this.followUp = java.util.Objects.requireNonNull(followUp, "followUp");
      optBits |= OPT_BIT_FOLLOW_UP;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#followUp() followUp} to followUp.
     * @param followUp The value for followUp
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("followUp")
    public final Builder followUp(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> followUp) {
      checkNotIsSet(followUpIsSet(), "followUp");
      this.followUp = followUp.orElse(null);
      optBits |= OPT_BIT_FOLLOW_UP;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#status() status} to status.
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
     * Initializes the optional value {@link Procedure#status() status} to status.
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
     * Initializes the optional value {@link Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Procedure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Procedure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Procedure#complication() complication} to complication.
     * @param complication The value for complication
     * @return {@code this} builder for chained invocation
     */
    public final Builder complication(java.util.List<com.fhir.CodeableConcept> complication) {
      checkNotIsSet(complicationIsSet(), "complication");
      this.complication = java.util.Objects.requireNonNull(complication, "complication");
      optBits |= OPT_BIT_COMPLICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#complication() complication} to complication.
     * @param complication The value for complication
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("complication")
    public final Builder complication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> complication) {
      checkNotIsSet(complicationIsSet(), "complication");
      this.complication = complication.orElse(null);
      optBits |= OPT_BIT_COMPLICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.Procedure_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.Procedure_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#report() report} to report.
     * @param report The value for report
     * @return {@code this} builder for chained invocation
     */
    public final Builder report(java.util.List<com.fhir.Reference> report) {
      checkNotIsSet(reportIsSet(), "report");
      this.report = java.util.Objects.requireNonNull(report, "report");
      optBits |= OPT_BIT_REPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#report() report} to report.
     * @param report The value for report
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("report")
    public final Builder report(java.util.Optional<? extends java.util.List<com.fhir.Reference>> report) {
      checkNotIsSet(reportIsSet(), "report");
      this.report = report.orElse(null);
      optBits |= OPT_BIT_REPORT;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedString() performedString} to performedString.
     * @param performedString The value for performedString
     * @return {@code this} builder for chained invocation
     */
    public final Builder performedString(java.lang.String performedString) {
      checkNotIsSet(performedStringIsSet(), "performedString");
      this.performedString = java.util.Objects.requireNonNull(performedString, "performedString");
      optBits |= OPT_BIT_PERFORMED_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#performedString() performedString} to performedString.
     * @param performedString The value for performedString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performedString")
    public final Builder performedString(java.util.Optional<java.lang.String> performedString) {
      checkNotIsSet(performedStringIsSet(), "performedString");
      this.performedString = performedString.orElse(null);
      optBits |= OPT_BIT_PERFORMED_STRING;
      return this;
    }

    /**
     * Initializes the value for the {@link Procedure#subject() subject} attribute.
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
     * Initializes the optional value {@link Procedure#note() note} to note.
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
     * Initializes the optional value {@link Procedure#note() note} to note.
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
     * Initializes the optional value {@link Procedure#focalDevice() focalDevice} to focalDevice.
     * @param focalDevice The value for focalDevice
     * @return {@code this} builder for chained invocation
     */
    public final Builder focalDevice(java.util.List<com.fhir.Procedure_FocalDevice> focalDevice) {
      checkNotIsSet(focalDeviceIsSet(), "focalDevice");
      this.focalDevice = java.util.Objects.requireNonNull(focalDevice, "focalDevice");
      optBits |= OPT_BIT_FOCAL_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#focalDevice() focalDevice} to focalDevice.
     * @param focalDevice The value for focalDevice
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("focalDevice")
    public final Builder focalDevice(java.util.Optional<? extends java.util.List<com.fhir.Procedure_FocalDevice>> focalDevice) {
      checkNotIsSet(focalDeviceIsSet(), "focalDevice");
      this.focalDevice = focalDevice.orElse(null);
      optBits |= OPT_BIT_FOCAL_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    public final Builder asserter(com.fhir.Reference asserter) {
      checkNotIsSet(asserterIsSet(), "asserter");
      this.asserter = java.util.Objects.requireNonNull(asserter, "asserter");
      optBits |= OPT_BIT_ASSERTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("asserter")
    public final Builder asserter(java.util.Optional<? extends com.fhir.Reference> asserter) {
      checkNotIsSet(asserterIsSet(), "asserter");
      this.asserter = asserter.orElse(null);
      optBits |= OPT_BIT_ASSERTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#language() language} to language.
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
     * Initializes the optional value {@link Procedure#language() language} to language.
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
     * Initializes the optional value {@link Procedure#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.CodeableConcept outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.CodeableConcept> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = java.util.Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(java.util.List<com.fhir.CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = java.util.Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public final Builder bodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#usedCode() usedCode} to usedCode.
     * @param usedCode The value for usedCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder usedCode(java.util.List<com.fhir.CodeableConcept> usedCode) {
      checkNotIsSet(usedCodeIsSet(), "usedCode");
      this.usedCode = java.util.Objects.requireNonNull(usedCode, "usedCode");
      optBits |= OPT_BIT_USED_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#usedCode() usedCode} to usedCode.
     * @param usedCode The value for usedCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedCode")
    public final Builder usedCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> usedCode) {
      checkNotIsSet(usedCodeIsSet(), "usedCode");
      this.usedCode = usedCode.orElse(null);
      optBits |= OPT_BIT_USED_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Procedure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Procedure#complicationDetail() complicationDetail} to complicationDetail.
     * @param complicationDetail The value for complicationDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder complicationDetail(java.util.List<com.fhir.Reference> complicationDetail) {
      checkNotIsSet(complicationDetailIsSet(), "complicationDetail");
      this.complicationDetail = java.util.Objects.requireNonNull(complicationDetail, "complicationDetail");
      optBits |= OPT_BIT_COMPLICATION_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#complicationDetail() complicationDetail} to complicationDetail.
     * @param complicationDetail The value for complicationDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("complicationDetail")
    public final Builder complicationDetail(java.util.Optional<? extends java.util.List<com.fhir.Reference>> complicationDetail) {
      checkNotIsSet(complicationDetailIsSet(), "complicationDetail");
      this.complicationDetail = complicationDetail.orElse(null);
      optBits |= OPT_BIT_COMPLICATION_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Procedure#reasonCode() reasonCode} to reasonCode.
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
     * Builds a new {@link Procedure Procedure}.
     * @return An immutable instance of Procedure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Procedure build() {
      checkRequiredAttributes();
      return new ImmutableProcedure(
          instantiatesCanonical,
          statusReason,
          basedOn,
          contained,
          code,
          encounter,
          performedDateTime,
          performedPeriod,
          performedAge,
          performedRange,
          category,
          resourceType,
          text,
          meta,
          extension,
          id,
          partOf,
          usedReference,
          location,
          recorder,
          reasonReference,
          followUp,
          status,
          modifierExtension,
          identifier,
          complication,
          performer,
          report,
          performedString,
          subject,
          note,
          focalDevice,
          asserter,
          language,
          outcome,
          instantiatesUri,
          bodySite,
          usedCode,
          implicitRules,
          complicationDetail,
          reasonCode);
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean performedDateTimeIsSet() {
      return (optBits & OPT_BIT_PERFORMED_DATE_TIME) != 0;
    }

    private boolean performedPeriodIsSet() {
      return (optBits & OPT_BIT_PERFORMED_PERIOD) != 0;
    }

    private boolean performedAgeIsSet() {
      return (optBits & OPT_BIT_PERFORMED_AGE) != 0;
    }

    private boolean performedRangeIsSet() {
      return (optBits & OPT_BIT_PERFORMED_RANGE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean usedReferenceIsSet() {
      return (optBits & OPT_BIT_USED_REFERENCE) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean followUpIsSet() {
      return (optBits & OPT_BIT_FOLLOW_UP) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean complicationIsSet() {
      return (optBits & OPT_BIT_COMPLICATION) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean reportIsSet() {
      return (optBits & OPT_BIT_REPORT) != 0;
    }

    private boolean performedStringIsSet() {
      return (optBits & OPT_BIT_PERFORMED_STRING) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean focalDeviceIsSet() {
      return (optBits & OPT_BIT_FOCAL_DEVICE) != 0;
    }

    private boolean asserterIsSet() {
      return (optBits & OPT_BIT_ASSERTER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean usedCodeIsSet() {
      return (optBits & OPT_BIT_USED_CODE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean complicationDetailIsSet() {
      return (optBits & OPT_BIT_COMPLICATION_DETAIL) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Procedure is strict, attribute is already set: ".concat(name));
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
      return "Cannot build Procedure, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Procedure", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Procedure#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Procedure", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link Procedure#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "Procedure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Procedure#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Procedure#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Procedure#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(com.fhir.CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link Procedure#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Procedure#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link Procedure#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link Procedure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Procedure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Procedure#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link Procedure#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link Procedure#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Procedure#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link Procedure#performedDateTime() performedDateTime} to performedDateTime.
     * @param performedDateTime The value for performedDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedDateTime(java.lang.String performedDateTime);

    /**
     * Initializes the optional value {@link Procedure#performedDateTime() performedDateTime} to performedDateTime.
     * @param performedDateTime The value for performedDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedDateTime(java.util.Optional<java.lang.String> performedDateTime);

    /**
     * Initializes the optional value {@link Procedure#performedPeriod() performedPeriod} to performedPeriod.
     * @param performedPeriod The value for performedPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedPeriod(com.fhir.Period performedPeriod);

    /**
     * Initializes the optional value {@link Procedure#performedPeriod() performedPeriod} to performedPeriod.
     * @param performedPeriod The value for performedPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedPeriod(java.util.Optional<? extends com.fhir.Period> performedPeriod);

    /**
     * Initializes the optional value {@link Procedure#performedAge() performedAge} to performedAge.
     * @param performedAge The value for performedAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedAge(com.fhir.Age performedAge);

    /**
     * Initializes the optional value {@link Procedure#performedAge() performedAge} to performedAge.
     * @param performedAge The value for performedAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedAge(java.util.Optional<? extends com.fhir.Age> performedAge);

    /**
     * Initializes the optional value {@link Procedure#performedRange() performedRange} to performedRange.
     * @param performedRange The value for performedRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedRange(com.fhir.Range performedRange);

    /**
     * Initializes the optional value {@link Procedure#performedRange() performedRange} to performedRange.
     * @param performedRange The value for performedRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedRange(java.util.Optional<? extends com.fhir.Range> performedRange);

    /**
     * Initializes the optional value {@link Procedure#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);

    /**
     * Initializes the optional value {@link Procedure#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link Procedure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Procedure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Procedure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Procedure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Procedure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Procedure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Procedure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Procedure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Procedure#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Procedure#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link Procedure#usedReference() usedReference} to usedReference.
     * @param usedReference The value for usedReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedReference(java.util.List<com.fhir.Reference> usedReference);

    /**
     * Initializes the optional value {@link Procedure#usedReference() usedReference} to usedReference.
     * @param usedReference The value for usedReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> usedReference);

    /**
     * Initializes the optional value {@link Procedure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link Procedure#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link Procedure#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(com.fhir.Reference recorder);

    /**
     * Initializes the optional value {@link Procedure#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(java.util.Optional<? extends com.fhir.Reference> recorder);

    /**
     * Initializes the optional value {@link Procedure#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link Procedure#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Procedure#followUp() followUp} to followUp.
     * @param followUp The value for followUp
     * @return {@code this} builder for chained invocation
     */
    BuildFinal followUp(java.util.List<com.fhir.CodeableConcept> followUp);

    /**
     * Initializes the optional value {@link Procedure#followUp() followUp} to followUp.
     * @param followUp The value for followUp
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal followUp(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> followUp);

    /**
     * Initializes the optional value {@link Procedure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link Procedure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link Procedure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Procedure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Procedure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Procedure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Procedure#complication() complication} to complication.
     * @param complication The value for complication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal complication(java.util.List<com.fhir.CodeableConcept> complication);

    /**
     * Initializes the optional value {@link Procedure#complication() complication} to complication.
     * @param complication The value for complication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal complication(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> complication);

    /**
     * Initializes the optional value {@link Procedure#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.Procedure_Performer> performer);

    /**
     * Initializes the optional value {@link Procedure#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.Procedure_Performer>> performer);

    /**
     * Initializes the optional value {@link Procedure#report() report} to report.
     * @param report The value for report
     * @return {@code this} builder for chained invocation
     */
    BuildFinal report(java.util.List<com.fhir.Reference> report);

    /**
     * Initializes the optional value {@link Procedure#report() report} to report.
     * @param report The value for report
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal report(java.util.Optional<? extends java.util.List<com.fhir.Reference>> report);

    /**
     * Initializes the optional value {@link Procedure#performedString() performedString} to performedString.
     * @param performedString The value for performedString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performedString(java.lang.String performedString);

    /**
     * Initializes the optional value {@link Procedure#performedString() performedString} to performedString.
     * @param performedString The value for performedString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performedString(java.util.Optional<java.lang.String> performedString);

    /**
     * Initializes the optional value {@link Procedure#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Procedure#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Procedure#focalDevice() focalDevice} to focalDevice.
     * @param focalDevice The value for focalDevice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focalDevice(java.util.List<com.fhir.Procedure_FocalDevice> focalDevice);

    /**
     * Initializes the optional value {@link Procedure#focalDevice() focalDevice} to focalDevice.
     * @param focalDevice The value for focalDevice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focalDevice(java.util.Optional<? extends java.util.List<com.fhir.Procedure_FocalDevice>> focalDevice);

    /**
     * Initializes the optional value {@link Procedure#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asserter(com.fhir.Reference asserter);

    /**
     * Initializes the optional value {@link Procedure#asserter() asserter} to asserter.
     * @param asserter The value for asserter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asserter(java.util.Optional<? extends com.fhir.Reference> asserter);

    /**
     * Initializes the optional value {@link Procedure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Procedure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Procedure#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.CodeableConcept outcome);

    /**
     * Initializes the optional value {@link Procedure#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.CodeableConcept> outcome);

    /**
     * Initializes the optional value {@link Procedure#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link Procedure#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link Procedure#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(java.util.List<com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link Procedure#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodySite);

    /**
     * Initializes the optional value {@link Procedure#usedCode() usedCode} to usedCode.
     * @param usedCode The value for usedCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usedCode(java.util.List<com.fhir.CodeableConcept> usedCode);

    /**
     * Initializes the optional value {@link Procedure#usedCode() usedCode} to usedCode.
     * @param usedCode The value for usedCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usedCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> usedCode);

    /**
     * Initializes the optional value {@link Procedure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Procedure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Procedure#complicationDetail() complicationDetail} to complicationDetail.
     * @param complicationDetail The value for complicationDetail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal complicationDetail(java.util.List<com.fhir.Reference> complicationDetail);

    /**
     * Initializes the optional value {@link Procedure#complicationDetail() complicationDetail} to complicationDetail.
     * @param complicationDetail The value for complicationDetail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal complicationDetail(java.util.Optional<? extends java.util.List<com.fhir.Reference>> complicationDetail);

    /**
     * Initializes the optional value {@link Procedure#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Procedure#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Builds a new {@link Procedure Procedure}.
     * @return An immutable instance of Procedure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Procedure build();
  }
}
