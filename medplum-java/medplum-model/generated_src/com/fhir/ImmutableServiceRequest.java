//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ServiceRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableServiceRequest.builder()}.
 */
@org.immutables.value.Generated(from = "ServiceRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableServiceRequest implements com.fhir.ServiceRequest {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final @javax.annotation.Nullable com.fhir.Range quantityRange;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces;
  private final @javax.annotation.Nullable java.lang.Boolean doNotPerform;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
  private final @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
  private final @javax.annotation.Nullable com.fhir.Reference requester;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code intent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept asNeededCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept performerType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> orderDetail;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable java.lang.String occurrenceDateTime;
  private final @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> locationReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.dateTime authoredOn;
  private final @javax.annotation.Nullable com.fhir.Quantity quantityQuantity;
  private final @javax.annotation.Nullable com.fhir.Ratio quantityRatio;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Identifier requisition;
  private final com.fhir.Reference subject;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.String patientInstruction;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.lang.Boolean asNeededBoolean;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> locationCode;

  private ImmutableServiceRequest(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      @javax.annotation.Nullable com.fhir.Range quantityRange,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces,
      @javax.annotation.Nullable java.lang.Boolean doNotPerform,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo,
      @javax.annotation.Nullable com.fhir.Timing occurrenceTiming,
      @javax.annotation.Nullable com.fhir.Reference requester,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code intent,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite,
      @javax.annotation.Nullable com.fhir.CodeableConcept asNeededCodeableConcept,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.CodeableConcept performerType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> orderDetail,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable java.lang.String occurrenceDateTime,
      @javax.annotation.Nullable com.fhir.Period occurrencePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> locationReference,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.dateTime authoredOn,
      @javax.annotation.Nullable com.fhir.Quantity quantityQuantity,
      @javax.annotation.Nullable com.fhir.Ratio quantityRatio,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Identifier requisition,
      com.fhir.Reference subject,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.String patientInstruction,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.lang.Boolean asNeededBoolean,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> locationCode) {
    this.contained = contained;
    this.instantiatesUri = instantiatesUri;
    this.quantityRange = quantityRange;
    this.id = id;
    this.replaces = replaces;
    this.doNotPerform = doNotPerform;
    this.supportingInfo = supportingInfo;
    this.occurrenceTiming = occurrenceTiming;
    this.requester = requester;
    this.language = language;
    this.specimen = specimen;
    this.extension = extension;
    this.implicitRules = implicitRules;
    this.intent = intent;
    this.bodySite = bodySite;
    this.asNeededCodeableConcept = asNeededCodeableConcept;
    this.meta = meta;
    this.performerType = performerType;
    this.relevantHistory = relevantHistory;
    this.identifier = identifier;
    this.text = text;
    this.category = category;
    this.orderDetail = orderDetail;
    this.note = note;
    this.status = status;
    this.instantiatesCanonical = instantiatesCanonical;
    this.occurrenceDateTime = occurrenceDateTime;
    this.occurrencePeriod = occurrencePeriod;
    this.modifierExtension = modifierExtension;
    this.basedOn = basedOn;
    this.locationReference = locationReference;
    this.insurance = insurance;
    this.encounter = encounter;
    this.authoredOn = authoredOn;
    this.quantityQuantity = quantityQuantity;
    this.quantityRatio = quantityRatio;
    this.performer = performer;
    this.reasonReference = reasonReference;
    this.requisition = requisition;
    this.subject = subject;
    this.resourceType = resourceType;
    this.patientInstruction = patientInstruction;
    this.code = code;
    this.asNeededBoolean = asNeededBoolean;
    this.priority = priority;
    this.reasonCode = reasonCode;
    this.locationCode = locationCode;
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code quantityRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantityRange")
  @Override
  public java.util.Optional<com.fhir.Range> quantityRange() {
    return java.util.Optional.ofNullable(quantityRange);
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
   * @return The value of the {@code replaces} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("replaces")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> replaces() {
    return java.util.Optional.ofNullable(replaces);
  }

  /**
   * @return The value of the {@code doNotPerform} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
  @Override
  public java.util.Optional<java.lang.Boolean> doNotPerform() {
    return java.util.Optional.ofNullable(doNotPerform);
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
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> occurrenceTiming() {
    return java.util.Optional.ofNullable(occurrenceTiming);
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
   * @return The value of the {@code specimen} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specimen")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> specimen() {
    return java.util.Optional.ofNullable(specimen);
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
   * @return The value of the {@code intent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intent")
  @Override
  public java.util.Optional<com.fhir.code> intent() {
    return java.util.Optional.ofNullable(intent);
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
   * @return The value of the {@code asNeededCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("asNeededCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> asNeededCodeableConcept() {
    return java.util.Optional.ofNullable(asNeededCodeableConcept);
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
   * @return The value of the {@code performerType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performerType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> performerType() {
    return java.util.Optional.ofNullable(performerType);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code orderDetail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("orderDetail")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> orderDetail() {
    return java.util.Optional.ofNullable(orderDetail);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
  @Override
  public java.util.Optional<java.lang.String> occurrenceDateTime() {
    return java.util.Optional.ofNullable(occurrenceDateTime);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code locationReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> locationReference() {
    return java.util.Optional.ofNullable(locationReference);
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
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code quantityQuantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantityQuantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> quantityQuantity() {
    return java.util.Optional.ofNullable(quantityQuantity);
  }

  /**
   * @return The value of the {@code quantityRatio} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantityRatio")
  @Override
  public java.util.Optional<com.fhir.Ratio> quantityRatio() {
    return java.util.Optional.ofNullable(quantityRatio);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> performer() {
    return java.util.Optional.ofNullable(performer);
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
   * @return The value of the {@code requisition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requisition")
  @Override
  public java.util.Optional<com.fhir.Identifier> requisition() {
    return java.util.Optional.ofNullable(requisition);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code patientInstruction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patientInstruction")
  @Override
  public java.util.Optional<java.lang.String> patientInstruction() {
    return java.util.Optional.ofNullable(patientInstruction);
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
   * @return The value of the {@code asNeededBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("asNeededBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> asNeededBoolean() {
    return java.util.Optional.ofNullable(asNeededBoolean);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code locationCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> locationCode() {
    return java.util.Optional.ofNullable(locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableServiceRequest(
        newValue,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableServiceRequest(
        value,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        newValue,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        value,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#quantityRange() quantityRange} attribute.
   * @param value The value for quantityRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withQuantityRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "quantityRange");
    if (this.quantityRange == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        newValue,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#quantityRange() quantityRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantityRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withQuantityRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.quantityRange == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        value,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        newValue,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        value,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withReplaces(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        newValue,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withReplaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        value,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withDoNotPerform(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        newValue,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withDoNotPerform(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        value,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withSupportingInfo(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        newValue,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withSupportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        value,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOccurrenceTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        newValue,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withOccurrenceTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        value,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withRequester(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        newValue,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withRequester(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        value,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        newValue,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        value,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withSpecimen(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        newValue,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withSpecimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        value,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        newValue,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        value,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        newValue,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        value,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withIntent(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        newValue,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withIntent(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        value,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withBodySite(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        newValue,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withBodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        value,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} attribute.
   * @param value The value for asNeededCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withAsNeededCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "asNeededCodeableConcept");
    if (this.asNeededCodeableConcept == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        newValue,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asNeededCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withAsNeededCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.asNeededCodeableConcept == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        value,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        newValue,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        value,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPerformerType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        newValue,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withPerformerType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        value,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#relevantHistory() relevantHistory} attribute.
   * @param value The value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withRelevantHistory(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "relevantHistory");
    if (this.relevantHistory == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        newValue,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#relevantHistory() relevantHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withRelevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.relevantHistory == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        value,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        newValue,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        value,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        newValue,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        value,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        newValue,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        value,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#orderDetail() orderDetail} attribute.
   * @param value The value for orderDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOrderDetail(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "orderDetail");
    if (this.orderDetail == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        newValue,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#orderDetail() orderDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withOrderDetail(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.orderDetail == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        value,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        newValue,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        value,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        newValue,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        value,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        newValue,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        value,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOccurrenceDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (java.util.Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        newValue,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOccurrenceDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        value,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOccurrencePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        newValue,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withOccurrencePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        value,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        newValue,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        value,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        newValue,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        value,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withLocationReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        newValue,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withLocationReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        value,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withInsurance(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        newValue,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withInsurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        value,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        newValue,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        value,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withAuthoredOn(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        newValue,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withAuthoredOn(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        value,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#quantityQuantity() quantityQuantity} attribute.
   * @param value The value for quantityQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withQuantityQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantityQuantity");
    if (this.quantityQuantity == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        newValue,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#quantityQuantity() quantityQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantityQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withQuantityQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantityQuantity == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        value,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#quantityRatio() quantityRatio} attribute.
   * @param value The value for quantityRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withQuantityRatio(com.fhir.Ratio value) {
    @javax.annotation.Nullable com.fhir.Ratio newValue = java.util.Objects.requireNonNull(value, "quantityRatio");
    if (this.quantityRatio == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        newValue,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#quantityRatio() quantityRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantityRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withQuantityRatio(java.util.Optional<? extends com.fhir.Ratio> optional) {
    @javax.annotation.Nullable com.fhir.Ratio value = optional.orElse(null);
    if (this.quantityRatio == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        value,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPerformer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        newValue,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withPerformer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        value,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        newValue,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        value,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#requisition() requisition} attribute.
   * @param value The value for requisition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withRequisition(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "requisition");
    if (this.requisition == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        newValue,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#requisition() requisition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requisition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withRequisition(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.requisition == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        value,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServiceRequest#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServiceRequest withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        newValue,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServiceRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServiceRequest withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        newValue,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#patientInstruction() patientInstruction} attribute.
   * @param value The value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPatientInstruction(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "patientInstruction");
    if (java.util.Objects.equals(this.patientInstruction, newValue)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        newValue,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#patientInstruction() patientInstruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPatientInstruction(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.patientInstruction, value)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        value,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        newValue,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        value,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#asNeededBoolean() asNeededBoolean} attribute.
   * @param value The value for asNeededBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withAsNeededBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.asNeededBoolean, newValue)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        newValue,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#asNeededBoolean() asNeededBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asNeededBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withAsNeededBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.asNeededBoolean, value)) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        value,
        this.priority,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        newValue,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        value,
        this.reasonCode,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        newValue,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        value,
        this.locationCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#locationCode() locationCode} attribute.
   * @param value The value for locationCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withLocationCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "locationCode");
    if (this.locationCode == newValue) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#locationCode() locationCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withLocationCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.locationCode == value) return this;
    return new ImmutableServiceRequest(
        this.contained,
        this.instantiatesUri,
        this.quantityRange,
        this.id,
        this.replaces,
        this.doNotPerform,
        this.supportingInfo,
        this.occurrenceTiming,
        this.requester,
        this.language,
        this.specimen,
        this.extension,
        this.implicitRules,
        this.intent,
        this.bodySite,
        this.asNeededCodeableConcept,
        this.meta,
        this.performerType,
        this.relevantHistory,
        this.identifier,
        this.text,
        this.category,
        this.orderDetail,
        this.note,
        this.status,
        this.instantiatesCanonical,
        this.occurrenceDateTime,
        this.occurrencePeriod,
        this.modifierExtension,
        this.basedOn,
        this.locationReference,
        this.insurance,
        this.encounter,
        this.authoredOn,
        this.quantityQuantity,
        this.quantityRatio,
        this.performer,
        this.reasonReference,
        this.requisition,
        this.subject,
        this.resourceType,
        this.patientInstruction,
        this.code,
        this.asNeededBoolean,
        this.priority,
        this.reasonCode,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableServiceRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableServiceRequest
        && equalTo((ImmutableServiceRequest) another);
  }

  private boolean equalTo(ImmutableServiceRequest another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(quantityRange, another.quantityRange)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(replaces, another.replaces)
        && java.util.Objects.equals(doNotPerform, another.doNotPerform)
        && java.util.Objects.equals(supportingInfo, another.supportingInfo)
        && java.util.Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && java.util.Objects.equals(requester, another.requester)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(specimen, another.specimen)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(intent, another.intent)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(asNeededCodeableConcept, another.asNeededCodeableConcept)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(performerType, another.performerType)
        && java.util.Objects.equals(relevantHistory, another.relevantHistory)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(orderDetail, another.orderDetail)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && java.util.Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(locationReference, another.locationReference)
        && java.util.Objects.equals(insurance, another.insurance)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(authoredOn, another.authoredOn)
        && java.util.Objects.equals(quantityQuantity, another.quantityQuantity)
        && java.util.Objects.equals(quantityRatio, another.quantityRatio)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(requisition, another.requisition)
        && subject.equals(another.subject)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(patientInstruction, another.patientInstruction)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(asNeededBoolean, another.asNeededBoolean)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(locationCode, another.locationCode);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code instantiatesUri}, {@code quantityRange}, {@code id}, {@code replaces}, {@code doNotPerform}, {@code supportingInfo}, {@code occurrenceTiming}, {@code requester}, {@code language}, {@code specimen}, {@code extension}, {@code implicitRules}, {@code intent}, {@code bodySite}, {@code asNeededCodeableConcept}, {@code meta}, {@code performerType}, {@code relevantHistory}, {@code identifier}, {@code text}, {@code category}, {@code orderDetail}, {@code note}, {@code status}, {@code instantiatesCanonical}, {@code occurrenceDateTime}, {@code occurrencePeriod}, {@code modifierExtension}, {@code basedOn}, {@code locationReference}, {@code insurance}, {@code encounter}, {@code authoredOn}, {@code quantityQuantity}, {@code quantityRatio}, {@code performer}, {@code reasonReference}, {@code requisition}, {@code subject}, {@code resourceType}, {@code patientInstruction}, {@code code}, {@code asNeededBoolean}, {@code priority}, {@code reasonCode}, {@code locationCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(quantityRange);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(replaces);
    h += (h << 5) + java.util.Objects.hashCode(doNotPerform);
    h += (h << 5) + java.util.Objects.hashCode(supportingInfo);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceTiming);
    h += (h << 5) + java.util.Objects.hashCode(requester);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(specimen);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(intent);
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(asNeededCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(performerType);
    h += (h << 5) + java.util.Objects.hashCode(relevantHistory);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(orderDetail);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + java.util.Objects.hashCode(occurrencePeriod);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(locationReference);
    h += (h << 5) + java.util.Objects.hashCode(insurance);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(authoredOn);
    h += (h << 5) + java.util.Objects.hashCode(quantityQuantity);
    h += (h << 5) + java.util.Objects.hashCode(quantityRatio);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(requisition);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(patientInstruction);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(asNeededBoolean);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(locationCode);
    return h;
  }

  /**
   * Prints the immutable value {@code ServiceRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ServiceRequest{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (quantityRange != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("quantityRange=").append(quantityRange);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (replaces != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (doNotPerform != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (supportingInfo != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (occurrenceTiming != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (requester != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (language != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (specimen != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (implicitRules != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (intent != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (bodySite != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (asNeededCodeableConcept != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("asNeededCodeableConcept=").append(asNeededCodeableConcept);
    }
    if (meta != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (performerType != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    if (relevantHistory != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("relevantHistory=").append(relevantHistory);
    }
    if (identifier != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (text != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (category != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (orderDetail != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("orderDetail=").append(orderDetail);
    }
    if (note != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (status != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (occurrenceDateTime != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (occurrencePeriod != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (basedOn != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (locationReference != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    if (insurance != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (encounter != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (authoredOn != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (quantityQuantity != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("quantityQuantity=").append(quantityQuantity);
    }
    if (quantityRatio != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("quantityRatio=").append(quantityRatio);
    }
    if (performer != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (reasonReference != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (requisition != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("requisition=").append(requisition);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("subject=").append(subject);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (patientInstruction != null) {
      builder.append(", ");
      builder.append("patientInstruction=").append(patientInstruction);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (asNeededBoolean != null) {
      builder.append(", ");
      builder.append("asNeededBoolean=").append(asNeededBoolean);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (locationCode != null) {
      builder.append(", ");
      builder.append("locationCode=").append(locationCode);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ServiceRequest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ServiceRequest {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> quantityRange = java.util.Optional.empty();
    boolean quantityRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> replaces = java.util.Optional.empty();
    boolean replacesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> doNotPerform = java.util.Optional.empty();
    boolean doNotPerformIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo = java.util.Optional.empty();
    boolean supportingInfoIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> occurrenceTiming = java.util.Optional.empty();
    boolean occurrenceTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requester = java.util.Optional.empty();
    boolean requesterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> specimen = java.util.Optional.empty();
    boolean specimenIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> intent = java.util.Optional.empty();
    boolean intentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> asNeededCodeableConcept = java.util.Optional.empty();
    boolean asNeededCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> performerType = java.util.Optional.empty();
    boolean performerTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory = java.util.Optional.empty();
    boolean relevantHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> orderDetail = java.util.Optional.empty();
    boolean orderDetailIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> occurrencePeriod = java.util.Optional.empty();
    boolean occurrencePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> locationReference = java.util.Optional.empty();
    boolean locationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> insurance = java.util.Optional.empty();
    boolean insuranceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> authoredOn = java.util.Optional.empty();
    boolean authoredOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantityQuantity = java.util.Optional.empty();
    boolean quantityQuantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Ratio> quantityRatio = java.util.Optional.empty();
    boolean quantityRatioIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> requisition = java.util.Optional.empty();
    boolean requisitionIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> patientInstruction = java.util.Optional.empty();
    boolean patientInstructionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> asNeededBoolean = java.util.Optional.empty();
    boolean asNeededBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> locationCode = java.util.Optional.empty();
    boolean locationCodeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantityRange")
    public void setQuantityRange(java.util.Optional<com.fhir.Range> quantityRange) {
      this.quantityRange = quantityRange;
      this.quantityRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public void setReplaces(java.util.Optional<java.util.List<com.fhir.Reference>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public void setDoNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public void setSupportingInfo(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(java.util.Optional<com.fhir.Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public void setSpecimen(java.util.Optional<java.util.List<com.fhir.Reference>> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public void setIntent(java.util.Optional<com.fhir.code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("asNeededCodeableConcept")
    public void setAsNeededCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> asNeededCodeableConcept) {
      this.asNeededCodeableConcept = asNeededCodeableConcept;
      this.asNeededCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performerType")
    public void setPerformerType(java.util.Optional<com.fhir.CodeableConcept> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
    public void setRelevantHistory(java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory) {
      this.relevantHistory = relevantHistory;
      this.relevantHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("orderDetail")
    public void setOrderDetail(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> orderDetail) {
      this.orderDetail = orderDetail;
      this.orderDetailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(java.util.Optional<com.fhir.Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
    public void setLocationReference(java.util.Optional<java.util.List<com.fhir.Reference>> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.Optional<java.util.List<com.fhir.Reference>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public void setAuthoredOn(java.util.Optional<com.fhir.dateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantityQuantity")
    public void setQuantityQuantity(java.util.Optional<com.fhir.Quantity> quantityQuantity) {
      this.quantityQuantity = quantityQuantity;
      this.quantityQuantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantityRatio")
    public void setQuantityRatio(java.util.Optional<com.fhir.Ratio> quantityRatio) {
      this.quantityRatio = quantityRatio;
      this.quantityRatioIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requisition")
    public void setRequisition(java.util.Optional<com.fhir.Identifier> requisition) {
      this.requisition = requisition;
      this.requisitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patientInstruction")
    public void setPatientInstruction(java.util.Optional<java.lang.String> patientInstruction) {
      this.patientInstruction = patientInstruction;
      this.patientInstructionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("asNeededBoolean")
    public void setAsNeededBoolean(java.util.Optional<java.lang.Boolean> asNeededBoolean) {
      this.asNeededBoolean = asNeededBoolean;
      this.asNeededBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationCode")
    public void setLocationCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> locationCode) {
      this.locationCode = locationCode;
      this.locationCodeIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> quantityRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> asNeededCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> performerType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> orderDetail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantityQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Ratio> quantityRatio() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> requisition() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> patientInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> asNeededBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> locationCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableServiceRequest fromJson(Json json) {
    ImmutableServiceRequest.Builder builder = ((ImmutableServiceRequest.Builder) ImmutableServiceRequest.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.quantityRangeIsSet) {
      builder.quantityRange(json.quantityRange);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.asNeededCodeableConceptIsSet) {
      builder.asNeededCodeableConcept(json.asNeededCodeableConcept);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
    }
    if (json.relevantHistoryIsSet) {
      builder.relevantHistory(json.relevantHistory);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.orderDetailIsSet) {
      builder.orderDetail(json.orderDetail);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.quantityQuantityIsSet) {
      builder.quantityQuantity(json.quantityQuantity);
    }
    if (json.quantityRatioIsSet) {
      builder.quantityRatio(json.quantityRatio);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.requisitionIsSet) {
      builder.requisition(json.requisition);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.patientInstructionIsSet) {
      builder.patientInstruction(json.patientInstruction);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.asNeededBooleanIsSet) {
      builder.asNeededBoolean(json.asNeededBoolean);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.locationCodeIsSet) {
      builder.locationCode(json.locationCode);
    }
    return (ImmutableServiceRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ServiceRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ServiceRequest instance
   */
  public static ServiceRequest copyOf(ServiceRequest instance) {
    if (instance instanceof ImmutableServiceRequest) {
      return (ImmutableServiceRequest) instance;
    }
    return ((ImmutableServiceRequest.Builder) ImmutableServiceRequest.builder())
        .contained(instance.contained())
        .instantiatesUri(instance.instantiatesUri())
        .quantityRange(instance.quantityRange())
        .id(instance.id())
        .replaces(instance.replaces())
        .doNotPerform(instance.doNotPerform())
        .supportingInfo(instance.supportingInfo())
        .occurrenceTiming(instance.occurrenceTiming())
        .requester(instance.requester())
        .language(instance.language())
        .specimen(instance.specimen())
        .extension(instance.extension())
        .implicitRules(instance.implicitRules())
        .intent(instance.intent())
        .bodySite(instance.bodySite())
        .asNeededCodeableConcept(instance.asNeededCodeableConcept())
        .meta(instance.meta())
        .performerType(instance.performerType())
        .relevantHistory(instance.relevantHistory())
        .identifier(instance.identifier())
        .text(instance.text())
        .category(instance.category())
        .orderDetail(instance.orderDetail())
        .note(instance.note())
        .status(instance.status())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .occurrencePeriod(instance.occurrencePeriod())
        .modifierExtension(instance.modifierExtension())
        .basedOn(instance.basedOn())
        .locationReference(instance.locationReference())
        .insurance(instance.insurance())
        .encounter(instance.encounter())
        .authoredOn(instance.authoredOn())
        .quantityQuantity(instance.quantityQuantity())
        .quantityRatio(instance.quantityRatio())
        .performer(instance.performer())
        .reasonReference(instance.reasonReference())
        .requisition(instance.requisition())
        .subject(instance.subject())
        .resourceType(instance.resourceType())
        .patientInstruction(instance.patientInstruction())
        .code(instance.code())
        .asNeededBoolean(instance.asNeededBoolean())
        .priority(instance.priority())
        .reasonCode(instance.reasonCode())
        .locationCode(instance.locationCode())
        .build();
  }

  /**
   * Creates a builder for {@link ServiceRequest ServiceRequest}.
   * <pre>
   * ImmutableServiceRequest.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ServiceRequest#contained() contained}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link ServiceRequest#instantiatesUri() instantiatesUri}
   *    .quantityRange(com.fhir.Range) // optional {@link ServiceRequest#quantityRange() quantityRange}
   *    .id(com.fhir.id) // optional {@link ServiceRequest#id() id}
   *    .replaces(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#replaces() replaces}
   *    .doNotPerform(Boolean) // optional {@link ServiceRequest#doNotPerform() doNotPerform}
   *    .supportingInfo(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#supportingInfo() supportingInfo}
   *    .occurrenceTiming(com.fhir.Timing) // optional {@link ServiceRequest#occurrenceTiming() occurrenceTiming}
   *    .requester(com.fhir.Reference) // optional {@link ServiceRequest#requester() requester}
   *    .language(com.fhir.code) // optional {@link ServiceRequest#language() language}
   *    .specimen(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#specimen() specimen}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ServiceRequest#extension() extension}
   *    .implicitRules(com.fhir.uri) // optional {@link ServiceRequest#implicitRules() implicitRules}
   *    .intent(com.fhir.code) // optional {@link ServiceRequest#intent() intent}
   *    .bodySite(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#bodySite() bodySite}
   *    .asNeededCodeableConcept(com.fhir.CodeableConcept) // optional {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept}
   *    .meta(com.fhir.Meta) // optional {@link ServiceRequest#meta() meta}
   *    .performerType(com.fhir.CodeableConcept) // optional {@link ServiceRequest#performerType() performerType}
   *    .relevantHistory(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#relevantHistory() relevantHistory}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ServiceRequest#identifier() identifier}
   *    .text(com.fhir.Narrative) // optional {@link ServiceRequest#text() text}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#category() category}
   *    .orderDetail(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#orderDetail() orderDetail}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link ServiceRequest#note() note}
   *    .status(com.fhir.code) // optional {@link ServiceRequest#status() status}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical}
   *    .occurrenceDateTime(String) // optional {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime}
   *    .occurrencePeriod(com.fhir.Period) // optional {@link ServiceRequest#occurrencePeriod() occurrencePeriod}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ServiceRequest#modifierExtension() modifierExtension}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#basedOn() basedOn}
   *    .locationReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#locationReference() locationReference}
   *    .insurance(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#insurance() insurance}
   *    .encounter(com.fhir.Reference) // optional {@link ServiceRequest#encounter() encounter}
   *    .authoredOn(com.fhir.dateTime) // optional {@link ServiceRequest#authoredOn() authoredOn}
   *    .quantityQuantity(com.fhir.Quantity) // optional {@link ServiceRequest#quantityQuantity() quantityQuantity}
   *    .quantityRatio(com.fhir.Ratio) // optional {@link ServiceRequest#quantityRatio() quantityRatio}
   *    .performer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#performer() performer}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#reasonReference() reasonReference}
   *    .requisition(com.fhir.Identifier) // optional {@link ServiceRequest#requisition() requisition}
   *    .subject(com.fhir.Reference) // required {@link ServiceRequest#subject() subject}
   *    .resourceType(String) // required {@link ServiceRequest#resourceType() resourceType}
   *    .patientInstruction(String) // optional {@link ServiceRequest#patientInstruction() patientInstruction}
   *    .code(com.fhir.CodeableConcept) // optional {@link ServiceRequest#code() code}
   *    .asNeededBoolean(Boolean) // optional {@link ServiceRequest#asNeededBoolean() asNeededBoolean}
   *    .priority(com.fhir.code) // optional {@link ServiceRequest#priority() priority}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#reasonCode() reasonCode}
   *    .locationCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#locationCode() locationCode}
   *    .build();
   * </pre>
   * @return A new ServiceRequest builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableServiceRequest.Builder();
  }

  /**
   * Builds instances of type {@link ServiceRequest ServiceRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ServiceRequest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x2L;
    private static final long OPT_BIT_QUANTITY_RANGE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_REPLACES = 0x10L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x20L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x40L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x80L;
    private static final long OPT_BIT_REQUESTER = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_SPECIMEN = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_INTENT = 0x2000L;
    private static final long OPT_BIT_BODY_SITE = 0x4000L;
    private static final long OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT = 0x8000L;
    private static final long OPT_BIT_META = 0x10000L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x20000L;
    private static final long OPT_BIT_RELEVANT_HISTORY = 0x40000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000L;
    private static final long OPT_BIT_TEXT = 0x100000L;
    private static final long OPT_BIT_CATEGORY = 0x200000L;
    private static final long OPT_BIT_ORDER_DETAIL = 0x400000L;
    private static final long OPT_BIT_NOTE = 0x800000L;
    private static final long OPT_BIT_STATUS = 0x1000000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x2000000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x4000000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x8000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000000L;
    private static final long OPT_BIT_BASED_ON = 0x20000000L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x40000000L;
    private static final long OPT_BIT_INSURANCE = 0x80000000L;
    private static final long OPT_BIT_ENCOUNTER = 0x100000000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x200000000L;
    private static final long OPT_BIT_QUANTITY_QUANTITY = 0x400000000L;
    private static final long OPT_BIT_QUANTITY_RATIO = 0x800000000L;
    private static final long OPT_BIT_PERFORMER = 0x1000000000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x2000000000L;
    private static final long OPT_BIT_REQUISITION = 0x4000000000L;
    private static final long OPT_BIT_PATIENT_INSTRUCTION = 0x8000000000L;
    private static final long OPT_BIT_CODE = 0x10000000000L;
    private static final long OPT_BIT_AS_NEEDED_BOOLEAN = 0x20000000000L;
    private static final long OPT_BIT_PRIORITY = 0x40000000000L;
    private static final long OPT_BIT_REASON_CODE = 0x80000000000L;
    private static final long OPT_BIT_LOCATION_CODE = 0x100000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable com.fhir.Range quantityRange;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces;
    private @javax.annotation.Nullable java.lang.Boolean doNotPerform;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
    private @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
    private @javax.annotation.Nullable com.fhir.Reference requester;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimen;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code intent;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite;
    private @javax.annotation.Nullable com.fhir.CodeableConcept asNeededCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.CodeableConcept performerType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> orderDetail;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable java.lang.String occurrenceDateTime;
    private @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> locationReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.dateTime authoredOn;
    private @javax.annotation.Nullable com.fhir.Quantity quantityQuantity;
    private @javax.annotation.Nullable com.fhir.Ratio quantityRatio;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Identifier requisition;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.String patientInstruction;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.lang.Boolean asNeededBoolean;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> locationCode;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ServiceRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link ServiceRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link ServiceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link ServiceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link ServiceRequest#quantityRange() quantityRange} to quantityRange.
     * @param quantityRange The value for quantityRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantityRange(com.fhir.Range quantityRange) {
      checkNotIsSet(quantityRangeIsSet(), "quantityRange");
      this.quantityRange = java.util.Objects.requireNonNull(quantityRange, "quantityRange");
      optBits |= OPT_BIT_QUANTITY_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRange() quantityRange} to quantityRange.
     * @param quantityRange The value for quantityRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantityRange")
    public final Builder quantityRange(java.util.Optional<? extends com.fhir.Range> quantityRange) {
      checkNotIsSet(quantityRangeIsSet(), "quantityRange");
      this.quantityRange = quantityRange.orElse(null);
      optBits |= OPT_BIT_QUANTITY_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#id() id} to id.
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
     * Initializes the optional value {@link ServiceRequest#id() id} to id.
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
     * Initializes the optional value {@link ServiceRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(java.util.List<com.fhir.Reference> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = java.util.Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public final Builder replaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    public final Builder doNotPerform(boolean doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform;
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public final Builder doNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#supportingInfo() supportingInfo} to supportingInfo.
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
     * Initializes the optional value {@link ServiceRequest#supportingInfo() supportingInfo} to supportingInfo.
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
     * Initializes the optional value {@link ServiceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link ServiceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link ServiceRequest#requester() requester} to requester.
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
     * Initializes the optional value {@link ServiceRequest#requester() requester} to requester.
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
     * Initializes the optional value {@link ServiceRequest#language() language} to language.
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
     * Initializes the optional value {@link ServiceRequest#language() language} to language.
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
     * Initializes the optional value {@link ServiceRequest#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(java.util.List<com.fhir.Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = java.util.Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specimen")
    public final Builder specimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link ServiceRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link ServiceRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ServiceRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ServiceRequest#intent() intent} to intent.
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
     * Initializes the optional value {@link ServiceRequest#intent() intent} to intent.
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
     * Initializes the optional value {@link ServiceRequest#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link ServiceRequest#bodySite() bodySite} to bodySite.
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
     * Initializes the optional value {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder asNeededCodeableConcept(com.fhir.CodeableConcept asNeededCodeableConcept) {
      checkNotIsSet(asNeededCodeableConceptIsSet(), "asNeededCodeableConcept");
      this.asNeededCodeableConcept = java.util.Objects.requireNonNull(asNeededCodeableConcept, "asNeededCodeableConcept");
      optBits |= OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("asNeededCodeableConcept")
    public final Builder asNeededCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> asNeededCodeableConcept) {
      checkNotIsSet(asNeededCodeableConceptIsSet(), "asNeededCodeableConcept");
      this.asNeededCodeableConcept = asNeededCodeableConcept.orElse(null);
      optBits |= OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link ServiceRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link ServiceRequest#performerType() performerType} to performerType.
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
     * Initializes the optional value {@link ServiceRequest#performerType() performerType} to performerType.
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
     * Initializes the optional value {@link ServiceRequest#relevantHistory() relevantHistory} to relevantHistory.
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
     * Initializes the optional value {@link ServiceRequest#relevantHistory() relevantHistory} to relevantHistory.
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
     * Initializes the optional value {@link ServiceRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ServiceRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ServiceRequest#text() text} to text.
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
     * Initializes the optional value {@link ServiceRequest#text() text} to text.
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
     * Initializes the optional value {@link ServiceRequest#category() category} to category.
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
     * Initializes the optional value {@link ServiceRequest#category() category} to category.
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
     * Initializes the optional value {@link ServiceRequest#orderDetail() orderDetail} to orderDetail.
     * @param orderDetail The value for orderDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder orderDetail(java.util.List<com.fhir.CodeableConcept> orderDetail) {
      checkNotIsSet(orderDetailIsSet(), "orderDetail");
      this.orderDetail = java.util.Objects.requireNonNull(orderDetail, "orderDetail");
      optBits |= OPT_BIT_ORDER_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#orderDetail() orderDetail} to orderDetail.
     * @param orderDetail The value for orderDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderDetail")
    public final Builder orderDetail(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> orderDetail) {
      checkNotIsSet(orderDetailIsSet(), "orderDetail");
      this.orderDetail = orderDetail.orElse(null);
      optBits |= OPT_BIT_ORDER_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#note() note} to note.
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
     * Initializes the optional value {@link ServiceRequest#note() note} to note.
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
     * Initializes the optional value {@link ServiceRequest#status() status} to status.
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
     * Initializes the optional value {@link ServiceRequest#status() status} to status.
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
     * Initializes the optional value {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link ServiceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link ServiceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link ServiceRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ServiceRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ServiceRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link ServiceRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link ServiceRequest#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationReference(java.util.List<com.fhir.Reference> locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = java.util.Objects.requireNonNull(locationReference, "locationReference");
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
    public final Builder locationReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = locationReference.orElse(null);
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#insurance() insurance} to insurance.
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
     * Initializes the optional value {@link ServiceRequest#insurance() insurance} to insurance.
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
     * Initializes the optional value {@link ServiceRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ServiceRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ServiceRequest#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link ServiceRequest#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link ServiceRequest#quantityQuantity() quantityQuantity} to quantityQuantity.
     * @param quantityQuantity The value for quantityQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantityQuantity(com.fhir.Quantity quantityQuantity) {
      checkNotIsSet(quantityQuantityIsSet(), "quantityQuantity");
      this.quantityQuantity = java.util.Objects.requireNonNull(quantityQuantity, "quantityQuantity");
      optBits |= OPT_BIT_QUANTITY_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityQuantity() quantityQuantity} to quantityQuantity.
     * @param quantityQuantity The value for quantityQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantityQuantity")
    public final Builder quantityQuantity(java.util.Optional<? extends com.fhir.Quantity> quantityQuantity) {
      checkNotIsSet(quantityQuantityIsSet(), "quantityQuantity");
      this.quantityQuantity = quantityQuantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRatio() quantityRatio} to quantityRatio.
     * @param quantityRatio The value for quantityRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantityRatio(com.fhir.Ratio quantityRatio) {
      checkNotIsSet(quantityRatioIsSet(), "quantityRatio");
      this.quantityRatio = java.util.Objects.requireNonNull(quantityRatio, "quantityRatio");
      optBits |= OPT_BIT_QUANTITY_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRatio() quantityRatio} to quantityRatio.
     * @param quantityRatio The value for quantityRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantityRatio")
    public final Builder quantityRatio(java.util.Optional<? extends com.fhir.Ratio> quantityRatio) {
      checkNotIsSet(quantityRatioIsSet(), "quantityRatio");
      this.quantityRatio = quantityRatio.orElse(null);
      optBits |= OPT_BIT_QUANTITY_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link ServiceRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link ServiceRequest#requisition() requisition} to requisition.
     * @param requisition The value for requisition
     * @return {@code this} builder for chained invocation
     */
    public final Builder requisition(com.fhir.Identifier requisition) {
      checkNotIsSet(requisitionIsSet(), "requisition");
      this.requisition = java.util.Objects.requireNonNull(requisition, "requisition");
      optBits |= OPT_BIT_REQUISITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#requisition() requisition} to requisition.
     * @param requisition The value for requisition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requisition")
    public final Builder requisition(java.util.Optional<? extends com.fhir.Identifier> requisition) {
      checkNotIsSet(requisitionIsSet(), "requisition");
      this.requisition = requisition.orElse(null);
      optBits |= OPT_BIT_REQUISITION;
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceRequest#subject() subject} attribute.
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
     * Initializes the value for the {@link ServiceRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ServiceRequest#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder patientInstruction(java.lang.String patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = java.util.Objects.requireNonNull(patientInstruction, "patientInstruction");
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patientInstruction")
    public final Builder patientInstruction(java.util.Optional<java.lang.String> patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = patientInstruction.orElse(null);
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#code() code} to code.
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
     * Initializes the optional value {@link ServiceRequest#code() code} to code.
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
     * Initializes the optional value {@link ServiceRequest#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder asNeededBoolean(boolean asNeededBoolean) {
      checkNotIsSet(asNeededBooleanIsSet(), "asNeededBoolean");
      this.asNeededBoolean = asNeededBoolean;
      optBits |= OPT_BIT_AS_NEEDED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("asNeededBoolean")
    public final Builder asNeededBoolean(java.util.Optional<java.lang.Boolean> asNeededBoolean) {
      checkNotIsSet(asNeededBooleanIsSet(), "asNeededBoolean");
      this.asNeededBoolean = asNeededBoolean.orElse(null);
      optBits |= OPT_BIT_AS_NEEDED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link ServiceRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link ServiceRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link ServiceRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link ServiceRequest#locationCode() locationCode} to locationCode.
     * @param locationCode The value for locationCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationCode(java.util.List<com.fhir.CodeableConcept> locationCode) {
      checkNotIsSet(locationCodeIsSet(), "locationCode");
      this.locationCode = java.util.Objects.requireNonNull(locationCode, "locationCode");
      optBits |= OPT_BIT_LOCATION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#locationCode() locationCode} to locationCode.
     * @param locationCode The value for locationCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationCode")
    public final Builder locationCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> locationCode) {
      checkNotIsSet(locationCodeIsSet(), "locationCode");
      this.locationCode = locationCode.orElse(null);
      optBits |= OPT_BIT_LOCATION_CODE;
      return this;
    }

    /**
     * Builds a new {@link ServiceRequest ServiceRequest}.
     * @return An immutable instance of ServiceRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ServiceRequest build() {
      checkRequiredAttributes();
      return new ImmutableServiceRequest(
          contained,
          instantiatesUri,
          quantityRange,
          id,
          replaces,
          doNotPerform,
          supportingInfo,
          occurrenceTiming,
          requester,
          language,
          specimen,
          extension,
          implicitRules,
          intent,
          bodySite,
          asNeededCodeableConcept,
          meta,
          performerType,
          relevantHistory,
          identifier,
          text,
          category,
          orderDetail,
          note,
          status,
          instantiatesCanonical,
          occurrenceDateTime,
          occurrencePeriod,
          modifierExtension,
          basedOn,
          locationReference,
          insurance,
          encounter,
          authoredOn,
          quantityQuantity,
          quantityRatio,
          performer,
          reasonReference,
          requisition,
          subject,
          resourceType,
          patientInstruction,
          code,
          asNeededBoolean,
          priority,
          reasonCode,
          locationCode);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean quantityRangeIsSet() {
      return (optBits & OPT_BIT_QUANTITY_RANGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean asNeededCodeableConceptIsSet() {
      return (optBits & OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean relevantHistoryIsSet() {
      return (optBits & OPT_BIT_RELEVANT_HISTORY) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean orderDetailIsSet() {
      return (optBits & OPT_BIT_ORDER_DETAIL) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean quantityQuantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY_QUANTITY) != 0;
    }

    private boolean quantityRatioIsSet() {
      return (optBits & OPT_BIT_QUANTITY_RATIO) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean requisitionIsSet() {
      return (optBits & OPT_BIT_REQUISITION) != 0;
    }

    private boolean patientInstructionIsSet() {
      return (optBits & OPT_BIT_PATIENT_INSTRUCTION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean asNeededBooleanIsSet() {
      return (optBits & OPT_BIT_AS_NEEDED_BOOLEAN) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean locationCodeIsSet() {
      return (optBits & OPT_BIT_LOCATION_CODE) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ServiceRequest is strict, attribute is already set: ".concat(name));
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
      return "Cannot build ServiceRequest, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ServiceRequest", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link ServiceRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "ServiceRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ServiceRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ServiceRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ServiceRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ServiceRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRange() quantityRange} to quantityRange.
     * @param quantityRange The value for quantityRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantityRange(com.fhir.Range quantityRange);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRange() quantityRange} to quantityRange.
     * @param quantityRange The value for quantityRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantityRange(java.util.Optional<? extends com.fhir.Range> quantityRange);

    /**
     * Initializes the optional value {@link ServiceRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ServiceRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ServiceRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(java.util.List<com.fhir.Reference> replaces);

    /**
     * Initializes the optional value {@link ServiceRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> replaces);

    /**
     * Initializes the optional value {@link ServiceRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doNotPerform(boolean doNotPerform);

    /**
     * Initializes the optional value {@link ServiceRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link ServiceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(java.util.List<com.fhir.Reference> supportingInfo);

    /**
     * Initializes the optional value {@link ServiceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(com.fhir.Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(java.util.Optional<? extends com.fhir.Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link ServiceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(com.fhir.Reference requester);

    /**
     * Initializes the optional value {@link ServiceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(java.util.Optional<? extends com.fhir.Reference> requester);

    /**
     * Initializes the optional value {@link ServiceRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ServiceRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ServiceRequest#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(java.util.List<com.fhir.Reference> specimen);

    /**
     * Initializes the optional value {@link ServiceRequest#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(java.util.Optional<? extends java.util.List<com.fhir.Reference>> specimen);

    /**
     * Initializes the optional value {@link ServiceRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ServiceRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ServiceRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ServiceRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ServiceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(com.fhir.code intent);

    /**
     * Initializes the optional value {@link ServiceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(java.util.Optional<? extends com.fhir.code> intent);

    /**
     * Initializes the optional value {@link ServiceRequest#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(java.util.List<com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link ServiceRequest#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodySite);

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asNeededCodeableConcept(com.fhir.CodeableConcept asNeededCodeableConcept);

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asNeededCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> asNeededCodeableConcept);

    /**
     * Initializes the optional value {@link ServiceRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ServiceRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ServiceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(com.fhir.CodeableConcept performerType);

    /**
     * Initializes the optional value {@link ServiceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(java.util.Optional<? extends com.fhir.CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link ServiceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relevantHistory(java.util.List<com.fhir.Reference> relevantHistory);

    /**
     * Initializes the optional value {@link ServiceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> relevantHistory);

    /**
     * Initializes the optional value {@link ServiceRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ServiceRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ServiceRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ServiceRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ServiceRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link ServiceRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link ServiceRequest#orderDetail() orderDetail} to orderDetail.
     * @param orderDetail The value for orderDetail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal orderDetail(java.util.List<com.fhir.CodeableConcept> orderDetail);

    /**
     * Initializes the optional value {@link ServiceRequest#orderDetail() orderDetail} to orderDetail.
     * @param orderDetail The value for orderDetail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal orderDetail(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> orderDetail);

    /**
     * Initializes the optional value {@link ServiceRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link ServiceRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link ServiceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link ServiceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(java.lang.String occurrenceDateTime);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(com.fhir.Period occurrencePeriod);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link ServiceRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ServiceRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ServiceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link ServiceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link ServiceRequest#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationReference(java.util.List<com.fhir.Reference> locationReference);

    /**
     * Initializes the optional value {@link ServiceRequest#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> locationReference);

    /**
     * Initializes the optional value {@link ServiceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(java.util.List<com.fhir.Reference> insurance);

    /**
     * Initializes the optional value {@link ServiceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> insurance);

    /**
     * Initializes the optional value {@link ServiceRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link ServiceRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link ServiceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(com.fhir.dateTime authoredOn);

    /**
     * Initializes the optional value {@link ServiceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityQuantity() quantityQuantity} to quantityQuantity.
     * @param quantityQuantity The value for quantityQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantityQuantity(com.fhir.Quantity quantityQuantity);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityQuantity() quantityQuantity} to quantityQuantity.
     * @param quantityQuantity The value for quantityQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantityQuantity(java.util.Optional<? extends com.fhir.Quantity> quantityQuantity);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRatio() quantityRatio} to quantityRatio.
     * @param quantityRatio The value for quantityRatio
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantityRatio(com.fhir.Ratio quantityRatio);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRatio() quantityRatio} to quantityRatio.
     * @param quantityRatio The value for quantityRatio
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantityRatio(java.util.Optional<? extends com.fhir.Ratio> quantityRatio);

    /**
     * Initializes the optional value {@link ServiceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link ServiceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer);

    /**
     * Initializes the optional value {@link ServiceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link ServiceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link ServiceRequest#requisition() requisition} to requisition.
     * @param requisition The value for requisition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requisition(com.fhir.Identifier requisition);

    /**
     * Initializes the optional value {@link ServiceRequest#requisition() requisition} to requisition.
     * @param requisition The value for requisition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requisition(java.util.Optional<? extends com.fhir.Identifier> requisition);

    /**
     * Initializes the optional value {@link ServiceRequest#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patientInstruction(java.lang.String patientInstruction);

    /**
     * Initializes the optional value {@link ServiceRequest#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patientInstruction(java.util.Optional<java.lang.String> patientInstruction);

    /**
     * Initializes the optional value {@link ServiceRequest#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link ServiceRequest#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asNeededBoolean(boolean asNeededBoolean);

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asNeededBoolean(java.util.Optional<java.lang.Boolean> asNeededBoolean);

    /**
     * Initializes the optional value {@link ServiceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link ServiceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

    /**
     * Initializes the optional value {@link ServiceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link ServiceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link ServiceRequest#locationCode() locationCode} to locationCode.
     * @param locationCode The value for locationCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationCode(java.util.List<com.fhir.CodeableConcept> locationCode);

    /**
     * Initializes the optional value {@link ServiceRequest#locationCode() locationCode} to locationCode.
     * @param locationCode The value for locationCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> locationCode);

    /**
     * Builds a new {@link ServiceRequest ServiceRequest}.
     * @return An immutable instance of ServiceRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ServiceRequest build();
  }
}
