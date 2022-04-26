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
 * Immutable implementation of {@link Immunization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunization.builder()}.
 */
@Generated(from = "Immunization", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunization implements Immunization {
  private final @Nullable CodeableConcept fundingSource;
  private final @Nullable String lotNumber;
  private final @Nullable CodeableConcept route;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable List<CodeableConcept> programEligibility;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String occurrenceString;
  private final @Nullable DateTime recorded;
  private final @Nullable Boolean isSubpotent;
  private final @Nullable List<Immunization_Education> education;
  private final @Nullable Reference location;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<Immunization_ProtocolApplied> protocolApplied;
  private final @Nullable List<Extension> extension;
  private final String resourceType;
  private final @Nullable List<Immunization_Performer> performer;
  private final CodeableConcept vaccineCode;
  private final @Nullable Code language;
  private final @Nullable Reference encounter;
  private final @Nullable Date expirationDate;
  private final Reference patient;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable List<Immunization_Reaction> reaction;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code status;
  private final @Nullable Quantity doseQuantity;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable CodeableConcept reportOrigin;
  private final @Nullable List<CodeableConcept> subpotentReason;
  private final @Nullable Boolean primarySource;
  private final @Nullable CodeableConcept site;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Reference manufacturer;
  private final @Nullable CodeableConcept statusReason;

  private ImmutableImmunization(
      @Nullable CodeableConcept fundingSource,
      @Nullable String lotNumber,
      @Nullable CodeableConcept route,
      @Nullable List<Reference> reasonReference,
      @Nullable List<CodeableConcept> programEligibility,
      @Nullable Narrative text,
      @Nullable List<Extension> modifierExtension,
      @Nullable String occurrenceString,
      @Nullable DateTime recorded,
      @Nullable Boolean isSubpotent,
      @Nullable List<Immunization_Education> education,
      @Nullable Reference location,
      @Nullable List<Annotation> note,
      @Nullable List<Immunization_ProtocolApplied> protocolApplied,
      @Nullable List<Extension> extension,
      String resourceType,
      @Nullable List<Immunization_Performer> performer,
      CodeableConcept vaccineCode,
      @Nullable Code language,
      @Nullable Reference encounter,
      @Nullable Date expirationDate,
      Reference patient,
      @Nullable String occurrenceDateTime,
      @Nullable List<Immunization_Reaction> reaction,
      @Nullable Uri implicitRules,
      @Nullable Code status,
      @Nullable Quantity doseQuantity,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable CodeableConcept reportOrigin,
      @Nullable List<CodeableConcept> subpotentReason,
      @Nullable Boolean primarySource,
      @Nullable CodeableConcept site,
      @Nullable List<ResourceList> contained,
      @Nullable List<Identifier> identifier,
      @Nullable Reference manufacturer,
      @Nullable CodeableConcept statusReason) {
    this.fundingSource = fundingSource;
    this.lotNumber = lotNumber;
    this.route = route;
    this.reasonReference = reasonReference;
    this.programEligibility = programEligibility;
    this.text = text;
    this.modifierExtension = modifierExtension;
    this.occurrenceString = occurrenceString;
    this.recorded = recorded;
    this.isSubpotent = isSubpotent;
    this.education = education;
    this.location = location;
    this.note = note;
    this.protocolApplied = protocolApplied;
    this.extension = extension;
    this.resourceType = resourceType;
    this.performer = performer;
    this.vaccineCode = vaccineCode;
    this.language = language;
    this.encounter = encounter;
    this.expirationDate = expirationDate;
    this.patient = patient;
    this.occurrenceDateTime = occurrenceDateTime;
    this.reaction = reaction;
    this.implicitRules = implicitRules;
    this.status = status;
    this.doseQuantity = doseQuantity;
    this.id = id;
    this.meta = meta;
    this.reasonCode = reasonCode;
    this.reportOrigin = reportOrigin;
    this.subpotentReason = subpotentReason;
    this.primarySource = primarySource;
    this.site = site;
    this.contained = contained;
    this.identifier = identifier;
    this.manufacturer = manufacturer;
    this.statusReason = statusReason;
  }

  /**
   * @return The value of the {@code fundingSource} attribute
   */
  @JsonProperty("fundingSource")
  @Override
  public Optional<CodeableConcept> fundingSource() {
    return Optional.ofNullable(fundingSource);
  }

  /**
   * @return The value of the {@code lotNumber} attribute
   */
  @JsonProperty("lotNumber")
  @Override
  public Optional<String> lotNumber() {
    return Optional.ofNullable(lotNumber);
  }

  /**
   * @return The value of the {@code route} attribute
   */
  @JsonProperty("route")
  @Override
  public Optional<CodeableConcept> route() {
    return Optional.ofNullable(route);
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
   * @return The value of the {@code programEligibility} attribute
   */
  @JsonProperty("programEligibility")
  @Override
  public Optional<List<CodeableConcept>> programEligibility() {
    return Optional.ofNullable(programEligibility);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code occurrenceString} attribute
   */
  @JsonProperty("occurrenceString")
  @Override
  public Optional<String> occurrenceString() {
    return Optional.ofNullable(occurrenceString);
  }

  /**
   * @return The value of the {@code recorded} attribute
   */
  @JsonProperty("recorded")
  @Override
  public Optional<DateTime> recorded() {
    return Optional.ofNullable(recorded);
  }

  /**
   * @return The value of the {@code isSubpotent} attribute
   */
  @JsonProperty("isSubpotent")
  @Override
  public Optional<Boolean> isSubpotent() {
    return Optional.ofNullable(isSubpotent);
  }

  /**
   * @return The value of the {@code education} attribute
   */
  @JsonProperty("education")
  @Override
  public Optional<List<Immunization_Education>> education() {
    return Optional.ofNullable(education);
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code protocolApplied} attribute
   */
  @JsonProperty("protocolApplied")
  @Override
  public Optional<List<Immunization_ProtocolApplied>> protocolApplied() {
    return Optional.ofNullable(protocolApplied);
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
  public Optional<List<Immunization_Performer>> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code vaccineCode} attribute
   */
  @JsonProperty("vaccineCode")
  @Override
  public CodeableConcept vaccineCode() {
    return vaccineCode;
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
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code expirationDate} attribute
   */
  @JsonProperty("expirationDate")
  @Override
  public Optional<Date> expirationDate() {
    return Optional.ofNullable(expirationDate);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Reference patient() {
    return patient;
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @JsonProperty("occurrenceDateTime")
  @Override
  public Optional<String> occurrenceDateTime() {
    return Optional.ofNullable(occurrenceDateTime);
  }

  /**
   * @return The value of the {@code reaction} attribute
   */
  @JsonProperty("reaction")
  @Override
  public Optional<List<Immunization_Reaction>> reaction() {
    return Optional.ofNullable(reaction);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code doseQuantity} attribute
   */
  @JsonProperty("doseQuantity")
  @Override
  public Optional<Quantity> doseQuantity() {
    return Optional.ofNullable(doseQuantity);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code reportOrigin} attribute
   */
  @JsonProperty("reportOrigin")
  @Override
  public Optional<CodeableConcept> reportOrigin() {
    return Optional.ofNullable(reportOrigin);
  }

  /**
   * @return The value of the {@code subpotentReason} attribute
   */
  @JsonProperty("subpotentReason")
  @Override
  public Optional<List<CodeableConcept>> subpotentReason() {
    return Optional.ofNullable(subpotentReason);
  }

  /**
   * @return The value of the {@code primarySource} attribute
   */
  @JsonProperty("primarySource")
  @Override
  public Optional<Boolean> primarySource() {
    return Optional.ofNullable(primarySource);
  }

  /**
   * @return The value of the {@code site} attribute
   */
  @JsonProperty("site")
  @Override
  public Optional<CodeableConcept> site() {
    return Optional.ofNullable(site);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty("manufacturer")
  @Override
  public Optional<Reference> manufacturer() {
    return Optional.ofNullable(manufacturer);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#fundingSource() fundingSource} attribute.
   * @param value The value for fundingSource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withFundingSource(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "fundingSource");
    if (this.fundingSource == newValue) return this;
    return new ImmutableImmunization(
        newValue,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#fundingSource() fundingSource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fundingSource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withFundingSource(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.fundingSource == value) return this;
    return new ImmutableImmunization(
        value,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#lotNumber() lotNumber} attribute.
   * @param value The value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withLotNumber(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "lotNumber");
    if (Objects.equals(this.lotNumber, newValue)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        newValue,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#lotNumber() lotNumber} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lotNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withLotNumber(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.lotNumber, value)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        value,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#route() route} attribute.
   * @param value The value for route
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withRoute(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "route");
    if (this.route == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        newValue,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#route() route} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for route
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withRoute(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.route == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        value,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        newValue,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        value,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#programEligibility() programEligibility} attribute.
   * @param value The value for programEligibility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withProgramEligibility(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "programEligibility");
    if (this.programEligibility == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        newValue,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#programEligibility() programEligibility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programEligibility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withProgramEligibility(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.programEligibility == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        value,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        newValue,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        value,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        newValue,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        value,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#occurrenceString() occurrenceString} attribute.
   * @param value The value for occurrenceString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withOccurrenceString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceString");
    if (Objects.equals(this.occurrenceString, newValue)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        newValue,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#occurrenceString() occurrenceString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withOccurrenceString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceString, value)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        value,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#recorded() recorded} attribute.
   * @param value The value for recorded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withRecorded(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "recorded");
    if (this.recorded == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        newValue,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#recorded() recorded} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recorded
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withRecorded(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.recorded == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        value,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#isSubpotent() isSubpotent} attribute.
   * @param value The value for isSubpotent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withIsSubpotent(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.isSubpotent, newValue)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        newValue,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#isSubpotent() isSubpotent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isSubpotent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withIsSubpotent(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.isSubpotent, value)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        value,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#education() education} attribute.
   * @param value The value for education
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withEducation(List<Immunization_Education> value) {
    @Nullable List<Immunization_Education> newValue = Objects.requireNonNull(value, "education");
    if (this.education == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        newValue,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#education() education} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for education
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withEducation(Optional<? extends List<Immunization_Education>> optional) {
    @Nullable List<Immunization_Education> value = optional.orElse(null);
    if (this.education == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        value,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        newValue,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        value,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        newValue,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        value,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#protocolApplied() protocolApplied} attribute.
   * @param value The value for protocolApplied
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withProtocolApplied(List<Immunization_ProtocolApplied> value) {
    @Nullable List<Immunization_ProtocolApplied> newValue = Objects.requireNonNull(value, "protocolApplied");
    if (this.protocolApplied == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        newValue,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#protocolApplied() protocolApplied} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for protocolApplied
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withProtocolApplied(Optional<? extends List<Immunization_ProtocolApplied>> optional) {
    @Nullable List<Immunization_ProtocolApplied> value = optional.orElse(null);
    if (this.protocolApplied == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        value,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        newValue,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        value,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Immunization#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunization withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        newValue,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withPerformer(List<Immunization_Performer> value) {
    @Nullable List<Immunization_Performer> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        newValue,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withPerformer(Optional<? extends List<Immunization_Performer>> optional) {
    @Nullable List<Immunization_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        value,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Immunization#vaccineCode() vaccineCode} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for vaccineCode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunization withVaccineCode(CodeableConcept value) {
    if (this.vaccineCode == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "vaccineCode");
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        newValue,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        newValue,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        value,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        newValue,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        value,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#expirationDate() expirationDate} attribute.
   * @param value The value for expirationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withExpirationDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "expirationDate");
    if (this.expirationDate == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        newValue,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#expirationDate() expirationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expirationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withExpirationDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.expirationDate == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        value,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Immunization#patient() patient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for patient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunization withPatient(Reference value) {
    if (this.patient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "patient");
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        newValue,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        newValue,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        value,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#reaction() reaction} attribute.
   * @param value The value for reaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withReaction(List<Immunization_Reaction> value) {
    @Nullable List<Immunization_Reaction> newValue = Objects.requireNonNull(value, "reaction");
    if (this.reaction == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        newValue,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#reaction() reaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withReaction(Optional<? extends List<Immunization_Reaction>> optional) {
    @Nullable List<Immunization_Reaction> value = optional.orElse(null);
    if (this.reaction == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        value,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        newValue,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        value,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        newValue,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        value,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#doseQuantity() doseQuantity} attribute.
   * @param value The value for doseQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withDoseQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "doseQuantity");
    if (this.doseQuantity == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        newValue,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#doseQuantity() doseQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withDoseQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.doseQuantity == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        value,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        newValue,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        value,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        newValue,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        value,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        newValue,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        value,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#reportOrigin() reportOrigin} attribute.
   * @param value The value for reportOrigin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withReportOrigin(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reportOrigin");
    if (this.reportOrigin == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        newValue,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#reportOrigin() reportOrigin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reportOrigin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withReportOrigin(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reportOrigin == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        value,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#subpotentReason() subpotentReason} attribute.
   * @param value The value for subpotentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withSubpotentReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "subpotentReason");
    if (this.subpotentReason == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        newValue,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#subpotentReason() subpotentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subpotentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withSubpotentReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.subpotentReason == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        value,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#primarySource() primarySource} attribute.
   * @param value The value for primarySource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withPrimarySource(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.primarySource, newValue)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        newValue,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#primarySource() primarySource} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for primarySource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withPrimarySource(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.primarySource, value)) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        value,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withSite(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "site");
    if (this.site == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        newValue,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#site() site} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withSite(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.site == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        value,
        this.contained,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        newValue,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        value,
        this.identifier,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        newValue,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        value,
        this.manufacturer,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withManufacturer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        newValue,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withManufacturer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        value,
        this.statusReason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization withStatusReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization withStatusReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableImmunization(
        this.fundingSource,
        this.lotNumber,
        this.route,
        this.reasonReference,
        this.programEligibility,
        this.text,
        this.modifierExtension,
        this.occurrenceString,
        this.recorded,
        this.isSubpotent,
        this.education,
        this.location,
        this.note,
        this.protocolApplied,
        this.extension,
        this.resourceType,
        this.performer,
        this.vaccineCode,
        this.language,
        this.encounter,
        this.expirationDate,
        this.patient,
        this.occurrenceDateTime,
        this.reaction,
        this.implicitRules,
        this.status,
        this.doseQuantity,
        this.id,
        this.meta,
        this.reasonCode,
        this.reportOrigin,
        this.subpotentReason,
        this.primarySource,
        this.site,
        this.contained,
        this.identifier,
        this.manufacturer,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunization
        && equalTo((ImmutableImmunization) another);
  }

  private boolean equalTo(ImmutableImmunization another) {
    return Objects.equals(fundingSource, another.fundingSource)
        && Objects.equals(lotNumber, another.lotNumber)
        && Objects.equals(route, another.route)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(programEligibility, another.programEligibility)
        && Objects.equals(text, another.text)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(occurrenceString, another.occurrenceString)
        && Objects.equals(recorded, another.recorded)
        && Objects.equals(isSubpotent, another.isSubpotent)
        && Objects.equals(education, another.education)
        && Objects.equals(location, another.location)
        && Objects.equals(note, another.note)
        && Objects.equals(protocolApplied, another.protocolApplied)
        && Objects.equals(extension, another.extension)
        && resourceType.equals(another.resourceType)
        && Objects.equals(performer, another.performer)
        && vaccineCode.equals(another.vaccineCode)
        && Objects.equals(language, another.language)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(expirationDate, another.expirationDate)
        && patient.equals(another.patient)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(reaction, another.reaction)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(status, another.status)
        && Objects.equals(doseQuantity, another.doseQuantity)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(reportOrigin, another.reportOrigin)
        && Objects.equals(subpotentReason, another.subpotentReason)
        && Objects.equals(primarySource, another.primarySource)
        && Objects.equals(site, another.site)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(statusReason, another.statusReason);
  }

  /**
   * Computes a hash code from attributes: {@code fundingSource}, {@code lotNumber}, {@code route}, {@code reasonReference}, {@code programEligibility}, {@code text}, {@code modifierExtension}, {@code occurrenceString}, {@code recorded}, {@code isSubpotent}, {@code education}, {@code location}, {@code note}, {@code protocolApplied}, {@code extension}, {@code resourceType}, {@code performer}, {@code vaccineCode}, {@code language}, {@code encounter}, {@code expirationDate}, {@code patient}, {@code occurrenceDateTime}, {@code reaction}, {@code implicitRules}, {@code status}, {@code doseQuantity}, {@code id}, {@code meta}, {@code reasonCode}, {@code reportOrigin}, {@code subpotentReason}, {@code primarySource}, {@code site}, {@code contained}, {@code identifier}, {@code manufacturer}, {@code statusReason}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(fundingSource);
    h += (h << 5) + Objects.hashCode(lotNumber);
    h += (h << 5) + Objects.hashCode(route);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(programEligibility);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(occurrenceString);
    h += (h << 5) + Objects.hashCode(recorded);
    h += (h << 5) + Objects.hashCode(isSubpotent);
    h += (h << 5) + Objects.hashCode(education);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(protocolApplied);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + vaccineCode.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(expirationDate);
    h += (h << 5) + patient.hashCode();
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(reaction);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(doseQuantity);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(reportOrigin);
    h += (h << 5) + Objects.hashCode(subpotentReason);
    h += (h << 5) + Objects.hashCode(primarySource);
    h += (h << 5) + Objects.hashCode(site);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(statusReason);
    return h;
  }

  /**
   * Prints the immutable value {@code Immunization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Immunization{");
    if (fundingSource != null) {
      builder.append("fundingSource=").append(fundingSource);
    }
    if (lotNumber != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("lotNumber=").append(lotNumber);
    }
    if (route != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("route=").append(route);
    }
    if (reasonReference != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (programEligibility != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("programEligibility=").append(programEligibility);
    }
    if (text != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (modifierExtension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (occurrenceString != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("occurrenceString=").append(occurrenceString);
    }
    if (recorded != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("recorded=").append(recorded);
    }
    if (isSubpotent != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("isSubpotent=").append(isSubpotent);
    }
    if (education != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("education=").append(education);
    }
    if (location != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (note != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (protocolApplied != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("protocolApplied=").append(protocolApplied);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    builder.append(", ");
    builder.append("vaccineCode=").append(vaccineCode);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (expirationDate != null) {
      builder.append(", ");
      builder.append("expirationDate=").append(expirationDate);
    }
    builder.append(", ");
    builder.append("patient=").append(patient);
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (reaction != null) {
      builder.append(", ");
      builder.append("reaction=").append(reaction);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (doseQuantity != null) {
      builder.append(", ");
      builder.append("doseQuantity=").append(doseQuantity);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (reportOrigin != null) {
      builder.append(", ");
      builder.append("reportOrigin=").append(reportOrigin);
    }
    if (subpotentReason != null) {
      builder.append(", ");
      builder.append("subpotentReason=").append(subpotentReason);
    }
    if (primarySource != null) {
      builder.append(", ");
      builder.append("primarySource=").append(primarySource);
    }
    if (site != null) {
      builder.append(", ");
      builder.append("site=").append(site);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (manufacturer != null) {
      builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Immunization", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Immunization {
    @Nullable Optional<CodeableConcept> fundingSource = Optional.empty();
    boolean fundingSourceIsSet;
    @Nullable Optional<String> lotNumber = Optional.empty();
    boolean lotNumberIsSet;
    @Nullable Optional<CodeableConcept> route = Optional.empty();
    boolean routeIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<List<CodeableConcept>> programEligibility = Optional.empty();
    boolean programEligibilityIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> occurrenceString = Optional.empty();
    boolean occurrenceStringIsSet;
    @Nullable Optional<DateTime> recorded = Optional.empty();
    boolean recordedIsSet;
    @Nullable Optional<Boolean> isSubpotent = Optional.empty();
    boolean isSubpotentIsSet;
    @Nullable Optional<List<Immunization_Education>> education = Optional.empty();
    boolean educationIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<Immunization_ProtocolApplied>> protocolApplied = Optional.empty();
    boolean protocolAppliedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Immunization_Performer>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable CodeableConcept vaccineCode;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Date> expirationDate = Optional.empty();
    boolean expirationDateIsSet;
    @Nullable Reference patient;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<List<Immunization_Reaction>> reaction = Optional.empty();
    boolean reactionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Quantity> doseQuantity = Optional.empty();
    boolean doseQuantityIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<CodeableConcept> reportOrigin = Optional.empty();
    boolean reportOriginIsSet;
    @Nullable Optional<List<CodeableConcept>> subpotentReason = Optional.empty();
    boolean subpotentReasonIsSet;
    @Nullable Optional<Boolean> primarySource = Optional.empty();
    boolean primarySourceIsSet;
    @Nullable Optional<CodeableConcept> site = Optional.empty();
    boolean siteIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Reference> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<CodeableConcept> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @JsonProperty("fundingSource")
    public void setFundingSource(Optional<CodeableConcept> fundingSource) {
      this.fundingSource = fundingSource;
      this.fundingSourceIsSet = true;
    }
    @JsonProperty("lotNumber")
    public void setLotNumber(Optional<String> lotNumber) {
      this.lotNumber = lotNumber;
      this.lotNumberIsSet = true;
    }
    @JsonProperty("route")
    public void setRoute(Optional<CodeableConcept> route) {
      this.route = route;
      this.routeIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("programEligibility")
    public void setProgramEligibility(Optional<List<CodeableConcept>> programEligibility) {
      this.programEligibility = programEligibility;
      this.programEligibilityIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("occurrenceString")
    public void setOccurrenceString(Optional<String> occurrenceString) {
      this.occurrenceString = occurrenceString;
      this.occurrenceStringIsSet = true;
    }
    @JsonProperty("recorded")
    public void setRecorded(Optional<DateTime> recorded) {
      this.recorded = recorded;
      this.recordedIsSet = true;
    }
    @JsonProperty("isSubpotent")
    public void setIsSubpotent(Optional<Boolean> isSubpotent) {
      this.isSubpotent = isSubpotent;
      this.isSubpotentIsSet = true;
    }
    @JsonProperty("education")
    public void setEducation(Optional<List<Immunization_Education>> education) {
      this.education = education;
      this.educationIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("protocolApplied")
    public void setProtocolApplied(Optional<List<Immunization_ProtocolApplied>> protocolApplied) {
      this.protocolApplied = protocolApplied;
      this.protocolAppliedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<Immunization_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("vaccineCode")
    public void setVaccineCode(CodeableConcept vaccineCode) {
      this.vaccineCode = vaccineCode;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("expirationDate")
    public void setExpirationDate(Optional<Date> expirationDate) {
      this.expirationDate = expirationDate;
      this.expirationDateIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Reference patient) {
      this.patient = patient;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("reaction")
    public void setReaction(Optional<List<Immunization_Reaction>> reaction) {
      this.reaction = reaction;
      this.reactionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("doseQuantity")
    public void setDoseQuantity(Optional<Quantity> doseQuantity) {
      this.doseQuantity = doseQuantity;
      this.doseQuantityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("reportOrigin")
    public void setReportOrigin(Optional<CodeableConcept> reportOrigin) {
      this.reportOrigin = reportOrigin;
      this.reportOriginIsSet = true;
    }
    @JsonProperty("subpotentReason")
    public void setSubpotentReason(Optional<List<CodeableConcept>> subpotentReason) {
      this.subpotentReason = subpotentReason;
      this.subpotentReasonIsSet = true;
    }
    @JsonProperty("primarySource")
    public void setPrimarySource(Optional<Boolean> primarySource) {
      this.primarySource = primarySource;
      this.primarySourceIsSet = true;
    }
    @JsonProperty("site")
    public void setSite(Optional<CodeableConcept> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<Reference> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> fundingSource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> lotNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> route() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> programEligibility() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> recorded() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> isSubpotent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Immunization_Education>> education() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Immunization_ProtocolApplied>> protocolApplied() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Immunization_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept vaccineCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> expirationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Reference patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Immunization_Reaction>> reaction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> doseQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reportOrigin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> subpotentReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> primarySource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> site() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImmunization fromJson(Json json) {
    ImmutableImmunization.Builder builder = ((ImmutableImmunization.Builder) ImmutableImmunization.builder());
    if (json.fundingSourceIsSet) {
      builder.fundingSource(json.fundingSource);
    }
    if (json.lotNumberIsSet) {
      builder.lotNumber(json.lotNumber);
    }
    if (json.routeIsSet) {
      builder.route(json.route);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.programEligibilityIsSet) {
      builder.programEligibility(json.programEligibility);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.occurrenceStringIsSet) {
      builder.occurrenceString(json.occurrenceString);
    }
    if (json.recordedIsSet) {
      builder.recorded(json.recorded);
    }
    if (json.isSubpotentIsSet) {
      builder.isSubpotent(json.isSubpotent);
    }
    if (json.educationIsSet) {
      builder.education(json.education);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.protocolAppliedIsSet) {
      builder.protocolApplied(json.protocolApplied);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.vaccineCode != null) {
      builder.vaccineCode(json.vaccineCode);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.expirationDateIsSet) {
      builder.expirationDate(json.expirationDate);
    }
    if (json.patient != null) {
      builder.patient(json.patient);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.reactionIsSet) {
      builder.reaction(json.reaction);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.doseQuantityIsSet) {
      builder.doseQuantity(json.doseQuantity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.reportOriginIsSet) {
      builder.reportOrigin(json.reportOrigin);
    }
    if (json.subpotentReasonIsSet) {
      builder.subpotentReason(json.subpotentReason);
    }
    if (json.primarySourceIsSet) {
      builder.primarySource(json.primarySource);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
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
        .fundingSource(instance.fundingSource())
        .lotNumber(instance.lotNumber())
        .route(instance.route())
        .reasonReference(instance.reasonReference())
        .programEligibility(instance.programEligibility())
        .text(instance.text())
        .modifierExtension(instance.modifierExtension())
        .occurrenceString(instance.occurrenceString())
        .recorded(instance.recorded())
        .isSubpotent(instance.isSubpotent())
        .education(instance.education())
        .location(instance.location())
        .note(instance.note())
        .protocolApplied(instance.protocolApplied())
        .extension(instance.extension())
        .resourceType(instance.resourceType())
        .performer(instance.performer())
        .vaccineCode(instance.vaccineCode())
        .language(instance.language())
        .encounter(instance.encounter())
        .expirationDate(instance.expirationDate())
        .patient(instance.patient())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .reaction(instance.reaction())
        .implicitRules(instance.implicitRules())
        .status(instance.status())
        .doseQuantity(instance.doseQuantity())
        .id(instance.id())
        .meta(instance.meta())
        .reasonCode(instance.reasonCode())
        .reportOrigin(instance.reportOrigin())
        .subpotentReason(instance.subpotentReason())
        .primarySource(instance.primarySource())
        .site(instance.site())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .manufacturer(instance.manufacturer())
        .statusReason(instance.statusReason())
        .build();
  }

  /**
   * Creates a builder for {@link Immunization Immunization}.
   * <pre>
   * ImmutableImmunization.builder()
   *    .fundingSource(com.fhir.types.fhir.CodeableConcept) // optional {@link Immunization#fundingSource() fundingSource}
   *    .lotNumber(String) // optional {@link Immunization#lotNumber() lotNumber}
   *    .route(com.fhir.types.fhir.CodeableConcept) // optional {@link Immunization#route() route}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Immunization#reasonReference() reasonReference}
   *    .programEligibility(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Immunization#programEligibility() programEligibility}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Immunization#text() text}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Immunization#modifierExtension() modifierExtension}
   *    .occurrenceString(String) // optional {@link Immunization#occurrenceString() occurrenceString}
   *    .recorded(com.fhir.types.fhir.DateTime) // optional {@link Immunization#recorded() recorded}
   *    .isSubpotent(Boolean) // optional {@link Immunization#isSubpotent() isSubpotent}
   *    .education(List&amp;lt;com.fhir.types.fhir.Immunization_Education&amp;gt;) // optional {@link Immunization#education() education}
   *    .location(com.fhir.types.fhir.Reference) // optional {@link Immunization#location() location}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Immunization#note() note}
   *    .protocolApplied(List&amp;lt;com.fhir.types.fhir.Immunization_ProtocolApplied&amp;gt;) // optional {@link Immunization#protocolApplied() protocolApplied}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Immunization#extension() extension}
   *    .resourceType(String) // required {@link Immunization#resourceType() resourceType}
   *    .performer(List&amp;lt;com.fhir.types.fhir.Immunization_Performer&amp;gt;) // optional {@link Immunization#performer() performer}
   *    .vaccineCode(com.fhir.types.fhir.CodeableConcept) // required {@link Immunization#vaccineCode() vaccineCode}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Immunization#language() language}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link Immunization#encounter() encounter}
   *    .expirationDate(com.fhir.types.fhir.Date) // optional {@link Immunization#expirationDate() expirationDate}
   *    .patient(com.fhir.types.fhir.Reference) // required {@link Immunization#patient() patient}
   *    .occurrenceDateTime(String) // optional {@link Immunization#occurrenceDateTime() occurrenceDateTime}
   *    .reaction(List&amp;lt;com.fhir.types.fhir.Immunization_Reaction&amp;gt;) // optional {@link Immunization#reaction() reaction}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Immunization#implicitRules() implicitRules}
   *    .status(com.fhir.types.fhir.Code) // optional {@link Immunization#status() status}
   *    .doseQuantity(com.fhir.types.fhir.Quantity) // optional {@link Immunization#doseQuantity() doseQuantity}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Immunization#id() id}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Immunization#meta() meta}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Immunization#reasonCode() reasonCode}
   *    .reportOrigin(com.fhir.types.fhir.CodeableConcept) // optional {@link Immunization#reportOrigin() reportOrigin}
   *    .subpotentReason(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Immunization#subpotentReason() subpotentReason}
   *    .primarySource(Boolean) // optional {@link Immunization#primarySource() primarySource}
   *    .site(com.fhir.types.fhir.CodeableConcept) // optional {@link Immunization#site() site}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Immunization#contained() contained}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Immunization#identifier() identifier}
   *    .manufacturer(com.fhir.types.fhir.Reference) // optional {@link Immunization#manufacturer() manufacturer}
   *    .statusReason(com.fhir.types.fhir.CodeableConcept) // optional {@link Immunization#statusReason() statusReason}
   *    .build();
   * </pre>
   * @return A new Immunization builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableImmunization.Builder();
  }

  /**
   * Builds instances of type {@link Immunization Immunization}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Immunization", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, VaccineCodeBuildStage, PatientBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_VACCINE_CODE = 0x2L;
    private static final long INIT_BIT_PATIENT = 0x4L;
    private static final long OPT_BIT_FUNDING_SOURCE = 0x1L;
    private static final long OPT_BIT_LOT_NUMBER = 0x2L;
    private static final long OPT_BIT_ROUTE = 0x4L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x8L;
    private static final long OPT_BIT_PROGRAM_ELIGIBILITY = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_OCCURRENCE_STRING = 0x80L;
    private static final long OPT_BIT_RECORDED = 0x100L;
    private static final long OPT_BIT_IS_SUBPOTENT = 0x200L;
    private static final long OPT_BIT_EDUCATION = 0x400L;
    private static final long OPT_BIT_LOCATION = 0x800L;
    private static final long OPT_BIT_NOTE = 0x1000L;
    private static final long OPT_BIT_PROTOCOL_APPLIED = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_PERFORMER = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_ENCOUNTER = 0x20000L;
    private static final long OPT_BIT_EXPIRATION_DATE = 0x40000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x80000L;
    private static final long OPT_BIT_REACTION = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_STATUS = 0x400000L;
    private static final long OPT_BIT_DOSE_QUANTITY = 0x800000L;
    private static final long OPT_BIT_ID = 0x1000000L;
    private static final long OPT_BIT_META = 0x2000000L;
    private static final long OPT_BIT_REASON_CODE = 0x4000000L;
    private static final long OPT_BIT_REPORT_ORIGIN = 0x8000000L;
    private static final long OPT_BIT_SUBPOTENT_REASON = 0x10000000L;
    private static final long OPT_BIT_PRIMARY_SOURCE = 0x20000000L;
    private static final long OPT_BIT_SITE = 0x40000000L;
    private static final long OPT_BIT_CONTAINED = 0x80000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000000L;
    private static final long OPT_BIT_MANUFACTURER = 0x200000000L;
    private static final long OPT_BIT_STATUS_REASON = 0x400000000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable CodeableConcept fundingSource;
    private @Nullable String lotNumber;
    private @Nullable CodeableConcept route;
    private @Nullable List<Reference> reasonReference;
    private @Nullable List<CodeableConcept> programEligibility;
    private @Nullable Narrative text;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String occurrenceString;
    private @Nullable DateTime recorded;
    private @Nullable Boolean isSubpotent;
    private @Nullable List<Immunization_Education> education;
    private @Nullable Reference location;
    private @Nullable List<Annotation> note;
    private @Nullable List<Immunization_ProtocolApplied> protocolApplied;
    private @Nullable List<Extension> extension;
    private @Nullable String resourceType;
    private @Nullable List<Immunization_Performer> performer;
    private @Nullable CodeableConcept vaccineCode;
    private @Nullable Code language;
    private @Nullable Reference encounter;
    private @Nullable Date expirationDate;
    private @Nullable Reference patient;
    private @Nullable String occurrenceDateTime;
    private @Nullable List<Immunization_Reaction> reaction;
    private @Nullable Uri implicitRules;
    private @Nullable Code status;
    private @Nullable Quantity doseQuantity;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable CodeableConcept reportOrigin;
    private @Nullable List<CodeableConcept> subpotentReason;
    private @Nullable Boolean primarySource;
    private @Nullable CodeableConcept site;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference manufacturer;
    private @Nullable CodeableConcept statusReason;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Immunization#fundingSource() fundingSource} to fundingSource.
     * @param fundingSource The value for fundingSource
     * @return {@code this} builder for chained invocation
     */
    public final Builder fundingSource(CodeableConcept fundingSource) {
      checkNotIsSet(fundingSourceIsSet(), "fundingSource");
      this.fundingSource = Objects.requireNonNull(fundingSource, "fundingSource");
      optBits |= OPT_BIT_FUNDING_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#fundingSource() fundingSource} to fundingSource.
     * @param fundingSource The value for fundingSource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fundingSource")
    public final Builder fundingSource(Optional<? extends CodeableConcept> fundingSource) {
      checkNotIsSet(fundingSourceIsSet(), "fundingSource");
      this.fundingSource = fundingSource.orElse(null);
      optBits |= OPT_BIT_FUNDING_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder lotNumber(String lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = Objects.requireNonNull(lotNumber, "lotNumber");
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lotNumber")
    public final Builder lotNumber(Optional<String> lotNumber) {
      checkNotIsSet(lotNumberIsSet(), "lotNumber");
      this.lotNumber = lotNumber.orElse(null);
      optBits |= OPT_BIT_LOT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for chained invocation
     */
    public final Builder route(CodeableConcept route) {
      checkNotIsSet(routeIsSet(), "route");
      this.route = Objects.requireNonNull(route, "route");
      optBits |= OPT_BIT_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("route")
    public final Builder route(Optional<? extends CodeableConcept> route) {
      checkNotIsSet(routeIsSet(), "route");
      this.route = route.orElse(null);
      optBits |= OPT_BIT_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Immunization#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Immunization#programEligibility() programEligibility} to programEligibility.
     * @param programEligibility The value for programEligibility
     * @return {@code this} builder for chained invocation
     */
    public final Builder programEligibility(List<CodeableConcept> programEligibility) {
      checkNotIsSet(programEligibilityIsSet(), "programEligibility");
      this.programEligibility = Objects.requireNonNull(programEligibility, "programEligibility");
      optBits |= OPT_BIT_PROGRAM_ELIGIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#programEligibility() programEligibility} to programEligibility.
     * @param programEligibility The value for programEligibility
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("programEligibility")
    public final Builder programEligibility(Optional<? extends List<CodeableConcept>> programEligibility) {
      checkNotIsSet(programEligibilityIsSet(), "programEligibility");
      this.programEligibility = programEligibility.orElse(null);
      optBits |= OPT_BIT_PROGRAM_ELIGIBILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#text() text} to text.
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
     * Initializes the optional value {@link Immunization#text() text} to text.
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
     * Initializes the optional value {@link Immunization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization#occurrenceString() occurrenceString} to occurrenceString.
     * @param occurrenceString The value for occurrenceString
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceString(String occurrenceString) {
      checkNotIsSet(occurrenceStringIsSet(), "occurrenceString");
      this.occurrenceString = Objects.requireNonNull(occurrenceString, "occurrenceString");
      optBits |= OPT_BIT_OCCURRENCE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#occurrenceString() occurrenceString} to occurrenceString.
     * @param occurrenceString The value for occurrenceString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceString")
    public final Builder occurrenceString(Optional<String> occurrenceString) {
      checkNotIsSet(occurrenceStringIsSet(), "occurrenceString");
      this.occurrenceString = occurrenceString.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    public final Builder recorded(DateTime recorded) {
      checkNotIsSet(recordedIsSet(), "recorded");
      this.recorded = Objects.requireNonNull(recorded, "recorded");
      optBits |= OPT_BIT_RECORDED;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recorded")
    public final Builder recorded(Optional<? extends DateTime> recorded) {
      checkNotIsSet(recordedIsSet(), "recorded");
      this.recorded = recorded.orElse(null);
      optBits |= OPT_BIT_RECORDED;
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
    @JsonProperty("isSubpotent")
    public final Builder isSubpotent(Optional<Boolean> isSubpotent) {
      checkNotIsSet(isSubpotentIsSet(), "isSubpotent");
      this.isSubpotent = isSubpotent.orElse(null);
      optBits |= OPT_BIT_IS_SUBPOTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#education() education} to education.
     * @param education The value for education
     * @return {@code this} builder for chained invocation
     */
    public final Builder education(List<Immunization_Education> education) {
      checkNotIsSet(educationIsSet(), "education");
      this.education = Objects.requireNonNull(education, "education");
      optBits |= OPT_BIT_EDUCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#education() education} to education.
     * @param education The value for education
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("education")
    public final Builder education(Optional<? extends List<Immunization_Education>> education) {
      checkNotIsSet(educationIsSet(), "education");
      this.education = education.orElse(null);
      optBits |= OPT_BIT_EDUCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#location() location} to location.
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
     * Initializes the optional value {@link Immunization#location() location} to location.
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
     * Initializes the optional value {@link Immunization#note() note} to note.
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
     * Initializes the optional value {@link Immunization#note() note} to note.
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
     * Initializes the optional value {@link Immunization#protocolApplied() protocolApplied} to protocolApplied.
     * @param protocolApplied The value for protocolApplied
     * @return {@code this} builder for chained invocation
     */
    public final Builder protocolApplied(List<Immunization_ProtocolApplied> protocolApplied) {
      checkNotIsSet(protocolAppliedIsSet(), "protocolApplied");
      this.protocolApplied = Objects.requireNonNull(protocolApplied, "protocolApplied");
      optBits |= OPT_BIT_PROTOCOL_APPLIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#protocolApplied() protocolApplied} to protocolApplied.
     * @param protocolApplied The value for protocolApplied
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("protocolApplied")
    public final Builder protocolApplied(Optional<? extends List<Immunization_ProtocolApplied>> protocolApplied) {
      checkNotIsSet(protocolAppliedIsSet(), "protocolApplied");
      this.protocolApplied = protocolApplied.orElse(null);
      optBits |= OPT_BIT_PROTOCOL_APPLIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization#extension() extension} to extension.
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
     * Initializes the value for the {@link Immunization#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Immunization#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<Immunization_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<Immunization_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the value for the {@link Immunization#vaccineCode() vaccineCode} attribute.
     * @param vaccineCode The value for vaccineCode 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("vaccineCode")
    public final Builder vaccineCode(CodeableConcept vaccineCode) {
      checkNotIsSet(vaccineCodeIsSet(), "vaccineCode");
      this.vaccineCode = Objects.requireNonNull(vaccineCode, "vaccineCode");
      initBits &= ~INIT_BIT_VACCINE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#language() language} to language.
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
     * Initializes the optional value {@link Immunization#language() language} to language.
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
     * Initializes the optional value {@link Immunization#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Immunization#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Immunization#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder expirationDate(Date expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = Objects.requireNonNull(expirationDate, "expirationDate");
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expirationDate")
    public final Builder expirationDate(Optional<? extends Date> expirationDate) {
      checkNotIsSet(expirationDateIsSet(), "expirationDate");
      this.expirationDate = expirationDate.orElse(null);
      optBits |= OPT_BIT_EXPIRATION_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link Immunization#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      initBits &= ~INIT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(String occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(Optional<String> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder reaction(List<Immunization_Reaction> reaction) {
      checkNotIsSet(reactionIsSet(), "reaction");
      this.reaction = Objects.requireNonNull(reaction, "reaction");
      optBits |= OPT_BIT_REACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reaction")
    public final Builder reaction(Optional<? extends List<Immunization_Reaction>> reaction) {
      checkNotIsSet(reactionIsSet(), "reaction");
      this.reaction = reaction.orElse(null);
      optBits |= OPT_BIT_REACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Immunization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Immunization#status() status} to status.
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
     * Initializes the optional value {@link Immunization#status() status} to status.
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
     * Initializes the optional value {@link Immunization#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseQuantity(Quantity doseQuantity) {
      checkNotIsSet(doseQuantityIsSet(), "doseQuantity");
      this.doseQuantity = Objects.requireNonNull(doseQuantity, "doseQuantity");
      optBits |= OPT_BIT_DOSE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseQuantity")
    public final Builder doseQuantity(Optional<? extends Quantity> doseQuantity) {
      checkNotIsSet(doseQuantityIsSet(), "doseQuantity");
      this.doseQuantity = doseQuantity.orElse(null);
      optBits |= OPT_BIT_DOSE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#id() id} to id.
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
     * Initializes the optional value {@link Immunization#id() id} to id.
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
     * Initializes the optional value {@link Immunization#meta() meta} to meta.
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
     * Initializes the optional value {@link Immunization#meta() meta} to meta.
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
     * Initializes the optional value {@link Immunization#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Immunization#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Immunization#reportOrigin() reportOrigin} to reportOrigin.
     * @param reportOrigin The value for reportOrigin
     * @return {@code this} builder for chained invocation
     */
    public final Builder reportOrigin(CodeableConcept reportOrigin) {
      checkNotIsSet(reportOriginIsSet(), "reportOrigin");
      this.reportOrigin = Objects.requireNonNull(reportOrigin, "reportOrigin");
      optBits |= OPT_BIT_REPORT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#reportOrigin() reportOrigin} to reportOrigin.
     * @param reportOrigin The value for reportOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reportOrigin")
    public final Builder reportOrigin(Optional<? extends CodeableConcept> reportOrigin) {
      checkNotIsSet(reportOriginIsSet(), "reportOrigin");
      this.reportOrigin = reportOrigin.orElse(null);
      optBits |= OPT_BIT_REPORT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#subpotentReason() subpotentReason} to subpotentReason.
     * @param subpotentReason The value for subpotentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder subpotentReason(List<CodeableConcept> subpotentReason) {
      checkNotIsSet(subpotentReasonIsSet(), "subpotentReason");
      this.subpotentReason = Objects.requireNonNull(subpotentReason, "subpotentReason");
      optBits |= OPT_BIT_SUBPOTENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#subpotentReason() subpotentReason} to subpotentReason.
     * @param subpotentReason The value for subpotentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subpotentReason")
    public final Builder subpotentReason(Optional<? extends List<CodeableConcept>> subpotentReason) {
      checkNotIsSet(subpotentReasonIsSet(), "subpotentReason");
      this.subpotentReason = subpotentReason.orElse(null);
      optBits |= OPT_BIT_SUBPOTENT_REASON;
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
    @JsonProperty("primarySource")
    public final Builder primarySource(Optional<Boolean> primarySource) {
      checkNotIsSet(primarySourceIsSet(), "primarySource");
      this.primarySource = primarySource.orElse(null);
      optBits |= OPT_BIT_PRIMARY_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(CodeableConcept site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("site")
    public final Builder site(Optional<? extends CodeableConcept> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#contained() contained} to contained.
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
     * Initializes the optional value {@link Immunization#contained() contained} to contained.
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
     * Initializes the optional value {@link Immunization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Immunization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Immunization#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(Reference manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturer")
    public final Builder manufacturer(Optional<? extends Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link Immunization#statusReason() statusReason} to statusReason.
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
     * Builds a new {@link Immunization Immunization}.
     * @return An immutable instance of Immunization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Immunization build() {
      checkRequiredAttributes();
      return new ImmutableImmunization(
          fundingSource,
          lotNumber,
          route,
          reasonReference,
          programEligibility,
          text,
          modifierExtension,
          occurrenceString,
          recorded,
          isSubpotent,
          education,
          location,
          note,
          protocolApplied,
          extension,
          resourceType,
          performer,
          vaccineCode,
          language,
          encounter,
          expirationDate,
          patient,
          occurrenceDateTime,
          reaction,
          implicitRules,
          status,
          doseQuantity,
          id,
          meta,
          reasonCode,
          reportOrigin,
          subpotentReason,
          primarySource,
          site,
          contained,
          identifier,
          manufacturer,
          statusReason);
    }

    private boolean fundingSourceIsSet() {
      return (optBits & OPT_BIT_FUNDING_SOURCE) != 0;
    }

    private boolean lotNumberIsSet() {
      return (optBits & OPT_BIT_LOT_NUMBER) != 0;
    }

    private boolean routeIsSet() {
      return (optBits & OPT_BIT_ROUTE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean programEligibilityIsSet() {
      return (optBits & OPT_BIT_PROGRAM_ELIGIBILITY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean occurrenceStringIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_STRING) != 0;
    }

    private boolean recordedIsSet() {
      return (optBits & OPT_BIT_RECORDED) != 0;
    }

    private boolean isSubpotentIsSet() {
      return (optBits & OPT_BIT_IS_SUBPOTENT) != 0;
    }

    private boolean educationIsSet() {
      return (optBits & OPT_BIT_EDUCATION) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean protocolAppliedIsSet() {
      return (optBits & OPT_BIT_PROTOCOL_APPLIED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean expirationDateIsSet() {
      return (optBits & OPT_BIT_EXPIRATION_DATE) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean reactionIsSet() {
      return (optBits & OPT_BIT_REACTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean doseQuantityIsSet() {
      return (optBits & OPT_BIT_DOSE_QUANTITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean reportOriginIsSet() {
      return (optBits & OPT_BIT_REPORT_ORIGIN) != 0;
    }

    private boolean subpotentReasonIsSet() {
      return (optBits & OPT_BIT_SUBPOTENT_REASON) != 0;
    }

    private boolean primarySourceIsSet() {
      return (optBits & OPT_BIT_PRIMARY_SOURCE) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean vaccineCodeIsSet() {
      return (initBits & INIT_BIT_VACCINE_CODE) == 0;
    }

    private boolean patientIsSet() {
      return (initBits & INIT_BIT_PATIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Immunization is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!vaccineCodeIsSet()) attributes.add("vaccineCode");
      if (!patientIsSet()) attributes.add("patient");
      return "Cannot build Immunization, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Immunization", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Immunization#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    VaccineCodeBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Immunization", generator = "Immutables")
  public interface VaccineCodeBuildStage {
    /**
     * Initializes the value for the {@link Immunization#vaccineCode() vaccineCode} attribute.
     * @param vaccineCode The value for vaccineCode 
     * @return {@code this} builder for use in a chained invocation
     */
    PatientBuildStage vaccineCode(CodeableConcept vaccineCode);
  }

  @Generated(from = "Immunization", generator = "Immutables")
  public interface PatientBuildStage {
    /**
     * Initializes the value for the {@link Immunization#patient() patient} attribute.
     * @param patient The value for patient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Reference patient);
  }

  @Generated(from = "Immunization", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Immunization#fundingSource() fundingSource} to fundingSource.
     * @param fundingSource The value for fundingSource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fundingSource(CodeableConcept fundingSource);

    /**
     * Initializes the optional value {@link Immunization#fundingSource() fundingSource} to fundingSource.
     * @param fundingSource The value for fundingSource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fundingSource(Optional<? extends CodeableConcept> fundingSource);

    /**
     * Initializes the optional value {@link Immunization#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lotNumber(String lotNumber);

    /**
     * Initializes the optional value {@link Immunization#lotNumber() lotNumber} to lotNumber.
     * @param lotNumber The value for lotNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lotNumber(Optional<String> lotNumber);

    /**
     * Initializes the optional value {@link Immunization#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for chained invocation
     */
    BuildFinal route(CodeableConcept route);

    /**
     * Initializes the optional value {@link Immunization#route() route} to route.
     * @param route The value for route
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal route(Optional<? extends CodeableConcept> route);

    /**
     * Initializes the optional value {@link Immunization#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link Immunization#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Immunization#programEligibility() programEligibility} to programEligibility.
     * @param programEligibility The value for programEligibility
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programEligibility(List<CodeableConcept> programEligibility);

    /**
     * Initializes the optional value {@link Immunization#programEligibility() programEligibility} to programEligibility.
     * @param programEligibility The value for programEligibility
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programEligibility(Optional<? extends List<CodeableConcept>> programEligibility);

    /**
     * Initializes the optional value {@link Immunization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Immunization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Immunization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Immunization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Immunization#occurrenceString() occurrenceString} to occurrenceString.
     * @param occurrenceString The value for occurrenceString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceString(String occurrenceString);

    /**
     * Initializes the optional value {@link Immunization#occurrenceString() occurrenceString} to occurrenceString.
     * @param occurrenceString The value for occurrenceString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceString(Optional<String> occurrenceString);

    /**
     * Initializes the optional value {@link Immunization#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recorded(DateTime recorded);

    /**
     * Initializes the optional value {@link Immunization#recorded() recorded} to recorded.
     * @param recorded The value for recorded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recorded(Optional<? extends DateTime> recorded);

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
    BuildFinal isSubpotent(Optional<Boolean> isSubpotent);

    /**
     * Initializes the optional value {@link Immunization#education() education} to education.
     * @param education The value for education
     * @return {@code this} builder for chained invocation
     */
    BuildFinal education(List<Immunization_Education> education);

    /**
     * Initializes the optional value {@link Immunization#education() education} to education.
     * @param education The value for education
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal education(Optional<? extends List<Immunization_Education>> education);

    /**
     * Initializes the optional value {@link Immunization#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link Immunization#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link Immunization#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Immunization#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Immunization#protocolApplied() protocolApplied} to protocolApplied.
     * @param protocolApplied The value for protocolApplied
     * @return {@code this} builder for chained invocation
     */
    BuildFinal protocolApplied(List<Immunization_ProtocolApplied> protocolApplied);

    /**
     * Initializes the optional value {@link Immunization#protocolApplied() protocolApplied} to protocolApplied.
     * @param protocolApplied The value for protocolApplied
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protocolApplied(Optional<? extends List<Immunization_ProtocolApplied>> protocolApplied);

    /**
     * Initializes the optional value {@link Immunization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Immunization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Immunization#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<Immunization_Performer> performer);

    /**
     * Initializes the optional value {@link Immunization#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<Immunization_Performer>> performer);

    /**
     * Initializes the optional value {@link Immunization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Immunization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Immunization#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Immunization#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Immunization#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expirationDate(Date expirationDate);

    /**
     * Initializes the optional value {@link Immunization#expirationDate() expirationDate} to expirationDate.
     * @param expirationDate The value for expirationDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expirationDate(Optional<? extends Date> expirationDate);

    /**
     * Initializes the optional value {@link Immunization#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link Immunization#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link Immunization#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reaction(List<Immunization_Reaction> reaction);

    /**
     * Initializes the optional value {@link Immunization#reaction() reaction} to reaction.
     * @param reaction The value for reaction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reaction(Optional<? extends List<Immunization_Reaction>> reaction);

    /**
     * Initializes the optional value {@link Immunization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Immunization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Immunization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link Immunization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link Immunization#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doseQuantity(Quantity doseQuantity);

    /**
     * Initializes the optional value {@link Immunization#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doseQuantity(Optional<? extends Quantity> doseQuantity);

    /**
     * Initializes the optional value {@link Immunization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Immunization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Immunization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Immunization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Immunization#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Immunization#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Immunization#reportOrigin() reportOrigin} to reportOrigin.
     * @param reportOrigin The value for reportOrigin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reportOrigin(CodeableConcept reportOrigin);

    /**
     * Initializes the optional value {@link Immunization#reportOrigin() reportOrigin} to reportOrigin.
     * @param reportOrigin The value for reportOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reportOrigin(Optional<? extends CodeableConcept> reportOrigin);

    /**
     * Initializes the optional value {@link Immunization#subpotentReason() subpotentReason} to subpotentReason.
     * @param subpotentReason The value for subpotentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subpotentReason(List<CodeableConcept> subpotentReason);

    /**
     * Initializes the optional value {@link Immunization#subpotentReason() subpotentReason} to subpotentReason.
     * @param subpotentReason The value for subpotentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subpotentReason(Optional<? extends List<CodeableConcept>> subpotentReason);

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
    BuildFinal primarySource(Optional<Boolean> primarySource);

    /**
     * Initializes the optional value {@link Immunization#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    BuildFinal site(CodeableConcept site);

    /**
     * Initializes the optional value {@link Immunization#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal site(Optional<? extends CodeableConcept> site);

    /**
     * Initializes the optional value {@link Immunization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Immunization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Immunization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Immunization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Immunization#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturer(Reference manufacturer);

    /**
     * Initializes the optional value {@link Immunization#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturer(Optional<? extends Reference> manufacturer);

    /**
     * Initializes the optional value {@link Immunization#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link Immunization#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends CodeableConcept> statusReason);

    /**
     * Builds a new {@link Immunization Immunization}.
     * @return An immutable instance of Immunization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Immunization build();
  }
}
