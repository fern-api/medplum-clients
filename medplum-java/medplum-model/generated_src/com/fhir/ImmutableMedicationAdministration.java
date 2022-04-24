//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicationAdministration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationAdministration.builder()}.
 */
@org.immutables.value.Generated(from = "MedicationAdministration", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationAdministration implements com.fhir.MedicationAdministration {
  private final @javax.annotation.Nullable com.fhir.Reference request;
  private final @javax.annotation.Nullable com.fhir.MedicationAdministration_Dosage dosage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiates;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference context;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> device;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept category;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.lang.String effectiveDateTime;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicationAdministration_Performer> performer;
  private final @javax.annotation.Nullable com.fhir.Reference medicationReference;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

  private ImmutableMedicationAdministration(
      @javax.annotation.Nullable com.fhir.Reference request,
      @javax.annotation.Nullable com.fhir.MedicationAdministration_Dosage dosage,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiates,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference context,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> device,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.CodeableConcept category,
      com.fhir.Reference subject,
      @javax.annotation.Nullable java.lang.String effectiveDateTime,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicationAdministration_Performer> performer,
      @javax.annotation.Nullable com.fhir.Reference medicationReference,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier) {
    this.request = request;
    this.dosage = dosage;
    this.extension = extension;
    this.instantiates = instantiates;
    this.modifierExtension = modifierExtension;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.implicitRules = implicitRules;
    this.partOf = partOf;
    this.language = language;
    this.status = status;
    this.id = id;
    this.contained = contained;
    this.text = text;
    this.context = context;
    this.reasonCode = reasonCode;
    this.supportingInformation = supportingInformation;
    this.effectivePeriod = effectivePeriod;
    this.eventHistory = eventHistory;
    this.statusReason = statusReason;
    this.device = device;
    this.note = note;
    this.reasonReference = reasonReference;
    this.category = category;
    this.subject = subject;
    this.effectiveDateTime = effectiveDateTime;
    this.resourceType = resourceType;
    this.performer = performer;
    this.medicationReference = medicationReference;
    this.meta = meta;
    this.identifier = identifier;
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("request")
  @Override
  public java.util.Optional<com.fhir.Reference> request() {
    return java.util.Optional.ofNullable(request);
  }

  /**
   * @return The value of the {@code dosage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dosage")
  @Override
  public java.util.Optional<com.fhir.MedicationAdministration_Dosage> dosage() {
    return java.util.Optional.ofNullable(dosage);
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
   * @return The value of the {@code instantiates} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiates() {
    return java.util.Optional.ofNullable(instantiates);
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
   * @return The value of the {@code medicationCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medicationCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept() {
    return java.util.Optional.ofNullable(medicationCodeableConcept);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code context} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  @Override
  public java.util.Optional<com.fhir.Reference> context() {
    return java.util.Optional.ofNullable(context);
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code device} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("device")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> device() {
    return java.util.Optional.ofNullable(device);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code effectiveDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
  @Override
  public java.util.Optional<java.lang.String> effectiveDateTime() {
    return java.util.Optional.ofNullable(effectiveDateTime);
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
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicationAdministration_Performer>> performer() {
    return java.util.Optional.ofNullable(performer);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withRequest(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableMedicationAdministration(
        newValue,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withRequest(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableMedicationAdministration(
        value,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#dosage() dosage} attribute.
   * @param value The value for dosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withDosage(com.fhir.MedicationAdministration_Dosage value) {
    @javax.annotation.Nullable com.fhir.MedicationAdministration_Dosage newValue = java.util.Objects.requireNonNull(value, "dosage");
    if (this.dosage == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        newValue,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#dosage() dosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withDosage(java.util.Optional<? extends com.fhir.MedicationAdministration_Dosage> optional) {
    @javax.annotation.Nullable com.fhir.MedicationAdministration_Dosage value = optional.orElse(null);
    if (this.dosage == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        value,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        newValue,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        value,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#instantiates() instantiates} attribute.
   * @param value The value for instantiates
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withInstantiates(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiates");
    if (this.instantiates == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        newValue,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#instantiates() instantiates} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiates
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withInstantiates(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiates == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        value,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        newValue,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        value,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withMedicationCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        newValue,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withMedicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        value,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        newValue,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        value,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        newValue,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        value,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        newValue,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        value,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        newValue,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        value,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        newValue,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        value,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        newValue,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        value,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        newValue,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        value,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withContext(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        newValue,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withContext(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        value,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        newValue,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        value,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withSupportingInformation(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        newValue,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withSupportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        value,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        newValue,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        value,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#eventHistory() eventHistory} attribute.
   * @param value The value for eventHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withEventHistory(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "eventHistory");
    if (this.eventHistory == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        newValue,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#eventHistory() eventHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withEventHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.eventHistory == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        value,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withStatusReason(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        newValue,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withStatusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        value,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#device() device} attribute.
   * @param value The value for device
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withDevice(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "device");
    if (this.device == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        newValue,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#device() device} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for device
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withDevice(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.device == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        value,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        newValue,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        value,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        newValue,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        value,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withCategory(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        newValue,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withCategory(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        value,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationAdministration#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationAdministration withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        newValue,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withEffectiveDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "effectiveDateTime");
    if (java.util.Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        newValue,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withEffectiveDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        value,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationAdministration#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationAdministration withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        newValue,
        this.performer,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withPerformer(java.util.List<com.fhir.MedicationAdministration_Performer> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationAdministration_Performer> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        newValue,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withPerformer(java.util.Optional<? extends java.util.List<com.fhir.MedicationAdministration_Performer>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicationAdministration_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        value,
        this.medicationReference,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withMedicationReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        newValue,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withMedicationReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        value,
        this.meta,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicationAdministration(
        this.request,
        this.dosage,
        this.extension,
        this.instantiates,
        this.modifierExtension,
        this.medicationCodeableConcept,
        this.implicitRules,
        this.partOf,
        this.language,
        this.status,
        this.id,
        this.contained,
        this.text,
        this.context,
        this.reasonCode,
        this.supportingInformation,
        this.effectivePeriod,
        this.eventHistory,
        this.statusReason,
        this.device,
        this.note,
        this.reasonReference,
        this.category,
        this.subject,
        this.effectiveDateTime,
        this.resourceType,
        this.performer,
        this.medicationReference,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationAdministration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationAdministration
        && equalTo((ImmutableMedicationAdministration) another);
  }

  private boolean equalTo(ImmutableMedicationAdministration another) {
    return java.util.Objects.equals(request, another.request)
        && java.util.Objects.equals(dosage, another.dosage)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(instantiates, another.instantiates)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(context, another.context)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(supportingInformation, another.supportingInformation)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(eventHistory, another.eventHistory)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(device, another.device)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(category, another.category)
        && subject.equals(another.subject)
        && java.util.Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(medicationReference, another.medicationReference)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code request}, {@code dosage}, {@code extension}, {@code instantiates}, {@code modifierExtension}, {@code medicationCodeableConcept}, {@code implicitRules}, {@code partOf}, {@code language}, {@code status}, {@code id}, {@code contained}, {@code text}, {@code context}, {@code reasonCode}, {@code supportingInformation}, {@code effectivePeriod}, {@code eventHistory}, {@code statusReason}, {@code device}, {@code note}, {@code reasonReference}, {@code category}, {@code subject}, {@code effectiveDateTime}, {@code resourceType}, {@code performer}, {@code medicationReference}, {@code meta}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + java.util.Objects.hashCode(dosage);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(instantiates);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(context);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(supportingInformation);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(eventHistory);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(device);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(effectiveDateTime);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(medicationReference);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationAdministration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicationAdministration{");
    if (request != null) {
      builder.append("request=").append(request);
    }
    if (dosage != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("dosage=").append(dosage);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (instantiates != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("instantiates=").append(instantiates);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (medicationCodeableConcept != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (implicitRules != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (partOf != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (language != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contained != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (text != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (context != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (reasonCode != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (supportingInformation != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (eventHistory != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("eventHistory=").append(eventHistory);
    }
    if (statusReason != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (device != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("device=").append(device);
    }
    if (note != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (reasonReference != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (category != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (builder.length() > 25) builder.append(", ");
    builder.append("subject=").append(subject);
    if (effectiveDateTime != null) {
      builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (medicationReference != null) {
      builder.append(", ");
      builder.append("medicationReference=").append(medicationReference);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicationAdministration", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicationAdministration {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MedicationAdministration_Dosage> dosage = java.util.Optional.empty();
    boolean dosageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiates = java.util.Optional.empty();
    boolean instantiatesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept = java.util.Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> context = java.util.Optional.empty();
    boolean contextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation = java.util.Optional.empty();
    boolean supportingInformationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory = java.util.Optional.empty();
    boolean eventHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> device = java.util.Optional.empty();
    boolean deviceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> effectiveDateTime = java.util.Optional.empty();
    boolean effectiveDateTimeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicationAdministration_Performer>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> medicationReference = java.util.Optional.empty();
    boolean medicationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<com.fhir.Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dosage")
    public void setDosage(java.util.Optional<com.fhir.MedicationAdministration_Dosage> dosage) {
      this.dosage = dosage;
      this.dosageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
    public void setInstantiates(java.util.Optional<java.util.List<com.fhir.uri>> instantiates) {
      this.instantiates = instantiates;
      this.instantiatesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Optional<com.fhir.Reference> context) {
      this.context = context;
      this.contextIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("eventHistory")
    public void setEventHistory(java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory) {
      this.eventHistory = eventHistory;
      this.eventHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public void setDevice(java.util.Optional<java.util.List<com.fhir.Reference>> device) {
      this.device = device;
      this.deviceIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.MedicationAdministration_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medicationReference")
    public void setMedicationReference(java.util.Optional<com.fhir.Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MedicationAdministration_Dosage> dosage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiates() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> context() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> eventHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> device() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicationAdministration_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationAdministration fromJson(Json json) {
    ImmutableMedicationAdministration.Builder builder = ((ImmutableMedicationAdministration.Builder) ImmutableMedicationAdministration.builder());
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.dosageIsSet) {
      builder.dosage(json.dosage);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.instantiatesIsSet) {
      builder.instantiates(json.instantiates);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.eventHistoryIsSet) {
      builder.eventHistory(json.eventHistory);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.deviceIsSet) {
      builder.device(json.device);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
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
        .request(instance.request())
        .dosage(instance.dosage())
        .extension(instance.extension())
        .instantiates(instance.instantiates())
        .modifierExtension(instance.modifierExtension())
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .implicitRules(instance.implicitRules())
        .partOf(instance.partOf())
        .language(instance.language())
        .status(instance.status())
        .id(instance.id())
        .contained(instance.contained())
        .text(instance.text())
        .context(instance.context())
        .reasonCode(instance.reasonCode())
        .supportingInformation(instance.supportingInformation())
        .effectivePeriod(instance.effectivePeriod())
        .eventHistory(instance.eventHistory())
        .statusReason(instance.statusReason())
        .device(instance.device())
        .note(instance.note())
        .reasonReference(instance.reasonReference())
        .category(instance.category())
        .subject(instance.subject())
        .effectiveDateTime(instance.effectiveDateTime())
        .resourceType(instance.resourceType())
        .performer(instance.performer())
        .medicationReference(instance.medicationReference())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationAdministration MedicationAdministration}.
   * <pre>
   * ImmutableMedicationAdministration.builder()
   *    .request(com.fhir.Reference) // optional {@link MedicationAdministration#request() request}
   *    .dosage(com.fhir.MedicationAdministration_Dosage) // optional {@link MedicationAdministration#dosage() dosage}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationAdministration#extension() extension}
   *    .instantiates(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link MedicationAdministration#instantiates() instantiates}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationAdministration#modifierExtension() modifierExtension}
   *    .medicationCodeableConcept(com.fhir.CodeableConcept) // optional {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicationAdministration#implicitRules() implicitRules}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#partOf() partOf}
   *    .language(com.fhir.code) // optional {@link MedicationAdministration#language() language}
   *    .status(com.fhir.code) // optional {@link MedicationAdministration#status() status}
   *    .id(com.fhir.id) // optional {@link MedicationAdministration#id() id}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicationAdministration#contained() contained}
   *    .text(com.fhir.Narrative) // optional {@link MedicationAdministration#text() text}
   *    .context(com.fhir.Reference) // optional {@link MedicationAdministration#context() context}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationAdministration#reasonCode() reasonCode}
   *    .supportingInformation(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#supportingInformation() supportingInformation}
   *    .effectivePeriod(com.fhir.Period) // optional {@link MedicationAdministration#effectivePeriod() effectivePeriod}
   *    .eventHistory(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#eventHistory() eventHistory}
   *    .statusReason(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationAdministration#statusReason() statusReason}
   *    .device(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#device() device}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link MedicationAdministration#note() note}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationAdministration#reasonReference() reasonReference}
   *    .category(com.fhir.CodeableConcept) // optional {@link MedicationAdministration#category() category}
   *    .subject(com.fhir.Reference) // required {@link MedicationAdministration#subject() subject}
   *    .effectiveDateTime(String) // optional {@link MedicationAdministration#effectiveDateTime() effectiveDateTime}
   *    .resourceType(String) // required {@link MedicationAdministration#resourceType() resourceType}
   *    .performer(List&amp;lt;com.fhir.MedicationAdministration_Performer&amp;gt;) // optional {@link MedicationAdministration#performer() performer}
   *    .medicationReference(com.fhir.Reference) // optional {@link MedicationAdministration#medicationReference() medicationReference}
   *    .meta(com.fhir.Meta) // optional {@link MedicationAdministration#meta() meta}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicationAdministration#identifier() identifier}
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
  @org.immutables.value.Generated(from = "MedicationAdministration", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_REQUEST = 0x1L;
    private static final long OPT_BIT_DOSAGE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_INSTANTIATES = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_PART_OF = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_CONTEXT = 0x2000L;
    private static final long OPT_BIT_REASON_CODE = 0x4000L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x8000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x10000L;
    private static final long OPT_BIT_EVENT_HISTORY = 0x20000L;
    private static final long OPT_BIT_STATUS_REASON = 0x40000L;
    private static final long OPT_BIT_DEVICE = 0x80000L;
    private static final long OPT_BIT_NOTE = 0x100000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x200000L;
    private static final long OPT_BIT_CATEGORY = 0x400000L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x800000L;
    private static final long OPT_BIT_PERFORMER = 0x1000000L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x2000000L;
    private static final long OPT_BIT_META = 0x4000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference request;
    private @javax.annotation.Nullable com.fhir.MedicationAdministration_Dosage dosage;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiates;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference context;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> eventHistory;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> device;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.lang.String effectiveDateTime;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicationAdministration_Performer> performer;
    private @javax.annotation.Nullable com.fhir.Reference medicationReference;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(com.fhir.Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = java.util.Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public final Builder request(java.util.Optional<? extends com.fhir.Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosage(com.fhir.MedicationAdministration_Dosage dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = java.util.Objects.requireNonNull(dosage, "dosage");
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dosage")
    public final Builder dosage(java.util.Optional<? extends com.fhir.MedicationAdministration_Dosage> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = dosage.orElse(null);
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationAdministration#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationAdministration#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiates(java.util.List<com.fhir.uri> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = java.util.Objects.requireNonNull(instantiates, "instantiates");
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiates")
    public final Builder instantiates(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiates) {
      checkNotIsSet(instantiatesIsSet(), "instantiates");
      this.instantiates = instantiates.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationAdministration#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationAdministration#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationAdministration#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationAdministration#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link MedicationAdministration#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link MedicationAdministration#language() language} to language.
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
     * Initializes the optional value {@link MedicationAdministration#language() language} to language.
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
     * Initializes the optional value {@link MedicationAdministration#status() status} to status.
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
     * Initializes the optional value {@link MedicationAdministration#status() status} to status.
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
     * Initializes the optional value {@link MedicationAdministration#id() id} to id.
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
     * Initializes the optional value {@link MedicationAdministration#id() id} to id.
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
     * Initializes the optional value {@link MedicationAdministration#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationAdministration#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationAdministration#text() text} to text.
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
     * Initializes the optional value {@link MedicationAdministration#text() text} to text.
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
     * Initializes the optional value {@link MedicationAdministration#context() context} to context.
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
     * Initializes the optional value {@link MedicationAdministration#context() context} to context.
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
     * Initializes the optional value {@link MedicationAdministration#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationAdministration#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationAdministration#supportingInformation() supportingInformation} to supportingInformation.
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
     * Initializes the optional value {@link MedicationAdministration#supportingInformation() supportingInformation} to supportingInformation.
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
     * Initializes the optional value {@link MedicationAdministration#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectivePeriod(com.fhir.Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = java.util.Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#eventHistory() eventHistory} to eventHistory.
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
     * Initializes the optional value {@link MedicationAdministration#eventHistory() eventHistory} to eventHistory.
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
     * Initializes the optional value {@link MedicationAdministration#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(java.util.List<com.fhir.CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = java.util.Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public final Builder statusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    public final Builder device(java.util.List<com.fhir.Reference> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = java.util.Objects.requireNonNull(device, "device");
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    public final Builder device(java.util.Optional<? extends java.util.List<com.fhir.Reference>> device) {
      checkNotIsSet(deviceIsSet(), "device");
      this.device = device.orElse(null);
      optBits |= OPT_BIT_DEVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#note() note} to note.
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
     * Initializes the optional value {@link MedicationAdministration#note() note} to note.
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
     * Initializes the optional value {@link MedicationAdministration#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationAdministration#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationAdministration#category() category} to category.
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
     * Initializes the optional value {@link MedicationAdministration#category() category} to category.
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
     * Initializes the value for the {@link MedicationAdministration#subject() subject} attribute.
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
     * Initializes the optional value {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveDateTime(java.lang.String effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = java.util.Objects.requireNonNull(effectiveDateTime, "effectiveDateTime");
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
    public final Builder effectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime) {
      checkNotIsSet(effectiveDateTimeIsSet(), "effectiveDateTime");
      this.effectiveDateTime = effectiveDateTime.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicationAdministration#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicationAdministration#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.MedicationAdministration_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.MedicationAdministration_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationAdministration#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationAdministration#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationAdministration#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationAdministration#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationAdministration#identifier() identifier} to identifier.
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
     * Builds a new {@link MedicationAdministration MedicationAdministration}.
     * @return An immutable instance of MedicationAdministration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicationAdministration build() {
      checkRequiredAttributes();
      return new ImmutableMedicationAdministration(
          request,
          dosage,
          extension,
          instantiates,
          modifierExtension,
          medicationCodeableConcept,
          implicitRules,
          partOf,
          language,
          status,
          id,
          contained,
          text,
          context,
          reasonCode,
          supportingInformation,
          effectivePeriod,
          eventHistory,
          statusReason,
          device,
          note,
          reasonReference,
          category,
          subject,
          effectiveDateTime,
          resourceType,
          performer,
          medicationReference,
          meta,
          identifier);
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean dosageIsSet() {
      return (optBits & OPT_BIT_DOSAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean instantiatesIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean eventHistoryIsSet() {
      return (optBits & OPT_BIT_EVENT_HISTORY) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean deviceIsSet() {
      return (optBits & OPT_BIT_DEVICE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicationAdministration is strict, attribute is already set: ".concat(name));
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
      return "Cannot build MedicationAdministration, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicationAdministration", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link MedicationAdministration#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "MedicationAdministration", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationAdministration#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicationAdministration", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationAdministration#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(com.fhir.Reference request);

    /**
     * Initializes the optional value {@link MedicationAdministration#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(java.util.Optional<? extends com.fhir.Reference> request);

    /**
     * Initializes the optional value {@link MedicationAdministration#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosage(com.fhir.MedicationAdministration_Dosage dosage);

    /**
     * Initializes the optional value {@link MedicationAdministration#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosage(java.util.Optional<? extends com.fhir.MedicationAdministration_Dosage> dosage);

    /**
     * Initializes the optional value {@link MedicationAdministration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicationAdministration#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationAdministration#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiates(java.util.List<com.fhir.uri> instantiates);

    /**
     * Initializes the optional value {@link MedicationAdministration#instantiates() instantiates} to instantiates.
     * @param instantiates The value for instantiates
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiates(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiates);

    /**
     * Initializes the optional value {@link MedicationAdministration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationAdministration#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(com.fhir.CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationAdministration#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationAdministration#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationAdministration#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link MedicationAdministration#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link MedicationAdministration#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicationAdministration#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicationAdministration#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link MedicationAdministration#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link MedicationAdministration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicationAdministration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicationAdministration#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationAdministration#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationAdministration#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicationAdministration#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicationAdministration#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(com.fhir.Reference context);

    /**
     * Initializes the optional value {@link MedicationAdministration#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(java.util.Optional<? extends com.fhir.Reference> context);

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link MedicationAdministration#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(java.util.List<com.fhir.Reference> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationAdministration#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link MedicationAdministration#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link MedicationAdministration#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link MedicationAdministration#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventHistory(java.util.List<com.fhir.Reference> eventHistory);

    /**
     * Initializes the optional value {@link MedicationAdministration#eventHistory() eventHistory} to eventHistory.
     * @param eventHistory The value for eventHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> eventHistory);

    /**
     * Initializes the optional value {@link MedicationAdministration#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(java.util.List<com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link MedicationAdministration#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> statusReason);

    /**
     * Initializes the optional value {@link MedicationAdministration#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for chained invocation
     */
    BuildFinal device(java.util.List<com.fhir.Reference> device);

    /**
     * Initializes the optional value {@link MedicationAdministration#device() device} to device.
     * @param device The value for device
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal device(java.util.Optional<? extends java.util.List<com.fhir.Reference>> device);

    /**
     * Initializes the optional value {@link MedicationAdministration#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link MedicationAdministration#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link MedicationAdministration#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link MedicationAdministration#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);

    /**
     * Initializes the optional value {@link MedicationAdministration#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(java.lang.String effectiveDateTime);

    /**
     * Initializes the optional value {@link MedicationAdministration#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime);

    /**
     * Initializes the optional value {@link MedicationAdministration#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.MedicationAdministration_Performer> performer);

    /**
     * Initializes the optional value {@link MedicationAdministration#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.MedicationAdministration_Performer>> performer);

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(com.fhir.Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicationAdministration#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(java.util.Optional<? extends com.fhir.Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicationAdministration#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicationAdministration#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicationAdministration#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicationAdministration#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Builds a new {@link MedicationAdministration MedicationAdministration}.
     * @return An immutable instance of MedicationAdministration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationAdministration build();
  }
}
