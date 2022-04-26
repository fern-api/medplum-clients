package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MedicationRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationRequest.builder()}.
 */
@Generated(from = "MedicationRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationRequest implements MedicationRequest {
  private final @Nullable CodeableConcept medicationCodeableConcept;
  private final @Nullable Code priority;
  private final @Nullable Code language;
  private final @Nullable List<Reference> detectedIssue;
  private final @Nullable List<Reference> supportingInformation;
  private final @Nullable Id id;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable List<Identifier> identifier;
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable CodeableConcept statusReason;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable Reference reportedReference;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean reportedBoolean;
  private final @Nullable Reference medicationReference;
  private final @Nullable MedicationRequest_Substitution substitution;
  private final @Nullable List<Annotation> note;
  private final @Nullable Code status;
  private final @Nullable Code intent;
  private final @Nullable Reference priorPrescription;
  private final @Nullable CodeableConcept courseOfTherapyType;
  private final @Nullable Reference recorder;
  private final @Nullable Reference performer;
  private final Reference subject;
  private final @Nullable DateTime authoredOn;
  private final @Nullable List<Reference> eventHistory;
  private final @Nullable Identifier groupIdentifier;
  private final @Nullable List<Reference> insurance;
  private final @Nullable Narrative text;
  private final @Nullable Reference encounter;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference requester;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept performerType;
  private final @Nullable List<Dosage> dosageInstruction;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Boolean doNotPerform;
  private final @Nullable MedicationRequest_DispenseRequest dispenseRequest;

  private ImmutableMedicationRequest(
      @Nullable CodeableConcept medicationCodeableConcept,
      @Nullable Code priority,
      @Nullable Code language,
      @Nullable List<Reference> detectedIssue,
      @Nullable List<Reference> supportingInformation,
      @Nullable Id id,
      @Nullable List<Uri> instantiatesUri,
      @Nullable List<Identifier> identifier,
      String resourceType,
      @Nullable Meta meta,
      @Nullable CodeableConcept statusReason,
      @Nullable List<CodeableConcept> category,
      @Nullable List<Reference> basedOn,
      @Nullable Reference reportedReference,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable List<Extension> extension,
      @Nullable Boolean reportedBoolean,
      @Nullable Reference medicationReference,
      @Nullable MedicationRequest_Substitution substitution,
      @Nullable List<Annotation> note,
      @Nullable Code status,
      @Nullable Code intent,
      @Nullable Reference priorPrescription,
      @Nullable CodeableConcept courseOfTherapyType,
      @Nullable Reference recorder,
      @Nullable Reference performer,
      Reference subject,
      @Nullable DateTime authoredOn,
      @Nullable List<Reference> eventHistory,
      @Nullable Identifier groupIdentifier,
      @Nullable List<Reference> insurance,
      @Nullable Narrative text,
      @Nullable Reference encounter,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference requester,
      @Nullable List<Reference> reasonReference,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept performerType,
      @Nullable List<Dosage> dosageInstruction,
      @Nullable List<ResourceList> contained,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Boolean doNotPerform,
      @Nullable MedicationRequest_DispenseRequest dispenseRequest) {
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.priority = priority;
    this.language = language;
    this.detectedIssue = detectedIssue;
    this.supportingInformation = supportingInformation;
    this.id = id;
    this.instantiatesUri = instantiatesUri;
    this.identifier = identifier;
    this.resourceType = resourceType;
    this.meta = meta;
    this.statusReason = statusReason;
    this.category = category;
    this.basedOn = basedOn;
    this.reportedReference = reportedReference;
    this.instantiatesCanonical = instantiatesCanonical;
    this.extension = extension;
    this.reportedBoolean = reportedBoolean;
    this.medicationReference = medicationReference;
    this.substitution = substitution;
    this.note = note;
    this.status = status;
    this.intent = intent;
    this.priorPrescription = priorPrescription;
    this.courseOfTherapyType = courseOfTherapyType;
    this.recorder = recorder;
    this.performer = performer;
    this.subject = subject;
    this.authoredOn = authoredOn;
    this.eventHistory = eventHistory;
    this.groupIdentifier = groupIdentifier;
    this.insurance = insurance;
    this.text = text;
    this.encounter = encounter;
    this.modifierExtension = modifierExtension;
    this.requester = requester;
    this.reasonReference = reasonReference;
    this.implicitRules = implicitRules;
    this.performerType = performerType;
    this.dosageInstruction = dosageInstruction;
    this.contained = contained;
    this.reasonCode = reasonCode;
    this.doNotPerform = doNotPerform;
    this.dispenseRequest = dispenseRequest;
  }

  /**
   * @return The value of the {@code medicationCodeableConcept} attribute
   */
  @JsonProperty("medicationCodeableConcept")
  @Override
  public Optional<CodeableConcept> medicationCodeableConcept() {
    return Optional.ofNullable(medicationCodeableConcept);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<Code> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code detectedIssue} attribute
   */
  @JsonProperty("detectedIssue")
  @Override
  public Optional<List<Reference>> detectedIssue() {
    return Optional.ofNullable(detectedIssue);
  }

  /**
   * @return The value of the {@code supportingInformation} attribute
   */
  @JsonProperty("supportingInformation")
  @Override
  public Optional<List<Reference>> supportingInformation() {
    return Optional.ofNullable(supportingInformation);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<List<Uri>> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<CodeableConcept> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code reportedReference} attribute
   */
  @JsonProperty("reportedReference")
  @Override
  public Optional<Reference> reportedReference() {
    return Optional.ofNullable(reportedReference);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<List<Canonical>> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code reportedBoolean} attribute
   */
  @JsonProperty("reportedBoolean")
  @Override
  public Optional<Boolean> reportedBoolean() {
    return Optional.ofNullable(reportedBoolean);
  }

  /**
   * @return The value of the {@code medicationReference} attribute
   */
  @JsonProperty("medicationReference")
  @Override
  public Optional<Reference> medicationReference() {
    return Optional.ofNullable(medicationReference);
  }

  /**
   * @return The value of the {@code substitution} attribute
   */
  @JsonProperty("substitution")
  @Override
  public Optional<MedicationRequest_Substitution> substitution() {
    return Optional.ofNullable(substitution);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @JsonProperty("intent")
  @Override
  public Optional<Code> intent() {
    return Optional.ofNullable(intent);
  }

  /**
   * @return The value of the {@code priorPrescription} attribute
   */
  @JsonProperty("priorPrescription")
  @Override
  public Optional<Reference> priorPrescription() {
    return Optional.ofNullable(priorPrescription);
  }

  /**
   * @return The value of the {@code courseOfTherapyType} attribute
   */
  @JsonProperty("courseOfTherapyType")
  @Override
  public Optional<CodeableConcept> courseOfTherapyType() {
    return Optional.ofNullable(courseOfTherapyType);
  }

  /**
   * @return The value of the {@code recorder} attribute
   */
  @JsonProperty("recorder")
  @Override
  public Optional<Reference> recorder() {
    return Optional.ofNullable(recorder);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<Reference> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
  }

  /**
   * @return The value of the {@code authoredOn} attribute
   */
  @JsonProperty("authoredOn")
  @Override
  public Optional<DateTime> authoredOn() {
    return Optional.ofNullable(authoredOn);
  }

  /**
   * @return The value of the {@code eventHistory} attribute
   */
  @JsonProperty("eventHistory")
  @Override
  public Optional<List<Reference>> eventHistory() {
    return Optional.ofNullable(eventHistory);
  }

  /**
   * @return The value of the {@code groupIdentifier} attribute
   */
  @JsonProperty("groupIdentifier")
  @Override
  public Optional<Identifier> groupIdentifier() {
    return Optional.ofNullable(groupIdentifier);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @JsonProperty("insurance")
  @Override
  public Optional<List<Reference>> insurance() {
    return Optional.ofNullable(insurance);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code requester} attribute
   */
  @JsonProperty("requester")
  @Override
  public Optional<Reference> requester() {
    return Optional.ofNullable(requester);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code performerType} attribute
   */
  @JsonProperty("performerType")
  @Override
  public Optional<CodeableConcept> performerType() {
    return Optional.ofNullable(performerType);
  }

  /**
   * @return The value of the {@code dosageInstruction} attribute
   */
  @JsonProperty("dosageInstruction")
  @Override
  public Optional<List<Dosage>> dosageInstruction() {
    return Optional.ofNullable(dosageInstruction);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code doNotPerform} attribute
   */
  @JsonProperty("doNotPerform")
  @Override
  public Optional<Boolean> doNotPerform() {
    return Optional.ofNullable(doNotPerform);
  }

  /**
   * @return The value of the {@code dispenseRequest} attribute
   */
  @JsonProperty("dispenseRequest")
  @Override
  public Optional<MedicationRequest_DispenseRequest> dispenseRequest() {
    return Optional.ofNullable(dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withMedicationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationRequest(
        newValue,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withMedicationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicationRequest(
        value,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        newValue,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        value,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        newValue,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        value,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#detectedIssue() detectedIssue} attribute.
   * @param value The value for detectedIssue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDetectedIssue(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "detectedIssue");
    if (this.detectedIssue == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        newValue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#detectedIssue() detectedIssue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detectedIssue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withDetectedIssue(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.detectedIssue == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        value,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withSupportingInformation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        newValue,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withSupportingInformation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        value,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        newValue,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        value,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        newValue,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        value,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        newValue,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        value,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationRequest withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        newValue,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        newValue,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        value,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withStatusReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        newValue,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withStatusReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        value,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        newValue,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        value,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        newValue,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        value,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#reportedReference() reportedReference} attribute.
   * @param value The value for reportedReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReportedReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "reportedReference");
    if (this.reportedReference == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        newValue,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#reportedReference() reportedReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reportedReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withReportedReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.reportedReference == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        value,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        newValue,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        value,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        newValue,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        value,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#reportedBoolean() reportedBoolean} attribute.
   * @param value The value for reportedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReportedBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.reportedBoolean, newValue)) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        newValue,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#reportedBoolean() reportedBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reportedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReportedBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.reportedBoolean, value)) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        value,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withMedicationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        newValue,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withMedicationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        value,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#substitution() substitution} attribute.
   * @param value The value for substitution
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withSubstitution(MedicationRequest_Substitution value) {
    @Nullable MedicationRequest_Substitution newValue = Objects.requireNonNull(value, "substitution");
    if (this.substitution == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        newValue,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#substitution() substitution} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substitution
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withSubstitution(Optional<? extends MedicationRequest_Substitution> optional) {
    @Nullable MedicationRequest_Substitution value = optional.orElse(null);
    if (this.substitution == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        value,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        newValue,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        value,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        newValue,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        value,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withIntent(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        newValue,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withIntent(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        value,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#priorPrescription() priorPrescription} attribute.
   * @param value The value for priorPrescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withPriorPrescription(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "priorPrescription");
    if (this.priorPrescription == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        newValue,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#priorPrescription() priorPrescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priorPrescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withPriorPrescription(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.priorPrescription == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        value,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} attribute.
   * @param value The value for courseOfTherapyType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withCourseOfTherapyType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "courseOfTherapyType");
    if (this.courseOfTherapyType == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        newValue,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for courseOfTherapyType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withCourseOfTherapyType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.courseOfTherapyType == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        value,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#recorder() recorder} attribute.
   * @param value The value for recorder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withRecorder(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "recorder");
    if (this.recorder == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        newValue,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#recorder() recorder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withRecorder(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.recorder == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        value,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withPerformer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        newValue,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withPerformer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        value,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationRequest#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationRequest withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        newValue,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withAuthoredOn(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        newValue,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withAuthoredOn(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        value,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#eventHistory() eventHistory} attribute.
   * @param value The value for eventHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withEventHistory(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "eventHistory");
    if (this.eventHistory == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        newValue,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#eventHistory() eventHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withEventHistory(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.eventHistory == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        value,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withGroupIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        newValue,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withGroupIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        value,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withInsurance(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        newValue,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withInsurance(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        value,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        newValue,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        value,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        newValue,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        value,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        newValue,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        value,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withRequester(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        newValue,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withRequester(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        value,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        newValue,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        value,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        newValue,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        value,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withPerformerType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        newValue,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withPerformerType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        value,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#dosageInstruction() dosageInstruction} attribute.
   * @param value The value for dosageInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDosageInstruction(List<Dosage> value) {
    @Nullable List<Dosage> newValue = Objects.requireNonNull(value, "dosageInstruction");
    if (this.dosageInstruction == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        newValue,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#dosageInstruction() dosageInstruction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosageInstruction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withDosageInstruction(Optional<? extends List<Dosage>> optional) {
    @Nullable List<Dosage> value = optional.orElse(null);
    if (this.dosageInstruction == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        value,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        newValue,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        value,
        this.reasonCode,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        newValue,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        value,
        this.doNotPerform,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDoNotPerform(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        newValue,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDoNotPerform(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        value,
        this.dispenseRequest);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest#dispenseRequest() dispenseRequest} attribute.
   * @param value The value for dispenseRequest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest withDispenseRequest(MedicationRequest_DispenseRequest value) {
    @Nullable MedicationRequest_DispenseRequest newValue = Objects.requireNonNull(value, "dispenseRequest");
    if (this.dispenseRequest == newValue) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest#dispenseRequest() dispenseRequest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dispenseRequest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest withDispenseRequest(Optional<? extends MedicationRequest_DispenseRequest> optional) {
    @Nullable MedicationRequest_DispenseRequest value = optional.orElse(null);
    if (this.dispenseRequest == value) return this;
    return new ImmutableMedicationRequest(
        this.medicationCodeableConcept,
        this.priority,
        this.language,
        this.detectedIssue,
        this.supportingInformation,
        this.id,
        this.instantiatesUri,
        this.identifier,
        this.resourceType,
        this.meta,
        this.statusReason,
        this.category,
        this.basedOn,
        this.reportedReference,
        this.instantiatesCanonical,
        this.extension,
        this.reportedBoolean,
        this.medicationReference,
        this.substitution,
        this.note,
        this.status,
        this.intent,
        this.priorPrescription,
        this.courseOfTherapyType,
        this.recorder,
        this.performer,
        this.subject,
        this.authoredOn,
        this.eventHistory,
        this.groupIdentifier,
        this.insurance,
        this.text,
        this.encounter,
        this.modifierExtension,
        this.requester,
        this.reasonReference,
        this.implicitRules,
        this.performerType,
        this.dosageInstruction,
        this.contained,
        this.reasonCode,
        this.doNotPerform,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationRequest
        && equalTo((ImmutableMedicationRequest) another);
  }

  private boolean equalTo(ImmutableMedicationRequest another) {
    return Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && Objects.equals(priority, another.priority)
        && Objects.equals(language, another.language)
        && Objects.equals(detectedIssue, another.detectedIssue)
        && Objects.equals(supportingInformation, another.supportingInformation)
        && Objects.equals(id, another.id)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(identifier, another.identifier)
        && resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(category, another.category)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(reportedReference, another.reportedReference)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(extension, another.extension)
        && Objects.equals(reportedBoolean, another.reportedBoolean)
        && Objects.equals(medicationReference, another.medicationReference)
        && Objects.equals(substitution, another.substitution)
        && Objects.equals(note, another.note)
        && Objects.equals(status, another.status)
        && Objects.equals(intent, another.intent)
        && Objects.equals(priorPrescription, another.priorPrescription)
        && Objects.equals(courseOfTherapyType, another.courseOfTherapyType)
        && Objects.equals(recorder, another.recorder)
        && Objects.equals(performer, another.performer)
        && subject.equals(another.subject)
        && Objects.equals(authoredOn, another.authoredOn)
        && Objects.equals(eventHistory, another.eventHistory)
        && Objects.equals(groupIdentifier, another.groupIdentifier)
        && Objects.equals(insurance, another.insurance)
        && Objects.equals(text, another.text)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(requester, another.requester)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(performerType, another.performerType)
        && Objects.equals(dosageInstruction, another.dosageInstruction)
        && Objects.equals(contained, another.contained)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(doNotPerform, another.doNotPerform)
        && Objects.equals(dispenseRequest, another.dispenseRequest);
  }

  /**
   * Computes a hash code from attributes: {@code medicationCodeableConcept}, {@code priority}, {@code language}, {@code detectedIssue}, {@code supportingInformation}, {@code id}, {@code instantiatesUri}, {@code identifier}, {@code resourceType}, {@code meta}, {@code statusReason}, {@code category}, {@code basedOn}, {@code reportedReference}, {@code instantiatesCanonical}, {@code extension}, {@code reportedBoolean}, {@code medicationReference}, {@code substitution}, {@code note}, {@code status}, {@code intent}, {@code priorPrescription}, {@code courseOfTherapyType}, {@code recorder}, {@code performer}, {@code subject}, {@code authoredOn}, {@code eventHistory}, {@code groupIdentifier}, {@code insurance}, {@code text}, {@code encounter}, {@code modifierExtension}, {@code requester}, {@code reasonReference}, {@code implicitRules}, {@code performerType}, {@code dosageInstruction}, {@code contained}, {@code reasonCode}, {@code doNotPerform}, {@code dispenseRequest}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(detectedIssue);
    h += (h << 5) + Objects.hashCode(supportingInformation);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(reportedReference);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(reportedBoolean);
    h += (h << 5) + Objects.hashCode(medicationReference);
    h += (h << 5) + Objects.hashCode(substitution);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(intent);
    h += (h << 5) + Objects.hashCode(priorPrescription);
    h += (h << 5) + Objects.hashCode(courseOfTherapyType);
    h += (h << 5) + Objects.hashCode(recorder);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(authoredOn);
    h += (h << 5) + Objects.hashCode(eventHistory);
    h += (h << 5) + Objects.hashCode(groupIdentifier);
    h += (h << 5) + Objects.hashCode(insurance);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(requester);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(performerType);
    h += (h << 5) + Objects.hashCode(dosageInstruction);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(doNotPerform);
    h += (h << 5) + Objects.hashCode(dispenseRequest);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationRequest{");
    if (medicationCodeableConcept != null) {
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (priority != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (language != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (detectedIssue != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("detectedIssue=").append(detectedIssue);
    }
    if (supportingInformation != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (identifier != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (reportedReference != null) {
      builder.append(", ");
      builder.append("reportedReference=").append(reportedReference);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (reportedBoolean != null) {
      builder.append(", ");
      builder.append("reportedBoolean=").append(reportedBoolean);
    }
    if (medicationReference != null) {
      builder.append(", ");
      builder.append("medicationReference=").append(medicationReference);
    }
    if (substitution != null) {
      builder.append(", ");
      builder.append("substitution=").append(substitution);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (intent != null) {
      builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (priorPrescription != null) {
      builder.append(", ");
      builder.append("priorPrescription=").append(priorPrescription);
    }
    if (courseOfTherapyType != null) {
      builder.append(", ");
      builder.append("courseOfTherapyType=").append(courseOfTherapyType);
    }
    if (recorder != null) {
      builder.append(", ");
      builder.append("recorder=").append(recorder);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    builder.append(", ");
    builder.append("subject=").append(subject);
    if (authoredOn != null) {
      builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (eventHistory != null) {
      builder.append(", ");
      builder.append("eventHistory=").append(eventHistory);
    }
    if (groupIdentifier != null) {
      builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (requester != null) {
      builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (performerType != null) {
      builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    if (dosageInstruction != null) {
      builder.append(", ");
      builder.append("dosageInstruction=").append(dosageInstruction);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (doNotPerform != null) {
      builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (dispenseRequest != null) {
      builder.append(", ");
      builder.append("dispenseRequest=").append(dispenseRequest);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationRequest {
    @Nullable Optional<CodeableConcept> medicationCodeableConcept = Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> detectedIssue = Optional.empty();
    boolean detectedIssueIsSet;
    @Nullable Optional<List<Reference>> supportingInformation = Optional.empty();
    boolean supportingInformationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<CodeableConcept> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<Reference> reportedReference = Optional.empty();
    boolean reportedReferenceIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> reportedBoolean = Optional.empty();
    boolean reportedBooleanIsSet;
    @Nullable Optional<Reference> medicationReference = Optional.empty();
    boolean medicationReferenceIsSet;
    @Nullable Optional<MedicationRequest_Substitution> substitution = Optional.empty();
    boolean substitutionIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Code> intent = Optional.empty();
    boolean intentIsSet;
    @Nullable Optional<Reference> priorPrescription = Optional.empty();
    boolean priorPrescriptionIsSet;
    @Nullable Optional<CodeableConcept> courseOfTherapyType = Optional.empty();
    boolean courseOfTherapyTypeIsSet;
    @Nullable Optional<Reference> recorder = Optional.empty();
    boolean recorderIsSet;
    @Nullable Optional<Reference> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Reference subject;
    @Nullable Optional<DateTime> authoredOn = Optional.empty();
    boolean authoredOnIsSet;
    @Nullable Optional<List<Reference>> eventHistory = Optional.empty();
    boolean eventHistoryIsSet;
    @Nullable Optional<Identifier> groupIdentifier = Optional.empty();
    boolean groupIdentifierIsSet;
    @Nullable Optional<List<Reference>> insurance = Optional.empty();
    boolean insuranceIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> requester = Optional.empty();
    boolean requesterIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> performerType = Optional.empty();
    boolean performerTypeIsSet;
    @Nullable Optional<List<Dosage>> dosageInstruction = Optional.empty();
    boolean dosageInstructionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Boolean> doNotPerform = Optional.empty();
    boolean doNotPerformIsSet;
    @Nullable Optional<MedicationRequest_DispenseRequest> dispenseRequest = Optional.empty();
    boolean dispenseRequestIsSet;
    @JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(Optional<CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("detectedIssue")
    public void setDetectedIssue(Optional<List<Reference>> detectedIssue) {
      this.detectedIssue = detectedIssue;
      this.detectedIssueIsSet = true;
    }
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(Optional<List<Reference>> supportingInformation) {
      this.supportingInformation = supportingInformation;
      this.supportingInformationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("reportedReference")
    public void setReportedReference(Optional<Reference> reportedReference) {
      this.reportedReference = reportedReference;
      this.reportedReferenceIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("reportedBoolean")
    public void setReportedBoolean(Optional<Boolean> reportedBoolean) {
      this.reportedBoolean = reportedBoolean;
      this.reportedBooleanIsSet = true;
    }
    @JsonProperty("medicationReference")
    public void setMedicationReference(Optional<Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
    }
    @JsonProperty("substitution")
    public void setSubstitution(Optional<MedicationRequest_Substitution> substitution) {
      this.substitution = substitution;
      this.substitutionIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(Optional<Code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @JsonProperty("priorPrescription")
    public void setPriorPrescription(Optional<Reference> priorPrescription) {
      this.priorPrescription = priorPrescription;
      this.priorPrescriptionIsSet = true;
    }
    @JsonProperty("courseOfTherapyType")
    public void setCourseOfTherapyType(Optional<CodeableConcept> courseOfTherapyType) {
      this.courseOfTherapyType = courseOfTherapyType;
      this.courseOfTherapyTypeIsSet = true;
    }
    @JsonProperty("recorder")
    public void setRecorder(Optional<Reference> recorder) {
      this.recorder = recorder;
      this.recorderIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("authoredOn")
    public void setAuthoredOn(Optional<DateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @JsonProperty("eventHistory")
    public void setEventHistory(Optional<List<Reference>> eventHistory) {
      this.eventHistory = eventHistory;
      this.eventHistoryIsSet = true;
    }
    @JsonProperty("groupIdentifier")
    public void setGroupIdentifier(Optional<Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(Optional<List<Reference>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("requester")
    public void setRequester(Optional<Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("performerType")
    public void setPerformerType(Optional<CodeableConcept> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
    }
    @JsonProperty("dosageInstruction")
    public void setDosageInstruction(Optional<List<Dosage>> dosageInstruction) {
      this.dosageInstruction = dosageInstruction;
      this.dosageInstructionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Optional<Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @JsonProperty("dispenseRequest")
    public void setDispenseRequest(Optional<MedicationRequest_DispenseRequest> dispenseRequest) {
      this.dispenseRequest = dispenseRequest;
      this.dispenseRequestIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> detectedIssue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> reportedReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> reportedBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicationRequest_Substitution> substitution() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> priorPrescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> courseOfTherapyType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> recorder() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> eventHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> performerType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Dosage>> dosageInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicationRequest_DispenseRequest> dispenseRequest() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationRequest fromJson(Json json) {
    ImmutableMedicationRequest.Builder builder = ((ImmutableMedicationRequest.Builder) ImmutableMedicationRequest.builder());
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.detectedIssueIsSet) {
      builder.detectedIssue(json.detectedIssue);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.reportedReferenceIsSet) {
      builder.reportedReference(json.reportedReference);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reportedBooleanIsSet) {
      builder.reportedBoolean(json.reportedBoolean);
    }
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.substitutionIsSet) {
      builder.substitution(json.substitution);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.priorPrescriptionIsSet) {
      builder.priorPrescription(json.priorPrescription);
    }
    if (json.courseOfTherapyTypeIsSet) {
      builder.courseOfTherapyType(json.courseOfTherapyType);
    }
    if (json.recorderIsSet) {
      builder.recorder(json.recorder);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.eventHistoryIsSet) {
      builder.eventHistory(json.eventHistory);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
    }
    if (json.dosageInstructionIsSet) {
      builder.dosageInstruction(json.dosageInstruction);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.dispenseRequestIsSet) {
      builder.dispenseRequest(json.dispenseRequest);
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
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .priority(instance.priority())
        .language(instance.language())
        .detectedIssue(instance.detectedIssue())
        .supportingInformation(instance.supportingInformation())
        .id(instance.id())
        .instantiatesUri(instance.instantiatesUri())
        .identifier(instance.identifier())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .statusReason(instance.statusReason())
        .category(instance.category())
        .basedOn(instance.basedOn())
        .reportedReference(instance.reportedReference())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .extension(instance.extension())
        .reportedBoolean(instance.reportedBoolean())
        .medicationReference(instance.medicationReference())
        .substitution(instance.substitution())
        .note(instance.note())
        .status(instance.status())
        .intent(instance.intent())
        .priorPrescription(instance.priorPrescription())
        .courseOfTherapyType(instance.courseOfTherapyType())
        .recorder(instance.recorder())
        .performer(instance.performer())
        .subject(instance.subject())
        .authoredOn(instance.authoredOn())
        .eventHistory(instance.eventHistory())
        .groupIdentifier(instance.groupIdentifier())
        .insurance(instance.insurance())
        .text(instance.text())
        .encounter(instance.encounter())
        .modifierExtension(instance.modifierExtension())
        .requester(instance.requester())
        .reasonReference(instance.reasonReference())
        .implicitRules(instance.implicitRules())
        .performerType(instance.performerType())
        .dosageInstruction(instance.dosageInstruction())
        .contained(instance.contained())
        .reasonCode(instance.reasonCode())
        .doNotPerform(instance.doNotPerform())
        .dispenseRequest(instance.dispenseRequest())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationRequest MedicationRequest}.
   * <pre>
   * ImmutableMedicationRequest.builder()
   *    .medicationCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept}
   *    .priority(com.fhir.types.fhir.Code) // optional {@link MedicationRequest#priority() priority}
   *    .language(com.fhir.types.fhir.Code) // optional {@link MedicationRequest#language() language}
   *    .detectedIssue(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#detectedIssue() detectedIssue}
   *    .supportingInformation(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#supportingInformation() supportingInformation}
   *    .id(com.fhir.types.fhir.Id) // optional {@link MedicationRequest#id() id}
   *    .instantiatesUri(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link MedicationRequest#instantiatesUri() instantiatesUri}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link MedicationRequest#identifier() identifier}
   *    .resourceType(String) // required {@link MedicationRequest#resourceType() resourceType}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link MedicationRequest#meta() meta}
   *    .statusReason(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationRequest#statusReason() statusReason}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationRequest#category() category}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#basedOn() basedOn}
   *    .reportedReference(com.fhir.types.fhir.Reference) // optional {@link MedicationRequest#reportedReference() reportedReference}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationRequest#extension() extension}
   *    .reportedBoolean(Boolean) // optional {@link MedicationRequest#reportedBoolean() reportedBoolean}
   *    .medicationReference(com.fhir.types.fhir.Reference) // optional {@link MedicationRequest#medicationReference() medicationReference}
   *    .substitution(com.fhir.types.fhir.MedicationRequest_Substitution) // optional {@link MedicationRequest#substitution() substitution}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link MedicationRequest#note() note}
   *    .status(com.fhir.types.fhir.Code) // optional {@link MedicationRequest#status() status}
   *    .intent(com.fhir.types.fhir.Code) // optional {@link MedicationRequest#intent() intent}
   *    .priorPrescription(com.fhir.types.fhir.Reference) // optional {@link MedicationRequest#priorPrescription() priorPrescription}
   *    .courseOfTherapyType(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType}
   *    .recorder(com.fhir.types.fhir.Reference) // optional {@link MedicationRequest#recorder() recorder}
   *    .performer(com.fhir.types.fhir.Reference) // optional {@link MedicationRequest#performer() performer}
   *    .subject(com.fhir.types.fhir.Reference) // required {@link MedicationRequest#subject() subject}
   *    .authoredOn(com.fhir.types.fhir.DateTime) // optional {@link MedicationRequest#authoredOn() authoredOn}
   *    .eventHistory(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#eventHistory() eventHistory}
   *    .groupIdentifier(com.fhir.types.fhir.Identifier) // optional {@link MedicationRequest#groupIdentifier() groupIdentifier}
   *    .insurance(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#insurance() insurance}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link MedicationRequest#text() text}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link MedicationRequest#encounter() encounter}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationRequest#modifierExtension() modifierExtension}
   *    .requester(com.fhir.types.fhir.Reference) // optional {@link MedicationRequest#requester() requester}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicationRequest#reasonReference() reasonReference}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link MedicationRequest#implicitRules() implicitRules}
   *    .performerType(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationRequest#performerType() performerType}
   *    .dosageInstruction(List&amp;lt;com.fhir.types.fhir.Dosage&amp;gt;) // optional {@link MedicationRequest#dosageInstruction() dosageInstruction}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link MedicationRequest#contained() contained}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationRequest#reasonCode() reasonCode}
   *    .doNotPerform(Boolean) // optional {@link MedicationRequest#doNotPerform() doNotPerform}
   *    .dispenseRequest(com.fhir.types.fhir.MedicationRequest_DispenseRequest) // optional {@link MedicationRequest#dispenseRequest() dispenseRequest}
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
  @Generated(from = "MedicationRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, SubjectBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SUBJECT = 0x2L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x1L;
    private static final long OPT_BIT_PRIORITY = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_DETECTED_ISSUE = 0x8L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_STATUS_REASON = 0x200L;
    private static final long OPT_BIT_CATEGORY = 0x400L;
    private static final long OPT_BIT_BASED_ON = 0x800L;
    private static final long OPT_BIT_REPORTED_REFERENCE = 0x1000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_REPORTED_BOOLEAN = 0x8000L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x10000L;
    private static final long OPT_BIT_SUBSTITUTION = 0x20000L;
    private static final long OPT_BIT_NOTE = 0x40000L;
    private static final long OPT_BIT_STATUS = 0x80000L;
    private static final long OPT_BIT_INTENT = 0x100000L;
    private static final long OPT_BIT_PRIOR_PRESCRIPTION = 0x200000L;
    private static final long OPT_BIT_COURSE_OF_THERAPY_TYPE = 0x400000L;
    private static final long OPT_BIT_RECORDER = 0x800000L;
    private static final long OPT_BIT_PERFORMER = 0x1000000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x2000000L;
    private static final long OPT_BIT_EVENT_HISTORY = 0x4000000L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x8000000L;
    private static final long OPT_BIT_INSURANCE = 0x10000000L;
    private static final long OPT_BIT_TEXT = 0x20000000L;
    private static final long OPT_BIT_ENCOUNTER = 0x40000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000000L;
    private static final long OPT_BIT_REQUESTER = 0x100000000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x200000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400000000L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x800000000L;
    private static final long OPT_BIT_DOSAGE_INSTRUCTION = 0x1000000000L;
    private static final long OPT_BIT_CONTAINED = 0x2000000000L;
    private static final long OPT_BIT_REASON_CODE = 0x4000000000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x8000000000L;
    private static final long OPT_BIT_DISPENSE_REQUEST = 0x10000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable CodeableConcept medicationCodeableConcept;
    private @Nullable Code priority;
    private @Nullable Code language;
    private @Nullable List<Reference> detectedIssue;
    private @Nullable List<Reference> supportingInformation;
    private @Nullable Id id;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable List<Identifier> identifier;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept statusReason;
    private @Nullable List<CodeableConcept> category;
    private @Nullable List<Reference> basedOn;
    private @Nullable Reference reportedReference;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean reportedBoolean;
    private @Nullable Reference medicationReference;
    private @Nullable MedicationRequest_Substitution substitution;
    private @Nullable List<Annotation> note;
    private @Nullable Code status;
    private @Nullable Code intent;
    private @Nullable Reference priorPrescription;
    private @Nullable CodeableConcept courseOfTherapyType;
    private @Nullable Reference recorder;
    private @Nullable Reference performer;
    private @Nullable Reference subject;
    private @Nullable DateTime authoredOn;
    private @Nullable List<Reference> eventHistory;
    private @Nullable Identifier groupIdentifier;
    private @Nullable List<Reference> insurance;
    private @Nullable Narrative text;
    private @Nullable Reference encounter;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference requester;
    private @Nullable List<Reference> reasonReference;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept performerType;
    private @Nullable List<Dosage> dosageInstruction;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Boolean doNotPerform;
    private @Nullable MedicationRequest_DispenseRequest dispenseRequest;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicationCodeableConcept(CodeableConcept medicationCodeableConcept) {
      checkNotIsSet(medicationCodeableConceptIsSet(), "medicationCodeableConcept");
      this.medicationCodeableConcept = Objects.requireNonNull(medicationCodeableConcept, "medicationCodeableConcept");
      optBits |= OPT_BIT_MEDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medicationCodeableConcept")
    public final Builder medicationCodeableConcept(Optional<? extends CodeableConcept> medicationCodeableConcept) {
      checkNotIsSet(medicationCodeableConceptIsSet(), "medicationCodeableConcept");
      this.medicationCodeableConcept = medicationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_MEDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(Code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends Code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for chained invocation
     */
    public final Builder detectedIssue(List<Reference> detectedIssue) {
      checkNotIsSet(detectedIssueIsSet(), "detectedIssue");
      this.detectedIssue = Objects.requireNonNull(detectedIssue, "detectedIssue");
      optBits |= OPT_BIT_DETECTED_ISSUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detectedIssue")
    public final Builder detectedIssue(Optional<? extends List<Reference>> detectedIssue) {
      checkNotIsSet(detectedIssueIsSet(), "detectedIssue");
      this.detectedIssue = detectedIssue.orElse(null);
      optBits |= OPT_BIT_DETECTED_ISSUE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInformation(List<Reference> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = Objects.requireNonNull(supportingInformation, "supportingInformation");
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInformation")
    public final Builder supportingInformation(Optional<? extends List<Reference>> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = supportingInformation.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(List<Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends List<Uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicationRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reportedReference() reportedReference} to reportedReference.
     * @param reportedReference The value for reportedReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reportedReference(Reference reportedReference) {
      checkNotIsSet(reportedReferenceIsSet(), "reportedReference");
      this.reportedReference = Objects.requireNonNull(reportedReference, "reportedReference");
      optBits |= OPT_BIT_REPORTED_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reportedReference() reportedReference} to reportedReference.
     * @param reportedReference The value for reportedReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reportedReference")
    public final Builder reportedReference(Optional<? extends Reference> reportedReference) {
      checkNotIsSet(reportedReferenceIsSet(), "reportedReference");
      this.reportedReference = reportedReference.orElse(null);
      optBits |= OPT_BIT_REPORTED_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(List<Canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
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
    @JsonProperty("reportedBoolean")
    public final Builder reportedBoolean(Optional<Boolean> reportedBoolean) {
      checkNotIsSet(reportedBooleanIsSet(), "reportedBoolean");
      this.reportedBoolean = reportedBoolean.orElse(null);
      optBits |= OPT_BIT_REPORTED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder medicationReference(Reference medicationReference) {
      checkNotIsSet(medicationReferenceIsSet(), "medicationReference");
      this.medicationReference = Objects.requireNonNull(medicationReference, "medicationReference");
      optBits |= OPT_BIT_MEDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medicationReference")
    public final Builder medicationReference(Optional<? extends Reference> medicationReference) {
      checkNotIsSet(medicationReferenceIsSet(), "medicationReference");
      this.medicationReference = medicationReference.orElse(null);
      optBits |= OPT_BIT_MEDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    public final Builder substitution(MedicationRequest_Substitution substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = Objects.requireNonNull(substitution, "substitution");
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substitution")
    public final Builder substitution(Optional<? extends MedicationRequest_Substitution> substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = substitution.orElse(null);
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(Code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intent")
    public final Builder intent(Optional<? extends Code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#priorPrescription() priorPrescription} to priorPrescription.
     * @param priorPrescription The value for priorPrescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder priorPrescription(Reference priorPrescription) {
      checkNotIsSet(priorPrescriptionIsSet(), "priorPrescription");
      this.priorPrescription = Objects.requireNonNull(priorPrescription, "priorPrescription");
      optBits |= OPT_BIT_PRIOR_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#priorPrescription() priorPrescription} to priorPrescription.
     * @param priorPrescription The value for priorPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priorPrescription")
    public final Builder priorPrescription(Optional<? extends Reference> priorPrescription) {
      checkNotIsSet(priorPrescriptionIsSet(), "priorPrescription");
      this.priorPrescription = priorPrescription.orElse(null);
      optBits |= OPT_BIT_PRIOR_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} to courseOfTherapyType.
     * @param courseOfTherapyType The value for courseOfTherapyType
     * @return {@code this} builder for chained invocation
     */
    public final Builder courseOfTherapyType(CodeableConcept courseOfTherapyType) {
      checkNotIsSet(courseOfTherapyTypeIsSet(), "courseOfTherapyType");
      this.courseOfTherapyType = Objects.requireNonNull(courseOfTherapyType, "courseOfTherapyType");
      optBits |= OPT_BIT_COURSE_OF_THERAPY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} to courseOfTherapyType.
     * @param courseOfTherapyType The value for courseOfTherapyType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("courseOfTherapyType")
    public final Builder courseOfTherapyType(Optional<? extends CodeableConcept> courseOfTherapyType) {
      checkNotIsSet(courseOfTherapyTypeIsSet(), "courseOfTherapyType");
      this.courseOfTherapyType = courseOfTherapyType.orElse(null);
      optBits |= OPT_BIT_COURSE_OF_THERAPY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorder(Reference recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = Objects.requireNonNull(recorder, "recorder");
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recorder")
    public final Builder recorder(Optional<? extends Reference> recorder) {
      checkNotIsSet(recorderIsSet(), "recorder");
      this.recorder = recorder.orElse(null);
      optBits |= OPT_BIT_RECORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicationRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(DateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authoredOn")
    public final Builder authoredOn(Optional<? extends DateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder eventHistory(List<Reference> eventHistory) {
      checkNotIsSet(eventHistoryIsSet(), "eventHistory");
      this.eventHistory = Objects.requireNonNull(eventHistory, "eventHistory");
      optBits |= OPT_BIT_EVENT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("eventHistory")
    public final Builder eventHistory(Optional<? extends List<Reference>> eventHistory) {
      checkNotIsSet(eventHistoryIsSet(), "eventHistory");
      this.eventHistory = eventHistory.orElse(null);
      optBits |= OPT_BIT_EVENT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupIdentifier(Identifier groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = Objects.requireNonNull(groupIdentifier, "groupIdentifier");
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupIdentifier")
    public final Builder groupIdentifier(Optional<? extends Identifier> groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = groupIdentifier.orElse(null);
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(List<Reference> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurance")
    public final Builder insurance(Optional<? extends List<Reference>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(Reference requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requester")
    public final Builder requester(Optional<? extends Reference> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = requester.orElse(null);
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(List<Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends List<Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerType(CodeableConcept performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = Objects.requireNonNull(performerType, "performerType");
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performerType")
    public final Builder performerType(Optional<? extends CodeableConcept> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = performerType.orElse(null);
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosageInstruction(List<Dosage> dosageInstruction) {
      checkNotIsSet(dosageInstructionIsSet(), "dosageInstruction");
      this.dosageInstruction = Objects.requireNonNull(dosageInstruction, "dosageInstruction");
      optBits |= OPT_BIT_DOSAGE_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dosageInstruction")
    public final Builder dosageInstruction(Optional<? extends List<Dosage>> dosageInstruction) {
      checkNotIsSet(dosageInstructionIsSet(), "dosageInstruction");
      this.dosageInstruction = dosageInstruction.orElse(null);
      optBits |= OPT_BIT_DOSAGE_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(List<CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends List<CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
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
    @JsonProperty("doNotPerform")
    public final Builder doNotPerform(Optional<Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#dispenseRequest() dispenseRequest} to dispenseRequest.
     * @param dispenseRequest The value for dispenseRequest
     * @return {@code this} builder for chained invocation
     */
    public final Builder dispenseRequest(MedicationRequest_DispenseRequest dispenseRequest) {
      checkNotIsSet(dispenseRequestIsSet(), "dispenseRequest");
      this.dispenseRequest = Objects.requireNonNull(dispenseRequest, "dispenseRequest");
      optBits |= OPT_BIT_DISPENSE_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest#dispenseRequest() dispenseRequest} to dispenseRequest.
     * @param dispenseRequest The value for dispenseRequest
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dispenseRequest")
    public final Builder dispenseRequest(Optional<? extends MedicationRequest_DispenseRequest> dispenseRequest) {
      checkNotIsSet(dispenseRequestIsSet(), "dispenseRequest");
      this.dispenseRequest = dispenseRequest.orElse(null);
      optBits |= OPT_BIT_DISPENSE_REQUEST;
      return this;
    }

    /**
     * Builds a new {@link MedicationRequest MedicationRequest}.
     * @return An immutable instance of MedicationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationRequest build() {
      checkRequiredAttributes();
      return new ImmutableMedicationRequest(
          medicationCodeableConcept,
          priority,
          language,
          detectedIssue,
          supportingInformation,
          id,
          instantiatesUri,
          identifier,
          resourceType,
          meta,
          statusReason,
          category,
          basedOn,
          reportedReference,
          instantiatesCanonical,
          extension,
          reportedBoolean,
          medicationReference,
          substitution,
          note,
          status,
          intent,
          priorPrescription,
          courseOfTherapyType,
          recorder,
          performer,
          subject,
          authoredOn,
          eventHistory,
          groupIdentifier,
          insurance,
          text,
          encounter,
          modifierExtension,
          requester,
          reasonReference,
          implicitRules,
          performerType,
          dosageInstruction,
          contained,
          reasonCode,
          doNotPerform,
          dispenseRequest);
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean detectedIssueIsSet() {
      return (optBits & OPT_BIT_DETECTED_ISSUE) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean reportedReferenceIsSet() {
      return (optBits & OPT_BIT_REPORTED_REFERENCE) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean reportedBooleanIsSet() {
      return (optBits & OPT_BIT_REPORTED_BOOLEAN) != 0;
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean substitutionIsSet() {
      return (optBits & OPT_BIT_SUBSTITUTION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean priorPrescriptionIsSet() {
      return (optBits & OPT_BIT_PRIOR_PRESCRIPTION) != 0;
    }

    private boolean courseOfTherapyTypeIsSet() {
      return (optBits & OPT_BIT_COURSE_OF_THERAPY_TYPE) != 0;
    }

    private boolean recorderIsSet() {
      return (optBits & OPT_BIT_RECORDER) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean eventHistoryIsSet() {
      return (optBits & OPT_BIT_EVENT_HISTORY) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean dosageInstructionIsSet() {
      return (optBits & OPT_BIT_DOSAGE_INSTRUCTION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean dispenseRequestIsSet() {
      return (optBits & OPT_BIT_DISPENSE_REQUEST) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!subjectIsSet()) attributes.add("subject");
      return "Cannot build MedicationRequest, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    SubjectBuildStage resourceType(String resourceType);
  }

  @Generated(from = "MedicationRequest", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link MedicationRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Reference subject);
  }

  @Generated(from = "MedicationRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationRequest#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(Optional<? extends CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link MedicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Initializes the optional value {@link MedicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicationRequest#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detectedIssue(List<Reference> detectedIssue);

    /**
     * Initializes the optional value {@link MedicationRequest#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detectedIssue(Optional<? extends List<Reference>> detectedIssue);

    /**
     * Initializes the optional value {@link MedicationRequest#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(List<Reference> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationRequest#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(Optional<? extends List<Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link MedicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link MedicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link MedicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link MedicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link MedicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link MedicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link MedicationRequest#reportedReference() reportedReference} to reportedReference.
     * @param reportedReference The value for reportedReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reportedReference(Reference reportedReference);

    /**
     * Initializes the optional value {@link MedicationRequest#reportedReference() reportedReference} to reportedReference.
     * @param reportedReference The value for reportedReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reportedReference(Optional<? extends Reference> reportedReference);

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link MedicationRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link MedicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

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
    BuildFinal reportedBoolean(Optional<Boolean> reportedBoolean);

    /**
     * Initializes the optional value {@link MedicationRequest#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicationRequest#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(Optional<? extends Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicationRequest#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    BuildFinal substitution(MedicationRequest_Substitution substitution);

    /**
     * Initializes the optional value {@link MedicationRequest#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substitution(Optional<? extends MedicationRequest_Substitution> substitution);

    /**
     * Initializes the optional value {@link MedicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link MedicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link MedicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link MedicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link MedicationRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(Code intent);

    /**
     * Initializes the optional value {@link MedicationRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(Optional<? extends Code> intent);

    /**
     * Initializes the optional value {@link MedicationRequest#priorPrescription() priorPrescription} to priorPrescription.
     * @param priorPrescription The value for priorPrescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priorPrescription(Reference priorPrescription);

    /**
     * Initializes the optional value {@link MedicationRequest#priorPrescription() priorPrescription} to priorPrescription.
     * @param priorPrescription The value for priorPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priorPrescription(Optional<? extends Reference> priorPrescription);

    /**
     * Initializes the optional value {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} to courseOfTherapyType.
     * @param courseOfTherapyType The value for courseOfTherapyType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal courseOfTherapyType(CodeableConcept courseOfTherapyType);

    /**
     * Initializes the optional value {@link MedicationRequest#courseOfTherapyType() courseOfTherapyType} to courseOfTherapyType.
     * @param courseOfTherapyType The value for courseOfTherapyType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal courseOfTherapyType(Optional<? extends CodeableConcept> courseOfTherapyType);

    /**
     * Initializes the optional value {@link MedicationRequest#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorder(Reference recorder);

    /**
     * Initializes the optional value {@link MedicationRequest#recorder() recorder} to recorder.
     * @param recorder The value for recorder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorder(Optional<? extends Reference> recorder);

    /**
     * Initializes the optional value {@link MedicationRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(Reference performer);

    /**
     * Initializes the optional value {@link MedicationRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends Reference> performer);

    /**
     * Initializes the optional value {@link MedicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(DateTime authoredOn);

    /**
     * Initializes the optional value {@link MedicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(Optional<? extends DateTime> authoredOn);

    /**
     * Initializes the optional value {@link MedicationRequest#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventHistory(List<Reference> eventHistory);

    /**
     * Initializes the optional value {@link MedicationRequest#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventHistory(Optional<? extends List<Reference>> eventHistory);

    /**
     * Initializes the optional value {@link MedicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link MedicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(Optional<? extends Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link MedicationRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(List<Reference> insurance);

    /**
     * Initializes the optional value {@link MedicationRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(Optional<? extends List<Reference>> insurance);

    /**
     * Initializes the optional value {@link MedicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link MedicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link MedicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(Reference requester);

    /**
     * Initializes the optional value {@link MedicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(Optional<? extends Reference> requester);

    /**
     * Initializes the optional value {@link MedicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link MedicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link MedicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(CodeableConcept performerType);

    /**
     * Initializes the optional value {@link MedicationRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(Optional<? extends CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link MedicationRequest#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosageInstruction(List<Dosage> dosageInstruction);

    /**
     * Initializes the optional value {@link MedicationRequest#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosageInstruction(Optional<? extends List<Dosage>> dosageInstruction);

    /**
     * Initializes the optional value {@link MedicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link MedicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

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
    BuildFinal doNotPerform(Optional<Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link MedicationRequest#dispenseRequest() dispenseRequest} to dispenseRequest.
     * @param dispenseRequest The value for dispenseRequest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dispenseRequest(MedicationRequest_DispenseRequest dispenseRequest);

    /**
     * Initializes the optional value {@link MedicationRequest#dispenseRequest() dispenseRequest} to dispenseRequest.
     * @param dispenseRequest The value for dispenseRequest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dispenseRequest(Optional<? extends MedicationRequest_DispenseRequest> dispenseRequest);

    /**
     * Builds a new {@link MedicationRequest MedicationRequest}.
     * @return An immutable instance of MedicationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationRequest build();
  }
}
