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
 * Immutable implementation of {@link MedicinalProductAuthorization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductAuthorization.builder()}.
 */
@Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductAuthorization
    implements MedicinalProductAuthorization {
  private final @Nullable DateTime restoreDate;
  private final @Nullable DateTime statusDate;
  private final @Nullable DateTime dateOfFirstAuthorization;
  private final @Nullable MedicinalProductAuthorization_Procedure procedure;
  private final @Nullable Narrative text;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Period dataExclusivityPeriod;
  private final @Nullable Reference holder;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference regulator;
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Period validityPeriod;
  private final @Nullable DateTime internationalBirthDate;
  private final @Nullable CodeableConcept status;
  private final @Nullable Reference subject;
  private final @Nullable List<MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable Id id;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept legalBasis;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> country;

  private ImmutableMedicinalProductAuthorization(
      @Nullable DateTime restoreDate,
      @Nullable DateTime statusDate,
      @Nullable DateTime dateOfFirstAuthorization,
      @Nullable MedicinalProductAuthorization_Procedure procedure,
      @Nullable Narrative text,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<Identifier> identifier,
      @Nullable Period dataExclusivityPeriod,
      @Nullable Reference holder,
      @Nullable Uri implicitRules,
      @Nullable Reference regulator,
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable Period validityPeriod,
      @Nullable DateTime internationalBirthDate,
      @Nullable CodeableConcept status,
      @Nullable Reference subject,
      @Nullable List<MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization,
      String resourceType,
      @Nullable Code language,
      @Nullable Id id,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept legalBasis,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> country) {
    this.restoreDate = restoreDate;
    this.statusDate = statusDate;
    this.dateOfFirstAuthorization = dateOfFirstAuthorization;
    this.procedure = procedure;
    this.text = text;
    this.jurisdiction = jurisdiction;
    this.identifier = identifier;
    this.dataExclusivityPeriod = dataExclusivityPeriod;
    this.holder = holder;
    this.implicitRules = implicitRules;
    this.regulator = regulator;
    this.meta = meta;
    this.contained = contained;
    this.validityPeriod = validityPeriod;
    this.internationalBirthDate = internationalBirthDate;
    this.status = status;
    this.subject = subject;
    this.jurisdictionalAuthorization = jurisdictionalAuthorization;
    this.resourceType = resourceType;
    this.language = language;
    this.id = id;
    this.extension = extension;
    this.legalBasis = legalBasis;
    this.modifierExtension = modifierExtension;
    this.country = country;
  }

  /**
   * @return The value of the {@code restoreDate} attribute
   */
  @JsonProperty("restoreDate")
  @Override
  public Optional<DateTime> restoreDate() {
    return Optional.ofNullable(restoreDate);
  }

  /**
   * @return The value of the {@code statusDate} attribute
   */
  @JsonProperty("statusDate")
  @Override
  public Optional<DateTime> statusDate() {
    return Optional.ofNullable(statusDate);
  }

  /**
   * @return The value of the {@code dateOfFirstAuthorization} attribute
   */
  @JsonProperty("dateOfFirstAuthorization")
  @Override
  public Optional<DateTime> dateOfFirstAuthorization() {
    return Optional.ofNullable(dateOfFirstAuthorization);
  }

  /**
   * @return The value of the {@code procedure} attribute
   */
  @JsonProperty("procedure")
  @Override
  public Optional<MedicinalProductAuthorization_Procedure> procedure() {
    return Optional.ofNullable(procedure);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code dataExclusivityPeriod} attribute
   */
  @JsonProperty("dataExclusivityPeriod")
  @Override
  public Optional<Period> dataExclusivityPeriod() {
    return Optional.ofNullable(dataExclusivityPeriod);
  }

  /**
   * @return The value of the {@code holder} attribute
   */
  @JsonProperty("holder")
  @Override
  public Optional<Reference> holder() {
    return Optional.ofNullable(holder);
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
   * @return The value of the {@code regulator} attribute
   */
  @JsonProperty("regulator")
  @Override
  public Optional<Reference> regulator() {
    return Optional.ofNullable(regulator);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code validityPeriod} attribute
   */
  @JsonProperty("validityPeriod")
  @Override
  public Optional<Period> validityPeriod() {
    return Optional.ofNullable(validityPeriod);
  }

  /**
   * @return The value of the {@code internationalBirthDate} attribute
   */
  @JsonProperty("internationalBirthDate")
  @Override
  public Optional<DateTime> internationalBirthDate() {
    return Optional.ofNullable(internationalBirthDate);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CodeableConcept> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code jurisdictionalAuthorization} attribute
   */
  @JsonProperty("jurisdictionalAuthorization")
  @Override
  public Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization() {
    return Optional.ofNullable(jurisdictionalAuthorization);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code legalBasis} attribute
   */
  @JsonProperty("legalBasis")
  @Override
  public Optional<CodeableConcept> legalBasis() {
    return Optional.ofNullable(legalBasis);
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
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public Optional<List<CodeableConcept>> country() {
    return Optional.ofNullable(country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#restoreDate() restoreDate} attribute.
   * @param value The value for restoreDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withRestoreDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "restoreDate");
    if (this.restoreDate == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        newValue,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#restoreDate() restoreDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for restoreDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withRestoreDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.restoreDate == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        value,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#statusDate() statusDate} attribute.
   * @param value The value for statusDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withStatusDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "statusDate");
    if (this.statusDate == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        newValue,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#statusDate() statusDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withStatusDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.statusDate == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        value,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} attribute.
   * @param value The value for dateOfFirstAuthorization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withDateOfFirstAuthorization(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "dateOfFirstAuthorization");
    if (this.dateOfFirstAuthorization == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        newValue,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateOfFirstAuthorization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withDateOfFirstAuthorization(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.dateOfFirstAuthorization == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        value,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#procedure() procedure} attribute.
   * @param value The value for procedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withProcedure(MedicinalProductAuthorization_Procedure value) {
    @Nullable MedicinalProductAuthorization_Procedure newValue = Objects.requireNonNull(value, "procedure");
    if (this.procedure == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        newValue,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#procedure() procedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withProcedure(Optional<? extends MedicinalProductAuthorization_Procedure> optional) {
    @Nullable MedicinalProductAuthorization_Procedure value = optional.orElse(null);
    if (this.procedure == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        value,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        newValue,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        value,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        newValue,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        value,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        newValue,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        value,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} attribute.
   * @param value The value for dataExclusivityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withDataExclusivityPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "dataExclusivityPeriod");
    if (this.dataExclusivityPeriod == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        newValue,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataExclusivityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withDataExclusivityPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.dataExclusivityPeriod == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        value,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#holder() holder} attribute.
   * @param value The value for holder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withHolder(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "holder");
    if (this.holder == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        newValue,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#holder() holder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for holder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withHolder(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.holder == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        value,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        newValue,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        value,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#regulator() regulator} attribute.
   * @param value The value for regulator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withRegulator(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "regulator");
    if (this.regulator == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        newValue,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#regulator() regulator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for regulator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withRegulator(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.regulator == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        value,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        newValue,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        value,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        newValue,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        value,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} attribute.
   * @param value The value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withValidityPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "validityPeriod");
    if (this.validityPeriod == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        newValue,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withValidityPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.validityPeriod == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        value,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} attribute.
   * @param value The value for internationalBirthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withInternationalBirthDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "internationalBirthDate");
    if (this.internationalBirthDate == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        newValue,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for internationalBirthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withInternationalBirthDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.internationalBirthDate == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        value,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        newValue,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        value,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        newValue,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        value,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} attribute.
   * @param value The value for jurisdictionalAuthorization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withJurisdictionalAuthorization(List<MedicinalProductAuthorization_JurisdictionalAuthorization> value) {
    @Nullable List<MedicinalProductAuthorization_JurisdictionalAuthorization> newValue = Objects.requireNonNull(value, "jurisdictionalAuthorization");
    if (this.jurisdictionalAuthorization == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        newValue,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdictionalAuthorization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withJurisdictionalAuthorization(Optional<? extends List<MedicinalProductAuthorization_JurisdictionalAuthorization>> optional) {
    @Nullable List<MedicinalProductAuthorization_JurisdictionalAuthorization> value = optional.orElse(null);
    if (this.jurisdictionalAuthorization == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        value,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductAuthorization#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        newValue,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        newValue,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        value,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        newValue,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        value,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        newValue,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        value,
        this.legalBasis,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#legalBasis() legalBasis} attribute.
   * @param value The value for legalBasis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withLegalBasis(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "legalBasis");
    if (this.legalBasis == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        newValue,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#legalBasis() legalBasis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalBasis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withLegalBasis(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.legalBasis == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        value,
        this.modifierExtension,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        newValue,
        this.country);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        value,
        this.country);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#country() country} attribute.
   * @param value The value for country
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withCountry(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "country");
    if (this.country == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#country() country} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for country
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withCountry(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.country == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.restoreDate,
        this.statusDate,
        this.dateOfFirstAuthorization,
        this.procedure,
        this.text,
        this.jurisdiction,
        this.identifier,
        this.dataExclusivityPeriod,
        this.holder,
        this.implicitRules,
        this.regulator,
        this.meta,
        this.contained,
        this.validityPeriod,
        this.internationalBirthDate,
        this.status,
        this.subject,
        this.jurisdictionalAuthorization,
        this.resourceType,
        this.language,
        this.id,
        this.extension,
        this.legalBasis,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductAuthorization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductAuthorization
        && equalTo((ImmutableMedicinalProductAuthorization) another);
  }

  private boolean equalTo(ImmutableMedicinalProductAuthorization another) {
    return Objects.equals(restoreDate, another.restoreDate)
        && Objects.equals(statusDate, another.statusDate)
        && Objects.equals(dateOfFirstAuthorization, another.dateOfFirstAuthorization)
        && Objects.equals(procedure, another.procedure)
        && Objects.equals(text, another.text)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(dataExclusivityPeriod, another.dataExclusivityPeriod)
        && Objects.equals(holder, another.holder)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(regulator, another.regulator)
        && Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(validityPeriod, another.validityPeriod)
        && Objects.equals(internationalBirthDate, another.internationalBirthDate)
        && Objects.equals(status, another.status)
        && Objects.equals(subject, another.subject)
        && Objects.equals(jurisdictionalAuthorization, another.jurisdictionalAuthorization)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(legalBasis, another.legalBasis)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(country, another.country);
  }

  /**
   * Computes a hash code from attributes: {@code restoreDate}, {@code statusDate}, {@code dateOfFirstAuthorization}, {@code procedure}, {@code text}, {@code jurisdiction}, {@code identifier}, {@code dataExclusivityPeriod}, {@code holder}, {@code implicitRules}, {@code regulator}, {@code meta}, {@code contained}, {@code validityPeriod}, {@code internationalBirthDate}, {@code status}, {@code subject}, {@code jurisdictionalAuthorization}, {@code resourceType}, {@code language}, {@code id}, {@code extension}, {@code legalBasis}, {@code modifierExtension}, {@code country}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(restoreDate);
    h += (h << 5) + Objects.hashCode(statusDate);
    h += (h << 5) + Objects.hashCode(dateOfFirstAuthorization);
    h += (h << 5) + Objects.hashCode(procedure);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(dataExclusivityPeriod);
    h += (h << 5) + Objects.hashCode(holder);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(regulator);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(validityPeriod);
    h += (h << 5) + Objects.hashCode(internationalBirthDate);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(jurisdictionalAuthorization);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(legalBasis);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(country);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductAuthorization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductAuthorization{");
    if (restoreDate != null) {
      builder.append("restoreDate=").append(restoreDate);
    }
    if (statusDate != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("statusDate=").append(statusDate);
    }
    if (dateOfFirstAuthorization != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("dateOfFirstAuthorization=").append(dateOfFirstAuthorization);
    }
    if (procedure != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("procedure=").append(procedure);
    }
    if (text != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (jurisdiction != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (identifier != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (dataExclusivityPeriod != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("dataExclusivityPeriod=").append(dataExclusivityPeriod);
    }
    if (holder != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("holder=").append(holder);
    }
    if (implicitRules != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (regulator != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("regulator=").append(regulator);
    }
    if (meta != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (validityPeriod != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("validityPeriod=").append(validityPeriod);
    }
    if (internationalBirthDate != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("internationalBirthDate=").append(internationalBirthDate);
    }
    if (status != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (subject != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (jurisdictionalAuthorization != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("jurisdictionalAuthorization=").append(jurisdictionalAuthorization);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (legalBasis != null) {
      builder.append(", ");
      builder.append("legalBasis=").append(legalBasis);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (country != null) {
      builder.append(", ");
      builder.append("country=").append(country);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductAuthorization {
    @Nullable Optional<DateTime> restoreDate = Optional.empty();
    boolean restoreDateIsSet;
    @Nullable Optional<DateTime> statusDate = Optional.empty();
    boolean statusDateIsSet;
    @Nullable Optional<DateTime> dateOfFirstAuthorization = Optional.empty();
    boolean dateOfFirstAuthorizationIsSet;
    @Nullable Optional<MedicinalProductAuthorization_Procedure> procedure = Optional.empty();
    boolean procedureIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Period> dataExclusivityPeriod = Optional.empty();
    boolean dataExclusivityPeriodIsSet;
    @Nullable Optional<Reference> holder = Optional.empty();
    boolean holderIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> regulator = Optional.empty();
    boolean regulatorIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Period> validityPeriod = Optional.empty();
    boolean validityPeriodIsSet;
    @Nullable Optional<DateTime> internationalBirthDate = Optional.empty();
    boolean internationalBirthDateIsSet;
    @Nullable Optional<CodeableConcept> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization = Optional.empty();
    boolean jurisdictionalAuthorizationIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> legalBasis = Optional.empty();
    boolean legalBasisIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> country = Optional.empty();
    boolean countryIsSet;
    @JsonProperty("restoreDate")
    public void setRestoreDate(Optional<DateTime> restoreDate) {
      this.restoreDate = restoreDate;
      this.restoreDateIsSet = true;
    }
    @JsonProperty("statusDate")
    public void setStatusDate(Optional<DateTime> statusDate) {
      this.statusDate = statusDate;
      this.statusDateIsSet = true;
    }
    @JsonProperty("dateOfFirstAuthorization")
    public void setDateOfFirstAuthorization(Optional<DateTime> dateOfFirstAuthorization) {
      this.dateOfFirstAuthorization = dateOfFirstAuthorization;
      this.dateOfFirstAuthorizationIsSet = true;
    }
    @JsonProperty("procedure")
    public void setProcedure(Optional<MedicinalProductAuthorization_Procedure> procedure) {
      this.procedure = procedure;
      this.procedureIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("dataExclusivityPeriod")
    public void setDataExclusivityPeriod(Optional<Period> dataExclusivityPeriod) {
      this.dataExclusivityPeriod = dataExclusivityPeriod;
      this.dataExclusivityPeriodIsSet = true;
    }
    @JsonProperty("holder")
    public void setHolder(Optional<Reference> holder) {
      this.holder = holder;
      this.holderIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("regulator")
    public void setRegulator(Optional<Reference> regulator) {
      this.regulator = regulator;
      this.regulatorIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Optional<Period> validityPeriod) {
      this.validityPeriod = validityPeriod;
      this.validityPeriodIsSet = true;
    }
    @JsonProperty("internationalBirthDate")
    public void setInternationalBirthDate(Optional<DateTime> internationalBirthDate) {
      this.internationalBirthDate = internationalBirthDate;
      this.internationalBirthDateIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("jurisdictionalAuthorization")
    public void setJurisdictionalAuthorization(Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization) {
      this.jurisdictionalAuthorization = jurisdictionalAuthorization;
      this.jurisdictionalAuthorizationIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
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
    @JsonProperty("legalBasis")
    public void setLegalBasis(Optional<CodeableConcept> legalBasis) {
      this.legalBasis = legalBasis;
      this.legalBasisIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("country")
    public void setCountry(Optional<List<CodeableConcept>> country) {
      this.country = country;
      this.countryIsSet = true;
    }
    @Override
    public Optional<DateTime> restoreDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> statusDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> dateOfFirstAuthorization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicinalProductAuthorization_Procedure> procedure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> dataExclusivityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> holder() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> regulator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> validityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> internationalBirthDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> legalBasis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> country() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductAuthorization fromJson(Json json) {
    ImmutableMedicinalProductAuthorization.Builder builder = ((ImmutableMedicinalProductAuthorization.Builder) ImmutableMedicinalProductAuthorization.builder());
    if (json.restoreDateIsSet) {
      builder.restoreDate(json.restoreDate);
    }
    if (json.statusDateIsSet) {
      builder.statusDate(json.statusDate);
    }
    if (json.dateOfFirstAuthorizationIsSet) {
      builder.dateOfFirstAuthorization(json.dateOfFirstAuthorization);
    }
    if (json.procedureIsSet) {
      builder.procedure(json.procedure);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.dataExclusivityPeriodIsSet) {
      builder.dataExclusivityPeriod(json.dataExclusivityPeriod);
    }
    if (json.holderIsSet) {
      builder.holder(json.holder);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.regulatorIsSet) {
      builder.regulator(json.regulator);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.validityPeriodIsSet) {
      builder.validityPeriod(json.validityPeriod);
    }
    if (json.internationalBirthDateIsSet) {
      builder.internationalBirthDate(json.internationalBirthDate);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.jurisdictionalAuthorizationIsSet) {
      builder.jurisdictionalAuthorization(json.jurisdictionalAuthorization);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.legalBasisIsSet) {
      builder.legalBasis(json.legalBasis);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.countryIsSet) {
      builder.country(json.country);
    }
    return (ImmutableMedicinalProductAuthorization) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductAuthorization} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductAuthorization instance
   */
  public static MedicinalProductAuthorization copyOf(MedicinalProductAuthorization instance) {
    if (instance instanceof ImmutableMedicinalProductAuthorization) {
      return (ImmutableMedicinalProductAuthorization) instance;
    }
    return ((ImmutableMedicinalProductAuthorization.Builder) ImmutableMedicinalProductAuthorization.builder())
        .restoreDate(instance.restoreDate())
        .statusDate(instance.statusDate())
        .dateOfFirstAuthorization(instance.dateOfFirstAuthorization())
        .procedure(instance.procedure())
        .text(instance.text())
        .jurisdiction(instance.jurisdiction())
        .identifier(instance.identifier())
        .dataExclusivityPeriod(instance.dataExclusivityPeriod())
        .holder(instance.holder())
        .implicitRules(instance.implicitRules())
        .regulator(instance.regulator())
        .meta(instance.meta())
        .contained(instance.contained())
        .validityPeriod(instance.validityPeriod())
        .internationalBirthDate(instance.internationalBirthDate())
        .status(instance.status())
        .subject(instance.subject())
        .jurisdictionalAuthorization(instance.jurisdictionalAuthorization())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .id(instance.id())
        .extension(instance.extension())
        .legalBasis(instance.legalBasis())
        .modifierExtension(instance.modifierExtension())
        .country(instance.country())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductAuthorization MedicinalProductAuthorization}.
   * <pre>
   * ImmutableMedicinalProductAuthorization.builder()
   *    .restoreDate(com.medplum.types.fhir.DateTime) // optional {@link MedicinalProductAuthorization#restoreDate() restoreDate}
   *    .statusDate(com.medplum.types.fhir.DateTime) // optional {@link MedicinalProductAuthorization#statusDate() statusDate}
   *    .dateOfFirstAuthorization(com.medplum.types.fhir.DateTime) // optional {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization}
   *    .procedure(com.medplum.types.fhir.MedicinalProductAuthorization_Procedure) // optional {@link MedicinalProductAuthorization#procedure() procedure}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductAuthorization#text() text}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductAuthorization#jurisdiction() jurisdiction}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MedicinalProductAuthorization#identifier() identifier}
   *    .dataExclusivityPeriod(com.medplum.types.fhir.Period) // optional {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod}
   *    .holder(com.medplum.types.fhir.Reference) // optional {@link MedicinalProductAuthorization#holder() holder}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductAuthorization#implicitRules() implicitRules}
   *    .regulator(com.medplum.types.fhir.Reference) // optional {@link MedicinalProductAuthorization#regulator() regulator}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductAuthorization#meta() meta}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductAuthorization#contained() contained}
   *    .validityPeriod(com.medplum.types.fhir.Period) // optional {@link MedicinalProductAuthorization#validityPeriod() validityPeriod}
   *    .internationalBirthDate(com.medplum.types.fhir.DateTime) // optional {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate}
   *    .status(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductAuthorization#status() status}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link MedicinalProductAuthorization#subject() subject}
   *    .jurisdictionalAuthorization(List&amp;lt;com.medplum.types.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization&amp;gt;) // optional {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization}
   *    .resourceType(String) // required {@link MedicinalProductAuthorization#resourceType() resourceType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductAuthorization#language() language}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductAuthorization#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductAuthorization#extension() extension}
   *    .legalBasis(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductAuthorization#legalBasis() legalBasis}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductAuthorization#modifierExtension() modifierExtension}
   *    .country(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductAuthorization#country() country}
   *    .build();
   * </pre>
   * @return A new MedicinalProductAuthorization builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductAuthorization.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductAuthorization MedicinalProductAuthorization}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_RESTORE_DATE = 0x1L;
    private static final long OPT_BIT_STATUS_DATE = 0x2L;
    private static final long OPT_BIT_DATE_OF_FIRST_AUTHORIZATION = 0x4L;
    private static final long OPT_BIT_PROCEDURE = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_JURISDICTION = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_DATA_EXCLUSIVITY_PERIOD = 0x80L;
    private static final long OPT_BIT_HOLDER = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_REGULATOR = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_VALIDITY_PERIOD = 0x2000L;
    private static final long OPT_BIT_INTERNATIONAL_BIRTH_DATE = 0x4000L;
    private static final long OPT_BIT_STATUS = 0x8000L;
    private static final long OPT_BIT_SUBJECT = 0x10000L;
    private static final long OPT_BIT_JURISDICTIONAL_AUTHORIZATION = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_ID = 0x80000L;
    private static final long OPT_BIT_EXTENSION = 0x100000L;
    private static final long OPT_BIT_LEGAL_BASIS = 0x200000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400000L;
    private static final long OPT_BIT_COUNTRY = 0x800000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable DateTime restoreDate;
    private @Nullable DateTime statusDate;
    private @Nullable DateTime dateOfFirstAuthorization;
    private @Nullable MedicinalProductAuthorization_Procedure procedure;
    private @Nullable Narrative text;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<Identifier> identifier;
    private @Nullable Period dataExclusivityPeriod;
    private @Nullable Reference holder;
    private @Nullable Uri implicitRules;
    private @Nullable Reference regulator;
    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable Period validityPeriod;
    private @Nullable DateTime internationalBirthDate;
    private @Nullable CodeableConcept status;
    private @Nullable Reference subject;
    private @Nullable List<MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable Id id;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept legalBasis;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> country;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder restoreDate(DateTime restoreDate) {
      checkNotIsSet(restoreDateIsSet(), "restoreDate");
      this.restoreDate = Objects.requireNonNull(restoreDate, "restoreDate");
      optBits |= OPT_BIT_RESTORE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("restoreDate")
    public final Builder restoreDate(Optional<? extends DateTime> restoreDate) {
      checkNotIsSet(restoreDateIsSet(), "restoreDate");
      this.restoreDate = restoreDate.orElse(null);
      optBits |= OPT_BIT_RESTORE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusDate(DateTime statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = Objects.requireNonNull(statusDate, "statusDate");
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusDate")
    public final Builder statusDate(Optional<? extends DateTime> statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = statusDate.orElse(null);
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} to dateOfFirstAuthorization.
     * @param dateOfFirstAuthorization The value for dateOfFirstAuthorization
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateOfFirstAuthorization(DateTime dateOfFirstAuthorization) {
      checkNotIsSet(dateOfFirstAuthorizationIsSet(), "dateOfFirstAuthorization");
      this.dateOfFirstAuthorization = Objects.requireNonNull(dateOfFirstAuthorization, "dateOfFirstAuthorization");
      optBits |= OPT_BIT_DATE_OF_FIRST_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} to dateOfFirstAuthorization.
     * @param dateOfFirstAuthorization The value for dateOfFirstAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateOfFirstAuthorization")
    public final Builder dateOfFirstAuthorization(Optional<? extends DateTime> dateOfFirstAuthorization) {
      checkNotIsSet(dateOfFirstAuthorizationIsSet(), "dateOfFirstAuthorization");
      this.dateOfFirstAuthorization = dateOfFirstAuthorization.orElse(null);
      optBits |= OPT_BIT_DATE_OF_FIRST_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedure(MedicinalProductAuthorization_Procedure procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = Objects.requireNonNull(procedure, "procedure");
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedure")
    public final Builder procedure(Optional<? extends MedicinalProductAuthorization_Procedure> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = procedure.orElse(null);
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(List<CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} to dataExclusivityPeriod.
     * @param dataExclusivityPeriod The value for dataExclusivityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataExclusivityPeriod(Period dataExclusivityPeriod) {
      checkNotIsSet(dataExclusivityPeriodIsSet(), "dataExclusivityPeriod");
      this.dataExclusivityPeriod = Objects.requireNonNull(dataExclusivityPeriod, "dataExclusivityPeriod");
      optBits |= OPT_BIT_DATA_EXCLUSIVITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} to dataExclusivityPeriod.
     * @param dataExclusivityPeriod The value for dataExclusivityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataExclusivityPeriod")
    public final Builder dataExclusivityPeriod(Optional<? extends Period> dataExclusivityPeriod) {
      checkNotIsSet(dataExclusivityPeriodIsSet(), "dataExclusivityPeriod");
      this.dataExclusivityPeriod = dataExclusivityPeriod.orElse(null);
      optBits |= OPT_BIT_DATA_EXCLUSIVITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#holder() holder} to holder.
     * @param holder The value for holder
     * @return {@code this} builder for chained invocation
     */
    public final Builder holder(Reference holder) {
      checkNotIsSet(holderIsSet(), "holder");
      this.holder = Objects.requireNonNull(holder, "holder");
      optBits |= OPT_BIT_HOLDER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#holder() holder} to holder.
     * @param holder The value for holder
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("holder")
    public final Builder holder(Optional<? extends Reference> holder) {
      checkNotIsSet(holderIsSet(), "holder");
      this.holder = holder.orElse(null);
      optBits |= OPT_BIT_HOLDER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for chained invocation
     */
    public final Builder regulator(Reference regulator) {
      checkNotIsSet(regulatorIsSet(), "regulator");
      this.regulator = Objects.requireNonNull(regulator, "regulator");
      optBits |= OPT_BIT_REGULATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("regulator")
    public final Builder regulator(Optional<? extends Reference> regulator) {
      checkNotIsSet(regulatorIsSet(), "regulator");
      this.regulator = regulator.orElse(null);
      optBits |= OPT_BIT_REGULATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder validityPeriod(Period validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = Objects.requireNonNull(validityPeriod, "validityPeriod");
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validityPeriod")
    public final Builder validityPeriod(Optional<? extends Period> validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = validityPeriod.orElse(null);
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} to internationalBirthDate.
     * @param internationalBirthDate The value for internationalBirthDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder internationalBirthDate(DateTime internationalBirthDate) {
      checkNotIsSet(internationalBirthDateIsSet(), "internationalBirthDate");
      this.internationalBirthDate = Objects.requireNonNull(internationalBirthDate, "internationalBirthDate");
      optBits |= OPT_BIT_INTERNATIONAL_BIRTH_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} to internationalBirthDate.
     * @param internationalBirthDate The value for internationalBirthDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("internationalBirthDate")
    public final Builder internationalBirthDate(Optional<? extends DateTime> internationalBirthDate) {
      checkNotIsSet(internationalBirthDateIsSet(), "internationalBirthDate");
      this.internationalBirthDate = internationalBirthDate.orElse(null);
      optBits |= OPT_BIT_INTERNATIONAL_BIRTH_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} to jurisdictionalAuthorization.
     * @param jurisdictionalAuthorization The value for jurisdictionalAuthorization
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdictionalAuthorization(List<MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization) {
      checkNotIsSet(jurisdictionalAuthorizationIsSet(), "jurisdictionalAuthorization");
      this.jurisdictionalAuthorization = Objects.requireNonNull(jurisdictionalAuthorization, "jurisdictionalAuthorization");
      optBits |= OPT_BIT_JURISDICTIONAL_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} to jurisdictionalAuthorization.
     * @param jurisdictionalAuthorization The value for jurisdictionalAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdictionalAuthorization")
    public final Builder jurisdictionalAuthorization(Optional<? extends List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization) {
      checkNotIsSet(jurisdictionalAuthorizationIsSet(), "jurisdictionalAuthorization");
      this.jurisdictionalAuthorization = jurisdictionalAuthorization.orElse(null);
      optBits |= OPT_BIT_JURISDICTIONAL_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductAuthorization#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#legalBasis() legalBasis} to legalBasis.
     * @param legalBasis The value for legalBasis
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalBasis(CodeableConcept legalBasis) {
      checkNotIsSet(legalBasisIsSet(), "legalBasis");
      this.legalBasis = Objects.requireNonNull(legalBasis, "legalBasis");
      optBits |= OPT_BIT_LEGAL_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#legalBasis() legalBasis} to legalBasis.
     * @param legalBasis The value for legalBasis
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("legalBasis")
    public final Builder legalBasis(Optional<? extends CodeableConcept> legalBasis) {
      checkNotIsSet(legalBasisIsSet(), "legalBasis");
      this.legalBasis = legalBasis.orElse(null);
      optBits |= OPT_BIT_LEGAL_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    public final Builder country(List<CodeableConcept> country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = Objects.requireNonNull(country, "country");
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("country")
    public final Builder country(Optional<? extends List<CodeableConcept>> country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = country.orElse(null);
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductAuthorization MedicinalProductAuthorization}.
     * @return An immutable instance of MedicinalProductAuthorization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductAuthorization build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductAuthorization(
          restoreDate,
          statusDate,
          dateOfFirstAuthorization,
          procedure,
          text,
          jurisdiction,
          identifier,
          dataExclusivityPeriod,
          holder,
          implicitRules,
          regulator,
          meta,
          contained,
          validityPeriod,
          internationalBirthDate,
          status,
          subject,
          jurisdictionalAuthorization,
          resourceType,
          language,
          id,
          extension,
          legalBasis,
          modifierExtension,
          country);
    }

    private boolean restoreDateIsSet() {
      return (optBits & OPT_BIT_RESTORE_DATE) != 0;
    }

    private boolean statusDateIsSet() {
      return (optBits & OPT_BIT_STATUS_DATE) != 0;
    }

    private boolean dateOfFirstAuthorizationIsSet() {
      return (optBits & OPT_BIT_DATE_OF_FIRST_AUTHORIZATION) != 0;
    }

    private boolean procedureIsSet() {
      return (optBits & OPT_BIT_PROCEDURE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean dataExclusivityPeriodIsSet() {
      return (optBits & OPT_BIT_DATA_EXCLUSIVITY_PERIOD) != 0;
    }

    private boolean holderIsSet() {
      return (optBits & OPT_BIT_HOLDER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean regulatorIsSet() {
      return (optBits & OPT_BIT_REGULATOR) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean validityPeriodIsSet() {
      return (optBits & OPT_BIT_VALIDITY_PERIOD) != 0;
    }

    private boolean internationalBirthDateIsSet() {
      return (optBits & OPT_BIT_INTERNATIONAL_BIRTH_DATE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean jurisdictionalAuthorizationIsSet() {
      return (optBits & OPT_BIT_JURISDICTIONAL_AUTHORIZATION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean legalBasisIsSet() {
      return (optBits & OPT_BIT_LEGAL_BASIS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean countryIsSet() {
      return (optBits & OPT_BIT_COUNTRY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductAuthorization is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductAuthorization, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductAuthorization#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal restoreDate(DateTime restoreDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal restoreDate(Optional<? extends DateTime> restoreDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusDate(DateTime statusDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusDate(Optional<? extends DateTime> statusDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} to dateOfFirstAuthorization.
     * @param dateOfFirstAuthorization The value for dateOfFirstAuthorization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateOfFirstAuthorization(DateTime dateOfFirstAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} to dateOfFirstAuthorization.
     * @param dateOfFirstAuthorization The value for dateOfFirstAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateOfFirstAuthorization(Optional<? extends DateTime> dateOfFirstAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedure(MedicinalProductAuthorization_Procedure procedure);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedure(Optional<? extends MedicinalProductAuthorization_Procedure> procedure);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} to dataExclusivityPeriod.
     * @param dataExclusivityPeriod The value for dataExclusivityPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataExclusivityPeriod(Period dataExclusivityPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} to dataExclusivityPeriod.
     * @param dataExclusivityPeriod The value for dataExclusivityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataExclusivityPeriod(Optional<? extends Period> dataExclusivityPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#holder() holder} to holder.
     * @param holder The value for holder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal holder(Reference holder);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#holder() holder} to holder.
     * @param holder The value for holder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal holder(Optional<? extends Reference> holder);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal regulator(Reference regulator);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal regulator(Optional<? extends Reference> regulator);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validityPeriod(Period validityPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validityPeriod(Optional<? extends Period> validityPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} to internationalBirthDate.
     * @param internationalBirthDate The value for internationalBirthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal internationalBirthDate(DateTime internationalBirthDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} to internationalBirthDate.
     * @param internationalBirthDate The value for internationalBirthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal internationalBirthDate(Optional<? extends DateTime> internationalBirthDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(CodeableConcept status);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends CodeableConcept> status);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} to jurisdictionalAuthorization.
     * @param jurisdictionalAuthorization The value for jurisdictionalAuthorization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdictionalAuthorization(List<MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} to jurisdictionalAuthorization.
     * @param jurisdictionalAuthorization The value for jurisdictionalAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdictionalAuthorization(Optional<? extends List<MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#legalBasis() legalBasis} to legalBasis.
     * @param legalBasis The value for legalBasis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legalBasis(CodeableConcept legalBasis);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#legalBasis() legalBasis} to legalBasis.
     * @param legalBasis The value for legalBasis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legalBasis(Optional<? extends CodeableConcept> legalBasis);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    BuildFinal country(List<CodeableConcept> country);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal country(Optional<? extends List<CodeableConcept>> country);

    /**
     * Builds a new {@link MedicinalProductAuthorization MedicinalProductAuthorization}.
     * @return An immutable instance of MedicinalProductAuthorization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductAuthorization build();
  }
}
