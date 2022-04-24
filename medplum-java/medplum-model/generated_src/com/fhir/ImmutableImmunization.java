//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Immunization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunization.builder()}.
 */
@org.immutables.value.Generated(from = "Immunization", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunization implements com.fhir.Immunization {
  private final com.fhir.Reference patient;
  private final com.fhir.CodeableConcept vaccineCode;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.Quantity doseQuantity;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept reportOrigin;
  private final @javax.annotation.Nullable java.lang.String lotNumber;
  private final @javax.annotation.Nullable com.fhir.dateTime recorded;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Education> education;
  private final @javax.annotation.Nullable com.fhir.date expirationDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept site;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Reaction> reaction;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.String occurrenceDateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programEligibility;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept route;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept fundingSource;
  private final @javax.annotation.Nullable com.fhir.Reference manufacturer;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Performer> performer;
  private final @javax.annotation.Nullable java.lang.Boolean isSubpotent;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable java.lang.Boolean primarySource;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Immunization_ProtocolApplied> protocolApplied;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subpotentReason;
  private final @javax.annotation.Nullable java.lang.String occurrenceString;

  private ImmutableImmunization(
      com.fhir.Reference patient,
      com.fhir.CodeableConcept vaccineCode,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.Quantity doseQuantity,
      @javax.annotation.Nullable com.fhir.CodeableConcept reportOrigin,
      @javax.annotation.Nullable java.lang.String lotNumber,
      @javax.annotation.Nullable com.fhir.dateTime recorded,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReason,
      @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Education> education,
      @javax.annotation.Nullable com.fhir.date expirationDate,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept site,
      @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Reaction> reaction,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.String occurrenceDateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programEligibility,
      @javax.annotation.Nullable com.fhir.CodeableConcept route,
      @javax.annotation.Nullable com.fhir.CodeableConcept fundingSource,
      @javax.annotation.Nullable com.fhir.Reference manufacturer,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Performer> performer,
      @javax.annotation.Nullable java.lang.Boolean isSubpotent,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable java.lang.Boolean primarySource,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Immunization_ProtocolApplied> protocolApplied,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subpotentReason,
      @javax.annotation.Nullable java.lang.String occurrenceString) {
    this.patient = patient;
    this.vaccineCode = vaccineCode;
    this.status = status;
    this.doseQuantity = doseQuantity;
    this.reportOrigin = reportOrigin;
    this.lotNumber = lotNumber;
    this.recorded = recorded;
    this.resourceType = resourceType;
    this.contained = contained;
    this.reasonReference = reasonReference;
    this.meta = meta;
    this.language = language;
    this.statusReason = statusReason;
    this.education = education;
    this.expirationDate = expirationDate;
    this.modifierExtension = modifierExtension;
    this.site = site;
    this.reaction = reaction;
    this.text = text;
    this.occurrenceDateTime = occurrenceDateTime;
    this.programEligibility = programEligibility;
    this.route = route;
    this.fundingSource = fundingSource;
    this.manufacturer = manufacturer;
    this.id = id;
    this.performer = performer;
    this.isSubpotent = isSubpotent;
    this.encounter = encounter;
    this.primarySource = primarySource;
    this.extension = extension;
    this.protocolApplied = protocolApplied;
    this.location = location;
    this.reasonCode = reasonCode;
    this.implicitRules = implicitRules;
    this.note = note;
    this.identifier = identifier;
    this.subpotentReason = subpotentReason;
    this.occurrenceString = occurrenceString;
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public com.fhir.Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code vaccineCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("vaccineCode")
  @Override
  public com.fhir.CodeableConcept vaccineCode() {
    return vaccineCode;
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
   * @return The value of the {@code doseQuantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doseQuantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> doseQuantity() {
    return java.util.Optional.ofNullable(doseQuantity);
  }

  /**
   * @return The value of the {@code reportOrigin} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reportOrigin")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> reportOrigin() {
    return java.util.Optional.ofNullable(reportOrigin);
  }

  /**
   * @return The value of the {@code lotNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lotNumber")
  @Override
  public java.util.Optional<java.lang.String> lotNumber() {
    return java.util.Optional.ofNullable(lotNumber);
  }

  /**
   * @return The value of the {@code recorded} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recorded")
  @Override
  public java.util.Optional<com.fhir.dateTime> recorded() {
    return java.util.Optional.ofNullable(recorded);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code education} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("education")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Immunization_Education>> education() {
    return java.util.Optional.ofNullable(education);
  }

  /**
   * @return The value of the {@code expirationDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
  @Override
  public java.util.Optional<com.fhir.date> expirationDate() {
    return java.util.Optional.ofNullable(expirationDate);
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
   * @return The value of the {@code site} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("site")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> site() {
    return java.util.Optional.ofNullable(site);
  }

  /**
   * @return The value of the {@code reaction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reaction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Immunization_Reaction>> reaction() {
    return java.util.Optional.ofNullable(reaction);
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
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
  @Override
  public java.util.Optional<java.lang.String> occurrenceDateTime() {
    return java.util.Optional.ofNullable(occurrenceDateTime);
  }

  /**
   * @return The value of the {@code programEligibility} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("programEligibility")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programEligibility() {
    return java.util.Optional.ofNullable(programEligibility);
  }

  /**
   * @return The value of the {@code route} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("route")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> route() {
    return java.util.Optional.ofNullable(route);
  }

  /**
   * @return The value of the {@code fundingSource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fundingSource")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> fundingSource() {
    return java.util.Optional.ofNullable(fundingSource);
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
  @Override
  public java.util.Optional<com.fhir.Reference> manufacturer() {
    return java.util.Optional.ofNullable(manufacturer);
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
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Immunization_Performer>> performer() {
    return java.util.Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code isSubpotent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("isSubpotent")
  @Override
  public java.util.Optional<java.lang.Boolean> isSubpotent() {
    return java.util.Optional.ofNullable(isSubpotent);
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
   * @return The value of the {@code primarySource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("primarySource")
  @Override
  public java.util.Optional<java.lang.Boolean> primarySource() {
    return java.util.Optional.ofNullable(primarySource);
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
   * @return The value of the {@code protocolApplied} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("protocolApplied")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Immunization_ProtocolApplied>> protocolApplied() {
    return java.util.Optional.ofNullable(protocolApplied);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code subpotentReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subpotentReason")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subpotentReason() {
    return java.util.Optional.ofNullable(subpotentReason);
  }

  /**
   * @return The value of the {@code occurrenceString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceString")
  @Override
  public java.util.Optional<java.lang.String> occurrenceString() {
    return java.util.Optional.ofNullable(occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Immunization#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunization withPatient(com.fhir.Reference value) {
    if (this.patient == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    return new ImmutableImmunization(
        newValue,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Immunization#vaccineCode() vaccineCode} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for vaccineCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunization withVaccineCode(com.fhir.CodeableConcept value) {
    if (this.vaccineCode == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "vaccineCode");
    return new ImmutableImmunization(
        this.patient,
        newValue,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        newValue,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        value,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#doseQuantity() doseQuantity} attribute.
   * @param value The value for doseQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withDoseQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "doseQuantity");
    if (this.doseQuantity == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        newValue,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#doseQuantity() doseQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withDoseQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.doseQuantity == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        value,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#reportOrigin() reportOrigin} attribute.
   * @param value The value for reportOrigin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withReportOrigin(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "reportOrigin");
    if (this.reportOrigin == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        newValue,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#reportOrigin() reportOrigin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reportOrigin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withReportOrigin(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.reportOrigin == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        value,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#lotNumber() lotNumber} attribute.
   * @param value The value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withLotNumber(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "lotNumber");
    if (java.util.Objects.equals(this.lotNumber, newValue)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        newValue,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#lotNumber() lotNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withLotNumber(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.lotNumber, value)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        value,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#recorded() recorded} attribute.
   * @param value The value for recorded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withRecorded(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "recorded");
    if (this.recorded == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        newValue,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#recorded() recorded} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorded
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withRecorded(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.recorded == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        value,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Immunization#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunization withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        newValue,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        newValue,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        value,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        newValue,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        value,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        newValue,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        value,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        newValue,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        value,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withStatusReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        newValue,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withStatusReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        value,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#education() education} attribute.
   * @param value The value for education
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withEducation(java.util.List<com.fhir.Immunization_Education> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Education> newValue = java.util.Objects.requireNonNull(value, "education");
    if (this.education == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        newValue,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#education() education} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for education
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withEducation(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Education>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Education> value = optional.orElse(null);
    if (this.education == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        value,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#expirationDate() expirationDate} attribute.
   * @param value The value for expirationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withExpirationDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "expirationDate");
    if (this.expirationDate == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        newValue,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#expirationDate() expirationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expirationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withExpirationDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.expirationDate == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        value,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        newValue,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        value,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withSite(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "site");
    if (this.site == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        newValue,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#site() site} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withSite(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.site == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        value,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#reaction() reaction} attribute.
   * @param value The value for reaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withReaction(java.util.List<com.fhir.Immunization_Reaction> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Reaction> newValue = java.util.Objects.requireNonNull(value, "reaction");
    if (this.reaction == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        newValue,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#reaction() reaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withReaction(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Reaction>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Reaction> value = optional.orElse(null);
    if (this.reaction == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        value,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        newValue,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        value,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withOccurrenceDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (java.util.Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        newValue,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withOccurrenceDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        value,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#programEligibility() programEligibility} attribute.
   * @param value The value for programEligibility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withProgramEligibility(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "programEligibility");
    if (this.programEligibility == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        newValue,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#programEligibility() programEligibility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programEligibility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withProgramEligibility(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.programEligibility == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        value,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#route() route} attribute.
   * @param value The value for route
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withRoute(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "route");
    if (this.route == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        newValue,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#route() route} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for route
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withRoute(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.route == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        value,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#fundingSource() fundingSource} attribute.
   * @param value The value for fundingSource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withFundingSource(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "fundingSource");
    if (this.fundingSource == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        newValue,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#fundingSource() fundingSource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundingSource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withFundingSource(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.fundingSource == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        value,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withManufacturer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        newValue,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withManufacturer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        value,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        newValue,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        value,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withPerformer(java.util.List<com.fhir.Immunization_Performer> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Performer> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        newValue,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withPerformer(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Performer>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        value,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#isSubpotent() isSubpotent} attribute.
   * @param value The value for isSubpotent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withIsSubpotent(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.isSubpotent, newValue)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        newValue,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#isSubpotent() isSubpotent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isSubpotent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withIsSubpotent(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.isSubpotent, value)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        value,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        newValue,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        value,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#primarySource() primarySource} attribute.
   * @param value The value for primarySource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withPrimarySource(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.primarySource, newValue)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        newValue,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#primarySource() primarySource} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for primarySource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withPrimarySource(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.primarySource, value)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        value,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        newValue,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        value,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#protocolApplied() protocolApplied} attribute.
   * @param value The value for protocolApplied
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withProtocolApplied(java.util.List<com.fhir.Immunization_ProtocolApplied> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Immunization_ProtocolApplied> newValue = java.util.Objects.requireNonNull(value, "protocolApplied");
    if (this.protocolApplied == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        newValue,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#protocolApplied() protocolApplied} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for protocolApplied
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withProtocolApplied(java.util.Optional<? extends java.util.List<com.fhir.Immunization_ProtocolApplied>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Immunization_ProtocolApplied> value = optional.orElse(null);
    if (this.protocolApplied == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        value,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        newValue,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        value,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        newValue,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        value,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        newValue,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        value,
        this.note,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        newValue,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        value,
        this.identifier,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        newValue,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        value,
        this.subpotentReason,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#subpotentReason() subpotentReason} attribute.
   * @param value The value for subpotentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withSubpotentReason(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "subpotentReason");
    if (this.subpotentReason == newValue) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        newValue,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#subpotentReason() subpotentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subpotentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withSubpotentReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.subpotentReason == value) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        value,
        this.occurrenceString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#occurrenceString() occurrenceString} attribute.
   * @param value The value for occurrenceString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withOccurrenceString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceString");
    if (java.util.Objects.equals(this.occurrenceString, newValue)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#occurrenceString() occurrenceString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withOccurrenceString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceString, value)) return this;
    return new ImmutableImmunization(
        this.patient,
        this.vaccineCode,
        this.status,
        this.doseQuantity,
        this.reportOrigin,
        this.lotNumber,
        this.recorded,
        this.resourceType,
        this.contained,
        this.reasonReference,
        this.meta,
        this.language,
        this.statusReason,
        this.education,
        this.expirationDate,
        this.modifierExtension,
        this.site,
        this.reaction,
        this.text,
        this.occurrenceDateTime,
        this.programEligibility,
        this.route,
        this.fundingSource,
        this.manufacturer,
        this.id,
        this.performer,
        this.isSubpotent,
        this.encounter,
        this.primarySource,
        this.extension,
        this.protocolApplied,
        this.location,
        this.reasonCode,
        this.implicitRules,
        this.note,
        this.identifier,
        this.subpotentReason,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunization
        && equalTo((ImmutableImmunization) another);
  }

  private boolean equalTo(ImmutableImmunization another) {
    return patient.equals(another.patient)
        && vaccineCode.equals(another.vaccineCode)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(doseQuantity, another.doseQuantity)
        && java.util.Objects.equals(reportOrigin, another.reportOrigin)
        && java.util.Objects.equals(lotNumber, another.lotNumber)
        && java.util.Objects.equals(recorded, another.recorded)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(education, another.education)
        && java.util.Objects.equals(expirationDate, another.expirationDate)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(site, another.site)
        && java.util.Objects.equals(reaction, another.reaction)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && java.util.Objects.equals(programEligibility, another.programEligibility)
        && java.util.Objects.equals(route, another.route)
        && java.util.Objects.equals(fundingSource, another.fundingSource)
        && java.util.Objects.equals(manufacturer, another.manufacturer)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(isSubpotent, another.isSubpotent)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(primarySource, another.primarySource)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(protocolApplied, another.protocolApplied)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(subpotentReason, another.subpotentReason)
        && java.util.Objects.equals(occurrenceString, another.occurrenceString);
  }

  /**
   * Computes a hash code from attributes: {@code patient}, {@code vaccineCode}, {@code status}, {@code doseQuantity}, {@code reportOrigin}, {@code lotNumber}, {@code recorded}, {@code resourceType}, {@code contained}, {@code reasonReference}, {@code meta}, {@code language}, {@code statusReason}, {@code education}, {@code expirationDate}, {@code modifierExtension}, {@code site}, {@code reaction}, {@code text}, {@code occurrenceDateTime}, {@code programEligibility}, {@code route}, {@code fundingSource}, {@code manufacturer}, {@code id}, {@code performer}, {@code isSubpotent}, {@code encounter}, {@code primarySource}, {@code extension}, {@code protocolApplied}, {@code location}, {@code reasonCode}, {@code implicitRules}, {@code note}, {@code identifier}, {@code subpotentReason}, {@code occurrenceString}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + vaccineCode.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(doseQuantity);
    h += (h << 5) + java.util.Objects.hashCode(reportOrigin);
    h += (h << 5) + java.util.Objects.hashCode(lotNumber);
    h += (h << 5) + java.util.Objects.hashCode(recorded);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(education);
    h += (h << 5) + java.util.Objects.hashCode(expirationDate);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(site);
    h += (h << 5) + java.util.Objects.hashCode(reaction);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + java.util.Objects.hashCode(programEligibility);
    h += (h << 5) + java.util.Objects.hashCode(route);
    h += (h << 5) + java.util.Objects.hashCode(fundingSource);
    h += (h << 5) + java.util.Objects.hashCode(manufacturer);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(isSubpotent);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(primarySource);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(protocolApplied);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(subpotentReason);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceString);
    return h;
  }

  /**
   * Prints the immutable value {@code Immunization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Immunization{");
    builder.append("patient=").append(patient);
    builder.append(", ");
    builder.append("vaccineCode=").append(vaccineCode);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (doseQuantity != null) {
      builder.append(", ");
      builder.append("doseQuantity=").append(doseQuantity);
    }
    if (reportOrigin != null) {
      builder.append(", ");
      builder.append("reportOrigin=").append(reportOrigin);
    }
    if (lotNumber != null) {
      builder.append(", ");
      builder.append("lotNumber=").append(lotNumber);
    }
    if (recorded != null) {
      builder.append(", ");
      builder.append("recorded=").append(recorded);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (education != null) {
      builder.append(", ");
      builder.append("education=").append(education);
    }
    if (expirationDate != null) {
      builder.append(", ");
      builder.append("expirationDate=").append(expirationDate);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (site != null) {
      builder.append(", ");
      builder.append("site=").append(site);
    }
    if (reaction != null) {
      builder.append(", ");
      builder.append("reaction=").append(reaction);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (programEligibility != null) {
      builder.append(", ");
      builder.append("programEligibility=").append(programEligibility);
    }
    if (route != null) {
      builder.append(", ");
      builder.append("route=").append(route);
    }
    if (fundingSource != null) {
      builder.append(", ");
      builder.append("fundingSource=").append(fundingSource);
    }
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (isSubpotent != null) {
      builder.append(", ");
      builder.append("isSubpotent=").append(isSubpotent);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (primarySource != null) {
      builder.append(", ");
      builder.append("primarySource=").append(primarySource);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (protocolApplied != null) {
      builder.append(", ");
      builder.append("protocolApplied=").append(protocolApplied);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (subpotentReason != null) {
      builder.append(", ");
      builder.append("subpotentReason=").append(subpotentReason);
    }
    if (occurrenceString != null) {
      builder.append(", ");
      builder.append("occurrenceString=").append(occurrenceString);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Immunization", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Immunization {
    @javax.annotation.Nullable com.fhir.Reference patient;
    @javax.annotation.Nullable com.fhir.CodeableConcept vaccineCode;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> doseQuantity = java.util.Optional.empty();
    boolean doseQuantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> reportOrigin = java.util.Optional.empty();
    boolean reportOriginIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> lotNumber = java.util.Optional.empty();
    boolean lotNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> recorded = java.util.Optional.empty();
    boolean recordedIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Immunization_Education>> education = java.util.Optional.empty();
    boolean educationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> expirationDate = java.util.Optional.empty();
    boolean expirationDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> site = java.util.Optional.empty();
    boolean siteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Immunization_Reaction>> reaction = java.util.Optional.empty();
    boolean reactionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programEligibility = java.util.Optional.empty();
    boolean programEligibilityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> route = java.util.Optional.empty();
    boolean routeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> fundingSource = java.util.Optional.empty();
    boolean fundingSourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> manufacturer = java.util.Optional.empty();
    boolean manufacturerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Immunization_Performer>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> isSubpotent = java.util.Optional.empty();
    boolean isSubpotentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> primarySource = java.util.Optional.empty();
    boolean primarySourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Immunization_ProtocolApplied>> protocolApplied = java.util.Optional.empty();
    boolean protocolAppliedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subpotentReason = java.util.Optional.empty();
    boolean subpotentReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceString = java.util.Optional.empty();
    boolean occurrenceStringIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(com.fhir.Reference patient) {
      this.patient = patient;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("vaccineCode")
    public void setVaccineCode(com.fhir.CodeableConcept vaccineCode) {
      this.vaccineCode = vaccineCode;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doseQuantity")
    public void setDoseQuantity(java.util.Optional<com.fhir.Quantity> doseQuantity) {
      this.doseQuantity = doseQuantity;
      this.doseQuantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reportOrigin")
    public void setReportOrigin(java.util.Optional<com.fhir.CodeableConcept> reportOrigin) {
      this.reportOrigin = reportOrigin;
      this.reportOriginIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lotNumber")
    public void setLotNumber(java.util.Optional<java.lang.String> lotNumber) {
      this.lotNumber = lotNumber;
      this.lotNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recorded")
    public void setRecorded(java.util.Optional<com.fhir.dateTime> recorded) {
      this.recorded = recorded;
      this.recordedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<com.fhir.CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("education")
    public void setEducation(java.util.Optional<java.util.List<com.fhir.Immunization_Education>> education) {
      this.education = education;
      this.educationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    public void setExpirationDate(java.util.Optional<com.fhir.date> expirationDate) {
      this.expirationDate = expirationDate;
      this.expirationDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("site")
    public void setSite(java.util.Optional<com.fhir.CodeableConcept> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reaction")
    public void setReaction(java.util.Optional<java.util.List<com.fhir.Immunization_Reaction>> reaction) {
      this.reaction = reaction;
      this.reactionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("programEligibility")
    public void setProgramEligibility(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programEligibility) {
      this.programEligibility = programEligibility;
      this.programEligibilityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("route")
    public void setRoute(java.util.Optional<com.fhir.CodeableConcept> route) {
      this.route = route;
      this.routeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fundingSource")
    public void setFundingSource(java.util.Optional<com.fhir.CodeableConcept> fundingSource) {
      this.fundingSource = fundingSource;
      this.fundingSourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public void setManufacturer(java.util.Optional<com.fhir.Reference> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.Immunization_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("isSubpotent")
    public void setIsSubpotent(java.util.Optional<java.lang.Boolean> isSubpotent) {
      this.isSubpotent = isSubpotent;
      this.isSubpotentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("primarySource")
    public void setPrimarySource(java.util.Optional<java.lang.Boolean> primarySource) {
      this.primarySource = primarySource;
      this.primarySourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("protocolApplied")
    public void setProtocolApplied(java.util.Optional<java.util.List<com.fhir.Immunization_ProtocolApplied>> protocolApplied) {
      this.protocolApplied = protocolApplied;
      this.protocolAppliedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subpotentReason")
    public void setSubpotentReason(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subpotentReason) {
      this.subpotentReason = subpotentReason;
      this.subpotentReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceString")
    public void setOccurrenceString(java.util.Optional<java.lang.String> occurrenceString) {
      this.occurrenceString = occurrenceString;
      this.occurrenceStringIsSet = true;
    }
    @Override
    public com.fhir.Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept vaccineCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> doseQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> reportOrigin() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> lotNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> recorded() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Immunization_Education>> education() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> expirationDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> site() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Immunization_Reaction>> reaction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> programEligibility() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> route() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> fundingSource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Immunization_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> isSubpotent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> primarySource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Immunization_ProtocolApplied>> protocolApplied() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subpotentReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceString() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImmunization fromJson(Json json) {
    ImmutableImmunization.Builder builder = ((ImmutableImmunization.Builder) ImmutableImmunization.builder());
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.vaccineCode != null) {
      builder.vaccineCode(json.vaccineCode);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.doseQuantityIsSet) {
      builder.doseQuantity(json.doseQuantity);
    }
    if (json.reportOriginIsSet) {
      builder.reportOrigin(json.reportOrigin);
    }
    if (json.lotNumberIsSet) {
      builder.lotNumber(json.lotNumber);
    }
    if (json.recordedIsSet) {
      builder.recorded(json.recorded);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.educationIsSet) {
      builder.education(json.education);
    }
    if (json.expirationDateIsSet) {
      builder.expirationDate(json.expirationDate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.reactionIsSet) {
      builder.reaction(json.reaction);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.programEligibilityIsSet) {
      builder.programEligibility(json.programEligibility);
    }
    if (json.routeIsSet) {
      builder.route(json.route);
    }
    if (json.fundingSourceIsSet) {
      builder.fundingSource(json.fundingSource);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.isSubpotentIsSet) {
      builder.isSubpotent(json.isSubpotent);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.primarySourceIsSet) {
      builder.primarySource(json.primarySource);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.protocolAppliedIsSet) {
      builder.protocolApplied(json.protocolApplied);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.subpotentReasonIsSet) {
      builder.subpotentReason(json.subpotentReason);
    }
    if (json.occurrenceStringIsSet) {
      builder.occurrenceString(json.occurrenceString);
    }
    return (ImmutableImmunization) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Immunization} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Immunization instance
   */
  public static Immunization copyOf(Immunization instance) {
    if (instance instanceof ImmutableImmunization) {
      return (ImmutableImmunization) instance;
    }
    return ((ImmutableImmunization.Builder) ImmutableImmunization.builder())
        .patient(instance.patient())
        .vaccineCode(instance.vaccineCode())
        .status(instance.status())
        .doseQuantity(instance.doseQuantity())
        .reportOrigin(instance.reportOrigin())
        .lotNumber(instance.lotNumber())
        .recorded(instance.recorded())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .reasonReference(instance.reasonReference())
        .meta(instance.meta())
        .language(instance.language())
        .statusReason(instance.statusReason())
        .education(instance.education())
        .expirationDate(instance.expirationDate())
        .modifierExtension(instance.modifierExtension())
        .site(instance.site())
        .reaction(instance.reaction())
        .text(instance.text())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .programEligibility(instance.programEligibility())
        .route(instance.route())
        .fundingSource(instance.fundingSource())
        .manufacturer(instance.manufacturer())
        .id(instance.id())
        .performer(instance.performer())
        .isSubpotent(instance.isSubpotent())
        .encounter(instance.encounter())
        .primarySource(instance.primarySource())
        .extension(instance.extension())
        .protocolApplied(instance.protocolApplied())
        .location(instance.location())
        .reasonCode(instance.reasonCode())
        .implicitRules(instance.implicitRules())
        .note(instance.note())
        .identifier(instance.identifier())
        .subpotentReason(instance.subpotentReason())
        .occurrenceString(instance.occurrenceString())
        .build();
  }

  /**
   * Creates a builder for {@link Immunization Immunization}.
   * <pre>
   * ImmutableImmunization.builder()
   *    .patient(com.fhir.Reference) // required {@link Immunization#patient() patient}
   *    .vaccineCode(com.fhir.CodeableConcept) // required {@link Immunization#vaccineCode() vaccineCode}
   *    .status(com.fhir.code) // optional {@link Immunization#status() status}
   *    .doseQuantity(com.fhir.Quantity) // optional {@link Immunization#doseQuantity() doseQuantity}
   *    .reportOrigin(com.fhir.CodeableConcept) // optional {@link Immunization#reportOrigin() reportOrigin}
   *    .lotNumber(String) // optional {@link Immunization#lotNumber() lotNumber}
   *    .recorded(com.fhir.dateTime) // optional {@link Immunization#recorded() recorded}
   *    .resourceType(String) // required {@link Immunization#resourceType() resourceType}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Immunization#contained() contained}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Immunization#reasonReference() reasonReference}
   *    .meta(com.fhir.Meta) // optional {@link Immunization#meta() meta}
   *    .language(com.fhir.code) // optional {@link Immunization#language() language}
   *    .statusReason(com.fhir.CodeableConcept) // optional {@link Immunization#statusReason() statusReason}
   *    .education(List&amp;lt;com.fhir.Immunization_Education&amp;gt;) // optional {@link Immunization#education() education}
   *    .expirationDate(com.fhir.date) // optional {@link Immunization#expirationDate() expirationDate}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Immunization#modifierExtension() modifierExtension}
   *    .site(com.fhir.CodeableConcept) // optional {@link Immunization#site() site}
   *    .reaction(List&amp;lt;com.fhir.Immunization_Reaction&amp;gt;) // optional {@link Immunization#reaction() reaction}
   *    .text(com.fhir.Narrative) // optional {@link Immunization#text() text}
   *    .occurrenceDateTime(String) // optional {@link Immunization#occurrenceDateTime() occurrenceDateTime}
   *    .programEligibility(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Immunization#programEligibility() programEligibility}
   *    .route(com.fhir.CodeableConcept) // optional {@link Immunization#route() route}
   *    .fundingSource(com.fhir.CodeableConcept) // optional {@link Immunization#fundingSource() fundingSource}
   *    .manufacturer(com.fhir.Reference) // optional {@link Immunization#manufacturer() manufacturer}
   *    .id(com.fhir.id) // optional {@link Immunization#id() id}
   *    .performer(List&amp;lt;com.fhir.Immunization_Performer&amp;gt;) // optional {@link Immunization#performer() performer}
   *    .isSubpotent(Boolean) // optional {@link Immunization#isSubpotent() isSubpotent}
   *    .encounter(com.fhir.Reference) // optional {@link Immunization#encounter() encounter}
   *    .primarySource(Boolean) // optional {@link Immunization#primarySource() primarySource}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Immunization#extension() extension}
   *    .protocolApplied(List&amp;lt;com.fhir.Immunization_ProtocolApplied&amp;gt;) // optional {@link Immunization#protocolApplied() protocolApplied}
   *    .location(com.fhir.Reference) // optional {@link Immunization#location() location}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Immunization#reasonCode() reasonCode}
   *    .implicitRules(com.fhir.uri) // optional {@link Immunization#implicitRules() implicitRules}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Immunization#note() note}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Immunization#identifier() identifier}
   *    .subpotentReason(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Immunization#subpotentReason() subpotentReason}
   *    .occurrenceString(String) // optional {@link Immunization#occurrenceString() occurrenceString}
   *    .build();
   * </pre>
   * @return A new Immunization builder
   */
  public static PatientBuildStage builder() {
    return new ImmutableImmunization.Builder();
  }

  /**
   * Builds instances of type {@link Immunization Immunization}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Immunization", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements PatientBuildStage, VaccineCodeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_PATIENT = 0x1L;
    private static final long INIT_BIT_VACCINE_CODE = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_DOSE_QUANTITY = 0x2L;
    private static final long OPT_BIT_REPORT_ORIGIN = 0x4L;
    private static final long OPT_BIT_LOT_NUMBER = 0x8L;
    private static final long OPT_BIT_RECORDED = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_STATUS_REASON = 0x200L;
    private static final long OPT_BIT_EDUCATION = 0x400L;
    private static final long OPT_BIT_EXPIRATION_DATE = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_SITE = 0x2000L;
    private static final long OPT_BIT_REACTION = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x10000L;
    private static final long OPT_BIT_PROGRAM_ELIGIBILITY = 0x20000L;
    private static final long OPT_BIT_ROUTE = 0x40000L;
    private static final long OPT_BIT_FUNDING_SOURCE = 0x80000L;
    private static final long OPT_BIT_MANUFACTURER = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_PERFORMER = 0x400000L;
    private static final long OPT_BIT_IS_SUBPOTENT = 0x800000L;
    private static final long OPT_BIT_ENCOUNTER = 0x1000000L;
    private static final long OPT_BIT_PRIMARY_SOURCE = 0x2000000L;
    private static final long OPT_BIT_EXTENSION = 0x4000000L;
    private static final long OPT_BIT_PROTOCOL_APPLIED = 0x8000000L;
    private static final long OPT_BIT_LOCATION = 0x10000000L;
    private static final long OPT_BIT_REASON_CODE = 0x20000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40000000L;
    private static final long OPT_BIT_NOTE = 0x80000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000000L;
    private static final long OPT_BIT_SUBPOTENT_REASON = 0x200000000L;
    private static final long OPT_BIT_OCCURRENCE_STRING = 0x400000000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable com.fhir.CodeableConcept vaccineCode;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.Quantity doseQuantity;
    private @javax.annotation.Nullable com.fhir.CodeableConcept reportOrigin;
    private @javax.annotation.Nullable java.lang.String lotNumber;
    private @javax.annotation.Nullable com.fhir.dateTime recorded;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
    private @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Education> education;
    private @javax.annotation.Nullable com.fhir.date expirationDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept site;
    private @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Reaction> reaction;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String occurrenceDateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> programEligibility;
    private @javax.annotation.Nullable com.fhir.CodeableConcept route;
    private @javax.annotation.Nullable com.fhir.CodeableConcept fundingSource;
    private @javax.annotation.Nullable com.fhir.Reference manufacturer;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Immunization_Performer> performer;
    private @javax.annotation.Nullable java.lang.Boolean isSubpotent;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.lang.Boolean primarySource;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Immunization_ProtocolApplied> protocolApplied;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subpotentReason;
    private @javax.annotation.Nullable java.lang.String occurrenceString;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Immunization#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the value for the {@link Immunization#vaccineCode() vaccineCode} attribute.
     * @param vaccineCode The value for vaccineCode 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaccineCode")
    public final Builder vaccineCode(com.fhir.CodeableConcept vaccineCode) {
      checkNotIsSet(vaccineCodeIsSet(), "vaccineCode");
      this.vaccineCode = java.util.Objects.requireNonNull(vaccineCode, "vaccineCode");
      initBits &= ~INIT_BIT_VACCINE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#status() status} to status.
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
     * Initializes the optional value {@link Immunization#status() status} to status.
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
     * Initializes the optional value {@link Immunization#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseQuantity(com.fhir.Quantity doseQuantity) {
      checkNotIsSet(doseQuantityIsSet(), "doseQuantity");
      this.doseQuantity = java.util.Objects.requireNonNull(doseQuantity, "doseQuantity");
      optBits |= OPT_BIT_DOSE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doseQuantity")
    public final Builder doseQuantity(java.util.Optional<? extends com.fhir.Quantity> doseQuantity) {
      checkNotIsSet(doseQuantityIsSet(), "doseQuantity");
      this.doseQuantity = doseQuantity.orElse(null);
      optBits |= OPT_BIT_DOSE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#reportOrigin() reportOrigin} to reportOrigin.
     * @param reportOrigin The value for reportOrigin
     * @return {@code this} builder for chained invocation
     */
    public final Builder reportOrigin(com.fhir.CodeableConcept reportOrigin) {
      checkNotIsSet(reportOriginIsSet(), "reportOrigin");
      this.reportOrigin = java.util.Objects.requireNonNull(reportOrigin, "reportOrigin");
      optBits |= OPT_BIT_REPORT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#reportOrigin() reportOrigin} to reportOrigin.
     * @param reportOrigin The value for reportOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reportOrigin")
    public final Builder reportOrigin(java.util.Optional<? extends com.fhir.CodeableConcept> reportOrigin) {
      checkNotIsSet(reportOriginIsSet(), "reportOrigin");
      this.reportOrigin = reportOrigin.orElse(null);
      optBits |= OPT_BIT_REPORT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder lotNumber(java.lang.String lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = java.util.Objects.requireNonNull(lotNumber, "lotNumber");
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lotNumber")
    public final Builder lotNumber(java.util.Optional<java.lang.String> lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = lotNumber.orElse(null);
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorded(com.fhir.dateTime recorded) {
      checkNotIsSet(recordedIsSet(), "recorded");
      this.recorded = java.util.Objects.requireNonNull(recorded, "recorded");
      optBits |= OPT_BIT_RECORDED;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recorded")
    public final Builder recorded(java.util.Optional<? extends com.fhir.dateTime> recorded) {
      checkNotIsSet(recordedIsSet(), "recorded");
      this.recorded = recorded.orElse(null);
      optBits |= OPT_BIT_RECORDED;
      return this;
    }

    /**
     * Initializes the value for the {@link Immunization#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Immunization#contained() contained} to contained.
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
     * Initializes the optional value {@link Immunization#contained() contained} to contained.
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
     * Initializes the optional value {@link Immunization#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Immunization#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Immunization#meta() meta} to meta.
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
     * Initializes the optional value {@link Immunization#meta() meta} to meta.
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
     * Initializes the optional value {@link Immunization#language() language} to language.
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
     * Initializes the optional value {@link Immunization#language() language} to language.
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
     * Initializes the optional value {@link Immunization#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link Immunization#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link Immunization#education() education} to education.
     * @param education The value for education
     * @return {@code this} builder for chained invocation
     */
    public final Builder education(java.util.List<com.fhir.Immunization_Education> education) {
      checkNotIsSet(educationIsSet(), "education");
      this.education = java.util.Objects.requireNonNull(education, "education");
      optBits |= OPT_BIT_EDUCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#education() education} to education.
     * @param education The value for education
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("education")
    public final Builder education(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Education>> education) {
      checkNotIsSet(educationIsSet(), "education");
      this.education = education.orElse(null);
      optBits |= OPT_BIT_EDUCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder expirationDate(com.fhir.date expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = java.util.Objects.requireNonNull(expirationDate, "expirationDate");
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    public final Builder expirationDate(java.util.Optional<? extends com.fhir.date> expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = expirationDate.orElse(null);
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(com.fhir.CodeableConcept site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = java.util.Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("site")
    public final Builder site(java.util.Optional<? extends com.fhir.CodeableConcept> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder reaction(java.util.List<com.fhir.Immunization_Reaction> reaction) {
      checkNotIsSet(reactionIsSet(), "reaction");
      this.reaction = java.util.Objects.requireNonNull(reaction, "reaction");
      optBits |= OPT_BIT_REACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reaction")
    public final Builder reaction(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Reaction>> reaction) {
      checkNotIsSet(reactionIsSet(), "reaction");
      this.reaction = reaction.orElse(null);
      optBits |= OPT_BIT_REACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#text() text} to text.
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
     * Initializes the optional value {@link Immunization#text() text} to text.
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
     * Initializes the optional value {@link Immunization#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link Immunization#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link Immunization#programEligibility() programEligibility} to programEligibility.
     * @param programEligibility The value for programEligibility
     * @return {@code this} builder for chained invocation
     */
    public final Builder programEligibility(java.util.List<com.fhir.CodeableConcept> programEligibility) {
      checkNotIsSet(programEligibilityIsSet(), "programEligibility");
      this.programEligibility = java.util.Objects.requireNonNull(programEligibility, "programEligibility");
      optBits |= OPT_BIT_PROGRAM_ELIGIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#programEligibility() programEligibility} to programEligibility.
     * @param programEligibility The value for programEligibility
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("programEligibility")
    public final Builder programEligibility(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> programEligibility) {
      checkNotIsSet(programEligibilityIsSet(), "programEligibility");
      this.programEligibility = programEligibility.orElse(null);
      optBits |= OPT_BIT_PROGRAM_ELIGIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for chained invocation
     */
    public final Builder route(com.fhir.CodeableConcept route) {
      checkNotIsSet(routeIsSet(), "route");
      this.route = java.util.Objects.requireNonNull(route, "route");
      optBits |= OPT_BIT_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("route")
    public final Builder route(java.util.Optional<? extends com.fhir.CodeableConcept> route) {
      checkNotIsSet(routeIsSet(), "route");
      this.route = route.orElse(null);
      optBits |= OPT_BIT_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#fundingSource() fundingSource} to fundingSource.
     * @param fundingSource The value for fundingSource
     * @return {@code this} builder for chained invocation
     */
    public final Builder fundingSource(com.fhir.CodeableConcept fundingSource) {
      checkNotIsSet(fundingSourceIsSet(), "fundingSource");
      this.fundingSource = java.util.Objects.requireNonNull(fundingSource, "fundingSource");
      optBits |= OPT_BIT_FUNDING_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#fundingSource() fundingSource} to fundingSource.
     * @param fundingSource The value for fundingSource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fundingSource")
    public final Builder fundingSource(java.util.Optional<? extends com.fhir.CodeableConcept> fundingSource) {
      checkNotIsSet(fundingSourceIsSet(), "fundingSource");
      this.fundingSource = fundingSource.orElse(null);
      optBits |= OPT_BIT_FUNDING_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(com.fhir.Reference manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = java.util.Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public final Builder manufacturer(java.util.Optional<? extends com.fhir.Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#id() id} to id.
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
     * Initializes the optional value {@link Immunization#id() id} to id.
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
     * Initializes the optional value {@link Immunization#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.Immunization_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#isSubpotent() isSubpotent} to isSubpotent.
     * @param isSubpotent The value for isSubpotent
     * @return {@code this} builder for chained invocation
     */
    public final Builder isSubpotent(boolean isSubpotent) {
      checkNotIsSet(isSubpotentIsSet(), "isSubpotent");
      this.isSubpotent = isSubpotent;
      optBits |= OPT_BIT_IS_SUBPOTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#isSubpotent() isSubpotent} to isSubpotent.
     * @param isSubpotent The value for isSubpotent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSubpotent")
    public final Builder isSubpotent(java.util.Optional<java.lang.Boolean> isSubpotent) {
      checkNotIsSet(isSubpotentIsSet(), "isSubpotent");
      this.isSubpotent = isSubpotent.orElse(null);
      optBits |= OPT_BIT_IS_SUBPOTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Immunization#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Immunization#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for chained invocation
     */
    public final Builder primarySource(boolean primarySource) {
      checkNotIsSet(primarySourceIsSet(), "primarySource");
      this.primarySource = primarySource;
      optBits |= OPT_BIT_PRIMARY_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primarySource")
    public final Builder primarySource(java.util.Optional<java.lang.Boolean> primarySource) {
      checkNotIsSet(primarySourceIsSet(), "primarySource");
      this.primarySource = primarySource.orElse(null);
      optBits |= OPT_BIT_PRIMARY_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization#protocolApplied() protocolApplied} to protocolApplied.
     * @param protocolApplied The value for protocolApplied
     * @return {@code this} builder for chained invocation
     */
    public final Builder protocolApplied(java.util.List<com.fhir.Immunization_ProtocolApplied> protocolApplied) {
      checkNotIsSet(protocolAppliedIsSet(), "protocolApplied");
      this.protocolApplied = java.util.Objects.requireNonNull(protocolApplied, "protocolApplied");
      optBits |= OPT_BIT_PROTOCOL_APPLIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#protocolApplied() protocolApplied} to protocolApplied.
     * @param protocolApplied The value for protocolApplied
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocolApplied")
    public final Builder protocolApplied(java.util.Optional<? extends java.util.List<com.fhir.Immunization_ProtocolApplied>> protocolApplied) {
      checkNotIsSet(protocolAppliedIsSet(), "protocolApplied");
      this.protocolApplied = protocolApplied.orElse(null);
      optBits |= OPT_BIT_PROTOCOL_APPLIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#location() location} to location.
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
     * Initializes the optional value {@link Immunization#location() location} to location.
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
     * Initializes the optional value {@link Immunization#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Immunization#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Immunization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Immunization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Immunization#note() note} to note.
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
     * Initializes the optional value {@link Immunization#note() note} to note.
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
     * Initializes the optional value {@link Immunization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Immunization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Immunization#subpotentReason() subpotentReason} to subpotentReason.
     * @param subpotentReason The value for subpotentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder subpotentReason(java.util.List<com.fhir.CodeableConcept> subpotentReason) {
      checkNotIsSet(subpotentReasonIsSet(), "subpotentReason");
      this.subpotentReason = java.util.Objects.requireNonNull(subpotentReason, "subpotentReason");
      optBits |= OPT_BIT_SUBPOTENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#subpotentReason() subpotentReason} to subpotentReason.
     * @param subpotentReason The value for subpotentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subpotentReason")
    public final Builder subpotentReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> subpotentReason) {
      checkNotIsSet(subpotentReasonIsSet(), "subpotentReason");
      this.subpotentReason = subpotentReason.orElse(null);
      optBits |= OPT_BIT_SUBPOTENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#occurrenceString() occurrenceString} to occurrenceString.
     * @param occurrenceString The value for occurrenceString
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceString(java.lang.String occurrenceString) {
      checkNotIsSet(occurrenceStringIsSet(), "occurrenceString");
      this.occurrenceString = java.util.Objects.requireNonNull(occurrenceString, "occurrenceString");
      optBits |= OPT_BIT_OCCURRENCE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#occurrenceString() occurrenceString} to occurrenceString.
     * @param occurrenceString The value for occurrenceString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceString")
    public final Builder occurrenceString(java.util.Optional<java.lang.String> occurrenceString) {
      checkNotIsSet(occurrenceStringIsSet(), "occurrenceString");
      this.occurrenceString = occurrenceString.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_STRING;
      return this;
    }

    /**
     * Builds a new {@link Immunization Immunization}.
     * @return An immutable instance of Immunization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Immunization build() {
      checkRequiredAttributes();
      return new ImmutableImmunization(
          patient,
          vaccineCode,
          status,
          doseQuantity,
          reportOrigin,
          lotNumber,
          recorded,
          resourceType,
          contained,
          reasonReference,
          meta,
          language,
          statusReason,
          education,
          expirationDate,
          modifierExtension,
          site,
          reaction,
          text,
          occurrenceDateTime,
          programEligibility,
          route,
          fundingSource,
          manufacturer,
          id,
          performer,
          isSubpotent,
          encounter,
          primarySource,
          extension,
          protocolApplied,
          location,
          reasonCode,
          implicitRules,
          note,
          identifier,
          subpotentReason,
          occurrenceString);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean doseQuantityIsSet() {
      return (optBits & OPT_BIT_DOSE_QUANTITY) != 0;
    }

    private boolean reportOriginIsSet() {
      return (optBits & OPT_BIT_REPORT_ORIGIN) != 0;
    }

    private boolean lotNumberIsSet() {
      return (optBits & OPT_BIT_LOT_NUMBER) != 0;
    }

    private boolean recordedIsSet() {
      return (optBits & OPT_BIT_RECORDED) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean educationIsSet() {
      return (optBits & OPT_BIT_EDUCATION) != 0;
    }

    private boolean expirationDateIsSet() {
      return (optBits & OPT_BIT_EXPIRATION_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean reactionIsSet() {
      return (optBits & OPT_BIT_REACTION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean programEligibilityIsSet() {
      return (optBits & OPT_BIT_PROGRAM_ELIGIBILITY) != 0;
    }

    private boolean routeIsSet() {
      return (optBits & OPT_BIT_ROUTE) != 0;
    }

    private boolean fundingSourceIsSet() {
      return (optBits & OPT_BIT_FUNDING_SOURCE) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean isSubpotentIsSet() {
      return (optBits & OPT_BIT_IS_SUBPOTENT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean primarySourceIsSet() {
      return (optBits & OPT_BIT_PRIMARY_SOURCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean protocolAppliedIsSet() {
      return (optBits & OPT_BIT_PROTOCOL_APPLIED) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean subpotentReasonIsSet() {
      return (optBits & OPT_BIT_SUBPOTENT_REASON) != 0;
    }

    private boolean occurrenceStringIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_STRING) != 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private boolean vaccineCodeIsSet() {
      return (initBits & INIT_BIT_VACCINE_CODE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Immunization is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!patientIsSet()) attributes.add("patient");
      if (!vaccineCodeIsSet()) attributes.add("vaccineCode");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Immunization, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Immunization", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link Immunization#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    VaccineCodeBuildStage patient(com.fhir.Reference patient);
  }

  @org.immutables.value.Generated(from = "Immunization", generator = "Immutables")
  public interface VaccineCodeBuildStage {
    /**
     * Initializes the value for the {@link Immunization#vaccineCode() vaccineCode} attribute.
     * @param vaccineCode The value for vaccineCode 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage vaccineCode(com.fhir.CodeableConcept vaccineCode);
  }

  @org.immutables.value.Generated(from = "Immunization", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Immunization#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Immunization", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Immunization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link Immunization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link Immunization#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseQuantity(com.fhir.Quantity doseQuantity);

    /**
     * Initializes the optional value {@link Immunization#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseQuantity(java.util.Optional<? extends com.fhir.Quantity> doseQuantity);

    /**
     * Initializes the optional value {@link Immunization#reportOrigin() reportOrigin} to reportOrigin.
     * @param reportOrigin The value for reportOrigin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reportOrigin(com.fhir.CodeableConcept reportOrigin);

    /**
     * Initializes the optional value {@link Immunization#reportOrigin() reportOrigin} to reportOrigin.
     * @param reportOrigin The value for reportOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reportOrigin(java.util.Optional<? extends com.fhir.CodeableConcept> reportOrigin);

    /**
     * Initializes the optional value {@link Immunization#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lotNumber(java.lang.String lotNumber);

    /**
     * Initializes the optional value {@link Immunization#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lotNumber(java.util.Optional<java.lang.String> lotNumber);

    /**
     * Initializes the optional value {@link Immunization#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorded(com.fhir.dateTime recorded);

    /**
     * Initializes the optional value {@link Immunization#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorded(java.util.Optional<? extends com.fhir.dateTime> recorded);

    /**
     * Initializes the optional value {@link Immunization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Immunization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Immunization#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link Immunization#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Immunization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Immunization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Immunization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Immunization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Immunization#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(com.fhir.CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link Immunization#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Immunization#education() education} to education.
     * @param education The value for education
     * @return {@code this} builder for chained invocation
     */
    BuildFinal education(java.util.List<com.fhir.Immunization_Education> education);

    /**
     * Initializes the optional value {@link Immunization#education() education} to education.
     * @param education The value for education
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal education(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Education>> education);

    /**
     * Initializes the optional value {@link Immunization#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expirationDate(com.fhir.date expirationDate);

    /**
     * Initializes the optional value {@link Immunization#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expirationDate(java.util.Optional<? extends com.fhir.date> expirationDate);

    /**
     * Initializes the optional value {@link Immunization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Immunization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Immunization#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    BuildFinal site(com.fhir.CodeableConcept site);

    /**
     * Initializes the optional value {@link Immunization#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal site(java.util.Optional<? extends com.fhir.CodeableConcept> site);

    /**
     * Initializes the optional value {@link Immunization#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reaction(java.util.List<com.fhir.Immunization_Reaction> reaction);

    /**
     * Initializes the optional value {@link Immunization#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reaction(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Reaction>> reaction);

    /**
     * Initializes the optional value {@link Immunization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Immunization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Immunization#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(java.lang.String occurrenceDateTime);

    /**
     * Initializes the optional value {@link Immunization#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link Immunization#programEligibility() programEligibility} to programEligibility.
     * @param programEligibility The value for programEligibility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programEligibility(java.util.List<com.fhir.CodeableConcept> programEligibility);

    /**
     * Initializes the optional value {@link Immunization#programEligibility() programEligibility} to programEligibility.
     * @param programEligibility The value for programEligibility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programEligibility(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> programEligibility);

    /**
     * Initializes the optional value {@link Immunization#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for chained invocation
     */
    BuildFinal route(com.fhir.CodeableConcept route);

    /**
     * Initializes the optional value {@link Immunization#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal route(java.util.Optional<? extends com.fhir.CodeableConcept> route);

    /**
     * Initializes the optional value {@link Immunization#fundingSource() fundingSource} to fundingSource.
     * @param fundingSource The value for fundingSource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundingSource(com.fhir.CodeableConcept fundingSource);

    /**
     * Initializes the optional value {@link Immunization#fundingSource() fundingSource} to fundingSource.
     * @param fundingSource The value for fundingSource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundingSource(java.util.Optional<? extends com.fhir.CodeableConcept> fundingSource);

    /**
     * Initializes the optional value {@link Immunization#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(com.fhir.Reference manufacturer);

    /**
     * Initializes the optional value {@link Immunization#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(java.util.Optional<? extends com.fhir.Reference> manufacturer);

    /**
     * Initializes the optional value {@link Immunization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Immunization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Immunization#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.Immunization_Performer> performer);

    /**
     * Initializes the optional value {@link Immunization#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.Immunization_Performer>> performer);

    /**
     * Initializes the optional value {@link Immunization#isSubpotent() isSubpotent} to isSubpotent.
     * @param isSubpotent The value for isSubpotent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal isSubpotent(boolean isSubpotent);

    /**
     * Initializes the optional value {@link Immunization#isSubpotent() isSubpotent} to isSubpotent.
     * @param isSubpotent The value for isSubpotent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal isSubpotent(java.util.Optional<java.lang.Boolean> isSubpotent);

    /**
     * Initializes the optional value {@link Immunization#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Immunization#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link Immunization#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal primarySource(boolean primarySource);

    /**
     * Initializes the optional value {@link Immunization#primarySource() primarySource} to primarySource.
     * @param primarySource The value for primarySource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal primarySource(java.util.Optional<java.lang.Boolean> primarySource);

    /**
     * Initializes the optional value {@link Immunization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Immunization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Immunization#protocolApplied() protocolApplied} to protocolApplied.
     * @param protocolApplied The value for protocolApplied
     * @return {@code this} builder for chained invocation
     */
    BuildFinal protocolApplied(java.util.List<com.fhir.Immunization_ProtocolApplied> protocolApplied);

    /**
     * Initializes the optional value {@link Immunization#protocolApplied() protocolApplied} to protocolApplied.
     * @param protocolApplied The value for protocolApplied
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protocolApplied(java.util.Optional<? extends java.util.List<com.fhir.Immunization_ProtocolApplied>> protocolApplied);

    /**
     * Initializes the optional value {@link Immunization#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link Immunization#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link Immunization#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Immunization#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Immunization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Immunization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Immunization#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Immunization#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Immunization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Immunization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Immunization#subpotentReason() subpotentReason} to subpotentReason.
     * @param subpotentReason The value for subpotentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subpotentReason(java.util.List<com.fhir.CodeableConcept> subpotentReason);

    /**
     * Initializes the optional value {@link Immunization#subpotentReason() subpotentReason} to subpotentReason.
     * @param subpotentReason The value for subpotentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subpotentReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> subpotentReason);

    /**
     * Initializes the optional value {@link Immunization#occurrenceString() occurrenceString} to occurrenceString.
     * @param occurrenceString The value for occurrenceString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceString(java.lang.String occurrenceString);

    /**
     * Initializes the optional value {@link Immunization#occurrenceString() occurrenceString} to occurrenceString.
     * @param occurrenceString The value for occurrenceString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceString(java.util.Optional<java.lang.String> occurrenceString);

    /**
     * Builds a new {@link Immunization Immunization}.
     * @return An immutable instance of Immunization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Immunization build();
  }
}
