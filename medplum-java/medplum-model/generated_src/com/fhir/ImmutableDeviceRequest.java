//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link DeviceRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceRequest.builder()}.
 */
@org.immutables.value.Generated(from = "DeviceRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceRequest implements com.fhir.DeviceRequest {
  private final @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Reference codeReference;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept codeCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance;
  private final @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
  private final @javax.annotation.Nullable com.fhir.Reference performer;
  private final @javax.annotation.Nullable com.fhir.dateTime authoredOn;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept performerType;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.Reference requester;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.code intent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DeviceRequest_Parameter> parameter;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> priorRequest;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
  private final @javax.annotation.Nullable java.lang.String occurrenceDateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;

  private ImmutableDeviceRequest(
      @javax.annotation.Nullable com.fhir.Period occurrencePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Reference codeReference,
      @javax.annotation.Nullable com.fhir.CodeableConcept codeCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance,
      @javax.annotation.Nullable com.fhir.Identifier groupIdentifier,
      @javax.annotation.Nullable com.fhir.Reference performer,
      @javax.annotation.Nullable com.fhir.dateTime authoredOn,
      @javax.annotation.Nullable com.fhir.CodeableConcept performerType,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.Reference requester,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.code intent,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable java.util.List<com.fhir.DeviceRequest_Parameter> parameter,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> priorRequest,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code priority,
      com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo,
      @javax.annotation.Nullable java.lang.String occurrenceDateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Timing occurrenceTiming,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference) {
    this.occurrencePeriod = occurrencePeriod;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.codeReference = codeReference;
    this.codeCodeableConcept = codeCodeableConcept;
    this.insurance = insurance;
    this.groupIdentifier = groupIdentifier;
    this.performer = performer;
    this.authoredOn = authoredOn;
    this.performerType = performerType;
    this.resourceType = resourceType;
    this.extension = extension;
    this.encounter = encounter;
    this.requester = requester;
    this.language = language;
    this.intent = intent;
    this.basedOn = basedOn;
    this.instantiatesCanonical = instantiatesCanonical;
    this.parameter = parameter;
    this.text = text;
    this.priorRequest = priorRequest;
    this.status = status;
    this.meta = meta;
    this.priority = priority;
    this.subject = subject;
    this.instantiatesUri = instantiatesUri;
    this.note = note;
    this.supportingInfo = supportingInfo;
    this.occurrenceDateTime = occurrenceDateTime;
    this.reasonCode = reasonCode;
    this.relevantHistory = relevantHistory;
    this.implicitRules = implicitRules;
    this.id = id;
    this.identifier = identifier;
    this.occurrenceTiming = occurrenceTiming;
    this.reasonReference = reasonReference;
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code codeReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("codeReference")
  @Override
  public java.util.Optional<com.fhir.Reference> codeReference() {
    return java.util.Optional.ofNullable(codeReference);
  }

  /**
   * @return The value of the {@code codeCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("codeCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> codeCodeableConcept() {
    return java.util.Optional.ofNullable(codeCodeableConcept);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> insurance() {
    return java.util.Optional.ofNullable(insurance);
  }

  /**
   * @return The value of the {@code groupIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> groupIdentifier() {
    return java.util.Optional.ofNullable(groupIdentifier);
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
   * @return The value of the {@code authoredOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
  @Override
  public java.util.Optional<com.fhir.dateTime> authoredOn() {
    return java.util.Optional.ofNullable(authoredOn);
  }

  /**
   * @return The value of the {@code performerType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performerType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> performerType() {
    return java.util.Optional.ofNullable(performerType);
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
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code requester} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requester")
  @Override
  public java.util.Optional<com.fhir.Reference> requester() {
    return java.util.Optional.ofNullable(requester);
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
   * @return The value of the {@code intent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intent")
  @Override
  public java.util.Optional<com.fhir.code> intent() {
    return java.util.Optional.ofNullable(intent);
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
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parameter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DeviceRequest_Parameter>> parameter() {
    return java.util.Optional.ofNullable(parameter);
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
   * @return The value of the {@code priorRequest} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priorRequest")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> priorRequest() {
    return java.util.Optional.ofNullable(priorRequest);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() {
    return java.util.Optional.ofNullable(supportingInfo);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code relevantHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory() {
    return java.util.Optional.ofNullable(relevantHistory);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> occurrenceTiming() {
    return java.util.Optional.ofNullable(occurrenceTiming);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withOccurrencePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableDeviceRequest(
        newValue,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withOccurrencePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableDeviceRequest(
        value,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        newValue,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        value,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        newValue,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        value,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#codeReference() codeReference} attribute.
   * @param value The value for codeReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withCodeReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "codeReference");
    if (this.codeReference == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        newValue,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#codeReference() codeReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withCodeReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.codeReference == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        value,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} attribute.
   * @param value The value for codeCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withCodeCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "codeCodeableConcept");
    if (this.codeCodeableConcept == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        newValue,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withCodeCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.codeCodeableConcept == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        value,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withInsurance(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        newValue,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withInsurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        value,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withGroupIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        newValue,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withGroupIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        value,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withPerformer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        newValue,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withPerformer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        value,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withAuthoredOn(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        newValue,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withAuthoredOn(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        value,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withPerformerType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        newValue,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withPerformerType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        value,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceRequest withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        newValue,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        newValue,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        value,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        newValue,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        value,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withRequester(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        newValue,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withRequester(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        value,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        newValue,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        value,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withIntent(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        newValue,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withIntent(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        value,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        newValue,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        value,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        newValue,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        value,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withParameter(java.util.List<com.fhir.DeviceRequest_Parameter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceRequest_Parameter> newValue = java.util.Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        newValue,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withParameter(java.util.Optional<? extends java.util.List<com.fhir.DeviceRequest_Parameter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DeviceRequest_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        value,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        newValue,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        value,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#priorRequest() priorRequest} attribute.
   * @param value The value for priorRequest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withPriorRequest(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "priorRequest");
    if (this.priorRequest == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        newValue,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#priorRequest() priorRequest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priorRequest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withPriorRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.priorRequest == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        value,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        newValue,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        value,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        newValue,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        value,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        newValue,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        value,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceRequest#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceRequest withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        newValue,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        newValue,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        value,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        newValue,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        value,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withSupportingInfo(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        newValue,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withSupportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        value,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withOccurrenceDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (java.util.Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        newValue,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withOccurrenceDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        value,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        newValue,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        value,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#relevantHistory() relevantHistory} attribute.
   * @param value The value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withRelevantHistory(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "relevantHistory");
    if (this.relevantHistory == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        newValue,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#relevantHistory() relevantHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withRelevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.relevantHistory == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        value,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        newValue,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        value,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        newValue,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        value,
        this.identifier,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        newValue,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        value,
        this.occurrenceTiming,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withOccurrenceTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        newValue,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withOccurrenceTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        value,
        this.reasonReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableDeviceRequest(
        this.occurrencePeriod,
        this.contained,
        this.modifierExtension,
        this.codeReference,
        this.codeCodeableConcept,
        this.insurance,
        this.groupIdentifier,
        this.performer,
        this.authoredOn,
        this.performerType,
        this.resourceType,
        this.extension,
        this.encounter,
        this.requester,
        this.language,
        this.intent,
        this.basedOn,
        this.instantiatesCanonical,
        this.parameter,
        this.text,
        this.priorRequest,
        this.status,
        this.meta,
        this.priority,
        this.subject,
        this.instantiatesUri,
        this.note,
        this.supportingInfo,
        this.occurrenceDateTime,
        this.reasonCode,
        this.relevantHistory,
        this.implicitRules,
        this.id,
        this.identifier,
        this.occurrenceTiming,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceRequest
        && equalTo((ImmutableDeviceRequest) another);
  }

  private boolean equalTo(ImmutableDeviceRequest another) {
    return java.util.Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(codeReference, another.codeReference)
        && java.util.Objects.equals(codeCodeableConcept, another.codeCodeableConcept)
        && java.util.Objects.equals(insurance, another.insurance)
        && java.util.Objects.equals(groupIdentifier, another.groupIdentifier)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(authoredOn, another.authoredOn)
        && java.util.Objects.equals(performerType, another.performerType)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(requester, another.requester)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(intent, another.intent)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(parameter, another.parameter)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(priorRequest, another.priorRequest)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(priority, another.priority)
        && subject.equals(another.subject)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(supportingInfo, another.supportingInfo)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(relevantHistory, another.relevantHistory)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && java.util.Objects.equals(reasonReference, another.reasonReference);
  }

  /**
   * Computes a hash code from attributes: {@code occurrencePeriod}, {@code contained}, {@code modifierExtension}, {@code codeReference}, {@code codeCodeableConcept}, {@code insurance}, {@code groupIdentifier}, {@code performer}, {@code authoredOn}, {@code performerType}, {@code resourceType}, {@code extension}, {@code encounter}, {@code requester}, {@code language}, {@code intent}, {@code basedOn}, {@code instantiatesCanonical}, {@code parameter}, {@code text}, {@code priorRequest}, {@code status}, {@code meta}, {@code priority}, {@code subject}, {@code instantiatesUri}, {@code note}, {@code supportingInfo}, {@code occurrenceDateTime}, {@code reasonCode}, {@code relevantHistory}, {@code implicitRules}, {@code id}, {@code identifier}, {@code occurrenceTiming}, {@code reasonReference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(occurrencePeriod);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(codeReference);
    h += (h << 5) + java.util.Objects.hashCode(codeCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(insurance);
    h += (h << 5) + java.util.Objects.hashCode(groupIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(authoredOn);
    h += (h << 5) + java.util.Objects.hashCode(performerType);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(requester);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(intent);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(parameter);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(priorRequest);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(supportingInfo);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(relevantHistory);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceTiming);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("DeviceRequest{");
    if (occurrencePeriod != null) {
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (codeReference != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("codeReference=").append(codeReference);
    }
    if (codeCodeableConcept != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("codeCodeableConcept=").append(codeCodeableConcept);
    }
    if (insurance != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (groupIdentifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (performer != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (authoredOn != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (performerType != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (requester != null) {
      builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (intent != null) {
      builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (parameter != null) {
      builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (priorRequest != null) {
      builder.append(", ");
      builder.append("priorRequest=").append(priorRequest);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (relevantHistory != null) {
      builder.append(", ");
      builder.append("relevantHistory=").append(relevantHistory);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (occurrenceTiming != null) {
      builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "DeviceRequest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.DeviceRequest {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> occurrencePeriod = java.util.Optional.empty();
    boolean occurrencePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> codeReference = java.util.Optional.empty();
    boolean codeReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> codeCodeableConcept = java.util.Optional.empty();
    boolean codeCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> insurance = java.util.Optional.empty();
    boolean insuranceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> groupIdentifier = java.util.Optional.empty();
    boolean groupIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> authoredOn = java.util.Optional.empty();
    boolean authoredOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> performerType = java.util.Optional.empty();
    boolean performerTypeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requester = java.util.Optional.empty();
    boolean requesterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> intent = java.util.Optional.empty();
    boolean intentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DeviceRequest_Parameter>> parameter = java.util.Optional.empty();
    boolean parameterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> priorRequest = java.util.Optional.empty();
    boolean priorRequestIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo = java.util.Optional.empty();
    boolean supportingInfoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory = java.util.Optional.empty();
    boolean relevantHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> occurrenceTiming = java.util.Optional.empty();
    boolean occurrenceTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(java.util.Optional<com.fhir.Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("codeReference")
    public void setCodeReference(java.util.Optional<com.fhir.Reference> codeReference) {
      this.codeReference = codeReference;
      this.codeReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("codeCodeableConcept")
    public void setCodeCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> codeCodeableConcept) {
      this.codeCodeableConcept = codeCodeableConcept;
      this.codeCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.Optional<java.util.List<com.fhir.Reference>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
    public void setGroupIdentifier(java.util.Optional<com.fhir.Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<com.fhir.Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public void setAuthoredOn(java.util.Optional<com.fhir.dateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performerType")
    public void setPerformerType(java.util.Optional<com.fhir.CodeableConcept> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requester")
    public void setRequester(java.util.Optional<com.fhir.Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public void setIntent(java.util.Optional<com.fhir.code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(java.util.Optional<java.util.List<com.fhir.DeviceRequest_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priorRequest")
    public void setPriorRequest(java.util.Optional<java.util.List<com.fhir.Reference>> priorRequest) {
      this.priorRequest = priorRequest;
      this.priorRequestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public void setSupportingInfo(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
    public void setRelevantHistory(java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory) {
      this.relevantHistory = relevantHistory;
      this.relevantHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(java.util.Optional<com.fhir.Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> codeReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> codeCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> performerType() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DeviceRequest_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> priorRequest() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceRequest fromJson(Json json) {
    ImmutableDeviceRequest.Builder builder = ((ImmutableDeviceRequest.Builder) ImmutableDeviceRequest.builder());
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeReferenceIsSet) {
      builder.codeReference(json.codeReference);
    }
    if (json.codeCodeableConceptIsSet) {
      builder.codeCodeableConcept(json.codeCodeableConcept);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.priorRequestIsSet) {
      builder.priorRequest(json.priorRequest);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.relevantHistoryIsSet) {
      builder.relevantHistory(json.relevantHistory);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    return (ImmutableDeviceRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceRequest instance
   */
  public static DeviceRequest copyOf(DeviceRequest instance) {
    if (instance instanceof ImmutableDeviceRequest) {
      return (ImmutableDeviceRequest) instance;
    }
    return ((ImmutableDeviceRequest.Builder) ImmutableDeviceRequest.builder())
        .occurrencePeriod(instance.occurrencePeriod())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .codeReference(instance.codeReference())
        .codeCodeableConcept(instance.codeCodeableConcept())
        .insurance(instance.insurance())
        .groupIdentifier(instance.groupIdentifier())
        .performer(instance.performer())
        .authoredOn(instance.authoredOn())
        .performerType(instance.performerType())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .encounter(instance.encounter())
        .requester(instance.requester())
        .language(instance.language())
        .intent(instance.intent())
        .basedOn(instance.basedOn())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .parameter(instance.parameter())
        .text(instance.text())
        .priorRequest(instance.priorRequest())
        .status(instance.status())
        .meta(instance.meta())
        .priority(instance.priority())
        .subject(instance.subject())
        .instantiatesUri(instance.instantiatesUri())
        .note(instance.note())
        .supportingInfo(instance.supportingInfo())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .reasonCode(instance.reasonCode())
        .relevantHistory(instance.relevantHistory())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .identifier(instance.identifier())
        .occurrenceTiming(instance.occurrenceTiming())
        .reasonReference(instance.reasonReference())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceRequest DeviceRequest}.
   * <pre>
   * ImmutableDeviceRequest.builder()
   *    .occurrencePeriod(com.fhir.Period) // optional {@link DeviceRequest#occurrencePeriod() occurrencePeriod}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link DeviceRequest#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceRequest#modifierExtension() modifierExtension}
   *    .codeReference(com.fhir.Reference) // optional {@link DeviceRequest#codeReference() codeReference}
   *    .codeCodeableConcept(com.fhir.CodeableConcept) // optional {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept}
   *    .insurance(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#insurance() insurance}
   *    .groupIdentifier(com.fhir.Identifier) // optional {@link DeviceRequest#groupIdentifier() groupIdentifier}
   *    .performer(com.fhir.Reference) // optional {@link DeviceRequest#performer() performer}
   *    .authoredOn(com.fhir.dateTime) // optional {@link DeviceRequest#authoredOn() authoredOn}
   *    .performerType(com.fhir.CodeableConcept) // optional {@link DeviceRequest#performerType() performerType}
   *    .resourceType(String) // required {@link DeviceRequest#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceRequest#extension() extension}
   *    .encounter(com.fhir.Reference) // optional {@link DeviceRequest#encounter() encounter}
   *    .requester(com.fhir.Reference) // optional {@link DeviceRequest#requester() requester}
   *    .language(com.fhir.code) // optional {@link DeviceRequest#language() language}
   *    .intent(com.fhir.code) // optional {@link DeviceRequest#intent() intent}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#basedOn() basedOn}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical}
   *    .parameter(List&amp;lt;com.fhir.DeviceRequest_Parameter&amp;gt;) // optional {@link DeviceRequest#parameter() parameter}
   *    .text(com.fhir.Narrative) // optional {@link DeviceRequest#text() text}
   *    .priorRequest(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#priorRequest() priorRequest}
   *    .status(com.fhir.code) // optional {@link DeviceRequest#status() status}
   *    .meta(com.fhir.Meta) // optional {@link DeviceRequest#meta() meta}
   *    .priority(com.fhir.code) // optional {@link DeviceRequest#priority() priority}
   *    .subject(com.fhir.Reference) // required {@link DeviceRequest#subject() subject}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link DeviceRequest#instantiatesUri() instantiatesUri}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link DeviceRequest#note() note}
   *    .supportingInfo(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#supportingInfo() supportingInfo}
   *    .occurrenceDateTime(String) // optional {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceRequest#reasonCode() reasonCode}
   *    .relevantHistory(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#relevantHistory() relevantHistory}
   *    .implicitRules(com.fhir.uri) // optional {@link DeviceRequest#implicitRules() implicitRules}
   *    .id(com.fhir.id) // optional {@link DeviceRequest#id() id}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link DeviceRequest#identifier() identifier}
   *    .occurrenceTiming(com.fhir.Timing) // optional {@link DeviceRequest#occurrenceTiming() occurrenceTiming}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#reasonReference() reasonReference}
   *    .build();
   * </pre>
   * @return A new DeviceRequest builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableDeviceRequest.Builder();
  }

  /**
   * Builds instances of type {@link DeviceRequest DeviceRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "DeviceRequest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_CODE_REFERENCE = 0x8L;
    private static final long OPT_BIT_CODE_CODEABLE_CONCEPT = 0x10L;
    private static final long OPT_BIT_INSURANCE = 0x20L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_PERFORMER = 0x80L;
    private static final long OPT_BIT_AUTHORED_ON = 0x100L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_ENCOUNTER = 0x800L;
    private static final long OPT_BIT_REQUESTER = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_INTENT = 0x4000L;
    private static final long OPT_BIT_BASED_ON = 0x8000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x10000L;
    private static final long OPT_BIT_PARAMETER = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_PRIOR_REQUEST = 0x80000L;
    private static final long OPT_BIT_STATUS = 0x100000L;
    private static final long OPT_BIT_META = 0x200000L;
    private static final long OPT_BIT_PRIORITY = 0x400000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x800000L;
    private static final long OPT_BIT_NOTE = 0x1000000L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x2000000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x4000000L;
    private static final long OPT_BIT_REASON_CODE = 0x8000000L;
    private static final long OPT_BIT_RELEVANT_HISTORY = 0x10000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000000L;
    private static final long OPT_BIT_ID = 0x40000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000000L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x100000000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x200000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Reference codeReference;
    private @javax.annotation.Nullable com.fhir.CodeableConcept codeCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance;
    private @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
    private @javax.annotation.Nullable com.fhir.Reference performer;
    private @javax.annotation.Nullable com.fhir.dateTime authoredOn;
    private @javax.annotation.Nullable com.fhir.CodeableConcept performerType;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.Reference requester;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.code intent;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable java.util.List<com.fhir.DeviceRequest_Parameter> parameter;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> priorRequest;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
    private @javax.annotation.Nullable java.lang.String occurrenceDateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link DeviceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link DeviceRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceRequest#codeReference() codeReference} to codeReference.
     * @param codeReference The value for codeReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeReference(com.fhir.Reference codeReference) {
      checkNotIsSet(codeReferenceIsSet(), "codeReference");
      this.codeReference = java.util.Objects.requireNonNull(codeReference, "codeReference");
      optBits |= OPT_BIT_CODE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#codeReference() codeReference} to codeReference.
     * @param codeReference The value for codeReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("codeReference")
    public final Builder codeReference(java.util.Optional<? extends com.fhir.Reference> codeReference) {
      checkNotIsSet(codeReferenceIsSet(), "codeReference");
      this.codeReference = codeReference.orElse(null);
      optBits |= OPT_BIT_CODE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} to codeCodeableConcept.
     * @param codeCodeableConcept The value for codeCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeCodeableConcept(com.fhir.CodeableConcept codeCodeableConcept) {
      checkNotIsSet(codeCodeableConceptIsSet(), "codeCodeableConcept");
      this.codeCodeableConcept = java.util.Objects.requireNonNull(codeCodeableConcept, "codeCodeableConcept");
      optBits |= OPT_BIT_CODE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} to codeCodeableConcept.
     * @param codeCodeableConcept The value for codeCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("codeCodeableConcept")
    public final Builder codeCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> codeCodeableConcept) {
      checkNotIsSet(codeCodeableConceptIsSet(), "codeCodeableConcept");
      this.codeCodeableConcept = codeCodeableConcept.orElse(null);
      optBits |= OPT_BIT_CODE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(java.util.List<com.fhir.Reference> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = java.util.Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public final Builder insurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupIdentifier(com.fhir.Identifier groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = java.util.Objects.requireNonNull(groupIdentifier, "groupIdentifier");
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
    public final Builder groupIdentifier(java.util.Optional<? extends com.fhir.Identifier> groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = groupIdentifier.orElse(null);
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#performer() performer} to performer.
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
     * Initializes the optional value {@link DeviceRequest#performer() performer} to performer.
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
     * Initializes the optional value {@link DeviceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(com.fhir.dateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = java.util.Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public final Builder authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerType(com.fhir.CodeableConcept performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = java.util.Objects.requireNonNull(performerType, "performerType");
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performerType")
    public final Builder performerType(java.util.Optional<? extends com.fhir.CodeableConcept> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = performerType.orElse(null);
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link DeviceRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DeviceRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link DeviceRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link DeviceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(com.fhir.Reference requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = java.util.Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requester")
    public final Builder requester(java.util.Optional<? extends com.fhir.Reference> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = requester.orElse(null);
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#language() language} to language.
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
     * Initializes the optional value {@link DeviceRequest#language() language} to language.
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
     * Initializes the optional value {@link DeviceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(com.fhir.code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = java.util.Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public final Builder intent(java.util.Optional<? extends com.fhir.code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DeviceRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link DeviceRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(java.util.List<com.fhir.DeviceRequest_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = java.util.Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public final Builder parameter(java.util.Optional<? extends java.util.List<com.fhir.DeviceRequest_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#text() text} to text.
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
     * Initializes the optional value {@link DeviceRequest#text() text} to text.
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
     * Initializes the optional value {@link DeviceRequest#priorRequest() priorRequest} to priorRequest.
     * @param priorRequest The value for priorRequest
     * @return {@code this} builder for chained invocation
     */
    public final Builder priorRequest(java.util.List<com.fhir.Reference> priorRequest) {
      checkNotIsSet(priorRequestIsSet(), "priorRequest");
      this.priorRequest = java.util.Objects.requireNonNull(priorRequest, "priorRequest");
      optBits |= OPT_BIT_PRIOR_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#priorRequest() priorRequest} to priorRequest.
     * @param priorRequest The value for priorRequest
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priorRequest")
    public final Builder priorRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> priorRequest) {
      checkNotIsSet(priorRequestIsSet(), "priorRequest");
      this.priorRequest = priorRequest.orElse(null);
      optBits |= OPT_BIT_PRIOR_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#status() status} to status.
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
     * Initializes the optional value {@link DeviceRequest#status() status} to status.
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
     * Initializes the optional value {@link DeviceRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the value for the {@link DeviceRequest#subject() subject} attribute.
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
     * Initializes the optional value {@link DeviceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link DeviceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link DeviceRequest#note() note} to note.
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
     * Initializes the optional value {@link DeviceRequest#note() note} to note.
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
     * Initializes the optional value {@link DeviceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(java.util.List<com.fhir.Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = java.util.Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public final Builder supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link DeviceRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link DeviceRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link DeviceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder relevantHistory(java.util.List<com.fhir.Reference> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = java.util.Objects.requireNonNull(relevantHistory, "relevantHistory");
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
    public final Builder relevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = relevantHistory.orElse(null);
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceRequest#id() id} to id.
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
     * Initializes the optional value {@link DeviceRequest#id() id} to id.
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
     * Initializes the optional value {@link DeviceRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceTiming(com.fhir.Timing occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = java.util.Objects.requireNonNull(occurrenceTiming, "occurrenceTiming");
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
    public final Builder occurrenceTiming(java.util.Optional<? extends com.fhir.Timing> occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = occurrenceTiming.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link DeviceRequest#reasonReference() reasonReference} to reasonReference.
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
     * Builds a new {@link DeviceRequest DeviceRequest}.
     * @return An immutable instance of DeviceRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.DeviceRequest build() {
      checkRequiredAttributes();
      return new ImmutableDeviceRequest(
          occurrencePeriod,
          contained,
          modifierExtension,
          codeReference,
          codeCodeableConcept,
          insurance,
          groupIdentifier,
          performer,
          authoredOn,
          performerType,
          resourceType,
          extension,
          encounter,
          requester,
          language,
          intent,
          basedOn,
          instantiatesCanonical,
          parameter,
          text,
          priorRequest,
          status,
          meta,
          priority,
          subject,
          instantiatesUri,
          note,
          supportingInfo,
          occurrenceDateTime,
          reasonCode,
          relevantHistory,
          implicitRules,
          id,
          identifier,
          occurrenceTiming,
          reasonReference);
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeReferenceIsSet() {
      return (optBits & OPT_BIT_CODE_REFERENCE) != 0;
    }

    private boolean codeCodeableConceptIsSet() {
      return (optBits & OPT_BIT_CODE_CODEABLE_CONCEPT) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean priorRequestIsSet() {
      return (optBits & OPT_BIT_PRIOR_REQUEST) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean relevantHistoryIsSet() {
      return (optBits & OPT_BIT_RELEVANT_HISTORY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of DeviceRequest is strict, attribute is already set: ".concat(name));
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
      return "Cannot build DeviceRequest, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "DeviceRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "DeviceRequest", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link DeviceRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "DeviceRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(com.fhir.Period occurrencePeriod);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link DeviceRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link DeviceRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link DeviceRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceRequest#codeReference() codeReference} to codeReference.
     * @param codeReference The value for codeReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal codeReference(com.fhir.Reference codeReference);

    /**
     * Initializes the optional value {@link DeviceRequest#codeReference() codeReference} to codeReference.
     * @param codeReference The value for codeReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal codeReference(java.util.Optional<? extends com.fhir.Reference> codeReference);

    /**
     * Initializes the optional value {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} to codeCodeableConcept.
     * @param codeCodeableConcept The value for codeCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal codeCodeableConcept(com.fhir.CodeableConcept codeCodeableConcept);

    /**
     * Initializes the optional value {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} to codeCodeableConcept.
     * @param codeCodeableConcept The value for codeCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal codeCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> codeCodeableConcept);

    /**
     * Initializes the optional value {@link DeviceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(java.util.List<com.fhir.Reference> insurance);

    /**
     * Initializes the optional value {@link DeviceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> insurance);

    /**
     * Initializes the optional value {@link DeviceRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(com.fhir.Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link DeviceRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(java.util.Optional<? extends com.fhir.Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link DeviceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(com.fhir.Reference performer);

    /**
     * Initializes the optional value {@link DeviceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link DeviceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(com.fhir.dateTime authoredOn);

    /**
     * Initializes the optional value {@link DeviceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn);

    /**
     * Initializes the optional value {@link DeviceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(com.fhir.CodeableConcept performerType);

    /**
     * Initializes the optional value {@link DeviceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(java.util.Optional<? extends com.fhir.CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link DeviceRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link DeviceRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link DeviceRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link DeviceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(com.fhir.Reference requester);

    /**
     * Initializes the optional value {@link DeviceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(java.util.Optional<? extends com.fhir.Reference> requester);

    /**
     * Initializes the optional value {@link DeviceRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link DeviceRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link DeviceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(com.fhir.code intent);

    /**
     * Initializes the optional value {@link DeviceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(java.util.Optional<? extends com.fhir.code> intent);

    /**
     * Initializes the optional value {@link DeviceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link DeviceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link DeviceRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(java.util.List<com.fhir.DeviceRequest_Parameter> parameter);

    /**
     * Initializes the optional value {@link DeviceRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(java.util.Optional<? extends java.util.List<com.fhir.DeviceRequest_Parameter>> parameter);

    /**
     * Initializes the optional value {@link DeviceRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link DeviceRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link DeviceRequest#priorRequest() priorRequest} to priorRequest.
     * @param priorRequest The value for priorRequest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priorRequest(java.util.List<com.fhir.Reference> priorRequest);

    /**
     * Initializes the optional value {@link DeviceRequest#priorRequest() priorRequest} to priorRequest.
     * @param priorRequest The value for priorRequest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priorRequest(java.util.Optional<? extends java.util.List<com.fhir.Reference>> priorRequest);

    /**
     * Initializes the optional value {@link DeviceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link DeviceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link DeviceRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link DeviceRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link DeviceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link DeviceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link DeviceRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link DeviceRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link DeviceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(java.util.List<com.fhir.Reference> supportingInfo);

    /**
     * Initializes the optional value {@link DeviceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(java.lang.String occurrenceDateTime);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link DeviceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link DeviceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link DeviceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relevantHistory(java.util.List<com.fhir.Reference> relevantHistory);

    /**
     * Initializes the optional value {@link DeviceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> relevantHistory);

    /**
     * Initializes the optional value {@link DeviceRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link DeviceRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link DeviceRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link DeviceRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link DeviceRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link DeviceRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(com.fhir.Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(java.util.Optional<? extends com.fhir.Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link DeviceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link DeviceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Builds a new {@link DeviceRequest DeviceRequest}.
     * @return An immutable instance of DeviceRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceRequest build();
  }
}
