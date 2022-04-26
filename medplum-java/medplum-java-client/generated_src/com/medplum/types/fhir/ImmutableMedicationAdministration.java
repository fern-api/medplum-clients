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
 * Immutable implementation of {@link MedicationAdministration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationAdministration.builder()}.
 */
@Generated(from = "MedicationAdministration", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationAdministration
    implements MedicationAdministration {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Annotation> note;
  private final @Nullable MedicationAdministration_Dosage dosage;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Uri> instantiates;
  private final Reference subject;
  private final @Nullable CodeableConcept medicationCodeableConcept;
  private final @Nullable List<Reference> supportingInformation;
  private final @Nullable Id id;
  private final @Nullable Reference context;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Narrative text;
  private final @Nullable Code status;
  private final @Nullable Period effectivePeriod;
  private final @Nullable Reference medicationReference;
  private final @Nullable Code language;
  private final @Nullable String effectiveDateTime;
  private final @Nullable List<CodeableConcept> statusReason;
  private final @Nullable Reference request;
  private final @Nullable List<Reference> partOf;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> device;
  private final @Nullable Uri implicitRules;
  private final @Nullable Meta meta;
  private final @Nullable CodeableConcept category;
  private final String resourceType;
  private final @Nullable List<MedicationAdministration_Performer> performer;
  private final @Nullable List<Reference> eventHistory;

  private ImmutableMedicationAdministration(
      @Nullable List<Extension> extension,
      @Nullable List<Annotation> note,
      @Nullable MedicationAdministration_Dosage dosage,
      @Nullable List<Reference> reasonReference,
      @Nullable List<Identifier> identifier,
      @Nullable List<Uri> instantiates,
      Reference subject,
      @Nullable CodeableConcept medicationCodeableConcept,
      @Nullable List<Reference> supportingInformation,
      @Nullable Id id,
      @Nullable Reference context,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<ResourceList> contained,
      @Nullable Narrative text,
      @Nullable Code status,
      @Nullable Period effectivePeriod,
      @Nullable Reference medicationReference,
      @Nullable Code language,
      @Nullable String effectiveDateTime,
      @Nullable List<CodeableConcept> statusReason,
      @Nullable Reference request,
      @Nullable List<Reference> partOf,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> device,
      @Nullable Uri implicitRules,
      @Nullable Meta meta,
      @Nullable CodeableConcept category,
      String resourceType,
      @Nullable List<MedicationAdministration_Performer> performer,
      @Nullable List<Reference> eventHistory) {
    this.extension = extension;
    this.note = note;
    this.dosage = dosage;
    this.reasonReference = reasonReference;
    this.identifier = identifier;
    this.instantiates = instantiates;
    this.subject = subject;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.supportingInformation = supportingInformation;
    this.id = id;
    this.context = context;
    this.reasonCode = reasonCode;
    this.contained = contained;
    this.text = text;
    this.status = status;
    this.effectivePeriod = effectivePeriod;
    this.medicationReference = medicationReference;
    this.language = language;
    this.effectiveDateTime = effectiveDateTime;
    this.statusReason = statusReason;
    this.request = request;
    this.partOf = partOf;
    this.modifierExtension = modifierExtension;
    this.device = device;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.category = category;
    this.resourceType = resourceType;
    this.performer = performer;
    this.eventHistory = eventHistory;
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code dosage} attribute
   */
  @JsonProperty("dosage")
  @Override
  public Optional<MedicationAdministration_Dosage> dosage() {
    return Optional.ofNullable(dosage);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code instantiates} attribute
   */
  @JsonProperty("instantiates")
  @Override
  public Optional<List<Uri>> instantiates() {
    return Optional.ofNullable(instantiates);
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
   * @return The value of the {@code medicationCodeableConcept} attribute
   */
  @JsonProperty("medicationCodeableConcept")
  @Override
  public Optional<CodeableConcept> medicationCodeableConcept() {
    return Optional.ofNullable(medicationCodeableConcept);
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
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<Reference> context() {
    return Optional.ofNullable(context);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code effectivePeriod} attribute
   */
  @JsonProperty("effectivePeriod")
  @Override
  public Optional<Period> effectivePeriod() {
    return Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code effectiveDateTime} attribute
   */
  @JsonProperty("effectiveDateTime")
  @Override
  public Optional<String> effectiveDateTime() {
    return Optional.ofNullable(effectiveDateTime);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<List<CodeableConcept>> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<Reference> request() {
    return Optional.ofNullable(request);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @JsonProperty("device")
  @Override
  public Optional<List<Reference>> device() {
    return Optional.ofNullable(device);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<List<MedicationAdministration_Performer>> performer() {
    return Optional.ofNullable(performer);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationAdministration(
        newValue,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationAdministration(
        value,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        newValue,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        value,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#dosage() dosage} attribute.
   * @param value The value for dosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withDosage(MedicationAdministration_Dosage value) {
    @Nullable MedicationAdministration_Dosage newValue = Objects.requireNonNull(value, "dosage");
    if (this.dosage == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        newValue,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#dosage() dosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withDosage(Optional<? extends MedicationAdministration_Dosage> optional) {
    @Nullable MedicationAdministration_Dosage value = optional.orElse(null);
    if (this.dosage == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        value,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        newValue,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        value,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        newValue,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        value,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#instantiates() instantiates} attribute.
   * @param value The value for instantiates
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withInstantiates(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiates");
    if (this.instantiates == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        newValue,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#instantiates() instantiates} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiates
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withInstantiates(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiates == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        value,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationAdministration#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationAdministration withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        newValue,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withMedicationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        newValue,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withMedicationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        value,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withSupportingInformation(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        newValue,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withSupportingInformation(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        value,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        newValue,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        value,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withContext(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        newValue,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withContext(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        value,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        newValue,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        value,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        newValue,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        value,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        newValue,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        value,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        newValue,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        value,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        newValue,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        value,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withMedicationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        newValue,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withMedicationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        value,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        newValue,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        value,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withEffectiveDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "effectiveDateTime");
    if (Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        newValue,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withEffectiveDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        value,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withStatusReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        newValue,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withStatusReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        value,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withRequest(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        newValue,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withRequest(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        value,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        newValue,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        value,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        newValue,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        value,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withDevice(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        newValue,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withDevice(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        value,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        newValue,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        value,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        newValue,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        value,
        this.category,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        newValue,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        value,
        this.resourceType,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationAdministration#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationAdministration withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        newValue,
        this.performer,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withPerformer(List<MedicationAdministration_Performer> value) {
    @Nullable List<MedicationAdministration_Performer> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        newValue,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withPerformer(Optional<? extends List<MedicationAdministration_Performer>> optional) {
    @Nullable List<MedicationAdministration_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        value,
        this.eventHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#eventHistory() eventHistory} attribute.
   * @param value The value for eventHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withEventHistory(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "eventHistory");
    if (this.eventHistory == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#eventHistory() eventHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withEventHistory(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.eventHistory == value) return this;
    return new ImmutableMedicationAdministration(
        this.extension,
        this.note,
        this.dosage,
        this.reasonReference,
        this.identifier,
        this.instantiates,
        this.subject,
        this.medicationCodeableConcept,
        this.supportingInformation,
        this.id,
        this.context,
        this.reasonCode,
        this.contained,
        this.text,
        this.status,
        this.effectivePeriod,
        this.medicationReference,
        this.language,
        this.effectiveDateTime,
        this.statusReason,
        this.request,
        this.partOf,
        this.modifierExtension,
        this.device,
        this.implicitRules,
        this.meta,
        this.category,
        this.resourceType,
        this.performer,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationAdministration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationAdministration
        && equalTo((ImmutableMedicationAdministration) another);
  }

  private boolean equalTo(ImmutableMedicationAdministration another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(note, another.note)
        && Objects.equals(dosage, another.dosage)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(instantiates, another.instantiates)
        && subject.equals(another.subject)
        && Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && Objects.equals(supportingInformation, another.supportingInformation)
        && Objects.equals(id, another.id)
        && Objects.equals(context, another.context)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(contained, another.contained)
        && Objects.equals(text, another.text)
        && Objects.equals(status, another.status)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(medicationReference, another.medicationReference)
        && Objects.equals(language, another.language)
        && Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(request, another.request)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(device, another.device)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(meta, another.meta)
        && Objects.equals(category, another.category)
        && resourceType.equals(another.resourceType)
        && Objects.equals(performer, another.performer)
        && Objects.equals(eventHistory, another.eventHistory);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code note}, {@code dosage}, {@code reasonReference}, {@code identifier}, {@code instantiates}, {@code subject}, {@code medicationCodeableConcept}, {@code supportingInformation}, {@code id}, {@code context}, {@code reasonCode}, {@code contained}, {@code text}, {@code status}, {@code effectivePeriod}, {@code medicationReference}, {@code language}, {@code effectiveDateTime}, {@code statusReason}, {@code request}, {@code partOf}, {@code modifierExtension}, {@code device}, {@code implicitRules}, {@code meta}, {@code category}, {@code resourceType}, {@code performer}, {@code eventHistory}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(dosage);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(instantiates);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + Objects.hashCode(supportingInformation);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(medicationReference);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(effectiveDateTime);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(device);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(eventHistory);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationAdministration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationAdministration{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (note != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (dosage != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("dosage=").append(dosage);
    }
    if (reasonReference != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (identifier != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (instantiates != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("instantiates=").append(instantiates);
    }
    if (builder.length() > 25) builder.append(", ");
    builder.append("subject=").append(subject);
    if (medicationCodeableConcept != null) {
      builder.append(", ");
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (supportingInformation != null) {
      builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (medicationReference != null) {
      builder.append(", ");
      builder.append("medicationReference=").append(medicationReference);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (effectiveDateTime != null) {
      builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (device != null) {
      builder.append(", ");
      builder.append("device=").append(device);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (eventHistory != null) {
      builder.append(", ");
      builder.append("eventHistory=").append(eventHistory);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationAdministration", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationAdministration {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<MedicationAdministration_Dosage> dosage = Optional.empty();
    boolean dosageIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Uri>> instantiates = Optional.empty();
    boolean instantiatesIsSet;
    @Nullable Reference subject;
    @Nullable Optional<CodeableConcept> medicationCodeableConcept = Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @Nullable Optional<List<Reference>> supportingInformation = Optional.empty();
    boolean supportingInformationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<Reference> medicationReference = Optional.empty();
    boolean medicationReferenceIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> effectiveDateTime = Optional.empty();
    boolean effectiveDateTimeIsSet;
    @Nullable Optional<List<CodeableConcept>> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<Reference> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> device = Optional.empty();
    boolean deviceIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<MedicationAdministration_Performer>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<List<Reference>> eventHistory = Optional.empty();
    boolean eventHistoryIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("dosage")
    public void setDosage(Optional<MedicationAdministration_Dosage> dosage) {
      this.dosage = dosage;
      this.dosageIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("instantiates")
    public void setInstantiates(Optional<List<Uri>> instantiates) {
      this.instantiates = instantiates;
      this.instantiatesIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(Optional<CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
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
    @JsonProperty("context")
    public void setContext(Optional<Reference> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("medicationReference")
    public void setMedicationReference(Optional<Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(Optional<String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<List<CodeableConcept>> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("device")
    public void setDevice(Optional<List<Reference>> device) {
      this.device = device;
      this.deviceIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<MedicationAdministration_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("eventHistory")
    public void setEventHistory(Optional<List<Reference>> eventHistory) {
      this.eventHistory = eventHistory;
      this.eventHistoryIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicationAdministration_Dosage> dosage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiates() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> device() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationAdministration_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> eventHistory() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationAdministration fromJson(Json json) {
    ImmutableMedicationAdministration.Builder builder = ((ImmutableMedicationAdministration.Builder) ImmutableMedicationAdministration.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.dosageIsSet) {
      builder.dosage(json.dosage);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.instantiatesIsSet) {
      builder.instantiates(json.instantiates);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.eventHistoryIsSet) {
      builder.eventHistory(json.eventHistory);
    }
    return (ImmutableMedicationAdministration) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationAdministration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationAdministration instance
   */
  public static MedicationAdministration copyOf(MedicationAdministration instance) {
    if (instance instanceof ImmutableMedicationAdministration) {
      return (ImmutableMedicationAdministration) instance;
    }
    return ((ImmutableMedicationAdministration.Builder) ImmutableMedicationAdministration.builder())
        .extension(instance.extension())
        .note(instance.note())
        .dosage(instance.dosage())
        .reasonReference(instance.reasonReference())
        .identifier(instance.identifier())
        .instantiates(instance.instantiates())
        .subject(instance.subject())
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .supportingInformation(instance.supportingInformation())
        .id(instance.id())
        .context(instance.context())
        .reasonCode(instance.reasonCode())
        .contained(instance.contained())
        .text(instance.text())
        .status(instance.status())
        .effectivePeriod(instance.effectivePeriod())
        .medicationReference(instance.medicationReference())
        .language(instance.language())
        .effectiveDateTime(instance.effectiveDateTime())
        .statusReason(instance.statusReason())
        .request(instance.request())
        .partOf(instance.partOf())
        .modifierExtension(instance.modifierExtension())
        .device(instance.device())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .category(instance.category())
        .resourceType(instance.resourceType())
        .performer(instance.performer())
        .eventHistory(instance.eventHistory())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationAdministration MedicationAdministration}.
   * <pre>
   * ImmutableMedicationAdministration.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationAdministration#extension() extension}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link MedicationAdministration#note() note}
   *    .dosage(com.medplum.types.fhir.MedicationAdministration_Dosage) // optional {@link MedicationAdministration#dosage() dosage}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#reasonReference() reasonReference}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MedicationAdministration#identifier() identifier}
   *    .instantiates(List&amp;lt;com.medplum.types.fhir.Uri&amp;gt;) // optional {@link MedicationAdministration#instantiates() instantiates}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link MedicationAdministration#subject() subject}
   *    .medicationCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept}
   *    .supportingInformation(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#supportingInformation() supportingInformation}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicationAdministration#id() id}
   *    .context(com.medplum.types.fhir.Reference) // optional {@link MedicationAdministration#context() context}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationAdministration#reasonCode() reasonCode}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicationAdministration#contained() contained}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicationAdministration#text() text}
   *    .status(com.medplum.types.fhir.Code) // optional {@link MedicationAdministration#status() status}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link MedicationAdministration#effectivePeriod() effectivePeriod}
   *    .medicationReference(com.medplum.types.fhir.Reference) // optional {@link MedicationAdministration#medicationReference() medicationReference}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicationAdministration#language() language}
   *    .effectiveDateTime(String) // optional {@link MedicationAdministration#effectiveDateTime() effectiveDateTime}
   *    .statusReason(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationAdministration#statusReason() statusReason}
   *    .request(com.medplum.types.fhir.Reference) // optional {@link MedicationAdministration#request() request}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#partOf() partOf}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationAdministration#modifierExtension() modifierExtension}
   *    .device(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#device() device}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicationAdministration#implicitRules() implicitRules}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicationAdministration#meta() meta}
   *    .category(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicationAdministration#category() category}
   *    .resourceType(String) // required {@link MedicationAdministration#resourceType() resourceType}
   *    .performer(List&amp;lt;com.medplum.types.fhir.MedicationAdministration_Performer&amp;gt;) // optional {@link MedicationAdministration#performer() performer}
   *    .eventHistory(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#eventHistory() eventHistory}
   *    .build();
   * </pre>
   * @return A new MedicationAdministration builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableMedicationAdministration.Builder();
  }

  /**
   * Builds instances of type {@link MedicationAdministration MedicationAdministration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationAdministration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_NOTE = 0x2L;
    private static final long OPT_BIT_DOSAGE = 0x4L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_INSTANTIATES = 0x20L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x40L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_CONTEXT = 0x200L;
    private static final long OPT_BIT_REASON_CODE = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_STATUS = 0x2000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x4000L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x20000L;
    private static final long OPT_BIT_STATUS_REASON = 0x40000L;
    private static final long OPT_BIT_REQUEST = 0x80000L;
    private static final long OPT_BIT_PART_OF = 0x100000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200000L;
    private static final long OPT_BIT_DEVICE = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private static final long OPT_BIT_META = 0x1000000L;
    private static final long OPT_BIT_CATEGORY = 0x2000000L;
    private static final long OPT_BIT_PERFORMER = 0x4000000L;
    private static final long OPT_BIT_EVENT_HISTORY = 0x8000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Annotation> note;
    private @Nullable MedicationAdministration_Dosage dosage;
    private @Nullable List<Reference> reasonReference;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Uri> instantiates;
    private @Nullable Reference subject;
    private @Nullable CodeableConcept medicationCodeableConcept;
    private @Nullable List<Reference> supportingInformation;
    private @Nullable Id id;
    private @Nullable Reference context;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<ResourceList> contained;
    private @Nullable Narrative text;
    private @Nullable Code status;
    private @Nullable Period effectivePeriod;
    private @Nullable Reference medicationReference;
    private @Nullable Code language;
    private @Nullable String effectiveDateTime;
    private @Nullable List<CodeableConcept> statusReason;
    private @Nullable Reference request;
    private @Nullable List<Reference> partOf;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> device;
    private @Nullable Uri implicitRules;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept category;
    private @Nullable String resourceType;
    private @Nullable List<MedicationAdministration_Performer> performer;
    private @Nullable List<Reference> eventHistory;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationAdministration#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationAdministration#note() note} to note.
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
     * Initializes the optional value {@link MedicationAdministration#note() note} to note.
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
     * Initializes the optional value {@link MedicationAdministration#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosage(MedicationAdministration_Dosage dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = Objects.requireNonNull(dosage, "dosage");
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dosage")
    public final Builder dosage(Optional<? extends MedicationAdministration_Dosage> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = dosage.orElse(null);
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationAdministration#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationAdministration#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationAdministration#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationAdministration#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiates(List<Uri> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = Objects.requireNonNull(instantiates, "instantiates");
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiates")
    public final Builder instantiates(Optional<? extends List<Uri>> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = instantiates.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicationAdministration#subject() subject} attribute.
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
     * Initializes the optional value {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationAdministration#supportingInformation() supportingInformation} to supportingInformation.
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
     * Initializes the optional value {@link MedicationAdministration#supportingInformation() supportingInformation} to supportingInformation.
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
     * Initializes the optional value {@link MedicationAdministration#id() id} to id.
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
     * Initializes the optional value {@link MedicationAdministration#id() id} to id.
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
     * Initializes the optional value {@link MedicationAdministration#context() context} to context.
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
     * Initializes the optional value {@link MedicationAdministration#context() context} to context.
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
     * Initializes the optional value {@link MedicationAdministration#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationAdministration#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationAdministration#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationAdministration#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationAdministration#text() text} to text.
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
     * Initializes the optional value {@link MedicationAdministration#text() text} to text.
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
     * Initializes the optional value {@link MedicationAdministration#status() status} to status.
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
     * Initializes the optional value {@link MedicationAdministration#status() status} to status.
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
     * Initializes the optional value {@link MedicationAdministration#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectivePeriod(Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(Optional<? extends Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationAdministration#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationAdministration#language() language} to language.
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
     * Initializes the optional value {@link MedicationAdministration#language() language} to language.
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
     * Initializes the optional value {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveDateTime(String effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = Objects.requireNonNull(effectiveDateTime, "effectiveDateTime");
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectiveDateTime")
    public final Builder effectiveDateTime(Optional<String> effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = effectiveDateTime.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(List<CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends List<CodeableConcept>> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Optional<? extends Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link MedicationAdministration#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link MedicationAdministration#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationAdministration#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationAdministration#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(List<Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("device")
    public final Builder device(Optional<? extends List<Reference>> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationAdministration#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationAdministration#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationAdministration#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationAdministration#category() category} to category.
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
     * Initializes the optional value {@link MedicationAdministration#category() category} to category.
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
     * Initializes the value for the {@link MedicationAdministration#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicationAdministration#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<MedicationAdministration_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<MedicationAdministration_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#eventHistory() eventHistory} to eventHistory.
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
     * Initializes the optional value {@link MedicationAdministration#eventHistory() eventHistory} to eventHistory.
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
     * Builds a new {@link MedicationAdministration MedicationAdministration}.
     * @return An immutable instance of MedicationAdministration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationAdministration build() {
      checkRequiredAttributes();
      return new ImmutableMedicationAdministration(
          extension,
          note,
          dosage,
          reasonReference,
          identifier,
          instantiates,
          subject,
          medicationCodeableConcept,
          supportingInformation,
          id,
          context,
          reasonCode,
          contained,
          text,
          status,
          effectivePeriod,
          medicationReference,
          language,
          effectiveDateTime,
          statusReason,
          request,
          partOf,
          modifierExtension,
          device,
          implicitRules,
          meta,
          category,
          resourceType,
          performer,
          eventHistory);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean dosageIsSet() {
      return (optBits & OPT_BIT_DOSAGE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean instantiatesIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES) != 0;
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean eventHistoryIsSet() {
      return (optBits & OPT_BIT_EVENT_HISTORY) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationAdministration is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicationAdministration, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationAdministration", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link MedicationAdministration#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "MedicationAdministration", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationAdministration#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicationAdministration", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationAdministration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationAdministration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationAdministration#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link MedicationAdministration#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link MedicationAdministration#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosage(MedicationAdministration_Dosage dosage);

    /**
     * Initializes the optional value {@link MedicationAdministration#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosage(Optional<? extends MedicationAdministration_Dosage> dosage);

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link MedicationAdministration#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicationAdministration#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicationAdministration#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiates(List<Uri> instantiates);

    /**
     * Initializes the optional value {@link MedicationAdministration#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiates(Optional<? extends List<Uri>> instantiates);

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(Optional<? extends CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationAdministration#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(List<Reference> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationAdministration#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(Optional<? extends List<Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationAdministration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicationAdministration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicationAdministration#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(Reference context);

    /**
     * Initializes the optional value {@link MedicationAdministration#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(Optional<? extends Reference> context);

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link MedicationAdministration#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationAdministration#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationAdministration#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicationAdministration#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicationAdministration#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link MedicationAdministration#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link MedicationAdministration#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link MedicationAdministration#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(Optional<? extends Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicationAdministration#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicationAdministration#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(String effectiveDateTime);

    /**
     * Initializes the optional value {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(Optional<String> effectiveDateTime);

    /**
     * Initializes the optional value {@link MedicationAdministration#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(List<CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link MedicationAdministration#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends List<CodeableConcept>> statusReason);

    /**
     * Initializes the optional value {@link MedicationAdministration#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(Reference request);

    /**
     * Initializes the optional value {@link MedicationAdministration#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(Optional<? extends Reference> request);

    /**
     * Initializes the optional value {@link MedicationAdministration#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link MedicationAdministration#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link MedicationAdministration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationAdministration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationAdministration#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(List<Reference> device);

    /**
     * Initializes the optional value {@link MedicationAdministration#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(Optional<? extends List<Reference>> device);

    /**
     * Initializes the optional value {@link MedicationAdministration#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationAdministration#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationAdministration#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicationAdministration#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicationAdministration#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link MedicationAdministration#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link MedicationAdministration#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<MedicationAdministration_Performer> performer);

    /**
     * Initializes the optional value {@link MedicationAdministration#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<MedicationAdministration_Performer>> performer);

    /**
     * Initializes the optional value {@link MedicationAdministration#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventHistory(List<Reference> eventHistory);

    /**
     * Initializes the optional value {@link MedicationAdministration#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventHistory(Optional<? extends List<Reference>> eventHistory);

    /**
     * Builds a new {@link MedicationAdministration MedicationAdministration}.
     * @return An immutable instance of MedicationAdministration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationAdministration build();
  }
}