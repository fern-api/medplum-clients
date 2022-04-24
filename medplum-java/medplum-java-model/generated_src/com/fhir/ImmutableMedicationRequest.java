//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicationRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationRequest.builder()}.
 */
@org.immutables.value.Generated(from = "MedicationRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationRequest implements com.fhir.MedicationRequest {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> detectedIssue;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory;
  private final @javax.annotation.Nullable java.lang.Boolean doNotPerform;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
  private final @javax.annotation.Nullable com.fhir.dateTime authoredOn;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept courseOfTherapyType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosageInstruction;
  private final @javax.annotation.Nullable com.fhir.Reference priorPrescription;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.Reference recorder;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.MedicationRequest_Substitution substitution;
  private final @javax.annotation.Nullable java.lang.Boolean reportedBoolean;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance;
  private final @javax.annotation.Nullable com.fhir.Reference reportedReference;
  private final @javax.annotation.Nullable com.fhir.MedicationRequest_DispenseRequest dispenseRequest;
  private final @javax.annotation.Nullable com.fhir.Reference performer;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Reference medicationReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept performerType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
  private final @javax.annotation.Nullable com.fhir.Reference requester;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.code intent;

  private ImmutableMedicationRequest(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> detectedIssue,
      @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Identifier groupIdentifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory,
      @javax.annotation.Nullable java.lang.Boolean doNotPerform,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReason,
      @javax.annotation.Nullable com.fhir.dateTime authoredOn,
      @javax.annotation.Nullable com.fhir.CodeableConcept courseOfTherapyType,
      @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosageInstruction,
      @javax.annotation.Nullable com.fhir.Reference priorPrescription,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.Reference recorder,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.MedicationRequest_Substitution substitution,
      @javax.annotation.Nullable java.lang.Boolean reportedBoolean,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance,
      @javax.annotation.Nullable com.fhir.Reference reportedReference,
      @javax.annotation.Nullable com.fhir.MedicationRequest_DispenseRequest dispenseRequest,
      @javax.annotation.Nullable com.fhir.Reference performer,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Reference medicationReference,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.CodeableConcept performerType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation,
      @javax.annotation.Nullable com.fhir.Reference requester,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.code intent) {
    this.detectedIssue = detectedIssue;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.category = category;
    this.instantiatesCanonical = instantiatesCanonical;
    this.note = note;
    this.reasonReference = reasonReference;
    this.groupIdentifier = groupIdentifier;
    this.eventHistory = eventHistory;
    this.doNotPerform = doNotPerform;
    this.statusReason = statusReason;
    this.authoredOn = authoredOn;
    this.courseOfTherapyType = courseOfTherapyType;
    this.dosageInstruction = dosageInstruction;
    this.priorPrescription = priorPrescription;
    this.resourceType = resourceType;
    this.encounter = encounter;
    this.recorder = recorder;
    this.contained = contained;
    this.priority = priority;
    this.modifierExtension = modifierExtension;
    this.substitution = substitution;
    this.reportedBoolean = reportedBoolean;
    this.implicitRules = implicitRules;
    this.status = status;
    this.insurance = insurance;
    this.reportedReference = reportedReference;
    this.dispenseRequest = dispenseRequest;
    this.performer = performer;
    this.meta = meta;
    this.medicationReference = medicationReference;
    this.instantiatesUri = instantiatesUri;
    this.subject = subject;
    this.language = language;
    this.identifier = identifier;
    this.extension = extension;
    this.text = text;
    this.performerType = performerType;
    this.reasonCode = reasonCode;
    this.supportingInformation = supportingInformation;
    this.requester = requester;
    this.basedOn = basedOn;
    this.id = id;
    this.intent = intent;
  }

  /**
   * @return The value of the {@code detectedIssue} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detectedIssue")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> detectedIssue() {
    return java.util.Optional.ofNullable(detectedIssue);
  }

  /**
   * @return The value of the {@code medicationCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medicationCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept() {
    return java.util.Optional.ofNullable(medicationCodeableConcept);
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
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
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
   * @return The value of the {@code groupIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> groupIdentifier() {
    return java.util.Optional.ofNullable(groupIdentifier);
  }

  /**
   * @return The value of the {@code eventHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("eventHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory() {
    return java.util.Optional.ofNullable(eventHistory);
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
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
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
   * @return The value of the {@code courseOfTherapyType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("courseOfTherapyType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> courseOfTherapyType() {
    return java.util.Optional.ofNullable(courseOfTherapyType);
  }

  /**
   * @return The value of the {@code dosageInstruction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dosageInstruction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Dosage>> dosageInstruction() {
    return java.util.Optional.ofNullable(dosageInstruction);
  }

  /**
   * @return The value of the {@code priorPrescription} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priorPrescription")
  @Override
  public java.util.Optional<com.fhir.Reference> priorPrescription() {
    return java.util.Optional.ofNullable(priorPrescription);
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
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code substitution} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("substitution")
  @Override
  public java.util.Optional<com.fhir.MedicationRequest_Substitution> substitution() {
    return java.util.Optional.ofNullable(substitution);
  }

  /**
   * @return The value of the {@code reportedBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reportedBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> reportedBoolean() {
    return java.util.Optional.ofNullable(reportedBoolean);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code reportedReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reportedReference")
  @Override
  public java.util.Optional<com.fhir.Reference> reportedReference() {
    return java.util.Optional.ofNullable(reportedReference);
  }

  /**
   * @return The value of the {@code dispenseRequest} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dispenseRequest")
  @Override
  public java.util.Optional<com.fhir.MedicationRequest_DispenseRequest> dispenseRequest() {
    return java.util.Optional.ofNullable(dispenseRequest);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code medicationReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medicationReference")
  @Override
  public java.util.Optional<com.fhir.Reference> medicationReference() {
    return java.util.Optional.ofNullable(medicationReference);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public com.fhir.Reference subject() {
    return subject;
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code supportingInformation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation() {
    return java.util.Optional.ofNullable(supportingInformation);
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
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
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
   * @return The value of the {@code intent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intent")
  @Override
  public java.util.Optional<com.fhir.code> intent() {
    return java.util.Optional.ofNullable(intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#detectedIssue() detectedIssue} attribute.
   * @param value The value for detectedIssue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDetectedIssue(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "detectedIssue");
    if (this.detectedIssue == newValue) return this;
    return new ImmutableMedicationRequest(
        newValue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#detectedIssue() detectedIssue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detectedIssue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withDetectedIssue(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.detectedIssue == value) return this;
    return new ImmutableMedicationRequest(
        value,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withMedicationCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        newValue,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withMedicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        value,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        newValue,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        value,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        newValue,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        value,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        newValue,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        value,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        newValue,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        value,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withGroupIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        newValue,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withGroupIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        value,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#eventHistory() eventHistory} attribute.
   * @param value The value for eventHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withEventHistory(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "eventHistory");
    if (this.eventHistory == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        newValue,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#eventHistory() eventHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withEventHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.eventHistory == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        value,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDoNotPerform(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        newValue,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDoNotPerform(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        value,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withStatusReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        newValue,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withStatusReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        value,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withAuthoredOn(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        newValue,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withAuthoredOn(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        value,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} attribute.
   * @param value The value for courseOfTherapyType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withCourseOfTherapyType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "courseOfTherapyType");
    if (this.courseOfTherapyType == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        newValue,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for courseOfTherapyType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withCourseOfTherapyType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.courseOfTherapyType == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        value,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#dosageInstruction() dosageInstruction} attribute.
   * @param value The value for dosageInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDosageInstruction(java.util.List<com.fhir.Dosage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Dosage> newValue = java.util.Objects.requireNonNull(value, "dosageInstruction");
    if (this.dosageInstruction == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        newValue,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#dosageInstruction() dosageInstruction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosageInstruction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withDosageInstruction(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Dosage> value = optional.orElse(null);
    if (this.dosageInstruction == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        value,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#priorPrescription() priorPrescription} attribute.
   * @param value The value for priorPrescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withPriorPrescription(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "priorPrescription");
    if (this.priorPrescription == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        newValue,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#priorPrescription() priorPrescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priorPrescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withPriorPrescription(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.priorPrescription == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        value,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationRequest withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        newValue,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        newValue,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        value,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withRecorder(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        newValue,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withRecorder(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        value,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        newValue,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        value,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        newValue,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        value,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        newValue,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        value,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#substitution() substitution} attribute.
   * @param value The value for substitution
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withSubstitution(com.fhir.MedicationRequest_Substitution value) {
    @javax.annotation.Nullable com.fhir.MedicationRequest_Substitution newValue = java.util.Objects.requireNonNull(value, "substitution");
    if (this.substitution == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        newValue,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#substitution() substitution} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substitution
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withSubstitution(java.util.Optional<? extends com.fhir.MedicationRequest_Substitution> optional) {
    @javax.annotation.Nullable com.fhir.MedicationRequest_Substitution value = optional.orElse(null);
    if (this.substitution == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        value,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#reportedBoolean() reportedBoolean} attribute.
   * @param value The value for reportedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReportedBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.reportedBoolean, newValue)) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        newValue,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#reportedBoolean() reportedBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reportedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReportedBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.reportedBoolean, value)) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        value,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        newValue,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        value,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        newValue,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        value,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withInsurance(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        newValue,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withInsurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        value,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#reportedReference() reportedReference} attribute.
   * @param value The value for reportedReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReportedReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "reportedReference");
    if (this.reportedReference == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        newValue,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#reportedReference() reportedReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reportedReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withReportedReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.reportedReference == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        value,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#dispenseRequest() dispenseRequest} attribute.
   * @param value The value for dispenseRequest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDispenseRequest(com.fhir.MedicationRequest_DispenseRequest value) {
    @javax.annotation.Nullable com.fhir.MedicationRequest_DispenseRequest newValue = java.util.Objects.requireNonNull(value, "dispenseRequest");
    if (this.dispenseRequest == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        newValue,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#dispenseRequest() dispenseRequest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dispenseRequest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withDispenseRequest(java.util.Optional<? extends com.fhir.MedicationRequest_DispenseRequest> optional) {
    @javax.annotation.Nullable com.fhir.MedicationRequest_DispenseRequest value = optional.orElse(null);
    if (this.dispenseRequest == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        value,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withPerformer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        newValue,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withPerformer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        value,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        newValue,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        value,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withMedicationReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        newValue,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withMedicationReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        value,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        newValue,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        value,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationRequest#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationRequest withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        newValue,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        newValue,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        value,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        newValue,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        value,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        newValue,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        value,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        newValue,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        value,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withPerformerType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        newValue,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withPerformerType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        value,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        newValue,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        value,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withSupportingInformation(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        newValue,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withSupportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        value,
        this.requester,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withRequester(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        newValue,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withRequester(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        value,
        this.basedOn,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        newValue,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        value,
        this.id,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        newValue,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        value,
        this.intent);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withIntent(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withIntent(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableMedicationRequest(
        this.detectedIssue,
        this.medicationCodeableConcept,
        this.category,
        this.instantiatesCanonical,
        this.note,
        this.reasonReference,
        this.groupIdentifier,
        this.eventHistory,
        this.doNotPerform,
        this.statusReason,
        this.authoredOn,
        this.courseOfTherapyType,
        this.dosageInstruction,
        this.priorPrescription,
        this.resourceType,
        this.encounter,
        this.recorder,
        this.contained,
        this.priority,
        this.modifierExtension,
        this.substitution,
        this.reportedBoolean,
        this.implicitRules,
        this.status,
        this.insurance,
        this.reportedReference,
        this.dispenseRequest,
        this.performer,
        this.meta,
        this.medicationReference,
        this.instantiatesUri,
        this.subject,
        this.language,
        this.identifier,
        this.extension,
        this.text,
        this.performerType,
        this.reasonCode,
        this.supportingInformation,
        this.requester,
        this.basedOn,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationRequest
        && equalTo((ImmutableMedicationRequest) another);
  }

  private boolean equalTo(ImmutableMedicationRequest another) {
    return java.util.Objects.equals(detectedIssue, another.detectedIssue)
        && java.util.Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(groupIdentifier, another.groupIdentifier)
        && java.util.Objects.equals(eventHistory, another.eventHistory)
        && java.util.Objects.equals(doNotPerform, another.doNotPerform)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(authoredOn, another.authoredOn)
        && java.util.Objects.equals(courseOfTherapyType, another.courseOfTherapyType)
        && java.util.Objects.equals(dosageInstruction, another.dosageInstruction)
        && java.util.Objects.equals(priorPrescription, another.priorPrescription)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(recorder, another.recorder)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(substitution, another.substitution)
        && java.util.Objects.equals(reportedBoolean, another.reportedBoolean)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(insurance, another.insurance)
        && java.util.Objects.equals(reportedReference, another.reportedReference)
        && java.util.Objects.equals(dispenseRequest, another.dispenseRequest)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(medicationReference, another.medicationReference)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && subject.equals(another.subject)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(performerType, another.performerType)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(supportingInformation, another.supportingInformation)
        && java.util.Objects.equals(requester, another.requester)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(intent, another.intent);
  }

  /**
   * Computes a hash code from attributes: {@code detectedIssue}, {@code medicationCodeableConcept}, {@code category}, {@code instantiatesCanonical}, {@code note}, {@code reasonReference}, {@code groupIdentifier}, {@code eventHistory}, {@code doNotPerform}, {@code statusReason}, {@code authoredOn}, {@code courseOfTherapyType}, {@code dosageInstruction}, {@code priorPrescription}, {@code resourceType}, {@code encounter}, {@code recorder}, {@code contained}, {@code priority}, {@code modifierExtension}, {@code substitution}, {@code reportedBoolean}, {@code implicitRules}, {@code status}, {@code insurance}, {@code reportedReference}, {@code dispenseRequest}, {@code performer}, {@code meta}, {@code medicationReference}, {@code instantiatesUri}, {@code subject}, {@code language}, {@code identifier}, {@code extension}, {@code text}, {@code performerType}, {@code reasonCode}, {@code supportingInformation}, {@code requester}, {@code basedOn}, {@code id}, {@code intent}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(detectedIssue);
    h += (h << 5) + java.util.Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(groupIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(eventHistory);
    h += (h << 5) + java.util.Objects.hashCode(doNotPerform);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(authoredOn);
    h += (h << 5) + java.util.Objects.hashCode(courseOfTherapyType);
    h += (h << 5) + java.util.Objects.hashCode(dosageInstruction);
    h += (h << 5) + java.util.Objects.hashCode(priorPrescription);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(recorder);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(substitution);
    h += (h << 5) + java.util.Objects.hashCode(reportedBoolean);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(insurance);
    h += (h << 5) + java.util.Objects.hashCode(reportedReference);
    h += (h << 5) + java.util.Objects.hashCode(dispenseRequest);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(medicationReference);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(performerType);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(supportingInformation);
    h += (h << 5) + java.util.Objects.hashCode(requester);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(intent);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicationRequest{");
    if (detectedIssue != null) {
      builder.append("detectedIssue=").append(detectedIssue);
    }
    if (medicationCodeableConcept != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (category != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (note != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (reasonReference != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (groupIdentifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (eventHistory != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("eventHistory=").append(eventHistory);
    }
    if (doNotPerform != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (statusReason != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (authoredOn != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (courseOfTherapyType != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("courseOfTherapyType=").append(courseOfTherapyType);
    }
    if (dosageInstruction != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("dosageInstruction=").append(dosageInstruction);
    }
    if (priorPrescription != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("priorPrescription=").append(priorPrescription);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (recorder != null) {
      builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (substitution != null) {
      builder.append(", ");
      builder.append("substitution=").append(substitution);
    }
    if (reportedBoolean != null) {
      builder.append(", ");
      builder.append("reportedBoolean=").append(reportedBoolean);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (reportedReference != null) {
      builder.append(", ");
      builder.append("reportedReference=").append(reportedReference);
    }
    if (dispenseRequest != null) {
      builder.append(", ");
      builder.append("dispenseRequest=").append(dispenseRequest);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (medicationReference != null) {
      builder.append(", ");
      builder.append("medicationReference=").append(medicationReference);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (performerType != null) {
      builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (supportingInformation != null) {
      builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (requester != null) {
      builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (intent != null) {
      builder.append(", ");
      builder.append("intent=").append(intent);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicationRequest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicationRequest {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> detectedIssue = java.util.Optional.empty();
    boolean detectedIssueIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept = java.util.Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> groupIdentifier = java.util.Optional.empty();
    boolean groupIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory = java.util.Optional.empty();
    boolean eventHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> doNotPerform = java.util.Optional.empty();
    boolean doNotPerformIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> authoredOn = java.util.Optional.empty();
    boolean authoredOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> courseOfTherapyType = java.util.Optional.empty();
    boolean courseOfTherapyTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Dosage>> dosageInstruction = java.util.Optional.empty();
    boolean dosageInstructionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> priorPrescription = java.util.Optional.empty();
    boolean priorPrescriptionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> recorder = java.util.Optional.empty();
    boolean recorderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MedicationRequest_Substitution> substitution = java.util.Optional.empty();
    boolean substitutionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> reportedBoolean = java.util.Optional.empty();
    boolean reportedBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> insurance = java.util.Optional.empty();
    boolean insuranceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> reportedReference = java.util.Optional.empty();
    boolean reportedReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MedicationRequest_DispenseRequest> dispenseRequest = java.util.Optional.empty();
    boolean dispenseRequestIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> medicationReference = java.util.Optional.empty();
    boolean medicationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> performerType = java.util.Optional.empty();
    boolean performerTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation = java.util.Optional.empty();
    boolean supportingInformationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requester = java.util.Optional.empty();
    boolean requesterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> intent = java.util.Optional.empty();
    boolean intentIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("detectedIssue")
    public void setDetectedIssue(java.util.Optional<java.util.List<com.fhir.Reference>> detectedIssue) {
      this.detectedIssue = detectedIssue;
      this.detectedIssueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
    public void setGroupIdentifier(java.util.Optional<com.fhir.Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eventHistory")
    public void setEventHistory(java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory) {
      this.eventHistory = eventHistory;
      this.eventHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public void setDoNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<com.fhir.CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public void setAuthoredOn(java.util.Optional<com.fhir.dateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("courseOfTherapyType")
    public void setCourseOfTherapyType(java.util.Optional<com.fhir.CodeableConcept> courseOfTherapyType) {
      this.courseOfTherapyType = courseOfTherapyType;
      this.courseOfTherapyTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dosageInstruction")
    public void setDosageInstruction(java.util.Optional<java.util.List<com.fhir.Dosage>> dosageInstruction) {
      this.dosageInstruction = dosageInstruction;
      this.dosageInstructionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priorPrescription")
    public void setPriorPrescription(java.util.Optional<com.fhir.Reference> priorPrescription) {
      this.priorPrescription = priorPrescription;
      this.priorPrescriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recorder")
    public void setRecorder(java.util.Optional<com.fhir.Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("substitution")
    public void setSubstitution(java.util.Optional<com.fhir.MedicationRequest_Substitution> substitution) {
      this.substitution = substitution;
      this.substitutionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reportedBoolean")
    public void setReportedBoolean(java.util.Optional<java.lang.Boolean> reportedBoolean) {
      this.reportedBoolean = reportedBoolean;
      this.reportedBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.Optional<java.util.List<com.fhir.Reference>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reportedReference")
    public void setReportedReference(java.util.Optional<com.fhir.Reference> reportedReference) {
      this.reportedReference = reportedReference;
      this.reportedReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dispenseRequest")
    public void setDispenseRequest(java.util.Optional<com.fhir.MedicationRequest_DispenseRequest> dispenseRequest) {
      this.dispenseRequest = dispenseRequest;
      this.dispenseRequestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<com.fhir.Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medicationReference")
    public void setMedicationReference(java.util.Optional<com.fhir.Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performerType")
    public void setPerformerType(java.util.Optional<com.fhir.CodeableConcept> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
    public void setSupportingInformation(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation) {
      this.supportingInformation = supportingInformation;
      this.supportingInformationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requester")
    public void setRequester(java.util.Optional<com.fhir.Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public void setIntent(java.util.Optional<com.fhir.code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> detectedIssue() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> courseOfTherapyType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Dosage>> dosageInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> priorPrescription() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MedicationRequest_Substitution> substitution() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> reportedBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> reportedReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MedicationRequest_DispenseRequest> dispenseRequest() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> performerType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> intent() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationRequest fromJson(Json json) {
    ImmutableMedicationRequest.Builder builder = ((ImmutableMedicationRequest.Builder) ImmutableMedicationRequest.builder());
    if (json.detectedIssueIsSet) {
      builder.detectedIssue(json.detectedIssue);
    }
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.eventHistoryIsSet) {
      builder.eventHistory(json.eventHistory);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.courseOfTherapyTypeIsSet) {
      builder.courseOfTherapyType(json.courseOfTherapyType);
    }
    if (json.dosageInstructionIsSet) {
      builder.dosageInstruction(json.dosageInstruction);
    }
    if (json.priorPrescriptionIsSet) {
      builder.priorPrescription(json.priorPrescription);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.substitutionIsSet) {
      builder.substitution(json.substitution);
    }
    if (json.reportedBooleanIsSet) {
      builder.reportedBoolean(json.reportedBoolean);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.reportedReferenceIsSet) {
      builder.reportedReference(json.reportedReference);
    }
    if (json.dispenseRequestIsSet) {
      builder.dispenseRequest(json.dispenseRequest);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    return (ImmutableMedicationRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationRequest instance
   */
  public static MedicationRequest copyOf(MedicationRequest instance) {
    if (instance instanceof ImmutableMedicationRequest) {
      return (ImmutableMedicationRequest) instance;
    }
    return ((ImmutableMedicationRequest.Builder) ImmutableMedicationRequest.builder())
        .detectedIssue(instance.detectedIssue())
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .category(instance.category())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .note(instance.note())
        .reasonReference(instance.reasonReference())
        .groupIdentifier(instance.groupIdentifier())
        .eventHistory(instance.eventHistory())
        .doNotPerform(instance.doNotPerform())
        .statusReason(instance.statusReason())
        .authoredOn(instance.authoredOn())
        .courseOfTherapyType(instance.courseOfTherapyType())
        .dosageInstruction(instance.dosageInstruction())
        .priorPrescription(instance.priorPrescription())
        .resourceType(instance.resourceType())
        .encounter(instance.encounter())
        .recorder(instance.recorder())
        .contained(instance.contained())
        .priority(instance.priority())
        .modifierExtension(instance.modifierExtension())
        .substitution(instance.substitution())
        .reportedBoolean(instance.reportedBoolean())
        .implicitRules(instance.implicitRules())
        .status(instance.status())
        .insurance(instance.insurance())
        .reportedReference(instance.reportedReference())
        .dispenseRequest(instance.dispenseRequest())
        .performer(instance.performer())
        .meta(instance.meta())
        .medicationReference(instance.medicationReference())
        .instantiatesUri(instance.instantiatesUri())
        .subject(instance.subject())
        .language(instance.language())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .text(instance.text())
        .performerType(instance.performerType())
        .reasonCode(instance.reasonCode())
        .supportingInformation(instance.supportingInformation())
        .requester(instance.requester())
        .basedOn(instance.basedOn())
        .id(instance.id())
        .intent(instance.intent())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationRequest MedicationRequest}.
   * <pre>
   * ImmutableMedicationRequest.builder()
   *    .detectedIssue(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#detectedIssue() detectedIssue}
   *    .medicationCodeableConcept(com.fhir.CodeableConcept) // optional {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationRequest#category() category}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link MedicationRequest#note() note}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#reasonReference() reasonReference}
   *    .groupIdentifier(com.fhir.Identifier) // optional {@link MedicationRequest#groupIdentifier() groupIdentifier}
   *    .eventHistory(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#eventHistory() eventHistory}
   *    .doNotPerform(Boolean) // optional {@link MedicationRequest#doNotPerform() doNotPerform}
   *    .statusReason(com.fhir.CodeableConcept) // optional {@link MedicationRequest#statusReason() statusReason}
   *    .authoredOn(com.fhir.dateTime) // optional {@link MedicationRequest#authoredOn() authoredOn}
   *    .courseOfTherapyType(com.fhir.CodeableConcept) // optional {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType}
   *    .dosageInstruction(List&amp;lt;com.fhir.Dosage&amp;gt;) // optional {@link MedicationRequest#dosageInstruction() dosageInstruction}
   *    .priorPrescription(com.fhir.Reference) // optional {@link MedicationRequest#priorPrescription() priorPrescription}
   *    .resourceType(String) // required {@link MedicationRequest#resourceType() resourceType}
   *    .encounter(com.fhir.Reference) // optional {@link MedicationRequest#encounter() encounter}
   *    .recorder(com.fhir.Reference) // optional {@link MedicationRequest#recorder() recorder}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicationRequest#contained() contained}
   *    .priority(com.fhir.code) // optional {@link MedicationRequest#priority() priority}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationRequest#modifierExtension() modifierExtension}
   *    .substitution(com.fhir.MedicationRequest_Substitution) // optional {@link MedicationRequest#substitution() substitution}
   *    .reportedBoolean(Boolean) // optional {@link MedicationRequest#reportedBoolean() reportedBoolean}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicationRequest#implicitRules() implicitRules}
   *    .status(com.fhir.code) // optional {@link MedicationRequest#status() status}
   *    .insurance(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#insurance() insurance}
   *    .reportedReference(com.fhir.Reference) // optional {@link MedicationRequest#reportedReference() reportedReference}
   *    .dispenseRequest(com.fhir.MedicationRequest_DispenseRequest) // optional {@link MedicationRequest#dispenseRequest() dispenseRequest}
   *    .performer(com.fhir.Reference) // optional {@link MedicationRequest#performer() performer}
   *    .meta(com.fhir.Meta) // optional {@link MedicationRequest#meta() meta}
   *    .medicationReference(com.fhir.Reference) // optional {@link MedicationRequest#medicationReference() medicationReference}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link MedicationRequest#instantiatesUri() instantiatesUri}
   *    .subject(com.fhir.Reference) // required {@link MedicationRequest#subject() subject}
   *    .language(com.fhir.code) // optional {@link MedicationRequest#language() language}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicationRequest#identifier() identifier}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationRequest#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link MedicationRequest#text() text}
   *    .performerType(com.fhir.CodeableConcept) // optional {@link MedicationRequest#performerType() performerType}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationRequest#reasonCode() reasonCode}
   *    .supportingInformation(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#supportingInformation() supportingInformation}
   *    .requester(com.fhir.Reference) // optional {@link MedicationRequest#requester() requester}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#basedOn() basedOn}
   *    .id(com.fhir.id) // optional {@link MedicationRequest#id() id}
   *    .intent(com.fhir.code) // optional {@link MedicationRequest#intent() intent}
   *    .build();
   * </pre>
   * @return A new MedicationRequest builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicationRequest.Builder();
  }

  /**
   * Builds instances of type {@link MedicationRequest MedicationRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicationRequest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_DETECTED_ISSUE = 0x1L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x2L;
    private static final long OPT_BIT_CATEGORY = 0x4L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x8L;
    private static final long OPT_BIT_NOTE = 0x10L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x20L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_EVENT_HISTORY = 0x80L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x100L;
    private static final long OPT_BIT_STATUS_REASON = 0x200L;
    private static final long OPT_BIT_AUTHORED_ON = 0x400L;
    private static final long OPT_BIT_COURSE_OF_THERAPY_TYPE = 0x800L;
    private static final long OPT_BIT_DOSAGE_INSTRUCTION = 0x1000L;
    private static final long OPT_BIT_PRIOR_PRESCRIPTION = 0x2000L;
    private static final long OPT_BIT_ENCOUNTER = 0x4000L;
    private static final long OPT_BIT_RECORDER = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_PRIORITY = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private static final long OPT_BIT_SUBSTITUTION = 0x80000L;
    private static final long OPT_BIT_REPORTED_BOOLEAN = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_STATUS = 0x400000L;
    private static final long OPT_BIT_INSURANCE = 0x800000L;
    private static final long OPT_BIT_REPORTED_REFERENCE = 0x1000000L;
    private static final long OPT_BIT_DISPENSE_REQUEST = 0x2000000L;
    private static final long OPT_BIT_PERFORMER = 0x4000000L;
    private static final long OPT_BIT_META = 0x8000000L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x10000000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x20000000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x80000000L;
    private static final long OPT_BIT_EXTENSION = 0x100000000L;
    private static final long OPT_BIT_TEXT = 0x200000000L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x400000000L;
    private static final long OPT_BIT_REASON_CODE = 0x800000000L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x1000000000L;
    private static final long OPT_BIT_REQUESTER = 0x2000000000L;
    private static final long OPT_BIT_BASED_ON = 0x4000000000L;
    private static final long OPT_BIT_ID = 0x8000000000L;
    private static final long OPT_BIT_INTENT = 0x10000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> detectedIssue;
    private @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory;
    private @javax.annotation.Nullable java.lang.Boolean doNotPerform;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
    private @javax.annotation.Nullable com.fhir.dateTime authoredOn;
    private @javax.annotation.Nullable com.fhir.CodeableConcept courseOfTherapyType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosageInstruction;
    private @javax.annotation.Nullable com.fhir.Reference priorPrescription;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.Reference recorder;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.MedicationRequest_Substitution substitution;
    private @javax.annotation.Nullable java.lang.Boolean reportedBoolean;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance;
    private @javax.annotation.Nullable com.fhir.Reference reportedReference;
    private @javax.annotation.Nullable com.fhir.MedicationRequest_DispenseRequest dispenseRequest;
    private @javax.annotation.Nullable com.fhir.Reference performer;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference medicationReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.CodeableConcept performerType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
    private @javax.annotation.Nullable com.fhir.Reference requester;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.code intent;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationRequest#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for chained invocation
     */
    public final Builder detectedIssue(java.util.List<com.fhir.Reference> detectedIssue) {
      checkNotIsSet(detectedIssueIsSet(), "detectedIssue");
      this.detectedIssue = java.util.Objects.requireNonNull(detectedIssue, "detectedIssue");
      optBits |= OPT_BIT_DETECTED_ISSUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detectedIssue")
    public final Builder detectedIssue(java.util.Optional<? extends java.util.List<com.fhir.Reference>> detectedIssue) {
      checkNotIsSet(detectedIssueIsSet(), "detectedIssue");
      this.detectedIssue = detectedIssue.orElse(null);
      optBits |= OPT_BIT_DETECTED_ISSUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicationCodeableConcept(com.fhir.CodeableConcept medicationCodeableConcept) {
      checkNotIsSet(medicationCodeableConceptIsSet(), "medicationCodeableConcept");
      this.medicationCodeableConcept = java.util.Objects.requireNonNull(medicationCodeableConcept, "medicationCodeableConcept");
      optBits |= OPT_BIT_MEDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("medicationCodeableConcept")
    public final Builder medicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> medicationCodeableConcept) {
      checkNotIsSet(medicationCodeableConceptIsSet(), "medicationCodeableConcept");
      this.medicationCodeableConcept = medicationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_MEDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#category() category} to category.
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
     * Initializes the optional value {@link MedicationRequest#category() category} to category.
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
     * Initializes the optional value {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link MedicationRequest#note() note} to note.
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
     * Initializes the optional value {@link MedicationRequest#note() note} to note.
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
     * Initializes the optional value {@link MedicationRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
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
     * Initializes the optional value {@link MedicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
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
     * Initializes the optional value {@link MedicationRequest#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder eventHistory(java.util.List<com.fhir.Reference> eventHistory) {
      checkNotIsSet(eventHistoryIsSet(), "eventHistory");
      this.eventHistory = java.util.Objects.requireNonNull(eventHistory, "eventHistory");
      optBits |= OPT_BIT_EVENT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventHistory")
    public final Builder eventHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> eventHistory) {
      checkNotIsSet(eventHistoryIsSet(), "eventHistory");
      this.eventHistory = eventHistory.orElse(null);
      optBits |= OPT_BIT_EVENT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#doNotPerform() doNotPerform} to doNotPerform.
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
     * Initializes the optional value {@link MedicationRequest#doNotPerform() doNotPerform} to doNotPerform.
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
     * Initializes the optional value {@link MedicationRequest#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link MedicationRequest#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link MedicationRequest#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link MedicationRequest#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} to courseOfTherapyType.
     * @param courseOfTherapyType The value for courseOfTherapyType
     * @return {@code this} builder for chained invocation
     */
    public final Builder courseOfTherapyType(com.fhir.CodeableConcept courseOfTherapyType) {
      checkNotIsSet(courseOfTherapyTypeIsSet(), "courseOfTherapyType");
      this.courseOfTherapyType = java.util.Objects.requireNonNull(courseOfTherapyType, "courseOfTherapyType");
      optBits |= OPT_BIT_COURSE_OF_THERAPY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} to courseOfTherapyType.
     * @param courseOfTherapyType The value for courseOfTherapyType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("courseOfTherapyType")
    public final Builder courseOfTherapyType(java.util.Optional<? extends com.fhir.CodeableConcept> courseOfTherapyType) {
      checkNotIsSet(courseOfTherapyTypeIsSet(), "courseOfTherapyType");
      this.courseOfTherapyType = courseOfTherapyType.orElse(null);
      optBits |= OPT_BIT_COURSE_OF_THERAPY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosageInstruction(java.util.List<com.fhir.Dosage> dosageInstruction) {
      checkNotIsSet(dosageInstructionIsSet(), "dosageInstruction");
      this.dosageInstruction = java.util.Objects.requireNonNull(dosageInstruction, "dosageInstruction");
      optBits |= OPT_BIT_DOSAGE_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dosageInstruction")
    public final Builder dosageInstruction(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> dosageInstruction) {
      checkNotIsSet(dosageInstructionIsSet(), "dosageInstruction");
      this.dosageInstruction = dosageInstruction.orElse(null);
      optBits |= OPT_BIT_DOSAGE_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#priorPrescription() priorPrescription} to priorPrescription.
     * @param priorPrescription The value for priorPrescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder priorPrescription(com.fhir.Reference priorPrescription) {
      checkNotIsSet(priorPrescriptionIsSet(), "priorPrescription");
      this.priorPrescription = java.util.Objects.requireNonNull(priorPrescription, "priorPrescription");
      optBits |= OPT_BIT_PRIOR_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#priorPrescription() priorPrescription} to priorPrescription.
     * @param priorPrescription The value for priorPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priorPrescription")
    public final Builder priorPrescription(java.util.Optional<? extends com.fhir.Reference> priorPrescription) {
      checkNotIsSet(priorPrescriptionIsSet(), "priorPrescription");
      this.priorPrescription = priorPrescription.orElse(null);
      optBits |= OPT_BIT_PRIOR_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicationRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicationRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link MedicationRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link MedicationRequest#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link MedicationRequest#recorder() recorder} to recorder.
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
     * Initializes the optional value {@link MedicationRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link MedicationRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link MedicationRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    public final Builder substitution(com.fhir.MedicationRequest_Substitution substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = java.util.Objects.requireNonNull(substitution, "substitution");
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("substitution")
    public final Builder substitution(java.util.Optional<? extends com.fhir.MedicationRequest_Substitution> substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = substitution.orElse(null);
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reportedBoolean() reportedBoolean} to reportedBoolean.
     * @param reportedBoolean The value for reportedBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder reportedBoolean(boolean reportedBoolean) {
      checkNotIsSet(reportedBooleanIsSet(), "reportedBoolean");
      this.reportedBoolean = reportedBoolean;
      optBits |= OPT_BIT_REPORTED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reportedBoolean() reportedBoolean} to reportedBoolean.
     * @param reportedBoolean The value for reportedBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reportedBoolean")
    public final Builder reportedBoolean(java.util.Optional<java.lang.Boolean> reportedBoolean) {
      checkNotIsSet(reportedBooleanIsSet(), "reportedBoolean");
      this.reportedBoolean = reportedBoolean.orElse(null);
      optBits |= OPT_BIT_REPORTED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationRequest#status() status} to status.
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
     * Initializes the optional value {@link MedicationRequest#status() status} to status.
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
     * Initializes the optional value {@link MedicationRequest#insurance() insurance} to insurance.
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
     * Initializes the optional value {@link MedicationRequest#insurance() insurance} to insurance.
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
     * Initializes the optional value {@link MedicationRequest#reportedReference() reportedReference} to reportedReference.
     * @param reportedReference The value for reportedReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reportedReference(com.fhir.Reference reportedReference) {
      checkNotIsSet(reportedReferenceIsSet(), "reportedReference");
      this.reportedReference = java.util.Objects.requireNonNull(reportedReference, "reportedReference");
      optBits |= OPT_BIT_REPORTED_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reportedReference() reportedReference} to reportedReference.
     * @param reportedReference The value for reportedReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reportedReference")
    public final Builder reportedReference(java.util.Optional<? extends com.fhir.Reference> reportedReference) {
      checkNotIsSet(reportedReferenceIsSet(), "reportedReference");
      this.reportedReference = reportedReference.orElse(null);
      optBits |= OPT_BIT_REPORTED_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#dispenseRequest() dispenseRequest} to dispenseRequest.
     * @param dispenseRequest The value for dispenseRequest
     * @return {@code this} builder for chained invocation
     */
    public final Builder dispenseRequest(com.fhir.MedicationRequest_DispenseRequest dispenseRequest) {
      checkNotIsSet(dispenseRequestIsSet(), "dispenseRequest");
      this.dispenseRequest = java.util.Objects.requireNonNull(dispenseRequest, "dispenseRequest");
      optBits |= OPT_BIT_DISPENSE_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#dispenseRequest() dispenseRequest} to dispenseRequest.
     * @param dispenseRequest The value for dispenseRequest
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dispenseRequest")
    public final Builder dispenseRequest(java.util.Optional<? extends com.fhir.MedicationRequest_DispenseRequest> dispenseRequest) {
      checkNotIsSet(dispenseRequestIsSet(), "dispenseRequest");
      this.dispenseRequest = dispenseRequest.orElse(null);
      optBits |= OPT_BIT_DISPENSE_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#performer() performer} to performer.
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
     * Initializes the optional value {@link MedicationRequest#performer() performer} to performer.
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
     * Initializes the optional value {@link MedicationRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationRequest#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicationReference(com.fhir.Reference medicationReference) {
      checkNotIsSet(medicationReferenceIsSet(), "medicationReference");
      this.medicationReference = java.util.Objects.requireNonNull(medicationReference, "medicationReference");
      optBits |= OPT_BIT_MEDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("medicationReference")
    public final Builder medicationReference(java.util.Optional<? extends com.fhir.Reference> medicationReference) {
      checkNotIsSet(medicationReferenceIsSet(), "medicationReference");
      this.medicationReference = medicationReference.orElse(null);
      optBits |= OPT_BIT_MEDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link MedicationRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the value for the {@link MedicationRequest#subject() subject} attribute.
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
     * Initializes the optional value {@link MedicationRequest#language() language} to language.
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
     * Initializes the optional value {@link MedicationRequest#language() language} to language.
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
     * Initializes the optional value {@link MedicationRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest#text() text} to text.
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
     * Initializes the optional value {@link MedicationRequest#text() text} to text.
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
     * Initializes the optional value {@link MedicationRequest#performerType() performerType} to performerType.
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
     * Initializes the optional value {@link MedicationRequest#performerType() performerType} to performerType.
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
     * Initializes the optional value {@link MedicationRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationRequest#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInformation(java.util.List<com.fhir.Reference> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = java.util.Objects.requireNonNull(supportingInformation, "supportingInformation");
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
    public final Builder supportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = supportingInformation.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#requester() requester} to requester.
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
     * Initializes the optional value {@link MedicationRequest#requester() requester} to requester.
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
     * Initializes the optional value {@link MedicationRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link MedicationRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link MedicationRequest#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest#intent() intent} to intent.
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
     * Initializes the optional value {@link MedicationRequest#intent() intent} to intent.
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
     * Builds a new {@link MedicationRequest MedicationRequest}.
     * @return An immutable instance of MedicationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicationRequest build() {
      checkRequiredAttributes();
      return new ImmutableMedicationRequest(
          detectedIssue,
          medicationCodeableConcept,
          category,
          instantiatesCanonical,
          note,
          reasonReference,
          groupIdentifier,
          eventHistory,
          doNotPerform,
          statusReason,
          authoredOn,
          courseOfTherapyType,
          dosageInstruction,
          priorPrescription,
          resourceType,
          encounter,
          recorder,
          contained,
          priority,
          modifierExtension,
          substitution,
          reportedBoolean,
          implicitRules,
          status,
          insurance,
          reportedReference,
          dispenseRequest,
          performer,
          meta,
          medicationReference,
          instantiatesUri,
          subject,
          language,
          identifier,
          extension,
          text,
          performerType,
          reasonCode,
          supportingInformation,
          requester,
          basedOn,
          id,
          intent);
    }

    private boolean detectedIssueIsSet() {
      return (optBits & OPT_BIT_DETECTED_ISSUE) != 0;
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean eventHistoryIsSet() {
      return (optBits & OPT_BIT_EVENT_HISTORY) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean courseOfTherapyTypeIsSet() {
      return (optBits & OPT_BIT_COURSE_OF_THERAPY_TYPE) != 0;
    }

    private boolean dosageInstructionIsSet() {
      return (optBits & OPT_BIT_DOSAGE_INSTRUCTION) != 0;
    }

    private boolean priorPrescriptionIsSet() {
      return (optBits & OPT_BIT_PRIOR_PRESCRIPTION) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean substitutionIsSet() {
      return (optBits & OPT_BIT_SUBSTITUTION) != 0;
    }

    private boolean reportedBooleanIsSet() {
      return (optBits & OPT_BIT_REPORTED_BOOLEAN) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean reportedReferenceIsSet() {
      return (optBits & OPT_BIT_REPORTED_REFERENCE) != 0;
    }

    private boolean dispenseRequestIsSet() {
      return (optBits & OPT_BIT_DISPENSE_REQUEST) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicationRequest is strict, attribute is already set: ".concat(name));
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
      return "Cannot build MedicationRequest, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicationRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicationRequest", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link MedicationRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "MedicationRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationRequest#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detectedIssue(java.util.List<com.fhir.Reference> detectedIssue);

    /**
     * Initializes the optional value {@link MedicationRequest#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detectedIssue(java.util.Optional<? extends java.util.List<com.fhir.Reference>> detectedIssue);

    /**
     * Initializes the optional value {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(com.fhir.CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link MedicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link MedicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link MedicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link MedicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link MedicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link MedicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(com.fhir.Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link MedicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(java.util.Optional<? extends com.fhir.Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link MedicationRequest#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventHistory(java.util.List<com.fhir.Reference> eventHistory);

    /**
     * Initializes the optional value {@link MedicationRequest#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> eventHistory);

    /**
     * Initializes the optional value {@link MedicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doNotPerform(boolean doNotPerform);

    /**
     * Initializes the optional value {@link MedicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link MedicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(com.fhir.CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link MedicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link MedicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(com.fhir.dateTime authoredOn);

    /**
     * Initializes the optional value {@link MedicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn);

    /**
     * Initializes the optional value {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} to courseOfTherapyType.
     * @param courseOfTherapyType The value for courseOfTherapyType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal courseOfTherapyType(com.fhir.CodeableConcept courseOfTherapyType);

    /**
     * Initializes the optional value {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} to courseOfTherapyType.
     * @param courseOfTherapyType The value for courseOfTherapyType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal courseOfTherapyType(java.util.Optional<? extends com.fhir.CodeableConcept> courseOfTherapyType);

    /**
     * Initializes the optional value {@link MedicationRequest#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosageInstruction(java.util.List<com.fhir.Dosage> dosageInstruction);

    /**
     * Initializes the optional value {@link MedicationRequest#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosageInstruction(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> dosageInstruction);

    /**
     * Initializes the optional value {@link MedicationRequest#priorPrescription() priorPrescription} to priorPrescription.
     * @param priorPrescription The value for priorPrescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priorPrescription(com.fhir.Reference priorPrescription);

    /**
     * Initializes the optional value {@link MedicationRequest#priorPrescription() priorPrescription} to priorPrescription.
     * @param priorPrescription The value for priorPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priorPrescription(java.util.Optional<? extends com.fhir.Reference> priorPrescription);

    /**
     * Initializes the optional value {@link MedicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link MedicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link MedicationRequest#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(com.fhir.Reference recorder);

    /**
     * Initializes the optional value {@link MedicationRequest#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(java.util.Optional<? extends com.fhir.Reference> recorder);

    /**
     * Initializes the optional value {@link MedicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link MedicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

    /**
     * Initializes the optional value {@link MedicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationRequest#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    BuildFinal substitution(com.fhir.MedicationRequest_Substitution substitution);

    /**
     * Initializes the optional value {@link MedicationRequest#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substitution(java.util.Optional<? extends com.fhir.MedicationRequest_Substitution> substitution);

    /**
     * Initializes the optional value {@link MedicationRequest#reportedBoolean() reportedBoolean} to reportedBoolean.
     * @param reportedBoolean The value for reportedBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reportedBoolean(boolean reportedBoolean);

    /**
     * Initializes the optional value {@link MedicationRequest#reportedBoolean() reportedBoolean} to reportedBoolean.
     * @param reportedBoolean The value for reportedBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reportedBoolean(java.util.Optional<java.lang.Boolean> reportedBoolean);

    /**
     * Initializes the optional value {@link MedicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link MedicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link MedicationRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(java.util.List<com.fhir.Reference> insurance);

    /**
     * Initializes the optional value {@link MedicationRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> insurance);

    /**
     * Initializes the optional value {@link MedicationRequest#reportedReference() reportedReference} to reportedReference.
     * @param reportedReference The value for reportedReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reportedReference(com.fhir.Reference reportedReference);

    /**
     * Initializes the optional value {@link MedicationRequest#reportedReference() reportedReference} to reportedReference.
     * @param reportedReference The value for reportedReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reportedReference(java.util.Optional<? extends com.fhir.Reference> reportedReference);

    /**
     * Initializes the optional value {@link MedicationRequest#dispenseRequest() dispenseRequest} to dispenseRequest.
     * @param dispenseRequest The value for dispenseRequest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dispenseRequest(com.fhir.MedicationRequest_DispenseRequest dispenseRequest);

    /**
     * Initializes the optional value {@link MedicationRequest#dispenseRequest() dispenseRequest} to dispenseRequest.
     * @param dispenseRequest The value for dispenseRequest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dispenseRequest(java.util.Optional<? extends com.fhir.MedicationRequest_DispenseRequest> dispenseRequest);

    /**
     * Initializes the optional value {@link MedicationRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(com.fhir.Reference performer);

    /**
     * Initializes the optional value {@link MedicationRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link MedicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicationRequest#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(com.fhir.Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicationRequest#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(java.util.Optional<? extends com.fhir.Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link MedicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicationRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(com.fhir.CodeableConcept performerType);

    /**
     * Initializes the optional value {@link MedicationRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(java.util.Optional<? extends com.fhir.CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link MedicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link MedicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link MedicationRequest#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(java.util.List<com.fhir.Reference> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationRequest#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(com.fhir.Reference requester);

    /**
     * Initializes the optional value {@link MedicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(java.util.Optional<? extends com.fhir.Reference> requester);

    /**
     * Initializes the optional value {@link MedicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link MedicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link MedicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicationRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(com.fhir.code intent);

    /**
     * Initializes the optional value {@link MedicationRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(java.util.Optional<? extends com.fhir.code> intent);

    /**
     * Builds a new {@link MedicationRequest MedicationRequest}.
     * @return An immutable instance of MedicationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationRequest build();
  }
}
