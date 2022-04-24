//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicationDispense}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationDispense.builder()}.
 */
@org.immutables.value.Generated(from = "MedicationDispense", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationDispense implements com.fhir.MedicationDispense {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.dateTime whenPrepared;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept category;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.MedicationDispense_Substitution substitution;
  private final @javax.annotation.Nullable com.fhir.Reference destination;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Quantity daysSupply;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReasonCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.Reference context;
  private final @javax.annotation.Nullable com.fhir.dateTime whenHandedOver;
  private final @javax.annotation.Nullable com.fhir.Reference statusReasonReference;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Reference medicationReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationDispense_Performer> performer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> authorizingPrescription;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosageInstruction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> detectedIssue;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> receiver;

  private ImmutableMedicationDispense(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept,
      @javax.annotation.Nullable com.fhir.dateTime whenPrepared,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.CodeableConcept category,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.MedicationDispense_Substitution substitution,
      @javax.annotation.Nullable com.fhir.Reference destination,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Quantity daysSupply,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReasonCodeableConcept,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.Reference context,
      @javax.annotation.Nullable com.fhir.dateTime whenHandedOver,
      @javax.annotation.Nullable com.fhir.Reference statusReasonReference,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Reference medicationReference,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationDispense_Performer> performer,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> authorizingPrescription,
      @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosageInstruction,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> detectedIssue,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> receiver) {
    this.partOf = partOf;
    this.language = language;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.whenPrepared = whenPrepared;
    this.type = type;
    this.category = category;
    this.status = status;
    this.extension = extension;
    this.contained = contained;
    this.id = id;
    this.note = note;
    this.substitution = substitution;
    this.destination = destination;
    this.identifier = identifier;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.daysSupply = daysSupply;
    this.location = location;
    this.quantity = quantity;
    this.statusReasonCodeableConcept = statusReasonCodeableConcept;
    this.subject = subject;
    this.context = context;
    this.whenHandedOver = whenHandedOver;
    this.statusReasonReference = statusReasonReference;
    this.text = text;
    this.meta = meta;
    this.medicationReference = medicationReference;
    this.performer = performer;
    this.supportingInformation = supportingInformation;
    this.eventHistory = eventHistory;
    this.authorizingPrescription = authorizingPrescription;
    this.dosageInstruction = dosageInstruction;
    this.detectedIssue = detectedIssue;
    this.implicitRules = implicitRules;
    this.receiver = receiver;
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code whenPrepared} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("whenPrepared")
  @Override
  public java.util.Optional<com.fhir.dateTime> whenPrepared() {
    return java.util.Optional.ofNullable(whenPrepared);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code substitution} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("substitution")
  @Override
  public java.util.Optional<com.fhir.MedicationDispense_Substitution> substitution() {
    return java.util.Optional.ofNullable(substitution);
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("destination")
  @Override
  public java.util.Optional<com.fhir.Reference> destination() {
    return java.util.Optional.ofNullable(destination);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code daysSupply} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("daysSupply")
  @Override
  public java.util.Optional<com.fhir.Quantity> daysSupply() {
    return java.util.Optional.ofNullable(daysSupply);
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
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> quantity() {
    return java.util.Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code statusReasonCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReasonCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReasonCodeableConcept() {
    return java.util.Optional.ofNullable(statusReasonCodeableConcept);
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
   * @return The value of the {@code context} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  @Override
  public java.util.Optional<com.fhir.Reference> context() {
    return java.util.Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code whenHandedOver} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("whenHandedOver")
  @Override
  public java.util.Optional<com.fhir.dateTime> whenHandedOver() {
    return java.util.Optional.ofNullable(whenHandedOver);
  }

  /**
   * @return The value of the {@code statusReasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReasonReference")
  @Override
  public java.util.Optional<com.fhir.Reference> statusReasonReference() {
    return java.util.Optional.ofNullable(statusReasonReference);
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
   * @return The value of the {@code medicationReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medicationReference")
  @Override
  public java.util.Optional<com.fhir.Reference> medicationReference() {
    return java.util.Optional.ofNullable(medicationReference);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationDispense_Performer>> performer() {
    return java.util.Optional.ofNullable(performer);
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
   * @return The value of the {@code eventHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("eventHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory() {
    return java.util.Optional.ofNullable(eventHistory);
  }

  /**
   * @return The value of the {@code authorizingPrescription} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authorizingPrescription")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> authorizingPrescription() {
    return java.util.Optional.ofNullable(authorizingPrescription);
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
   * @return The value of the {@code detectedIssue} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detectedIssue")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> detectedIssue() {
    return java.util.Optional.ofNullable(detectedIssue);
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
   * @return The value of the {@code receiver} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("receiver")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> receiver() {
    return java.util.Optional.ofNullable(receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableMedicationDispense(
        newValue,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableMedicationDispense(
        value,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        newValue,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        value,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withMedicationCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        newValue,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withMedicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        value,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#whenPrepared() whenPrepared} attribute.
   * @param value The value for whenPrepared
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withWhenPrepared(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "whenPrepared");
    if (this.whenPrepared == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        newValue,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#whenPrepared() whenPrepared} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for whenPrepared
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withWhenPrepared(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.whenPrepared == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        value,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        newValue,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        value,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withCategory(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        newValue,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withCategory(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        value,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        newValue,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        value,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        newValue,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        value,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        newValue,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        value,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        newValue,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        value,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        newValue,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        value,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#substitution() substitution} attribute.
   * @param value The value for substitution
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withSubstitution(com.fhir.MedicationDispense_Substitution value) {
    @javax.annotation.Nullable com.fhir.MedicationDispense_Substitution newValue = java.util.Objects.requireNonNull(value, "substitution");
    if (this.substitution == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        newValue,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#substitution() substitution} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substitution
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withSubstitution(java.util.Optional<? extends com.fhir.MedicationDispense_Substitution> optional) {
    @javax.annotation.Nullable com.fhir.MedicationDispense_Substitution value = optional.orElse(null);
    if (this.substitution == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        value,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withDestination(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        newValue,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withDestination(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        value,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        value,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        newValue,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        value,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationDispense#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationDispense withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        newValue,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#daysSupply() daysSupply} attribute.
   * @param value The value for daysSupply
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withDaysSupply(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "daysSupply");
    if (this.daysSupply == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#daysSupply() daysSupply} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for daysSupply
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withDaysSupply(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.daysSupply == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        value,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        newValue,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        value,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        newValue,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        value,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} attribute.
   * @param value The value for statusReasonCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withStatusReasonCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReasonCodeableConcept");
    if (this.statusReasonCodeableConcept == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        newValue,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReasonCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withStatusReasonCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReasonCodeableConcept == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        value,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        newValue,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        value,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withContext(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        newValue,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withContext(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        value,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#whenHandedOver() whenHandedOver} attribute.
   * @param value The value for whenHandedOver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withWhenHandedOver(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "whenHandedOver");
    if (this.whenHandedOver == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        newValue,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#whenHandedOver() whenHandedOver} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for whenHandedOver
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withWhenHandedOver(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.whenHandedOver == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        value,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#statusReasonReference() statusReasonReference} attribute.
   * @param value The value for statusReasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withStatusReasonReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "statusReasonReference");
    if (this.statusReasonReference == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        newValue,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#statusReasonReference() statusReasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withStatusReasonReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.statusReasonReference == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        value,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        newValue,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        value,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        newValue,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        value,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withMedicationReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        newValue,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withMedicationReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        value,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withPerformer(java.util.List<com.fhir.MedicationDispense_Performer> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationDispense_Performer> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        newValue,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withPerformer(java.util.Optional<? extends java.util.List<com.fhir.MedicationDispense_Performer>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationDispense_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        value,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withSupportingInformation(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        newValue,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withSupportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        value,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#eventHistory() eventHistory} attribute.
   * @param value The value for eventHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withEventHistory(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "eventHistory");
    if (this.eventHistory == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        newValue,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#eventHistory() eventHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withEventHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.eventHistory == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        value,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#authorizingPrescription() authorizingPrescription} attribute.
   * @param value The value for authorizingPrescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withAuthorizingPrescription(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "authorizingPrescription");
    if (this.authorizingPrescription == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        newValue,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#authorizingPrescription() authorizingPrescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorizingPrescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withAuthorizingPrescription(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.authorizingPrescription == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        value,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#dosageInstruction() dosageInstruction} attribute.
   * @param value The value for dosageInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withDosageInstruction(java.util.List<com.fhir.Dosage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Dosage> newValue = java.util.Objects.requireNonNull(value, "dosageInstruction");
    if (this.dosageInstruction == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        newValue,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#dosageInstruction() dosageInstruction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosageInstruction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withDosageInstruction(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Dosage> value = optional.orElse(null);
    if (this.dosageInstruction == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        value,
        this.detectedIssue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#detectedIssue() detectedIssue} attribute.
   * @param value The value for detectedIssue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withDetectedIssue(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "detectedIssue");
    if (this.detectedIssue == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        newValue,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#detectedIssue() detectedIssue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detectedIssue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withDetectedIssue(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.detectedIssue == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        value,
        this.implicitRules,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        newValue,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        value,
        this.receiver);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#receiver() receiver} attribute.
   * @param value The value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withReceiver(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "receiver");
    if (this.receiver == newValue) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#receiver() receiver} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiver
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withReceiver(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.receiver == value) return this;
    return new ImmutableMedicationDispense(
        this.partOf,
        this.language,
        this.medicationCodeableConcept,
        this.whenPrepared,
        this.type,
        this.category,
        this.status,
        this.extension,
        this.contained,
        this.id,
        this.note,
        this.substitution,
        this.destination,
        this.identifier,
        this.modifierExtension,
        this.resourceType,
        this.daysSupply,
        this.location,
        this.quantity,
        this.statusReasonCodeableConcept,
        this.subject,
        this.context,
        this.whenHandedOver,
        this.statusReasonReference,
        this.text,
        this.meta,
        this.medicationReference,
        this.performer,
        this.supportingInformation,
        this.eventHistory,
        this.authorizingPrescription,
        this.dosageInstruction,
        this.detectedIssue,
        this.implicitRules,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationDispense} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationDispense
        && equalTo((ImmutableMedicationDispense) another);
  }

  private boolean equalTo(ImmutableMedicationDispense another) {
    return java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && java.util.Objects.equals(whenPrepared, another.whenPrepared)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(substitution, another.substitution)
        && java.util.Objects.equals(destination, another.destination)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(daysSupply, another.daysSupply)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(statusReasonCodeableConcept, another.statusReasonCodeableConcept)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(context, another.context)
        && java.util.Objects.equals(whenHandedOver, another.whenHandedOver)
        && java.util.Objects.equals(statusReasonReference, another.statusReasonReference)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(medicationReference, another.medicationReference)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(supportingInformation, another.supportingInformation)
        && java.util.Objects.equals(eventHistory, another.eventHistory)
        && java.util.Objects.equals(authorizingPrescription, another.authorizingPrescription)
        && java.util.Objects.equals(dosageInstruction, another.dosageInstruction)
        && java.util.Objects.equals(detectedIssue, another.detectedIssue)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(receiver, another.receiver);
  }

  /**
   * Computes a hash code from attributes: {@code partOf}, {@code language}, {@code medicationCodeableConcept}, {@code whenPrepared}, {@code type}, {@code category}, {@code status}, {@code extension}, {@code contained}, {@code id}, {@code note}, {@code substitution}, {@code destination}, {@code identifier}, {@code modifierExtension}, {@code resourceType}, {@code daysSupply}, {@code location}, {@code quantity}, {@code statusReasonCodeableConcept}, {@code subject}, {@code context}, {@code whenHandedOver}, {@code statusReasonReference}, {@code text}, {@code meta}, {@code medicationReference}, {@code performer}, {@code supportingInformation}, {@code eventHistory}, {@code authorizingPrescription}, {@code dosageInstruction}, {@code detectedIssue}, {@code implicitRules}, {@code receiver}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(whenPrepared);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(substitution);
    h += (h << 5) + java.util.Objects.hashCode(destination);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(daysSupply);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(statusReasonCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(context);
    h += (h << 5) + java.util.Objects.hashCode(whenHandedOver);
    h += (h << 5) + java.util.Objects.hashCode(statusReasonReference);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(medicationReference);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(supportingInformation);
    h += (h << 5) + java.util.Objects.hashCode(eventHistory);
    h += (h << 5) + java.util.Objects.hashCode(authorizingPrescription);
    h += (h << 5) + java.util.Objects.hashCode(dosageInstruction);
    h += (h << 5) + java.util.Objects.hashCode(detectedIssue);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(receiver);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationDispense} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicationDispense{");
    if (partOf != null) {
      builder.append("partOf=").append(partOf);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (medicationCodeableConcept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (whenPrepared != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("whenPrepared=").append(whenPrepared);
    }
    if (type != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (category != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (note != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (substitution != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("substitution=").append(substitution);
    }
    if (destination != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (daysSupply != null) {
      builder.append(", ");
      builder.append("daysSupply=").append(daysSupply);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (statusReasonCodeableConcept != null) {
      builder.append(", ");
      builder.append("statusReasonCodeableConcept=").append(statusReasonCodeableConcept);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    if (whenHandedOver != null) {
      builder.append(", ");
      builder.append("whenHandedOver=").append(whenHandedOver);
    }
    if (statusReasonReference != null) {
      builder.append(", ");
      builder.append("statusReasonReference=").append(statusReasonReference);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (medicationReference != null) {
      builder.append(", ");
      builder.append("medicationReference=").append(medicationReference);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (supportingInformation != null) {
      builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (eventHistory != null) {
      builder.append(", ");
      builder.append("eventHistory=").append(eventHistory);
    }
    if (authorizingPrescription != null) {
      builder.append(", ");
      builder.append("authorizingPrescription=").append(authorizingPrescription);
    }
    if (dosageInstruction != null) {
      builder.append(", ");
      builder.append("dosageInstruction=").append(dosageInstruction);
    }
    if (detectedIssue != null) {
      builder.append(", ");
      builder.append("detectedIssue=").append(detectedIssue);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (receiver != null) {
      builder.append(", ");
      builder.append("receiver=").append(receiver);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicationDispense", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicationDispense {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept = java.util.Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> whenPrepared = java.util.Optional.empty();
    boolean whenPreparedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MedicationDispense_Substitution> substitution = java.util.Optional.empty();
    boolean substitutionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> destination = java.util.Optional.empty();
    boolean destinationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> daysSupply = java.util.Optional.empty();
    boolean daysSupplyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReasonCodeableConcept = java.util.Optional.empty();
    boolean statusReasonCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> context = java.util.Optional.empty();
    boolean contextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> whenHandedOver = java.util.Optional.empty();
    boolean whenHandedOverIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> statusReasonReference = java.util.Optional.empty();
    boolean statusReasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> medicationReference = java.util.Optional.empty();
    boolean medicationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationDispense_Performer>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation = java.util.Optional.empty();
    boolean supportingInformationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory = java.util.Optional.empty();
    boolean eventHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> authorizingPrescription = java.util.Optional.empty();
    boolean authorizingPrescriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Dosage>> dosageInstruction = java.util.Optional.empty();
    boolean dosageInstructionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> detectedIssue = java.util.Optional.empty();
    boolean detectedIssueIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> receiver = java.util.Optional.empty();
    boolean receiverIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("whenPrepared")
    public void setWhenPrepared(java.util.Optional<com.fhir.dateTime> whenPrepared) {
      this.whenPrepared = whenPrepared;
      this.whenPreparedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("substitution")
    public void setSubstitution(java.util.Optional<com.fhir.MedicationDispense_Substitution> substitution) {
      this.substitution = substitution;
      this.substitutionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public void setDestination(java.util.Optional<com.fhir.Reference> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("daysSupply")
    public void setDaysSupply(java.util.Optional<com.fhir.Quantity> daysSupply) {
      this.daysSupply = daysSupply;
      this.daysSupplyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReasonCodeableConcept")
    public void setStatusReasonCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> statusReasonCodeableConcept) {
      this.statusReasonCodeableConcept = statusReasonCodeableConcept;
      this.statusReasonCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Optional<com.fhir.Reference> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("whenHandedOver")
    public void setWhenHandedOver(java.util.Optional<com.fhir.dateTime> whenHandedOver) {
      this.whenHandedOver = whenHandedOver;
      this.whenHandedOverIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReasonReference")
    public void setStatusReasonReference(java.util.Optional<com.fhir.Reference> statusReasonReference) {
      this.statusReasonReference = statusReasonReference;
      this.statusReasonReferenceIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("medicationReference")
    public void setMedicationReference(java.util.Optional<com.fhir.Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.MedicationDispense_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
    public void setSupportingInformation(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation) {
      this.supportingInformation = supportingInformation;
      this.supportingInformationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eventHistory")
    public void setEventHistory(java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory) {
      this.eventHistory = eventHistory;
      this.eventHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authorizingPrescription")
    public void setAuthorizingPrescription(java.util.Optional<java.util.List<com.fhir.Reference>> authorizingPrescription) {
      this.authorizingPrescription = authorizingPrescription;
      this.authorizingPrescriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dosageInstruction")
    public void setDosageInstruction(java.util.Optional<java.util.List<com.fhir.Dosage>> dosageInstruction) {
      this.dosageInstruction = dosageInstruction;
      this.dosageInstructionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detectedIssue")
    public void setDetectedIssue(java.util.Optional<java.util.List<com.fhir.Reference>> detectedIssue) {
      this.detectedIssue = detectedIssue;
      this.detectedIssueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("receiver")
    public void setReceiver(java.util.Optional<java.util.List<com.fhir.Reference>> receiver) {
      this.receiver = receiver;
      this.receiverIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> whenPrepared() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MedicationDispense_Substitution> substitution() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> destination() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> daysSupply() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReasonCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> context() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> whenHandedOver() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> statusReasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationDispense_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> authorizingPrescription() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Dosage>> dosageInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> detectedIssue() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> receiver() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationDispense fromJson(Json json) {
    ImmutableMedicationDispense.Builder builder = ((ImmutableMedicationDispense.Builder) ImmutableMedicationDispense.builder());
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.whenPreparedIsSet) {
      builder.whenPrepared(json.whenPrepared);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.substitutionIsSet) {
      builder.substitution(json.substitution);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.daysSupplyIsSet) {
      builder.daysSupply(json.daysSupply);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.statusReasonCodeableConceptIsSet) {
      builder.statusReasonCodeableConcept(json.statusReasonCodeableConcept);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.whenHandedOverIsSet) {
      builder.whenHandedOver(json.whenHandedOver);
    }
    if (json.statusReasonReferenceIsSet) {
      builder.statusReasonReference(json.statusReasonReference);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.eventHistoryIsSet) {
      builder.eventHistory(json.eventHistory);
    }
    if (json.authorizingPrescriptionIsSet) {
      builder.authorizingPrescription(json.authorizingPrescription);
    }
    if (json.dosageInstructionIsSet) {
      builder.dosageInstruction(json.dosageInstruction);
    }
    if (json.detectedIssueIsSet) {
      builder.detectedIssue(json.detectedIssue);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.receiverIsSet) {
      builder.receiver(json.receiver);
    }
    return (ImmutableMedicationDispense) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationDispense} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationDispense instance
   */
  public static MedicationDispense copyOf(MedicationDispense instance) {
    if (instance instanceof ImmutableMedicationDispense) {
      return (ImmutableMedicationDispense) instance;
    }
    return ((ImmutableMedicationDispense.Builder) ImmutableMedicationDispense.builder())
        .partOf(instance.partOf())
        .language(instance.language())
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .whenPrepared(instance.whenPrepared())
        .type(instance.type())
        .category(instance.category())
        .status(instance.status())
        .extension(instance.extension())
        .contained(instance.contained())
        .id(instance.id())
        .note(instance.note())
        .substitution(instance.substitution())
        .destination(instance.destination())
        .identifier(instance.identifier())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .daysSupply(instance.daysSupply())
        .location(instance.location())
        .quantity(instance.quantity())
        .statusReasonCodeableConcept(instance.statusReasonCodeableConcept())
        .subject(instance.subject())
        .context(instance.context())
        .whenHandedOver(instance.whenHandedOver())
        .statusReasonReference(instance.statusReasonReference())
        .text(instance.text())
        .meta(instance.meta())
        .medicationReference(instance.medicationReference())
        .performer(instance.performer())
        .supportingInformation(instance.supportingInformation())
        .eventHistory(instance.eventHistory())
        .authorizingPrescription(instance.authorizingPrescription())
        .dosageInstruction(instance.dosageInstruction())
        .detectedIssue(instance.detectedIssue())
        .implicitRules(instance.implicitRules())
        .receiver(instance.receiver())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationDispense MedicationDispense}.
   * <pre>
   * ImmutableMedicationDispense.builder()
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#partOf() partOf}
   *    .language(com.fhir.code) // optional {@link MedicationDispense#language() language}
   *    .medicationCodeableConcept(com.fhir.CodeableConcept) // optional {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept}
   *    .whenPrepared(com.fhir.dateTime) // optional {@link MedicationDispense#whenPrepared() whenPrepared}
   *    .type(com.fhir.CodeableConcept) // optional {@link MedicationDispense#type() type}
   *    .category(com.fhir.CodeableConcept) // optional {@link MedicationDispense#category() category}
   *    .status(com.fhir.code) // optional {@link MedicationDispense#status() status}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationDispense#extension() extension}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicationDispense#contained() contained}
   *    .id(com.fhir.id) // optional {@link MedicationDispense#id() id}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link MedicationDispense#note() note}
   *    .substitution(com.fhir.MedicationDispense_Substitution) // optional {@link MedicationDispense#substitution() substitution}
   *    .destination(com.fhir.Reference) // optional {@link MedicationDispense#destination() destination}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicationDispense#identifier() identifier}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationDispense#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link MedicationDispense#resourceType() resourceType}
   *    .daysSupply(com.fhir.Quantity) // optional {@link MedicationDispense#daysSupply() daysSupply}
   *    .location(com.fhir.Reference) // optional {@link MedicationDispense#location() location}
   *    .quantity(com.fhir.Quantity) // optional {@link MedicationDispense#quantity() quantity}
   *    .statusReasonCodeableConcept(com.fhir.CodeableConcept) // optional {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept}
   *    .subject(com.fhir.Reference) // optional {@link MedicationDispense#subject() subject}
   *    .context(com.fhir.Reference) // optional {@link MedicationDispense#context() context}
   *    .whenHandedOver(com.fhir.dateTime) // optional {@link MedicationDispense#whenHandedOver() whenHandedOver}
   *    .statusReasonReference(com.fhir.Reference) // optional {@link MedicationDispense#statusReasonReference() statusReasonReference}
   *    .text(com.fhir.Narrative) // optional {@link MedicationDispense#text() text}
   *    .meta(com.fhir.Meta) // optional {@link MedicationDispense#meta() meta}
   *    .medicationReference(com.fhir.Reference) // optional {@link MedicationDispense#medicationReference() medicationReference}
   *    .performer(List&amp;lt;com.fhir.MedicationDispense_Performer&amp;gt;) // optional {@link MedicationDispense#performer() performer}
   *    .supportingInformation(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#supportingInformation() supportingInformation}
   *    .eventHistory(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#eventHistory() eventHistory}
   *    .authorizingPrescription(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#authorizingPrescription() authorizingPrescription}
   *    .dosageInstruction(List&amp;lt;com.fhir.Dosage&amp;gt;) // optional {@link MedicationDispense#dosageInstruction() dosageInstruction}
   *    .detectedIssue(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#detectedIssue() detectedIssue}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicationDispense#implicitRules() implicitRules}
   *    .receiver(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#receiver() receiver}
   *    .build();
   * </pre>
   * @return A new MedicationDispense builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicationDispense.Builder();
  }

  /**
   * Builds instances of type {@link MedicationDispense MedicationDispense}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicationDispense", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_PART_OF = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_WHEN_PREPARED = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_CATEGORY = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_NOTE = 0x400L;
    private static final long OPT_BIT_SUBSTITUTION = 0x800L;
    private static final long OPT_BIT_DESTINATION = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_DAYS_SUPPLY = 0x8000L;
    private static final long OPT_BIT_LOCATION = 0x10000L;
    private static final long OPT_BIT_QUANTITY = 0x20000L;
    private static final long OPT_BIT_STATUS_REASON_CODEABLE_CONCEPT = 0x40000L;
    private static final long OPT_BIT_SUBJECT = 0x80000L;
    private static final long OPT_BIT_CONTEXT = 0x100000L;
    private static final long OPT_BIT_WHEN_HANDED_OVER = 0x200000L;
    private static final long OPT_BIT_STATUS_REASON_REFERENCE = 0x400000L;
    private static final long OPT_BIT_TEXT = 0x800000L;
    private static final long OPT_BIT_META = 0x1000000L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x2000000L;
    private static final long OPT_BIT_PERFORMER = 0x4000000L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x8000000L;
    private static final long OPT_BIT_EVENT_HISTORY = 0x10000000L;
    private static final long OPT_BIT_AUTHORIZING_PRESCRIPTION = 0x20000000L;
    private static final long OPT_BIT_DOSAGE_INSTRUCTION = 0x40000000L;
    private static final long OPT_BIT_DETECTED_ISSUE = 0x80000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100000000L;
    private static final long OPT_BIT_RECEIVER = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept;
    private @javax.annotation.Nullable com.fhir.dateTime whenPrepared;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.MedicationDispense_Substitution substitution;
    private @javax.annotation.Nullable com.fhir.Reference destination;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Quantity daysSupply;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReasonCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.Reference context;
    private @javax.annotation.Nullable com.fhir.dateTime whenHandedOver;
    private @javax.annotation.Nullable com.fhir.Reference statusReasonReference;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference medicationReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationDispense_Performer> performer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> authorizingPrescription;
    private @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosageInstruction;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> detectedIssue;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> receiver;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationDispense#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link MedicationDispense#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link MedicationDispense#language() language} to language.
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
     * Initializes the optional value {@link MedicationDispense#language() language} to language.
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
     * Initializes the optional value {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationDispense#whenPrepared() whenPrepared} to whenPrepared.
     * @param whenPrepared The value for whenPrepared
     * @return {@code this} builder for chained invocation
     */
    public final Builder whenPrepared(com.fhir.dateTime whenPrepared) {
      checkNotIsSet(whenPreparedIsSet(), "whenPrepared");
      this.whenPrepared = java.util.Objects.requireNonNull(whenPrepared, "whenPrepared");
      optBits |= OPT_BIT_WHEN_PREPARED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#whenPrepared() whenPrepared} to whenPrepared.
     * @param whenPrepared The value for whenPrepared
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("whenPrepared")
    public final Builder whenPrepared(java.util.Optional<? extends com.fhir.dateTime> whenPrepared) {
      checkNotIsSet(whenPreparedIsSet(), "whenPrepared");
      this.whenPrepared = whenPrepared.orElse(null);
      optBits |= OPT_BIT_WHEN_PREPARED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#type() type} to type.
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
     * Initializes the optional value {@link MedicationDispense#type() type} to type.
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
     * Initializes the optional value {@link MedicationDispense#category() category} to category.
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
     * Initializes the optional value {@link MedicationDispense#category() category} to category.
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
     * Initializes the optional value {@link MedicationDispense#status() status} to status.
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
     * Initializes the optional value {@link MedicationDispense#status() status} to status.
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
     * Initializes the optional value {@link MedicationDispense#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationDispense#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationDispense#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationDispense#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationDispense#id() id} to id.
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
     * Initializes the optional value {@link MedicationDispense#id() id} to id.
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
     * Initializes the optional value {@link MedicationDispense#note() note} to note.
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
     * Initializes the optional value {@link MedicationDispense#note() note} to note.
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
     * Initializes the optional value {@link MedicationDispense#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    public final Builder substitution(com.fhir.MedicationDispense_Substitution substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = java.util.Objects.requireNonNull(substitution, "substitution");
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("substitution")
    public final Builder substitution(java.util.Optional<? extends com.fhir.MedicationDispense_Substitution> substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = substitution.orElse(null);
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(com.fhir.Reference destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = java.util.Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public final Builder destination(java.util.Optional<? extends com.fhir.Reference> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationDispense#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationDispense#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationDispense#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MedicationDispense#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicationDispense#daysSupply() daysSupply} to daysSupply.
     * @param daysSupply The value for daysSupply
     * @return {@code this} builder for chained invocation
     */
    public final Builder daysSupply(com.fhir.Quantity daysSupply) {
      checkNotIsSet(daysSupplyIsSet(), "daysSupply");
      this.daysSupply = java.util.Objects.requireNonNull(daysSupply, "daysSupply");
      optBits |= OPT_BIT_DAYS_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#daysSupply() daysSupply} to daysSupply.
     * @param daysSupply The value for daysSupply
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("daysSupply")
    public final Builder daysSupply(java.util.Optional<? extends com.fhir.Quantity> daysSupply) {
      checkNotIsSet(daysSupplyIsSet(), "daysSupply");
      this.daysSupply = daysSupply.orElse(null);
      optBits |= OPT_BIT_DAYS_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#location() location} to location.
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
     * Initializes the optional value {@link MedicationDispense#location() location} to location.
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
     * Initializes the optional value {@link MedicationDispense#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(com.fhir.Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(java.util.Optional<? extends com.fhir.Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} to statusReasonCodeableConcept.
     * @param statusReasonCodeableConcept The value for statusReasonCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReasonCodeableConcept(com.fhir.CodeableConcept statusReasonCodeableConcept) {
      checkNotIsSet(statusReasonCodeableConceptIsSet(), "statusReasonCodeableConcept");
      this.statusReasonCodeableConcept = java.util.Objects.requireNonNull(statusReasonCodeableConcept, "statusReasonCodeableConcept");
      optBits |= OPT_BIT_STATUS_REASON_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} to statusReasonCodeableConcept.
     * @param statusReasonCodeableConcept The value for statusReasonCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReasonCodeableConcept")
    public final Builder statusReasonCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> statusReasonCodeableConcept) {
      checkNotIsSet(statusReasonCodeableConceptIsSet(), "statusReasonCodeableConcept");
      this.statusReasonCodeableConcept = statusReasonCodeableConcept.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicationDispense#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicationDispense#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(com.fhir.Reference context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = java.util.Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public final Builder context(java.util.Optional<? extends com.fhir.Reference> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#whenHandedOver() whenHandedOver} to whenHandedOver.
     * @param whenHandedOver The value for whenHandedOver
     * @return {@code this} builder for chained invocation
     */
    public final Builder whenHandedOver(com.fhir.dateTime whenHandedOver) {
      checkNotIsSet(whenHandedOverIsSet(), "whenHandedOver");
      this.whenHandedOver = java.util.Objects.requireNonNull(whenHandedOver, "whenHandedOver");
      optBits |= OPT_BIT_WHEN_HANDED_OVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#whenHandedOver() whenHandedOver} to whenHandedOver.
     * @param whenHandedOver The value for whenHandedOver
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("whenHandedOver")
    public final Builder whenHandedOver(java.util.Optional<? extends com.fhir.dateTime> whenHandedOver) {
      checkNotIsSet(whenHandedOverIsSet(), "whenHandedOver");
      this.whenHandedOver = whenHandedOver.orElse(null);
      optBits |= OPT_BIT_WHEN_HANDED_OVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonReference() statusReasonReference} to statusReasonReference.
     * @param statusReasonReference The value for statusReasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReasonReference(com.fhir.Reference statusReasonReference) {
      checkNotIsSet(statusReasonReferenceIsSet(), "statusReasonReference");
      this.statusReasonReference = java.util.Objects.requireNonNull(statusReasonReference, "statusReasonReference");
      optBits |= OPT_BIT_STATUS_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonReference() statusReasonReference} to statusReasonReference.
     * @param statusReasonReference The value for statusReasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReasonReference")
    public final Builder statusReasonReference(java.util.Optional<? extends com.fhir.Reference> statusReasonReference) {
      checkNotIsSet(statusReasonReferenceIsSet(), "statusReasonReference");
      this.statusReasonReference = statusReasonReference.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#text() text} to text.
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
     * Initializes the optional value {@link MedicationDispense#text() text} to text.
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
     * Initializes the optional value {@link MedicationDispense#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationDispense#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationDispense#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationDispense#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationDispense#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.MedicationDispense_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.MedicationDispense_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#supportingInformation() supportingInformation} to supportingInformation.
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
     * Initializes the optional value {@link MedicationDispense#supportingInformation() supportingInformation} to supportingInformation.
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
     * Initializes the optional value {@link MedicationDispense#eventHistory() eventHistory} to eventHistory.
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
     * Initializes the optional value {@link MedicationDispense#eventHistory() eventHistory} to eventHistory.
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
     * Initializes the optional value {@link MedicationDispense#authorizingPrescription() authorizingPrescription} to authorizingPrescription.
     * @param authorizingPrescription The value for authorizingPrescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorizingPrescription(java.util.List<com.fhir.Reference> authorizingPrescription) {
      checkNotIsSet(authorizingPrescriptionIsSet(), "authorizingPrescription");
      this.authorizingPrescription = java.util.Objects.requireNonNull(authorizingPrescription, "authorizingPrescription");
      optBits |= OPT_BIT_AUTHORIZING_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#authorizingPrescription() authorizingPrescription} to authorizingPrescription.
     * @param authorizingPrescription The value for authorizingPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizingPrescription")
    public final Builder authorizingPrescription(java.util.Optional<? extends java.util.List<com.fhir.Reference>> authorizingPrescription) {
      checkNotIsSet(authorizingPrescriptionIsSet(), "authorizingPrescription");
      this.authorizingPrescription = authorizingPrescription.orElse(null);
      optBits |= OPT_BIT_AUTHORIZING_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#dosageInstruction() dosageInstruction} to dosageInstruction.
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
     * Initializes the optional value {@link MedicationDispense#dosageInstruction() dosageInstruction} to dosageInstruction.
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
     * Initializes the optional value {@link MedicationDispense#detectedIssue() detectedIssue} to detectedIssue.
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
     * Initializes the optional value {@link MedicationDispense#detectedIssue() detectedIssue} to detectedIssue.
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
     * Initializes the optional value {@link MedicationDispense#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationDispense#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationDispense#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    public final Builder receiver(java.util.List<com.fhir.Reference> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = java.util.Objects.requireNonNull(receiver, "receiver");
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("receiver")
    public final Builder receiver(java.util.Optional<? extends java.util.List<com.fhir.Reference>> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = receiver.orElse(null);
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Builds a new {@link MedicationDispense MedicationDispense}.
     * @return An immutable instance of MedicationDispense
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicationDispense build() {
      checkRequiredAttributes();
      return new ImmutableMedicationDispense(
          partOf,
          language,
          medicationCodeableConcept,
          whenPrepared,
          type,
          category,
          status,
          extension,
          contained,
          id,
          note,
          substitution,
          destination,
          identifier,
          modifierExtension,
          resourceType,
          daysSupply,
          location,
          quantity,
          statusReasonCodeableConcept,
          subject,
          context,
          whenHandedOver,
          statusReasonReference,
          text,
          meta,
          medicationReference,
          performer,
          supportingInformation,
          eventHistory,
          authorizingPrescription,
          dosageInstruction,
          detectedIssue,
          implicitRules,
          receiver);
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean whenPreparedIsSet() {
      return (optBits & OPT_BIT_WHEN_PREPARED) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean substitutionIsSet() {
      return (optBits & OPT_BIT_SUBSTITUTION) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean daysSupplyIsSet() {
      return (optBits & OPT_BIT_DAYS_SUPPLY) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean statusReasonCodeableConceptIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON_CODEABLE_CONCEPT) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean whenHandedOverIsSet() {
      return (optBits & OPT_BIT_WHEN_HANDED_OVER) != 0;
    }

    private boolean statusReasonReferenceIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON_REFERENCE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean eventHistoryIsSet() {
      return (optBits & OPT_BIT_EVENT_HISTORY) != 0;
    }

    private boolean authorizingPrescriptionIsSet() {
      return (optBits & OPT_BIT_AUTHORIZING_PRESCRIPTION) != 0;
    }

    private boolean dosageInstructionIsSet() {
      return (optBits & OPT_BIT_DOSAGE_INSTRUCTION) != 0;
    }

    private boolean detectedIssueIsSet() {
      return (optBits & OPT_BIT_DETECTED_ISSUE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean receiverIsSet() {
      return (optBits & OPT_BIT_RECEIVER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicationDispense is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicationDispense, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicationDispense", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationDispense#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicationDispense", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationDispense#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link MedicationDispense#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link MedicationDispense#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicationDispense#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(com.fhir.CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationDispense#whenPrepared() whenPrepared} to whenPrepared.
     * @param whenPrepared The value for whenPrepared
     * @return {@code this} builder for chained invocation
     */
    BuildFinal whenPrepared(com.fhir.dateTime whenPrepared);

    /**
     * Initializes the optional value {@link MedicationDispense#whenPrepared() whenPrepared} to whenPrepared.
     * @param whenPrepared The value for whenPrepared
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal whenPrepared(java.util.Optional<? extends com.fhir.dateTime> whenPrepared);

    /**
     * Initializes the optional value {@link MedicationDispense#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link MedicationDispense#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link MedicationDispense#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);

    /**
     * Initializes the optional value {@link MedicationDispense#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link MedicationDispense#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link MedicationDispense#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link MedicationDispense#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicationDispense#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationDispense#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationDispense#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationDispense#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicationDispense#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicationDispense#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link MedicationDispense#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link MedicationDispense#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    BuildFinal substitution(com.fhir.MedicationDispense_Substitution substitution);

    /**
     * Initializes the optional value {@link MedicationDispense#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substitution(java.util.Optional<? extends com.fhir.MedicationDispense_Substitution> substitution);

    /**
     * Initializes the optional value {@link MedicationDispense#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(com.fhir.Reference destination);

    /**
     * Initializes the optional value {@link MedicationDispense#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(java.util.Optional<? extends com.fhir.Reference> destination);

    /**
     * Initializes the optional value {@link MedicationDispense#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicationDispense#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicationDispense#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationDispense#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationDispense#daysSupply() daysSupply} to daysSupply.
     * @param daysSupply The value for daysSupply
     * @return {@code this} builder for chained invocation
     */
    BuildFinal daysSupply(com.fhir.Quantity daysSupply);

    /**
     * Initializes the optional value {@link MedicationDispense#daysSupply() daysSupply} to daysSupply.
     * @param daysSupply The value for daysSupply
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal daysSupply(java.util.Optional<? extends com.fhir.Quantity> daysSupply);

    /**
     * Initializes the optional value {@link MedicationDispense#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link MedicationDispense#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link MedicationDispense#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link MedicationDispense#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} to statusReasonCodeableConcept.
     * @param statusReasonCodeableConcept The value for statusReasonCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReasonCodeableConcept(com.fhir.CodeableConcept statusReasonCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} to statusReasonCodeableConcept.
     * @param statusReasonCodeableConcept The value for statusReasonCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReasonCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> statusReasonCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationDispense#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link MedicationDispense#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link MedicationDispense#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(com.fhir.Reference context);

    /**
     * Initializes the optional value {@link MedicationDispense#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(java.util.Optional<? extends com.fhir.Reference> context);

    /**
     * Initializes the optional value {@link MedicationDispense#whenHandedOver() whenHandedOver} to whenHandedOver.
     * @param whenHandedOver The value for whenHandedOver
     * @return {@code this} builder for chained invocation
     */
    BuildFinal whenHandedOver(com.fhir.dateTime whenHandedOver);

    /**
     * Initializes the optional value {@link MedicationDispense#whenHandedOver() whenHandedOver} to whenHandedOver.
     * @param whenHandedOver The value for whenHandedOver
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal whenHandedOver(java.util.Optional<? extends com.fhir.dateTime> whenHandedOver);

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonReference() statusReasonReference} to statusReasonReference.
     * @param statusReasonReference The value for statusReasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReasonReference(com.fhir.Reference statusReasonReference);

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonReference() statusReasonReference} to statusReasonReference.
     * @param statusReasonReference The value for statusReasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReasonReference(java.util.Optional<? extends com.fhir.Reference> statusReasonReference);

    /**
     * Initializes the optional value {@link MedicationDispense#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicationDispense#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicationDispense#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicationDispense#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicationDispense#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(com.fhir.Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicationDispense#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(java.util.Optional<? extends com.fhir.Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicationDispense#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.MedicationDispense_Performer> performer);

    /**
     * Initializes the optional value {@link MedicationDispense#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.MedicationDispense_Performer>> performer);

    /**
     * Initializes the optional value {@link MedicationDispense#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(java.util.List<com.fhir.Reference> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationDispense#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationDispense#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventHistory(java.util.List<com.fhir.Reference> eventHistory);

    /**
     * Initializes the optional value {@link MedicationDispense#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> eventHistory);

    /**
     * Initializes the optional value {@link MedicationDispense#authorizingPrescription() authorizingPrescription} to authorizingPrescription.
     * @param authorizingPrescription The value for authorizingPrescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authorizingPrescription(java.util.List<com.fhir.Reference> authorizingPrescription);

    /**
     * Initializes the optional value {@link MedicationDispense#authorizingPrescription() authorizingPrescription} to authorizingPrescription.
     * @param authorizingPrescription The value for authorizingPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authorizingPrescription(java.util.Optional<? extends java.util.List<com.fhir.Reference>> authorizingPrescription);

    /**
     * Initializes the optional value {@link MedicationDispense#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosageInstruction(java.util.List<com.fhir.Dosage> dosageInstruction);

    /**
     * Initializes the optional value {@link MedicationDispense#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosageInstruction(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> dosageInstruction);

    /**
     * Initializes the optional value {@link MedicationDispense#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detectedIssue(java.util.List<com.fhir.Reference> detectedIssue);

    /**
     * Initializes the optional value {@link MedicationDispense#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detectedIssue(java.util.Optional<? extends java.util.List<com.fhir.Reference>> detectedIssue);

    /**
     * Initializes the optional value {@link MedicationDispense#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationDispense#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationDispense#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    BuildFinal receiver(java.util.List<com.fhir.Reference> receiver);

    /**
     * Initializes the optional value {@link MedicationDispense#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal receiver(java.util.Optional<? extends java.util.List<com.fhir.Reference>> receiver);

    /**
     * Builds a new {@link MedicationDispense MedicationDispense}.
     * @return An immutable instance of MedicationDispense
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationDispense build();
  }
}
