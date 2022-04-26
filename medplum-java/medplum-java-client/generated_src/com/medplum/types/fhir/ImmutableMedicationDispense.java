package com.medplum.types.fhir;

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
 * Immutable implementation of {@link MedicationDispense}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationDispense.builder()}.
 */
@Generated(from = "MedicationDispense", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationDispense implements MedicationDispense {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference location;
  private final @Nullable CodeableConcept type;
  private final @Nullable Reference subject;
  private final @Nullable List<Dosage> dosageInstruction;
  private final @Nullable MedicationDispense_Substitution substitution;
  private final @Nullable Code status;
  private final String resourceType;
  private final @Nullable List<Reference> receiver;
  private final @Nullable Reference medicationReference;
  private final @Nullable List<Reference> supportingInformation;
  private final @Nullable Id id;
  private final @Nullable List<Extension> extension;
  private final @Nullable DateTime whenPrepared;
  private final @Nullable CodeableConcept category;
  private final @Nullable Quantity quantity;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<Reference> detectedIssue;
  private final @Nullable Meta meta;
  private final @Nullable CodeableConcept medicationCodeableConcept;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<MedicationDispense_Performer> performer;
  private final @Nullable List<Reference> authorizingPrescription;
  private final @Nullable Narrative text;
  private final @Nullable Reference destination;
  private final @Nullable List<Reference> eventHistory;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Reference> partOf;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Quantity daysSupply;
  private final @Nullable Reference statusReasonReference;
  private final @Nullable CodeableConcept statusReasonCodeableConcept;
  private final @Nullable DateTime whenHandedOver;
  private final @Nullable Code language;
  private final @Nullable Reference context;

  private ImmutableMedicationDispense(
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference location,
      @Nullable CodeableConcept type,
      @Nullable Reference subject,
      @Nullable List<Dosage> dosageInstruction,
      @Nullable MedicationDispense_Substitution substitution,
      @Nullable Code status,
      String resourceType,
      @Nullable List<Reference> receiver,
      @Nullable Reference medicationReference,
      @Nullable List<Reference> supportingInformation,
      @Nullable Id id,
      @Nullable List<Extension> extension,
      @Nullable DateTime whenPrepared,
      @Nullable CodeableConcept category,
      @Nullable Quantity quantity,
      @Nullable List<Annotation> note,
      @Nullable List<Reference> detectedIssue,
      @Nullable Meta meta,
      @Nullable CodeableConcept medicationCodeableConcept,
      @Nullable List<ResourceList> contained,
      @Nullable List<MedicationDispense_Performer> performer,
      @Nullable List<Reference> authorizingPrescription,
      @Nullable Narrative text,
      @Nullable Reference destination,
      @Nullable List<Reference> eventHistory,
      @Nullable Uri implicitRules,
      @Nullable List<Reference> partOf,
      @Nullable List<Identifier> identifier,
      @Nullable Quantity daysSupply,
      @Nullable Reference statusReasonReference,
      @Nullable CodeableConcept statusReasonCodeableConcept,
      @Nullable DateTime whenHandedOver,
      @Nullable Code language,
      @Nullable Reference context) {
    this.modifierExtension = modifierExtension;
    this.location = location;
    this.type = type;
    this.subject = subject;
    this.dosageInstruction = dosageInstruction;
    this.substitution = substitution;
    this.status = status;
    this.resourceType = resourceType;
    this.receiver = receiver;
    this.medicationReference = medicationReference;
    this.supportingInformation = supportingInformation;
    this.id = id;
    this.extension = extension;
    this.whenPrepared = whenPrepared;
    this.category = category;
    this.quantity = quantity;
    this.note = note;
    this.detectedIssue = detectedIssue;
    this.meta = meta;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.contained = contained;
    this.performer = performer;
    this.authorizingPrescription = authorizingPrescription;
    this.text = text;
    this.destination = destination;
    this.eventHistory = eventHistory;
    this.implicitRules = implicitRules;
    this.partOf = partOf;
    this.identifier = identifier;
    this.daysSupply = daysSupply;
    this.statusReasonReference = statusReasonReference;
    this.statusReasonCodeableConcept = statusReasonCodeableConcept;
    this.whenHandedOver = whenHandedOver;
    this.language = language;
    this.context = context;
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
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code substitution} attribute
   */
  @JsonProperty("substitution")
  @Override
  public Optional<MedicationDispense_Substitution> substitution() {
    return Optional.ofNullable(substitution);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code receiver} attribute
   */
  @JsonProperty("receiver")
  @Override
  public Optional<List<Reference>> receiver() {
    return Optional.ofNullable(receiver);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code whenPrepared} attribute
   */
  @JsonProperty("whenPrepared")
  @Override
  public Optional<DateTime> whenPrepared() {
    return Optional.ofNullable(whenPrepared);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
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
   * @return The value of the {@code detectedIssue} attribute
   */
  @JsonProperty("detectedIssue")
  @Override
  public Optional<List<Reference>> detectedIssue() {
    return Optional.ofNullable(detectedIssue);
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
   * @return The value of the {@code medicationCodeableConcept} attribute
   */
  @JsonProperty("medicationCodeableConcept")
  @Override
  public Optional<CodeableConcept> medicationCodeableConcept() {
    return Optional.ofNullable(medicationCodeableConcept);
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
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<List<MedicationDispense_Performer>> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code authorizingPrescription} attribute
   */
  @JsonProperty("authorizingPrescription")
  @Override
  public Optional<List<Reference>> authorizingPrescription() {
    return Optional.ofNullable(authorizingPrescription);
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
   * @return The value of the {@code destination} attribute
   */
  @JsonProperty("destination")
  @Override
  public Optional<Reference> destination() {
    return Optional.ofNullable(destination);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Reference>> partOf() {
    return Optional.ofNullable(partOf);
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
   * @return The value of the {@code daysSupply} attribute
   */
  @JsonProperty("daysSupply")
  @Override
  public Optional<Quantity> daysSupply() {
    return Optional.ofNullable(daysSupply);
  }

  /**
   * @return The value of the {@code statusReasonReference} attribute
   */
  @JsonProperty("statusReasonReference")
  @Override
  public Optional<Reference> statusReasonReference() {
    return Optional.ofNullable(statusReasonReference);
  }

  /**
   * @return The value of the {@code statusReasonCodeableConcept} attribute
   */
  @JsonProperty("statusReasonCodeableConcept")
  @Override
  public Optional<CodeableConcept> statusReasonCodeableConcept() {
    return Optional.ofNullable(statusReasonCodeableConcept);
  }

  /**
   * @return The value of the {@code whenHandedOver} attribute
   */
  @JsonProperty("whenHandedOver")
  @Override
  public Optional<DateTime> whenHandedOver() {
    return Optional.ofNullable(whenHandedOver);
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
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<Reference> context() {
    return Optional.ofNullable(context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationDispense(
        newValue,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationDispense(
        value,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        newValue,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        value,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        newValue,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        value,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        newValue,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        value,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#dosageInstruction() dosageInstruction} attribute.
   * @param value The value for dosageInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withDosageInstruction(List<Dosage> value) {
    @Nullable List<Dosage> newValue = Objects.requireNonNull(value, "dosageInstruction");
    if (this.dosageInstruction == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        newValue,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#dosageInstruction() dosageInstruction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosageInstruction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withDosageInstruction(Optional<? extends List<Dosage>> optional) {
    @Nullable List<Dosage> value = optional.orElse(null);
    if (this.dosageInstruction == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        value,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#substitution() substitution} attribute.
   * @param value The value for substitution
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withSubstitution(MedicationDispense_Substitution value) {
    @Nullable MedicationDispense_Substitution newValue = Objects.requireNonNull(value, "substitution");
    if (this.substitution == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        newValue,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#substitution() substitution} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substitution
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withSubstitution(Optional<? extends MedicationDispense_Substitution> optional) {
    @Nullable MedicationDispense_Substitution value = optional.orElse(null);
    if (this.substitution == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        value,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        newValue,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        value,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationDispense#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationDispense withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        newValue,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#receiver() receiver} attribute.
   * @param value The value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withReceiver(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "receiver");
    if (this.receiver == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        newValue,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#receiver() receiver} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiver
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withReceiver(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.receiver == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        value,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withMedicationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        newValue,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withMedicationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        value,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withSupportingInformation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        newValue,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withSupportingInformation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        value,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        newValue,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        value,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        newValue,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        value,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#whenPrepared() whenPrepared} attribute.
   * @param value The value for whenPrepared
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withWhenPrepared(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "whenPrepared");
    if (this.whenPrepared == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        newValue,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#whenPrepared() whenPrepared} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for whenPrepared
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withWhenPrepared(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.whenPrepared == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        value,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        newValue,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        value,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        newValue,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        value,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        newValue,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        value,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#detectedIssue() detectedIssue} attribute.
   * @param value The value for detectedIssue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withDetectedIssue(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "detectedIssue");
    if (this.detectedIssue == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        newValue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#detectedIssue() detectedIssue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detectedIssue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withDetectedIssue(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.detectedIssue == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        value,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        newValue,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        value,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withMedicationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        newValue,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withMedicationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        value,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        newValue,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        value,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withPerformer(List<MedicationDispense_Performer> value) {
    @Nullable List<MedicationDispense_Performer> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        newValue,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withPerformer(Optional<? extends List<MedicationDispense_Performer>> optional) {
    @Nullable List<MedicationDispense_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        value,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#authorizingPrescription() authorizingPrescription} attribute.
   * @param value The value for authorizingPrescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withAuthorizingPrescription(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "authorizingPrescription");
    if (this.authorizingPrescription == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        newValue,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#authorizingPrescription() authorizingPrescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorizingPrescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withAuthorizingPrescription(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.authorizingPrescription == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        value,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        newValue,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        value,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withDestination(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "destination");
    if (this.destination == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        newValue,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#destination() destination} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withDestination(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.destination == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        value,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#eventHistory() eventHistory} attribute.
   * @param value The value for eventHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withEventHistory(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "eventHistory");
    if (this.eventHistory == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        newValue,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#eventHistory() eventHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withEventHistory(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.eventHistory == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        value,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        newValue,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        value,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        newValue,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        value,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        newValue,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        value,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#daysSupply() daysSupply} attribute.
   * @param value The value for daysSupply
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withDaysSupply(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "daysSupply");
    if (this.daysSupply == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        newValue,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#daysSupply() daysSupply} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for daysSupply
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withDaysSupply(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.daysSupply == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        value,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#statusReasonReference() statusReasonReference} attribute.
   * @param value The value for statusReasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withStatusReasonReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "statusReasonReference");
    if (this.statusReasonReference == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        newValue,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#statusReasonReference() statusReasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withStatusReasonReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.statusReasonReference == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        value,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} attribute.
   * @param value The value for statusReasonCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withStatusReasonCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReasonCodeableConcept");
    if (this.statusReasonCodeableConcept == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        newValue,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReasonCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withStatusReasonCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReasonCodeableConcept == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        value,
        this.whenHandedOver,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#whenHandedOver() whenHandedOver} attribute.
   * @param value The value for whenHandedOver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withWhenHandedOver(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "whenHandedOver");
    if (this.whenHandedOver == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        newValue,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#whenHandedOver() whenHandedOver} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for whenHandedOver
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withWhenHandedOver(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.whenHandedOver == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        value,
        this.language,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        newValue,
        this.context);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        value,
        this.context);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense withContext(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense withContext(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableMedicationDispense(
        this.modifierExtension,
        this.location,
        this.type,
        this.subject,
        this.dosageInstruction,
        this.substitution,
        this.status,
        this.resourceType,
        this.receiver,
        this.medicationReference,
        this.supportingInformation,
        this.id,
        this.extension,
        this.whenPrepared,
        this.category,
        this.quantity,
        this.note,
        this.detectedIssue,
        this.meta,
        this.medicationCodeableConcept,
        this.contained,
        this.performer,
        this.authorizingPrescription,
        this.text,
        this.destination,
        this.eventHistory,
        this.implicitRules,
        this.partOf,
        this.identifier,
        this.daysSupply,
        this.statusReasonReference,
        this.statusReasonCodeableConcept,
        this.whenHandedOver,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationDispense} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationDispense
        && equalTo((ImmutableMedicationDispense) another);
  }

  private boolean equalTo(ImmutableMedicationDispense another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(location, another.location)
        && Objects.equals(type, another.type)
        && Objects.equals(subject, another.subject)
        && Objects.equals(dosageInstruction, another.dosageInstruction)
        && Objects.equals(substitution, another.substitution)
        && Objects.equals(status, another.status)
        && resourceType.equals(another.resourceType)
        && Objects.equals(receiver, another.receiver)
        && Objects.equals(medicationReference, another.medicationReference)
        && Objects.equals(supportingInformation, another.supportingInformation)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(whenPrepared, another.whenPrepared)
        && Objects.equals(category, another.category)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(note, another.note)
        && Objects.equals(detectedIssue, another.detectedIssue)
        && Objects.equals(meta, another.meta)
        && Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && Objects.equals(contained, another.contained)
        && Objects.equals(performer, another.performer)
        && Objects.equals(authorizingPrescription, another.authorizingPrescription)
        && Objects.equals(text, another.text)
        && Objects.equals(destination, another.destination)
        && Objects.equals(eventHistory, another.eventHistory)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(daysSupply, another.daysSupply)
        && Objects.equals(statusReasonReference, another.statusReasonReference)
        && Objects.equals(statusReasonCodeableConcept, another.statusReasonCodeableConcept)
        && Objects.equals(whenHandedOver, another.whenHandedOver)
        && Objects.equals(language, another.language)
        && Objects.equals(context, another.context);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code location}, {@code type}, {@code subject}, {@code dosageInstruction}, {@code substitution}, {@code status}, {@code resourceType}, {@code receiver}, {@code medicationReference}, {@code supportingInformation}, {@code id}, {@code extension}, {@code whenPrepared}, {@code category}, {@code quantity}, {@code note}, {@code detectedIssue}, {@code meta}, {@code medicationCodeableConcept}, {@code contained}, {@code performer}, {@code authorizingPrescription}, {@code text}, {@code destination}, {@code eventHistory}, {@code implicitRules}, {@code partOf}, {@code identifier}, {@code daysSupply}, {@code statusReasonReference}, {@code statusReasonCodeableConcept}, {@code whenHandedOver}, {@code language}, {@code context}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(dosageInstruction);
    h += (h << 5) + Objects.hashCode(substitution);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(receiver);
    h += (h << 5) + Objects.hashCode(medicationReference);
    h += (h << 5) + Objects.hashCode(supportingInformation);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(whenPrepared);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(detectedIssue);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(authorizingPrescription);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(destination);
    h += (h << 5) + Objects.hashCode(eventHistory);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(daysSupply);
    h += (h << 5) + Objects.hashCode(statusReasonReference);
    h += (h << 5) + Objects.hashCode(statusReasonCodeableConcept);
    h += (h << 5) + Objects.hashCode(whenHandedOver);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(context);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationDispense} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationDispense{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (location != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (type != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (subject != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (dosageInstruction != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("dosageInstruction=").append(dosageInstruction);
    }
    if (substitution != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("substitution=").append(substitution);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (receiver != null) {
      builder.append(", ");
      builder.append("receiver=").append(receiver);
    }
    if (medicationReference != null) {
      builder.append(", ");
      builder.append("medicationReference=").append(medicationReference);
    }
    if (supportingInformation != null) {
      builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (whenPrepared != null) {
      builder.append(", ");
      builder.append("whenPrepared=").append(whenPrepared);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (detectedIssue != null) {
      builder.append(", ");
      builder.append("detectedIssue=").append(detectedIssue);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (medicationCodeableConcept != null) {
      builder.append(", ");
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (authorizingPrescription != null) {
      builder.append(", ");
      builder.append("authorizingPrescription=").append(authorizingPrescription);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (destination != null) {
      builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (eventHistory != null) {
      builder.append(", ");
      builder.append("eventHistory=").append(eventHistory);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (daysSupply != null) {
      builder.append(", ");
      builder.append("daysSupply=").append(daysSupply);
    }
    if (statusReasonReference != null) {
      builder.append(", ");
      builder.append("statusReasonReference=").append(statusReasonReference);
    }
    if (statusReasonCodeableConcept != null) {
      builder.append(", ");
      builder.append("statusReasonCodeableConcept=").append(statusReasonCodeableConcept);
    }
    if (whenHandedOver != null) {
      builder.append(", ");
      builder.append("whenHandedOver=").append(whenHandedOver);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationDispense", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationDispense {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<Dosage>> dosageInstruction = Optional.empty();
    boolean dosageInstructionIsSet;
    @Nullable Optional<MedicationDispense_Substitution> substitution = Optional.empty();
    boolean substitutionIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Reference>> receiver = Optional.empty();
    boolean receiverIsSet;
    @Nullable Optional<Reference> medicationReference = Optional.empty();
    boolean medicationReferenceIsSet;
    @Nullable Optional<List<Reference>> supportingInformation = Optional.empty();
    boolean supportingInformationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DateTime> whenPrepared = Optional.empty();
    boolean whenPreparedIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<Reference>> detectedIssue = Optional.empty();
    boolean detectedIssueIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<CodeableConcept> medicationCodeableConcept = Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<MedicationDispense_Performer>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<List<Reference>> authorizingPrescription = Optional.empty();
    boolean authorizingPrescriptionIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> destination = Optional.empty();
    boolean destinationIsSet;
    @Nullable Optional<List<Reference>> eventHistory = Optional.empty();
    boolean eventHistoryIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Quantity> daysSupply = Optional.empty();
    boolean daysSupplyIsSet;
    @Nullable Optional<Reference> statusReasonReference = Optional.empty();
    boolean statusReasonReferenceIsSet;
    @Nullable Optional<CodeableConcept> statusReasonCodeableConcept = Optional.empty();
    boolean statusReasonCodeableConceptIsSet;
    @Nullable Optional<DateTime> whenHandedOver = Optional.empty();
    boolean whenHandedOverIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Reference> context = Optional.empty();
    boolean contextIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("dosageInstruction")
    public void setDosageInstruction(Optional<List<Dosage>> dosageInstruction) {
      this.dosageInstruction = dosageInstruction;
      this.dosageInstructionIsSet = true;
    }
    @JsonProperty("substitution")
    public void setSubstitution(Optional<MedicationDispense_Substitution> substitution) {
      this.substitution = substitution;
      this.substitutionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("receiver")
    public void setReceiver(Optional<List<Reference>> receiver) {
      this.receiver = receiver;
      this.receiverIsSet = true;
    }
    @JsonProperty("medicationReference")
    public void setMedicationReference(Optional<Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("whenPrepared")
    public void setWhenPrepared(Optional<DateTime> whenPrepared) {
      this.whenPrepared = whenPrepared;
      this.whenPreparedIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("detectedIssue")
    public void setDetectedIssue(Optional<List<Reference>> detectedIssue) {
      this.detectedIssue = detectedIssue;
      this.detectedIssueIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(Optional<CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<MedicationDispense_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("authorizingPrescription")
    public void setAuthorizingPrescription(Optional<List<Reference>> authorizingPrescription) {
      this.authorizingPrescription = authorizingPrescription;
      this.authorizingPrescriptionIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("destination")
    public void setDestination(Optional<Reference> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @JsonProperty("eventHistory")
    public void setEventHistory(Optional<List<Reference>> eventHistory) {
      this.eventHistory = eventHistory;
      this.eventHistoryIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("daysSupply")
    public void setDaysSupply(Optional<Quantity> daysSupply) {
      this.daysSupply = daysSupply;
      this.daysSupplyIsSet = true;
    }
    @JsonProperty("statusReasonReference")
    public void setStatusReasonReference(Optional<Reference> statusReasonReference) {
      this.statusReasonReference = statusReasonReference;
      this.statusReasonReferenceIsSet = true;
    }
    @JsonProperty("statusReasonCodeableConcept")
    public void setStatusReasonCodeableConcept(Optional<CodeableConcept> statusReasonCodeableConcept) {
      this.statusReasonCodeableConcept = statusReasonCodeableConcept;
      this.statusReasonCodeableConceptIsSet = true;
    }
    @JsonProperty("whenHandedOver")
    public void setWhenHandedOver(Optional<DateTime> whenHandedOver) {
      this.whenHandedOver = whenHandedOver;
      this.whenHandedOverIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<Reference> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Dosage>> dosageInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicationDispense_Substitution> substitution() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> receiver() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> whenPrepared() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> detectedIssue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationDispense_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> authorizingPrescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> destination() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> eventHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> daysSupply() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> statusReasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReasonCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> whenHandedOver() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> context() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationDispense fromJson(Json json) {
    ImmutableMedicationDispense.Builder builder = ((ImmutableMedicationDispense.Builder) ImmutableMedicationDispense.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.dosageInstructionIsSet) {
      builder.dosageInstruction(json.dosageInstruction);
    }
    if (json.substitutionIsSet) {
      builder.substitution(json.substitution);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.receiverIsSet) {
      builder.receiver(json.receiver);
    }
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.whenPreparedIsSet) {
      builder.whenPrepared(json.whenPrepared);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.detectedIssueIsSet) {
      builder.detectedIssue(json.detectedIssue);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.authorizingPrescriptionIsSet) {
      builder.authorizingPrescription(json.authorizingPrescription);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.eventHistoryIsSet) {
      builder.eventHistory(json.eventHistory);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.daysSupplyIsSet) {
      builder.daysSupply(json.daysSupply);
    }
    if (json.statusReasonReferenceIsSet) {
      builder.statusReasonReference(json.statusReasonReference);
    }
    if (json.statusReasonCodeableConceptIsSet) {
      builder.statusReasonCodeableConcept(json.statusReasonCodeableConcept);
    }
    if (json.whenHandedOverIsSet) {
      builder.whenHandedOver(json.whenHandedOver);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
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
        .modifierExtension(instance.modifierExtension())
        .location(instance.location())
        .type(instance.type())
        .subject(instance.subject())
        .dosageInstruction(instance.dosageInstruction())
        .substitution(instance.substitution())
        .status(instance.status())
        .resourceType(instance.resourceType())
        .receiver(instance.receiver())
        .medicationReference(instance.medicationReference())
        .supportingInformation(instance.supportingInformation())
        .id(instance.id())
        .extension(instance.extension())
        .whenPrepared(instance.whenPrepared())
        .category(instance.category())
        .quantity(instance.quantity())
        .note(instance.note())
        .detectedIssue(instance.detectedIssue())
        .meta(instance.meta())
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .contained(instance.contained())
        .performer(instance.performer())
        .authorizingPrescription(instance.authorizingPrescription())
        .text(instance.text())
        .destination(instance.destination())
        .eventHistory(instance.eventHistory())
        .implicitRules(instance.implicitRules())
        .partOf(instance.partOf())
        .identifier(instance.identifier())
        .daysSupply(instance.daysSupply())
        .statusReasonReference(instance.statusReasonReference())
        .statusReasonCodeableConcept(instance.statusReasonCodeableConcept())
        .whenHandedOver(instance.whenHandedOver())
        .language(instance.language())
        .context(instance.context())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationDispense MedicationDispense}.
   * <pre>
   * ImmutableMedicationDispense.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationDispense#modifierExtension() modifierExtension}
   *    .location(com.medplum.types.fhir.Reference) // optional {@link MedicationDispense#location() location}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationDispense#type() type}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link MedicationDispense#subject() subject}
   *    .dosageInstruction(List&amp;lt;com.medplum.types.fhir.Dosage&amp;gt;) // optional {@link MedicationDispense#dosageInstruction() dosageInstruction}
   *    .substitution(com.medplum.types.fhir.MedicationDispense_Substitution) // optional {@link MedicationDispense#substitution() substitution}
   *    .status(com.medplum.types.fhir.Code) // optional {@link MedicationDispense#status() status}
   *    .resourceType(String) // required {@link MedicationDispense#resourceType() resourceType}
   *    .receiver(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#receiver() receiver}
   *    .medicationReference(com.medplum.types.fhir.Reference) // optional {@link MedicationDispense#medicationReference() medicationReference}
   *    .supportingInformation(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#supportingInformation() supportingInformation}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicationDispense#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationDispense#extension() extension}
   *    .whenPrepared(com.medplum.types.fhir.DateTime) // optional {@link MedicationDispense#whenPrepared() whenPrepared}
   *    .category(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationDispense#category() category}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link MedicationDispense#quantity() quantity}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link MedicationDispense#note() note}
   *    .detectedIssue(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#detectedIssue() detectedIssue}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicationDispense#meta() meta}
   *    .medicationCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicationDispense#contained() contained}
   *    .performer(List&amp;lt;com.medplum.types.fhir.MedicationDispense_Performer&amp;gt;) // optional {@link MedicationDispense#performer() performer}
   *    .authorizingPrescription(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#authorizingPrescription() authorizingPrescription}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicationDispense#text() text}
   *    .destination(com.medplum.types.fhir.Reference) // optional {@link MedicationDispense#destination() destination}
   *    .eventHistory(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#eventHistory() eventHistory}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicationDispense#implicitRules() implicitRules}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationDispense#partOf() partOf}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MedicationDispense#identifier() identifier}
   *    .daysSupply(com.medplum.types.fhir.Quantity) // optional {@link MedicationDispense#daysSupply() daysSupply}
   *    .statusReasonReference(com.medplum.types.fhir.Reference) // optional {@link MedicationDispense#statusReasonReference() statusReasonReference}
   *    .statusReasonCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept}
   *    .whenHandedOver(com.medplum.types.fhir.DateTime) // optional {@link MedicationDispense#whenHandedOver() whenHandedOver}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicationDispense#language() language}
   *    .context(com.medplum.types.fhir.Reference) // optional {@link MedicationDispense#context() context}
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
  @Generated(from = "MedicationDispense", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_LOCATION = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_SUBJECT = 0x8L;
    private static final long OPT_BIT_DOSAGE_INSTRUCTION = 0x10L;
    private static final long OPT_BIT_SUBSTITUTION = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_RECEIVER = 0x80L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x100L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_WHEN_PREPARED = 0x1000L;
    private static final long OPT_BIT_CATEGORY = 0x2000L;
    private static final long OPT_BIT_QUANTITY = 0x4000L;
    private static final long OPT_BIT_NOTE = 0x8000L;
    private static final long OPT_BIT_DETECTED_ISSUE = 0x10000L;
    private static final long OPT_BIT_META = 0x20000L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x40000L;
    private static final long OPT_BIT_CONTAINED = 0x80000L;
    private static final long OPT_BIT_PERFORMER = 0x100000L;
    private static final long OPT_BIT_AUTHORIZING_PRESCRIPTION = 0x200000L;
    private static final long OPT_BIT_TEXT = 0x400000L;
    private static final long OPT_BIT_DESTINATION = 0x800000L;
    private static final long OPT_BIT_EVENT_HISTORY = 0x1000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000000L;
    private static final long OPT_BIT_PART_OF = 0x4000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000000L;
    private static final long OPT_BIT_DAYS_SUPPLY = 0x10000000L;
    private static final long OPT_BIT_STATUS_REASON_REFERENCE = 0x20000000L;
    private static final long OPT_BIT_STATUS_REASON_CODEABLE_CONCEPT = 0x40000000L;
    private static final long OPT_BIT_WHEN_HANDED_OVER = 0x80000000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000000L;
    private static final long OPT_BIT_CONTEXT = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference location;
    private @Nullable CodeableConcept type;
    private @Nullable Reference subject;
    private @Nullable List<Dosage> dosageInstruction;
    private @Nullable MedicationDispense_Substitution substitution;
    private @Nullable Code status;
    private @Nullable String resourceType;
    private @Nullable List<Reference> receiver;
    private @Nullable Reference medicationReference;
    private @Nullable List<Reference> supportingInformation;
    private @Nullable Id id;
    private @Nullable List<Extension> extension;
    private @Nullable DateTime whenPrepared;
    private @Nullable CodeableConcept category;
    private @Nullable Quantity quantity;
    private @Nullable List<Annotation> note;
    private @Nullable List<Reference> detectedIssue;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept medicationCodeableConcept;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<MedicationDispense_Performer> performer;
    private @Nullable List<Reference> authorizingPrescription;
    private @Nullable Narrative text;
    private @Nullable Reference destination;
    private @Nullable List<Reference> eventHistory;
    private @Nullable Uri implicitRules;
    private @Nullable List<Reference> partOf;
    private @Nullable List<Identifier> identifier;
    private @Nullable Quantity daysSupply;
    private @Nullable Reference statusReasonReference;
    private @Nullable CodeableConcept statusReasonCodeableConcept;
    private @Nullable DateTime whenHandedOver;
    private @Nullable Code language;
    private @Nullable Reference context;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationDispense#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationDispense#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationDispense#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#dosageInstruction() dosageInstruction} to dosageInstruction.
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
     * Initializes the optional value {@link MedicationDispense#dosageInstruction() dosageInstruction} to dosageInstruction.
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
     * Initializes the optional value {@link MedicationDispense#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    public final Builder substitution(MedicationDispense_Substitution substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = Objects.requireNonNull(substitution, "substitution");
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substitution")
    public final Builder substitution(Optional<? extends MedicationDispense_Substitution> substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = substitution.orElse(null);
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#status() status} to status.
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
     * Initializes the optional value {@link MedicationDispense#status() status} to status.
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
     * Initializes the value for the {@link MedicationDispense#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicationDispense#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    public final Builder receiver(List<Reference> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = Objects.requireNonNull(receiver, "receiver");
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("receiver")
    public final Builder receiver(Optional<? extends List<Reference>> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = receiver.orElse(null);
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationDispense#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationDispense#supportingInformation() supportingInformation} to supportingInformation.
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
     * Initializes the optional value {@link MedicationDispense#supportingInformation() supportingInformation} to supportingInformation.
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
     * Initializes the optional value {@link MedicationDispense#id() id} to id.
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
     * Initializes the optional value {@link MedicationDispense#id() id} to id.
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
     * Initializes the optional value {@link MedicationDispense#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationDispense#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationDispense#whenPrepared() whenPrepared} to whenPrepared.
     * @param whenPrepared The value for whenPrepared
     * @return {@code this} builder for chained invocation
     */
    public final Builder whenPrepared(DateTime whenPrepared) {
      checkNotIsSet(whenPreparedIsSet(), "whenPrepared");
      this.whenPrepared = Objects.requireNonNull(whenPrepared, "whenPrepared");
      optBits |= OPT_BIT_WHEN_PREPARED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#whenPrepared() whenPrepared} to whenPrepared.
     * @param whenPrepared The value for whenPrepared
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("whenPrepared")
    public final Builder whenPrepared(Optional<? extends DateTime> whenPrepared) {
      checkNotIsSet(whenPreparedIsSet(), "whenPrepared");
      this.whenPrepared = whenPrepared.orElse(null);
      optBits |= OPT_BIT_WHEN_PREPARED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#note() note} to note.
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
     * Initializes the optional value {@link MedicationDispense#note() note} to note.
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
     * Initializes the optional value {@link MedicationDispense#detectedIssue() detectedIssue} to detectedIssue.
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
     * Initializes the optional value {@link MedicationDispense#detectedIssue() detectedIssue} to detectedIssue.
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
     * Initializes the optional value {@link MedicationDispense#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationDispense#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationDispense#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationDispense#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationDispense#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<MedicationDispense_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<MedicationDispense_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#authorizingPrescription() authorizingPrescription} to authorizingPrescription.
     * @param authorizingPrescription The value for authorizingPrescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorizingPrescription(List<Reference> authorizingPrescription) {
      checkNotIsSet(authorizingPrescriptionIsSet(), "authorizingPrescription");
      this.authorizingPrescription = Objects.requireNonNull(authorizingPrescription, "authorizingPrescription");
      optBits |= OPT_BIT_AUTHORIZING_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#authorizingPrescription() authorizingPrescription} to authorizingPrescription.
     * @param authorizingPrescription The value for authorizingPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authorizingPrescription")
    public final Builder authorizingPrescription(Optional<? extends List<Reference>> authorizingPrescription) {
      checkNotIsSet(authorizingPrescriptionIsSet(), "authorizingPrescription");
      this.authorizingPrescription = authorizingPrescription.orElse(null);
      optBits |= OPT_BIT_AUTHORIZING_PRESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#text() text} to text.
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
     * Initializes the optional value {@link MedicationDispense#text() text} to text.
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
     * Initializes the optional value {@link MedicationDispense#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(Reference destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = Objects.requireNonNull(destination, "destination");
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("destination")
    public final Builder destination(Optional<? extends Reference> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#eventHistory() eventHistory} to eventHistory.
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
     * Initializes the optional value {@link MedicationDispense#eventHistory() eventHistory} to eventHistory.
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
     * Initializes the optional value {@link MedicationDispense#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationDispense#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationDispense#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(List<Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends List<Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationDispense#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationDispense#daysSupply() daysSupply} to daysSupply.
     * @param daysSupply The value for daysSupply
     * @return {@code this} builder for chained invocation
     */
    public final Builder daysSupply(Quantity daysSupply) {
      checkNotIsSet(daysSupplyIsSet(), "daysSupply");
      this.daysSupply = Objects.requireNonNull(daysSupply, "daysSupply");
      optBits |= OPT_BIT_DAYS_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#daysSupply() daysSupply} to daysSupply.
     * @param daysSupply The value for daysSupply
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("daysSupply")
    public final Builder daysSupply(Optional<? extends Quantity> daysSupply) {
      checkNotIsSet(daysSupplyIsSet(), "daysSupply");
      this.daysSupply = daysSupply.orElse(null);
      optBits |= OPT_BIT_DAYS_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonReference() statusReasonReference} to statusReasonReference.
     * @param statusReasonReference The value for statusReasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReasonReference(Reference statusReasonReference) {
      checkNotIsSet(statusReasonReferenceIsSet(), "statusReasonReference");
      this.statusReasonReference = Objects.requireNonNull(statusReasonReference, "statusReasonReference");
      optBits |= OPT_BIT_STATUS_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonReference() statusReasonReference} to statusReasonReference.
     * @param statusReasonReference The value for statusReasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReasonReference")
    public final Builder statusReasonReference(Optional<? extends Reference> statusReasonReference) {
      checkNotIsSet(statusReasonReferenceIsSet(), "statusReasonReference");
      this.statusReasonReference = statusReasonReference.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} to statusReasonCodeableConcept.
     * @param statusReasonCodeableConcept The value for statusReasonCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReasonCodeableConcept(CodeableConcept statusReasonCodeableConcept) {
      checkNotIsSet(statusReasonCodeableConceptIsSet(), "statusReasonCodeableConcept");
      this.statusReasonCodeableConcept = Objects.requireNonNull(statusReasonCodeableConcept, "statusReasonCodeableConcept");
      optBits |= OPT_BIT_STATUS_REASON_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} to statusReasonCodeableConcept.
     * @param statusReasonCodeableConcept The value for statusReasonCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReasonCodeableConcept")
    public final Builder statusReasonCodeableConcept(Optional<? extends CodeableConcept> statusReasonCodeableConcept) {
      checkNotIsSet(statusReasonCodeableConceptIsSet(), "statusReasonCodeableConcept");
      this.statusReasonCodeableConcept = statusReasonCodeableConcept.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#whenHandedOver() whenHandedOver} to whenHandedOver.
     * @param whenHandedOver The value for whenHandedOver
     * @return {@code this} builder for chained invocation
     */
    public final Builder whenHandedOver(DateTime whenHandedOver) {
      checkNotIsSet(whenHandedOverIsSet(), "whenHandedOver");
      this.whenHandedOver = Objects.requireNonNull(whenHandedOver, "whenHandedOver");
      optBits |= OPT_BIT_WHEN_HANDED_OVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#whenHandedOver() whenHandedOver} to whenHandedOver.
     * @param whenHandedOver The value for whenHandedOver
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("whenHandedOver")
    public final Builder whenHandedOver(Optional<? extends DateTime> whenHandedOver) {
      checkNotIsSet(whenHandedOverIsSet(), "whenHandedOver");
      this.whenHandedOver = whenHandedOver.orElse(null);
      optBits |= OPT_BIT_WHEN_HANDED_OVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#language() language} to language.
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
     * Initializes the optional value {@link MedicationDispense#language() language} to language.
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
     * Initializes the optional value {@link MedicationDispense#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(Reference context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends Reference> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Builds a new {@link MedicationDispense MedicationDispense}.
     * @return An immutable instance of MedicationDispense
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationDispense build() {
      checkRequiredAttributes();
      return new ImmutableMedicationDispense(
          modifierExtension,
          location,
          type,
          subject,
          dosageInstruction,
          substitution,
          status,
          resourceType,
          receiver,
          medicationReference,
          supportingInformation,
          id,
          extension,
          whenPrepared,
          category,
          quantity,
          note,
          detectedIssue,
          meta,
          medicationCodeableConcept,
          contained,
          performer,
          authorizingPrescription,
          text,
          destination,
          eventHistory,
          implicitRules,
          partOf,
          identifier,
          daysSupply,
          statusReasonReference,
          statusReasonCodeableConcept,
          whenHandedOver,
          language,
          context);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean dosageInstructionIsSet() {
      return (optBits & OPT_BIT_DOSAGE_INSTRUCTION) != 0;
    }

    private boolean substitutionIsSet() {
      return (optBits & OPT_BIT_SUBSTITUTION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean receiverIsSet() {
      return (optBits & OPT_BIT_RECEIVER) != 0;
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean whenPreparedIsSet() {
      return (optBits & OPT_BIT_WHEN_PREPARED) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean detectedIssueIsSet() {
      return (optBits & OPT_BIT_DETECTED_ISSUE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean authorizingPrescriptionIsSet() {
      return (optBits & OPT_BIT_AUTHORIZING_PRESCRIPTION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean eventHistoryIsSet() {
      return (optBits & OPT_BIT_EVENT_HISTORY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean daysSupplyIsSet() {
      return (optBits & OPT_BIT_DAYS_SUPPLY) != 0;
    }

    private boolean statusReasonReferenceIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON_REFERENCE) != 0;
    }

    private boolean statusReasonCodeableConceptIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON_CODEABLE_CONCEPT) != 0;
    }

    private boolean whenHandedOverIsSet() {
      return (optBits & OPT_BIT_WHEN_HANDED_OVER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationDispense is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicationDispense, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationDispense", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationDispense#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicationDispense", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationDispense#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationDispense#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationDispense#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link MedicationDispense#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link MedicationDispense#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link MedicationDispense#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link MedicationDispense#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link MedicationDispense#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link MedicationDispense#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosageInstruction(List<Dosage> dosageInstruction);

    /**
     * Initializes the optional value {@link MedicationDispense#dosageInstruction() dosageInstruction} to dosageInstruction.
     * @param dosageInstruction The value for dosageInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosageInstruction(Optional<? extends List<Dosage>> dosageInstruction);

    /**
     * Initializes the optional value {@link MedicationDispense#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    BuildFinal substitution(MedicationDispense_Substitution substitution);

    /**
     * Initializes the optional value {@link MedicationDispense#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substitution(Optional<? extends MedicationDispense_Substitution> substitution);

    /**
     * Initializes the optional value {@link MedicationDispense#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link MedicationDispense#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link MedicationDispense#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    BuildFinal receiver(List<Reference> receiver);

    /**
     * Initializes the optional value {@link MedicationDispense#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal receiver(Optional<? extends List<Reference>> receiver);

    /**
     * Initializes the optional value {@link MedicationDispense#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicationDispense#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(Optional<? extends Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicationDispense#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(List<Reference> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationDispense#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(Optional<? extends List<Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationDispense#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicationDispense#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicationDispense#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationDispense#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationDispense#whenPrepared() whenPrepared} to whenPrepared.
     * @param whenPrepared The value for whenPrepared
     * @return {@code this} builder for chained invocation
     */
    BuildFinal whenPrepared(DateTime whenPrepared);

    /**
     * Initializes the optional value {@link MedicationDispense#whenPrepared() whenPrepared} to whenPrepared.
     * @param whenPrepared The value for whenPrepared
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal whenPrepared(Optional<? extends DateTime> whenPrepared);

    /**
     * Initializes the optional value {@link MedicationDispense#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link MedicationDispense#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link MedicationDispense#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link MedicationDispense#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link MedicationDispense#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link MedicationDispense#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link MedicationDispense#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detectedIssue(List<Reference> detectedIssue);

    /**
     * Initializes the optional value {@link MedicationDispense#detectedIssue() detectedIssue} to detectedIssue.
     * @param detectedIssue The value for detectedIssue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detectedIssue(Optional<? extends List<Reference>> detectedIssue);

    /**
     * Initializes the optional value {@link MedicationDispense#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicationDispense#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationDispense#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(Optional<? extends CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationDispense#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationDispense#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationDispense#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<MedicationDispense_Performer> performer);

    /**
     * Initializes the optional value {@link MedicationDispense#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<MedicationDispense_Performer>> performer);

    /**
     * Initializes the optional value {@link MedicationDispense#authorizingPrescription() authorizingPrescription} to authorizingPrescription.
     * @param authorizingPrescription The value for authorizingPrescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authorizingPrescription(List<Reference> authorizingPrescription);

    /**
     * Initializes the optional value {@link MedicationDispense#authorizingPrescription() authorizingPrescription} to authorizingPrescription.
     * @param authorizingPrescription The value for authorizingPrescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authorizingPrescription(Optional<? extends List<Reference>> authorizingPrescription);

    /**
     * Initializes the optional value {@link MedicationDispense#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicationDispense#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicationDispense#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(Reference destination);

    /**
     * Initializes the optional value {@link MedicationDispense#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(Optional<? extends Reference> destination);

    /**
     * Initializes the optional value {@link MedicationDispense#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventHistory(List<Reference> eventHistory);

    /**
     * Initializes the optional value {@link MedicationDispense#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventHistory(Optional<? extends List<Reference>> eventHistory);

    /**
     * Initializes the optional value {@link MedicationDispense#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationDispense#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationDispense#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link MedicationDispense#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link MedicationDispense#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicationDispense#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicationDispense#daysSupply() daysSupply} to daysSupply.
     * @param daysSupply The value for daysSupply
     * @return {@code this} builder for chained invocation
     */
    BuildFinal daysSupply(Quantity daysSupply);

    /**
     * Initializes the optional value {@link MedicationDispense#daysSupply() daysSupply} to daysSupply.
     * @param daysSupply The value for daysSupply
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal daysSupply(Optional<? extends Quantity> daysSupply);

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonReference() statusReasonReference} to statusReasonReference.
     * @param statusReasonReference The value for statusReasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReasonReference(Reference statusReasonReference);

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonReference() statusReasonReference} to statusReasonReference.
     * @param statusReasonReference The value for statusReasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReasonReference(Optional<? extends Reference> statusReasonReference);

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} to statusReasonCodeableConcept.
     * @param statusReasonCodeableConcept The value for statusReasonCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReasonCodeableConcept(CodeableConcept statusReasonCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationDispense#statusReasonCodeableConcept() statusReasonCodeableConcept} to statusReasonCodeableConcept.
     * @param statusReasonCodeableConcept The value for statusReasonCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReasonCodeableConcept(Optional<? extends CodeableConcept> statusReasonCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationDispense#whenHandedOver() whenHandedOver} to whenHandedOver.
     * @param whenHandedOver The value for whenHandedOver
     * @return {@code this} builder for chained invocation
     */
    BuildFinal whenHandedOver(DateTime whenHandedOver);

    /**
     * Initializes the optional value {@link MedicationDispense#whenHandedOver() whenHandedOver} to whenHandedOver.
     * @param whenHandedOver The value for whenHandedOver
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal whenHandedOver(Optional<? extends DateTime> whenHandedOver);

    /**
     * Initializes the optional value {@link MedicationDispense#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicationDispense#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicationDispense#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(Reference context);

    /**
     * Initializes the optional value {@link MedicationDispense#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(Optional<? extends Reference> context);

    /**
     * Builds a new {@link MedicationDispense MedicationDispense}.
     * @return An immutable instance of MedicationDispense
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationDispense build();
  }
}
