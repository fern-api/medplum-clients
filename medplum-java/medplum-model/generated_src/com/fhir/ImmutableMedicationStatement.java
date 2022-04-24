//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicationStatement}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationStatement.builder()}.
 */
@org.immutables.value.Generated(from = "MedicationStatement", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationStatement implements com.fhir.MedicationStatement {
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String effectiveDateTime;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.Reference context;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference medicationReference;
  private final @javax.annotation.Nullable com.fhir.Reference informationSource;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept category;
  private final @javax.annotation.Nullable com.fhir.dateTime dateAsserted;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

  private ImmutableMedicationStatement(
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String effectiveDateTime,
      @javax.annotation.Nullable com.fhir.code language,
      com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.Reference context,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference medicationReference,
      @javax.annotation.Nullable com.fhir.Reference informationSource,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.CodeableConcept category,
      @javax.annotation.Nullable com.fhir.dateTime dateAsserted,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosage,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier) {
    this.effectivePeriod = effectivePeriod;
    this.partOf = partOf;
    this.status = status;
    this.id = id;
    this.effectiveDateTime = effectiveDateTime;
    this.language = language;
    this.subject = subject;
    this.context = context;
    this.modifierExtension = modifierExtension;
    this.basedOn = basedOn;
    this.note = note;
    this.contained = contained;
    this.text = text;
    this.medicationReference = medicationReference;
    this.informationSource = informationSource;
    this.statusReason = statusReason;
    this.implicitRules = implicitRules;
    this.reasonReference = reasonReference;
    this.category = category;
    this.dateAsserted = dateAsserted;
    this.extension = extension;
    this.dosage = dosage;
    this.reasonCode = reasonCode;
    this.medicationCodeableConcept = medicationCodeableConcept;
    this.meta = meta;
    this.resourceType = resourceType;
    this.derivedFrom = derivedFrom;
    this.identifier = identifier;
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
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
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
   * @return The value of the {@code effectiveDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
  @Override
  public java.util.Optional<java.lang.String> effectiveDateTime() {
    return java.util.Optional.ofNullable(effectiveDateTime);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public com.fhir.Reference subject() {
    return subject;
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code medicationReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medicationReference")
  @Override
  public java.util.Optional<com.fhir.Reference> medicationReference() {
    return java.util.Optional.ofNullable(medicationReference);
  }

  /**
   * @return The value of the {@code informationSource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("informationSource")
  @Override
  public java.util.Optional<com.fhir.Reference> informationSource() {
    return java.util.Optional.ofNullable(informationSource);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code dateAsserted} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dateAsserted")
  @Override
  public java.util.Optional<com.fhir.dateTime> dateAsserted() {
    return java.util.Optional.ofNullable(dateAsserted);
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
   * @return The value of the {@code dosage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dosage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Dosage>> dosage() {
    return java.util.Optional.ofNullable(dosage);
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
   * @return The value of the {@code medicationCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medicationCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept() {
    return java.util.Optional.ofNullable(medicationCodeableConcept);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code derivedFrom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom() {
    return java.util.Optional.ofNullable(derivedFrom);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableMedicationStatement(
        newValue,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableMedicationStatement(
        value,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        newValue,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        value,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        newValue,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        value,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        newValue,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        value,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#effectiveDateTime() effectiveDateTime} attribute.
   * @param value The value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withEffectiveDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "effectiveDateTime");
    if (java.util.Objects.equals(this.effectiveDateTime, newValue)) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        newValue,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#effectiveDateTime() effectiveDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withEffectiveDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.effectiveDateTime, value)) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        value,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        newValue,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        value,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationStatement#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationStatement withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        newValue,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withContext(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        newValue,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withContext(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        value,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        newValue,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        value,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        newValue,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        value,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        newValue,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        value,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        newValue,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        value,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        newValue,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        value,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#medicationReference() medicationReference} attribute.
   * @param value The value for medicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withMedicationReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "medicationReference");
    if (this.medicationReference == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        newValue,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#medicationReference() medicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withMedicationReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.medicationReference == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        value,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#informationSource() informationSource} attribute.
   * @param value The value for informationSource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withInformationSource(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "informationSource");
    if (this.informationSource == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        newValue,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#informationSource() informationSource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for informationSource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withInformationSource(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.informationSource == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        value,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withStatusReason(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        newValue,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withStatusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        value,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        newValue,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        value,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        newValue,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        value,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withCategory(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        newValue,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withCategory(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        value,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#dateAsserted() dateAsserted} attribute.
   * @param value The value for dateAsserted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withDateAsserted(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "dateAsserted");
    if (this.dateAsserted == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        newValue,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#dateAsserted() dateAsserted} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateAsserted
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withDateAsserted(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.dateAsserted == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        value,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        newValue,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        value,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#dosage() dosage} attribute.
   * @param value The value for dosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withDosage(java.util.List<com.fhir.Dosage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Dosage> newValue = java.util.Objects.requireNonNull(value, "dosage");
    if (this.dosage == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        newValue,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#dosage() dosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withDosage(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Dosage> value = optional.orElse(null);
    if (this.dosage == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        value,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        newValue,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        value,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * @param value The value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withMedicationCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "medicationCodeableConcept");
    if (this.medicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        newValue,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withMedicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.medicationCodeableConcept == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        value,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        newValue,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        value,
        this.resourceType,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationStatement#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationStatement withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        newValue,
        this.derivedFrom,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withDerivedFrom(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withDerivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationStatement#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationStatement withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationStatement#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationStatement withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicationStatement(
        this.effectivePeriod,
        this.partOf,
        this.status,
        this.id,
        this.effectiveDateTime,
        this.language,
        this.subject,
        this.context,
        this.modifierExtension,
        this.basedOn,
        this.note,
        this.contained,
        this.text,
        this.medicationReference,
        this.informationSource,
        this.statusReason,
        this.implicitRules,
        this.reasonReference,
        this.category,
        this.dateAsserted,
        this.extension,
        this.dosage,
        this.reasonCode,
        this.medicationCodeableConcept,
        this.meta,
        this.resourceType,
        this.derivedFrom,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationStatement} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationStatement
        && equalTo((ImmutableMedicationStatement) another);
  }

  private boolean equalTo(ImmutableMedicationStatement another) {
    return java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(effectiveDateTime, another.effectiveDateTime)
        && java.util.Objects.equals(language, another.language)
        && subject.equals(another.subject)
        && java.util.Objects.equals(context, another.context)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(medicationReference, another.medicationReference)
        && java.util.Objects.equals(informationSource, another.informationSource)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(dateAsserted, another.dateAsserted)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(dosage, another.dosage)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(medicationCodeableConcept, another.medicationCodeableConcept)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(derivedFrom, another.derivedFrom)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code effectivePeriod}, {@code partOf}, {@code status}, {@code id}, {@code effectiveDateTime}, {@code language}, {@code subject}, {@code context}, {@code modifierExtension}, {@code basedOn}, {@code note}, {@code contained}, {@code text}, {@code medicationReference}, {@code informationSource}, {@code statusReason}, {@code implicitRules}, {@code reasonReference}, {@code category}, {@code dateAsserted}, {@code extension}, {@code dosage}, {@code reasonCode}, {@code medicationCodeableConcept}, {@code meta}, {@code resourceType}, {@code derivedFrom}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(effectiveDateTime);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(context);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(medicationReference);
    h += (h << 5) + java.util.Objects.hashCode(informationSource);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(dateAsserted);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(dosage);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(medicationCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(derivedFrom);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationStatement} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicationStatement{");
    if (effectivePeriod != null) {
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (partOf != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (status != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (effectiveDateTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("effectiveDateTime=").append(effectiveDateTime);
    }
    if (language != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("subject=").append(subject);
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (medicationReference != null) {
      builder.append(", ");
      builder.append("medicationReference=").append(medicationReference);
    }
    if (informationSource != null) {
      builder.append(", ");
      builder.append("informationSource=").append(informationSource);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (dateAsserted != null) {
      builder.append(", ");
      builder.append("dateAsserted=").append(dateAsserted);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (dosage != null) {
      builder.append(", ");
      builder.append("dosage=").append(dosage);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (medicationCodeableConcept != null) {
      builder.append(", ");
      builder.append("medicationCodeableConcept=").append(medicationCodeableConcept);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (derivedFrom != null) {
      builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
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
  @org.immutables.value.Generated(from = "MedicationStatement", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicationStatement {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> effectiveDateTime = java.util.Optional.empty();
    boolean effectiveDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> context = java.util.Optional.empty();
    boolean contextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> medicationReference = java.util.Optional.empty();
    boolean medicationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> informationSource = java.util.Optional.empty();
    boolean informationSourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> dateAsserted = java.util.Optional.empty();
    boolean dateAssertedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Dosage>> dosage = java.util.Optional.empty();
    boolean dosageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept = java.util.Optional.empty();
    boolean medicationCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom = java.util.Optional.empty();
    boolean derivedFromIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
    public void setEffectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime) {
      this.effectiveDateTime = effectiveDateTime;
      this.effectiveDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Optional<com.fhir.Reference> context) {
      this.context = context;
      this.contextIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("medicationReference")
    public void setMedicationReference(java.util.Optional<com.fhir.Reference> medicationReference) {
      this.medicationReference = medicationReference;
      this.medicationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("informationSource")
    public void setInformationSource(java.util.Optional<com.fhir.Reference> informationSource) {
      this.informationSource = informationSource;
      this.informationSourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("dateAsserted")
    public void setDateAsserted(java.util.Optional<com.fhir.dateTime> dateAsserted) {
      this.dateAsserted = dateAsserted;
      this.dateAssertedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dosage")
    public void setDosage(java.util.Optional<java.util.List<com.fhir.Dosage>> dosage) {
      this.dosage = dosage;
      this.dosageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medicationCodeableConcept")
    public void setMedicationCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept) {
      this.medicationCodeableConcept = medicationCodeableConcept;
      this.medicationCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public void setDerivedFrom(java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> effectiveDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> context() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> medicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> informationSource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> dateAsserted() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Dosage>> dosage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> medicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> derivedFrom() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicationStatement fromJson(Json json) {
    ImmutableMedicationStatement.Builder builder = ((ImmutableMedicationStatement.Builder) ImmutableMedicationStatement.builder());
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.effectiveDateTimeIsSet) {
      builder.effectiveDateTime(json.effectiveDateTime);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.medicationReferenceIsSet) {
      builder.medicationReference(json.medicationReference);
    }
    if (json.informationSourceIsSet) {
      builder.informationSource(json.informationSource);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.dateAssertedIsSet) {
      builder.dateAsserted(json.dateAsserted);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.dosageIsSet) {
      builder.dosage(json.dosage);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.medicationCodeableConceptIsSet) {
      builder.medicationCodeableConcept(json.medicationCodeableConcept);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableMedicationStatement) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationStatement} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationStatement instance
   */
  public static MedicationStatement copyOf(MedicationStatement instance) {
    if (instance instanceof ImmutableMedicationStatement) {
      return (ImmutableMedicationStatement) instance;
    }
    return ((ImmutableMedicationStatement.Builder) ImmutableMedicationStatement.builder())
        .effectivePeriod(instance.effectivePeriod())
        .partOf(instance.partOf())
        .status(instance.status())
        .id(instance.id())
        .effectiveDateTime(instance.effectiveDateTime())
        .language(instance.language())
        .subject(instance.subject())
        .context(instance.context())
        .modifierExtension(instance.modifierExtension())
        .basedOn(instance.basedOn())
        .note(instance.note())
        .contained(instance.contained())
        .text(instance.text())
        .medicationReference(instance.medicationReference())
        .informationSource(instance.informationSource())
        .statusReason(instance.statusReason())
        .implicitRules(instance.implicitRules())
        .reasonReference(instance.reasonReference())
        .category(instance.category())
        .dateAsserted(instance.dateAsserted())
        .extension(instance.extension())
        .dosage(instance.dosage())
        .reasonCode(instance.reasonCode())
        .medicationCodeableConcept(instance.medicationCodeableConcept())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .derivedFrom(instance.derivedFrom())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationStatement MedicationStatement}.
   * <pre>
   * ImmutableMedicationStatement.builder()
   *    .effectivePeriod(com.fhir.Period) // optional {@link MedicationStatement#effectivePeriod() effectivePeriod}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationStatement#partOf() partOf}
   *    .status(com.fhir.code) // optional {@link MedicationStatement#status() status}
   *    .id(com.fhir.id) // optional {@link MedicationStatement#id() id}
   *    .effectiveDateTime(String) // optional {@link MedicationStatement#effectiveDateTime() effectiveDateTime}
   *    .language(com.fhir.code) // optional {@link MedicationStatement#language() language}
   *    .subject(com.fhir.Reference) // required {@link MedicationStatement#subject() subject}
   *    .context(com.fhir.Reference) // optional {@link MedicationStatement#context() context}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationStatement#modifierExtension() modifierExtension}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationStatement#basedOn() basedOn}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link MedicationStatement#note() note}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicationStatement#contained() contained}
   *    .text(com.fhir.Narrative) // optional {@link MedicationStatement#text() text}
   *    .medicationReference(com.fhir.Reference) // optional {@link MedicationStatement#medicationReference() medicationReference}
   *    .informationSource(com.fhir.Reference) // optional {@link MedicationStatement#informationSource() informationSource}
   *    .statusReason(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationStatement#statusReason() statusReason}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicationStatement#implicitRules() implicitRules}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationStatement#reasonReference() reasonReference}
   *    .category(com.fhir.CodeableConcept) // optional {@link MedicationStatement#category() category}
   *    .dateAsserted(com.fhir.dateTime) // optional {@link MedicationStatement#dateAsserted() dateAsserted}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationStatement#extension() extension}
   *    .dosage(List&amp;lt;com.fhir.Dosage&amp;gt;) // optional {@link MedicationStatement#dosage() dosage}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationStatement#reasonCode() reasonCode}
   *    .medicationCodeableConcept(com.fhir.CodeableConcept) // optional {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept}
   *    .meta(com.fhir.Meta) // optional {@link MedicationStatement#meta() meta}
   *    .resourceType(String) // required {@link MedicationStatement#resourceType() resourceType}
   *    .derivedFrom(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicationStatement#derivedFrom() derivedFrom}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicationStatement#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new MedicationStatement builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableMedicationStatement.Builder();
  }

  /**
   * Builds instances of type {@link MedicationStatement MedicationStatement}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicationStatement", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x1L;
    private static final long OPT_BIT_PART_OF = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EFFECTIVE_DATE_TIME = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_CONTEXT = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_BASED_ON = 0x100L;
    private static final long OPT_BIT_NOTE = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_MEDICATION_REFERENCE = 0x1000L;
    private static final long OPT_BIT_INFORMATION_SOURCE = 0x2000L;
    private static final long OPT_BIT_STATUS_REASON = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x10000L;
    private static final long OPT_BIT_CATEGORY = 0x20000L;
    private static final long OPT_BIT_DATE_ASSERTED = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_DOSAGE = 0x100000L;
    private static final long OPT_BIT_REASON_CODE = 0x200000L;
    private static final long OPT_BIT_MEDICATION_CODEABLE_CONCEPT = 0x400000L;
    private static final long OPT_BIT_META = 0x800000L;
    private static final long OPT_BIT_DERIVED_FROM = 0x1000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String effectiveDateTime;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.Reference context;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference medicationReference;
    private @javax.annotation.Nullable com.fhir.Reference informationSource;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> statusReason;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable com.fhir.dateTime dateAsserted;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosage;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable com.fhir.CodeableConcept medicationCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> derivedFrom;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationStatement#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link MedicationStatement#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link MedicationStatement#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link MedicationStatement#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link MedicationStatement#status() status} to status.
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
     * Initializes the optional value {@link MedicationStatement#status() status} to status.
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
     * Initializes the optional value {@link MedicationStatement#id() id} to id.
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
     * Initializes the optional value {@link MedicationStatement#id() id} to id.
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
     * Initializes the optional value {@link MedicationStatement#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
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
     * Initializes the optional value {@link MedicationStatement#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
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
     * Initializes the optional value {@link MedicationStatement#language() language} to language.
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
     * Initializes the optional value {@link MedicationStatement#language() language} to language.
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
     * Initializes the value for the {@link MedicationStatement#subject() subject} attribute.
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
     * Initializes the optional value {@link MedicationStatement#context() context} to context.
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
     * Initializes the optional value {@link MedicationStatement#context() context} to context.
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
     * Initializes the optional value {@link MedicationStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationStatement#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationStatement#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link MedicationStatement#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link MedicationStatement#note() note} to note.
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
     * Initializes the optional value {@link MedicationStatement#note() note} to note.
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
     * Initializes the optional value {@link MedicationStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationStatement#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicationStatement#text() text} to text.
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
     * Initializes the optional value {@link MedicationStatement#text() text} to text.
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
     * Initializes the optional value {@link MedicationStatement#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationStatement#medicationReference() medicationReference} to medicationReference.
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
     * Initializes the optional value {@link MedicationStatement#informationSource() informationSource} to informationSource.
     * @param informationSource The value for informationSource
     * @return {@code this} builder for chained invocation
     */
    public final Builder informationSource(com.fhir.Reference informationSource) {
      checkNotIsSet(informationSourceIsSet(), "informationSource");
      this.informationSource = java.util.Objects.requireNonNull(informationSource, "informationSource");
      optBits |= OPT_BIT_INFORMATION_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#informationSource() informationSource} to informationSource.
     * @param informationSource The value for informationSource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("informationSource")
    public final Builder informationSource(java.util.Optional<? extends com.fhir.Reference> informationSource) {
      checkNotIsSet(informationSourceIsSet(), "informationSource");
      this.informationSource = informationSource.orElse(null);
      optBits |= OPT_BIT_INFORMATION_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link MedicationStatement#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link MedicationStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationStatement#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicationStatement#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationStatement#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link MedicationStatement#category() category} to category.
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
     * Initializes the optional value {@link MedicationStatement#category() category} to category.
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
     * Initializes the optional value {@link MedicationStatement#dateAsserted() dateAsserted} to dateAsserted.
     * @param dateAsserted The value for dateAsserted
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateAsserted(com.fhir.dateTime dateAsserted) {
      checkNotIsSet(dateAssertedIsSet(), "dateAsserted");
      this.dateAsserted = java.util.Objects.requireNonNull(dateAsserted, "dateAsserted");
      optBits |= OPT_BIT_DATE_ASSERTED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#dateAsserted() dateAsserted} to dateAsserted.
     * @param dateAsserted The value for dateAsserted
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateAsserted")
    public final Builder dateAsserted(java.util.Optional<? extends com.fhir.dateTime> dateAsserted) {
      checkNotIsSet(dateAssertedIsSet(), "dateAsserted");
      this.dateAsserted = dateAsserted.orElse(null);
      optBits |= OPT_BIT_DATE_ASSERTED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationStatement#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationStatement#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosage(java.util.List<com.fhir.Dosage> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = java.util.Objects.requireNonNull(dosage, "dosage");
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dosage")
    public final Builder dosage(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = dosage.orElse(null);
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationStatement#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
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
     * Initializes the optional value {@link MedicationStatement#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicationStatement#meta() meta} to meta.
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
     * Initializes the value for the {@link MedicationStatement#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicationStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(java.util.List<com.fhir.Reference> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = java.util.Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public final Builder derivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationStatement#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicationStatement#identifier() identifier} to identifier.
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
     * Builds a new {@link MedicationStatement MedicationStatement}.
     * @return An immutable instance of MedicationStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicationStatement build() {
      checkRequiredAttributes();
      return new ImmutableMedicationStatement(
          effectivePeriod,
          partOf,
          status,
          id,
          effectiveDateTime,
          language,
          subject,
          context,
          modifierExtension,
          basedOn,
          note,
          contained,
          text,
          medicationReference,
          informationSource,
          statusReason,
          implicitRules,
          reasonReference,
          category,
          dateAsserted,
          extension,
          dosage,
          reasonCode,
          medicationCodeableConcept,
          meta,
          resourceType,
          derivedFrom,
          identifier);
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean effectiveDateTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE_TIME) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean medicationReferenceIsSet() {
      return (optBits & OPT_BIT_MEDICATION_REFERENCE) != 0;
    }

    private boolean informationSourceIsSet() {
      return (optBits & OPT_BIT_INFORMATION_SOURCE) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean dateAssertedIsSet() {
      return (optBits & OPT_BIT_DATE_ASSERTED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dosageIsSet() {
      return (optBits & OPT_BIT_DOSAGE) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean medicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MEDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
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
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicationStatement is strict, attribute is already set: ".concat(name));
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
      return "Cannot build MedicationStatement, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicationStatement", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link MedicationStatement#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "MedicationStatement", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationStatement#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicationStatement", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationStatement#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link MedicationStatement#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link MedicationStatement#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link MedicationStatement#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link MedicationStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link MedicationStatement#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link MedicationStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicationStatement#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicationStatement#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectiveDateTime(java.lang.String effectiveDateTime);

    /**
     * Initializes the optional value {@link MedicationStatement#effectiveDateTime() effectiveDateTime} to effectiveDateTime.
     * @param effectiveDateTime The value for effectiveDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectiveDateTime(java.util.Optional<java.lang.String> effectiveDateTime);

    /**
     * Initializes the optional value {@link MedicationStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicationStatement#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicationStatement#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(com.fhir.Reference context);

    /**
     * Initializes the optional value {@link MedicationStatement#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(java.util.Optional<? extends com.fhir.Reference> context);

    /**
     * Initializes the optional value {@link MedicationStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationStatement#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link MedicationStatement#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link MedicationStatement#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link MedicationStatement#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link MedicationStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicationStatement#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicationStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicationStatement#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicationStatement#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationReference(com.fhir.Reference medicationReference);

    /**
     * Initializes the optional value {@link MedicationStatement#medicationReference() medicationReference} to medicationReference.
     * @param medicationReference The value for medicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationReference(java.util.Optional<? extends com.fhir.Reference> medicationReference);

    /**
     * Initializes the optional value {@link MedicationStatement#informationSource() informationSource} to informationSource.
     * @param informationSource The value for informationSource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal informationSource(com.fhir.Reference informationSource);

    /**
     * Initializes the optional value {@link MedicationStatement#informationSource() informationSource} to informationSource.
     * @param informationSource The value for informationSource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal informationSource(java.util.Optional<? extends com.fhir.Reference> informationSource);

    /**
     * Initializes the optional value {@link MedicationStatement#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(java.util.List<com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link MedicationStatement#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> statusReason);

    /**
     * Initializes the optional value {@link MedicationStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicationStatement#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicationStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link MedicationStatement#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link MedicationStatement#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);

    /**
     * Initializes the optional value {@link MedicationStatement#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link MedicationStatement#dateAsserted() dateAsserted} to dateAsserted.
     * @param dateAsserted The value for dateAsserted
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateAsserted(com.fhir.dateTime dateAsserted);

    /**
     * Initializes the optional value {@link MedicationStatement#dateAsserted() dateAsserted} to dateAsserted.
     * @param dateAsserted The value for dateAsserted
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateAsserted(java.util.Optional<? extends com.fhir.dateTime> dateAsserted);

    /**
     * Initializes the optional value {@link MedicationStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicationStatement#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationStatement#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosage(java.util.List<com.fhir.Dosage> dosage);

    /**
     * Initializes the optional value {@link MedicationStatement#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosage(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> dosage);

    /**
     * Initializes the optional value {@link MedicationStatement#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link MedicationStatement#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medicationCodeableConcept(com.fhir.CodeableConcept medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationStatement#medicationCodeableConcept() medicationCodeableConcept} to medicationCodeableConcept.
     * @param medicationCodeableConcept The value for medicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medicationCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> medicationCodeableConcept);

    /**
     * Initializes the optional value {@link MedicationStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicationStatement#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicationStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(java.util.List<com.fhir.Reference> derivedFrom);

    /**
     * Initializes the optional value {@link MedicationStatement#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(java.util.Optional<? extends java.util.List<com.fhir.Reference>> derivedFrom);

    /**
     * Initializes the optional value {@link MedicationStatement#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicationStatement#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Builds a new {@link MedicationStatement MedicationStatement}.
     * @return An immutable instance of MedicationStatement
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationStatement build();
  }
}
