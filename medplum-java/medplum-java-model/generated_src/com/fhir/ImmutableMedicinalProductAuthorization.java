//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProductAuthorization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductAuthorization.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductAuthorization implements com.fhir.MedicinalProductAuthorization {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Period validityPeriod;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> country;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Period dataExclusivityPeriod;
  private final @javax.annotation.Nullable com.fhir.dateTime internationalBirthDate;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.dateTime dateOfFirstAuthorization;
  private final @javax.annotation.Nullable com.fhir.dateTime statusDate;
  private final @javax.annotation.Nullable com.fhir.Reference holder;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept status;
  private final @javax.annotation.Nullable com.fhir.dateTime restoreDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.MedicinalProductAuthorization_Procedure procedure;
  private final @javax.annotation.Nullable com.fhir.Reference regulator;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept legalBasis;

  private ImmutableMedicinalProductAuthorization(
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Period validityPeriod,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> country,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Period dataExclusivityPeriod,
      @javax.annotation.Nullable com.fhir.dateTime internationalBirthDate,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.dateTime dateOfFirstAuthorization,
      @javax.annotation.Nullable com.fhir.dateTime statusDate,
      @javax.annotation.Nullable com.fhir.Reference holder,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.CodeableConcept status,
      @javax.annotation.Nullable com.fhir.dateTime restoreDate,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.MedicinalProductAuthorization_Procedure procedure,
      @javax.annotation.Nullable com.fhir.Reference regulator,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept legalBasis) {
    this.identifier = identifier;
    this.validityPeriod = validityPeriod;
    this.implicitRules = implicitRules;
    this.country = country;
    this.subject = subject;
    this.jurisdiction = jurisdiction;
    this.contained = contained;
    this.dataExclusivityPeriod = dataExclusivityPeriod;
    this.internationalBirthDate = internationalBirthDate;
    this.text = text;
    this.dateOfFirstAuthorization = dateOfFirstAuthorization;
    this.statusDate = statusDate;
    this.holder = holder;
    this.resourceType = resourceType;
    this.status = status;
    this.restoreDate = restoreDate;
    this.jurisdictionalAuthorization = jurisdictionalAuthorization;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.procedure = procedure;
    this.regulator = regulator;
    this.language = language;
    this.meta = meta;
    this.extension = extension;
    this.legalBasis = legalBasis;
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
   * @return The value of the {@code validityPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> validityPeriod() {
    return java.util.Optional.ofNullable(validityPeriod);
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
   * @return The value of the {@code country} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("country")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> country() {
    return java.util.Optional.ofNullable(country);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code dataExclusivityPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dataExclusivityPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> dataExclusivityPeriod() {
    return java.util.Optional.ofNullable(dataExclusivityPeriod);
  }

  /**
   * @return The value of the {@code internationalBirthDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("internationalBirthDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> internationalBirthDate() {
    return java.util.Optional.ofNullable(internationalBirthDate);
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
   * @return The value of the {@code dateOfFirstAuthorization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dateOfFirstAuthorization")
  @Override
  public java.util.Optional<com.fhir.dateTime> dateOfFirstAuthorization() {
    return java.util.Optional.ofNullable(dateOfFirstAuthorization);
  }

  /**
   * @return The value of the {@code statusDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> statusDate() {
    return java.util.Optional.ofNullable(statusDate);
  }

  /**
   * @return The value of the {@code holder} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("holder")
  @Override
  public java.util.Optional<com.fhir.Reference> holder() {
    return java.util.Optional.ofNullable(holder);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code restoreDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("restoreDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> restoreDate() {
    return java.util.Optional.ofNullable(restoreDate);
  }

  /**
   * @return The value of the {@code jurisdictionalAuthorization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdictionalAuthorization")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization() {
    return java.util.Optional.ofNullable(jurisdictionalAuthorization);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code procedure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("procedure")
  @Override
  public java.util.Optional<com.fhir.MedicinalProductAuthorization_Procedure> procedure() {
    return java.util.Optional.ofNullable(procedure);
  }

  /**
   * @return The value of the {@code regulator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("regulator")
  @Override
  public java.util.Optional<com.fhir.Reference> regulator() {
    return java.util.Optional.ofNullable(regulator);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code legalBasis} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("legalBasis")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> legalBasis() {
    return java.util.Optional.ofNullable(legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        newValue,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        value,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} attribute.
   * @param value The value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withValidityPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "validityPeriod");
    if (this.validityPeriod == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        newValue,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withValidityPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.validityPeriod == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        value,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        newValue,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        value,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#country() country} attribute.
   * @param value The value for country
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withCountry(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "country");
    if (this.country == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        newValue,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#country() country} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for country
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withCountry(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.country == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        value,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        newValue,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        value,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        newValue,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        value,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        newValue,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        value,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} attribute.
   * @param value The value for dataExclusivityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withDataExclusivityPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "dataExclusivityPeriod");
    if (this.dataExclusivityPeriod == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        newValue,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataExclusivityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withDataExclusivityPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.dataExclusivityPeriod == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        value,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} attribute.
   * @param value The value for internationalBirthDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withInternationalBirthDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "internationalBirthDate");
    if (this.internationalBirthDate == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        newValue,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for internationalBirthDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withInternationalBirthDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.internationalBirthDate == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        value,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        newValue,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        value,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} attribute.
   * @param value The value for dateOfFirstAuthorization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withDateOfFirstAuthorization(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "dateOfFirstAuthorization");
    if (this.dateOfFirstAuthorization == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        newValue,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateOfFirstAuthorization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withDateOfFirstAuthorization(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.dateOfFirstAuthorization == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        value,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#statusDate() statusDate} attribute.
   * @param value The value for statusDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withStatusDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "statusDate");
    if (this.statusDate == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        newValue,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#statusDate() statusDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withStatusDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.statusDate == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        value,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#holder() holder} attribute.
   * @param value The value for holder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withHolder(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "holder");
    if (this.holder == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        newValue,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#holder() holder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for holder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withHolder(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.holder == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        value,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductAuthorization#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        newValue,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        newValue,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        value,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#restoreDate() restoreDate} attribute.
   * @param value The value for restoreDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withRestoreDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "restoreDate");
    if (this.restoreDate == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        newValue,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#restoreDate() restoreDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for restoreDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withRestoreDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.restoreDate == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        value,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} attribute.
   * @param value The value for jurisdictionalAuthorization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withJurisdictionalAuthorization(java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization> newValue = java.util.Objects.requireNonNull(value, "jurisdictionalAuthorization");
    if (this.jurisdictionalAuthorization == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        newValue,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdictionalAuthorization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withJurisdictionalAuthorization(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization> value = optional.orElse(null);
    if (this.jurisdictionalAuthorization == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        value,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        newValue,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        value,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        newValue,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        value,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#procedure() procedure} attribute.
   * @param value The value for procedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withProcedure(com.fhir.MedicinalProductAuthorization_Procedure value) {
    @javax.annotation.Nullable com.fhir.MedicinalProductAuthorization_Procedure newValue = java.util.Objects.requireNonNull(value, "procedure");
    if (this.procedure == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        newValue,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#procedure() procedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withProcedure(java.util.Optional<? extends com.fhir.MedicinalProductAuthorization_Procedure> optional) {
    @javax.annotation.Nullable com.fhir.MedicinalProductAuthorization_Procedure value = optional.orElse(null);
    if (this.procedure == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        value,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#regulator() regulator} attribute.
   * @param value The value for regulator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withRegulator(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "regulator");
    if (this.regulator == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        newValue,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#regulator() regulator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for regulator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withRegulator(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.regulator == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        value,
        this.language,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        newValue,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        value,
        this.meta,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        newValue,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        value,
        this.extension,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        newValue,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        value,
        this.legalBasis);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization#legalBasis() legalBasis} attribute.
   * @param value The value for legalBasis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization withLegalBasis(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "legalBasis");
    if (this.legalBasis == newValue) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization#legalBasis() legalBasis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalBasis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization withLegalBasis(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.legalBasis == value) return this;
    return new ImmutableMedicinalProductAuthorization(
        this.identifier,
        this.validityPeriod,
        this.implicitRules,
        this.country,
        this.subject,
        this.jurisdiction,
        this.contained,
        this.dataExclusivityPeriod,
        this.internationalBirthDate,
        this.text,
        this.dateOfFirstAuthorization,
        this.statusDate,
        this.holder,
        this.resourceType,
        this.status,
        this.restoreDate,
        this.jurisdictionalAuthorization,
        this.id,
        this.modifierExtension,
        this.procedure,
        this.regulator,
        this.language,
        this.meta,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductAuthorization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductAuthorization
        && equalTo((ImmutableMedicinalProductAuthorization) another);
  }

  private boolean equalTo(ImmutableMedicinalProductAuthorization another) {
    return java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(validityPeriod, another.validityPeriod)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(country, another.country)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(dataExclusivityPeriod, another.dataExclusivityPeriod)
        && java.util.Objects.equals(internationalBirthDate, another.internationalBirthDate)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(dateOfFirstAuthorization, another.dateOfFirstAuthorization)
        && java.util.Objects.equals(statusDate, another.statusDate)
        && java.util.Objects.equals(holder, another.holder)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(restoreDate, another.restoreDate)
        && java.util.Objects.equals(jurisdictionalAuthorization, another.jurisdictionalAuthorization)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(procedure, another.procedure)
        && java.util.Objects.equals(regulator, another.regulator)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(legalBasis, another.legalBasis);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code validityPeriod}, {@code implicitRules}, {@code country}, {@code subject}, {@code jurisdiction}, {@code contained}, {@code dataExclusivityPeriod}, {@code internationalBirthDate}, {@code text}, {@code dateOfFirstAuthorization}, {@code statusDate}, {@code holder}, {@code resourceType}, {@code status}, {@code restoreDate}, {@code jurisdictionalAuthorization}, {@code id}, {@code modifierExtension}, {@code procedure}, {@code regulator}, {@code language}, {@code meta}, {@code extension}, {@code legalBasis}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(validityPeriod);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(country);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(dataExclusivityPeriod);
    h += (h << 5) + java.util.Objects.hashCode(internationalBirthDate);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(dateOfFirstAuthorization);
    h += (h << 5) + java.util.Objects.hashCode(statusDate);
    h += (h << 5) + java.util.Objects.hashCode(holder);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(restoreDate);
    h += (h << 5) + java.util.Objects.hashCode(jurisdictionalAuthorization);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(procedure);
    h += (h << 5) + java.util.Objects.hashCode(regulator);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(legalBasis);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductAuthorization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProductAuthorization{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (validityPeriod != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("validityPeriod=").append(validityPeriod);
    }
    if (implicitRules != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (country != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("country=").append(country);
    }
    if (subject != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (jurisdiction != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (contained != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (dataExclusivityPeriod != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("dataExclusivityPeriod=").append(dataExclusivityPeriod);
    }
    if (internationalBirthDate != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("internationalBirthDate=").append(internationalBirthDate);
    }
    if (text != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (dateOfFirstAuthorization != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("dateOfFirstAuthorization=").append(dateOfFirstAuthorization);
    }
    if (statusDate != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("statusDate=").append(statusDate);
    }
    if (holder != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("holder=").append(holder);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (restoreDate != null) {
      builder.append(", ");
      builder.append("restoreDate=").append(restoreDate);
    }
    if (jurisdictionalAuthorization != null) {
      builder.append(", ");
      builder.append("jurisdictionalAuthorization=").append(jurisdictionalAuthorization);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (procedure != null) {
      builder.append(", ");
      builder.append("procedure=").append(procedure);
    }
    if (regulator != null) {
      builder.append(", ");
      builder.append("regulator=").append(regulator);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (legalBasis != null) {
      builder.append(", ");
      builder.append("legalBasis=").append(legalBasis);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProductAuthorization {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> validityPeriod = java.util.Optional.empty();
    boolean validityPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> country = java.util.Optional.empty();
    boolean countryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> dataExclusivityPeriod = java.util.Optional.empty();
    boolean dataExclusivityPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> internationalBirthDate = java.util.Optional.empty();
    boolean internationalBirthDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> dateOfFirstAuthorization = java.util.Optional.empty();
    boolean dateOfFirstAuthorizationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> statusDate = java.util.Optional.empty();
    boolean statusDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> holder = java.util.Optional.empty();
    boolean holderIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> restoreDate = java.util.Optional.empty();
    boolean restoreDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization = java.util.Optional.empty();
    boolean jurisdictionalAuthorizationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MedicinalProductAuthorization_Procedure> procedure = java.util.Optional.empty();
    boolean procedureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> regulator = java.util.Optional.empty();
    boolean regulatorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> legalBasis = java.util.Optional.empty();
    boolean legalBasisIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
    public void setValidityPeriod(java.util.Optional<com.fhir.Period> validityPeriod) {
      this.validityPeriod = validityPeriod;
      this.validityPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    public void setCountry(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> country) {
      this.country = country;
      this.countryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dataExclusivityPeriod")
    public void setDataExclusivityPeriod(java.util.Optional<com.fhir.Period> dataExclusivityPeriod) {
      this.dataExclusivityPeriod = dataExclusivityPeriod;
      this.dataExclusivityPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("internationalBirthDate")
    public void setInternationalBirthDate(java.util.Optional<com.fhir.dateTime> internationalBirthDate) {
      this.internationalBirthDate = internationalBirthDate;
      this.internationalBirthDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dateOfFirstAuthorization")
    public void setDateOfFirstAuthorization(java.util.Optional<com.fhir.dateTime> dateOfFirstAuthorization) {
      this.dateOfFirstAuthorization = dateOfFirstAuthorization;
      this.dateOfFirstAuthorizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
    public void setStatusDate(java.util.Optional<com.fhir.dateTime> statusDate) {
      this.statusDate = statusDate;
      this.statusDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("holder")
    public void setHolder(java.util.Optional<com.fhir.Reference> holder) {
      this.holder = holder;
      this.holderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("restoreDate")
    public void setRestoreDate(java.util.Optional<com.fhir.dateTime> restoreDate) {
      this.restoreDate = restoreDate;
      this.restoreDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdictionalAuthorization")
    public void setJurisdictionalAuthorization(java.util.Optional<java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization) {
      this.jurisdictionalAuthorization = jurisdictionalAuthorization;
      this.jurisdictionalAuthorizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("procedure")
    public void setProcedure(java.util.Optional<com.fhir.MedicinalProductAuthorization_Procedure> procedure) {
      this.procedure = procedure;
      this.procedureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("regulator")
    public void setRegulator(java.util.Optional<com.fhir.Reference> regulator) {
      this.regulator = regulator;
      this.regulatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("legalBasis")
    public void setLegalBasis(java.util.Optional<com.fhir.CodeableConcept> legalBasis) {
      this.legalBasis = legalBasis;
      this.legalBasisIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> validityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> country() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> dataExclusivityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> internationalBirthDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> dateOfFirstAuthorization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> statusDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> holder() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> restoreDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MedicinalProductAuthorization_Procedure> procedure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> regulator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> legalBasis() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductAuthorization fromJson(Json json) {
    ImmutableMedicinalProductAuthorization.Builder builder = ((ImmutableMedicinalProductAuthorization.Builder) ImmutableMedicinalProductAuthorization.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.validityPeriodIsSet) {
      builder.validityPeriod(json.validityPeriod);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.countryIsSet) {
      builder.country(json.country);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.dataExclusivityPeriodIsSet) {
      builder.dataExclusivityPeriod(json.dataExclusivityPeriod);
    }
    if (json.internationalBirthDateIsSet) {
      builder.internationalBirthDate(json.internationalBirthDate);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.dateOfFirstAuthorizationIsSet) {
      builder.dateOfFirstAuthorization(json.dateOfFirstAuthorization);
    }
    if (json.statusDateIsSet) {
      builder.statusDate(json.statusDate);
    }
    if (json.holderIsSet) {
      builder.holder(json.holder);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.restoreDateIsSet) {
      builder.restoreDate(json.restoreDate);
    }
    if (json.jurisdictionalAuthorizationIsSet) {
      builder.jurisdictionalAuthorization(json.jurisdictionalAuthorization);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.procedureIsSet) {
      builder.procedure(json.procedure);
    }
    if (json.regulatorIsSet) {
      builder.regulator(json.regulator);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.legalBasisIsSet) {
      builder.legalBasis(json.legalBasis);
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
        .identifier(instance.identifier())
        .validityPeriod(instance.validityPeriod())
        .implicitRules(instance.implicitRules())
        .country(instance.country())
        .subject(instance.subject())
        .jurisdiction(instance.jurisdiction())
        .contained(instance.contained())
        .dataExclusivityPeriod(instance.dataExclusivityPeriod())
        .internationalBirthDate(instance.internationalBirthDate())
        .text(instance.text())
        .dateOfFirstAuthorization(instance.dateOfFirstAuthorization())
        .statusDate(instance.statusDate())
        .holder(instance.holder())
        .resourceType(instance.resourceType())
        .status(instance.status())
        .restoreDate(instance.restoreDate())
        .jurisdictionalAuthorization(instance.jurisdictionalAuthorization())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .procedure(instance.procedure())
        .regulator(instance.regulator())
        .language(instance.language())
        .meta(instance.meta())
        .extension(instance.extension())
        .legalBasis(instance.legalBasis())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductAuthorization MedicinalProductAuthorization}.
   * <pre>
   * ImmutableMedicinalProductAuthorization.builder()
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicinalProductAuthorization#identifier() identifier}
   *    .validityPeriod(com.fhir.Period) // optional {@link MedicinalProductAuthorization#validityPeriod() validityPeriod}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProductAuthorization#implicitRules() implicitRules}
   *    .country(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductAuthorization#country() country}
   *    .subject(com.fhir.Reference) // optional {@link MedicinalProductAuthorization#subject() subject}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductAuthorization#jurisdiction() jurisdiction}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductAuthorization#contained() contained}
   *    .dataExclusivityPeriod(com.fhir.Period) // optional {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod}
   *    .internationalBirthDate(com.fhir.dateTime) // optional {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProductAuthorization#text() text}
   *    .dateOfFirstAuthorization(com.fhir.dateTime) // optional {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization}
   *    .statusDate(com.fhir.dateTime) // optional {@link MedicinalProductAuthorization#statusDate() statusDate}
   *    .holder(com.fhir.Reference) // optional {@link MedicinalProductAuthorization#holder() holder}
   *    .resourceType(String) // required {@link MedicinalProductAuthorization#resourceType() resourceType}
   *    .status(com.fhir.CodeableConcept) // optional {@link MedicinalProductAuthorization#status() status}
   *    .restoreDate(com.fhir.dateTime) // optional {@link MedicinalProductAuthorization#restoreDate() restoreDate}
   *    .jurisdictionalAuthorization(List&amp;lt;com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization&amp;gt;) // optional {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization}
   *    .id(com.fhir.id) // optional {@link MedicinalProductAuthorization#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductAuthorization#modifierExtension() modifierExtension}
   *    .procedure(com.fhir.MedicinalProductAuthorization_Procedure) // optional {@link MedicinalProductAuthorization#procedure() procedure}
   *    .regulator(com.fhir.Reference) // optional {@link MedicinalProductAuthorization#regulator() regulator}
   *    .language(com.fhir.code) // optional {@link MedicinalProductAuthorization#language() language}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProductAuthorization#meta() meta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductAuthorization#extension() extension}
   *    .legalBasis(com.fhir.CodeableConcept) // optional {@link MedicinalProductAuthorization#legalBasis() legalBasis}
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
  @org.immutables.value.Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_VALIDITY_PERIOD = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_COUNTRY = 0x8L;
    private static final long OPT_BIT_SUBJECT = 0x10L;
    private static final long OPT_BIT_JURISDICTION = 0x20L;
    private static final long OPT_BIT_CONTAINED = 0x40L;
    private static final long OPT_BIT_DATA_EXCLUSIVITY_PERIOD = 0x80L;
    private static final long OPT_BIT_INTERNATIONAL_BIRTH_DATE = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_DATE_OF_FIRST_AUTHORIZATION = 0x400L;
    private static final long OPT_BIT_STATUS_DATE = 0x800L;
    private static final long OPT_BIT_HOLDER = 0x1000L;
    private static final long OPT_BIT_STATUS = 0x2000L;
    private static final long OPT_BIT_RESTORE_DATE = 0x4000L;
    private static final long OPT_BIT_JURISDICTIONAL_AUTHORIZATION = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000L;
    private static final long OPT_BIT_PROCEDURE = 0x40000L;
    private static final long OPT_BIT_REGULATOR = 0x80000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000L;
    private static final long OPT_BIT_META = 0x200000L;
    private static final long OPT_BIT_EXTENSION = 0x400000L;
    private static final long OPT_BIT_LEGAL_BASIS = 0x800000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Period validityPeriod;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> country;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Period dataExclusivityPeriod;
    private @javax.annotation.Nullable com.fhir.dateTime internationalBirthDate;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.dateTime dateOfFirstAuthorization;
    private @javax.annotation.Nullable com.fhir.dateTime statusDate;
    private @javax.annotation.Nullable com.fhir.Reference holder;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.CodeableConcept status;
    private @javax.annotation.Nullable com.fhir.dateTime restoreDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.MedicinalProductAuthorization_Procedure procedure;
    private @javax.annotation.Nullable com.fhir.Reference regulator;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept legalBasis;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder validityPeriod(com.fhir.Period validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = java.util.Objects.requireNonNull(validityPeriod, "validityPeriod");
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validityPeriod")
    public final Builder validityPeriod(java.util.Optional<? extends com.fhir.Period> validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = validityPeriod.orElse(null);
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    public final Builder country(java.util.List<com.fhir.CodeableConcept> country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = java.util.Objects.requireNonNull(country, "country");
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    public final Builder country(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = country.orElse(null);
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = java.util.Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public final Builder jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} to dataExclusivityPeriod.
     * @param dataExclusivityPeriod The value for dataExclusivityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataExclusivityPeriod(com.fhir.Period dataExclusivityPeriod) {
      checkNotIsSet(dataExclusivityPeriodIsSet(), "dataExclusivityPeriod");
      this.dataExclusivityPeriod = java.util.Objects.requireNonNull(dataExclusivityPeriod, "dataExclusivityPeriod");
      optBits |= OPT_BIT_DATA_EXCLUSIVITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} to dataExclusivityPeriod.
     * @param dataExclusivityPeriod The value for dataExclusivityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataExclusivityPeriod")
    public final Builder dataExclusivityPeriod(java.util.Optional<? extends com.fhir.Period> dataExclusivityPeriod) {
      checkNotIsSet(dataExclusivityPeriodIsSet(), "dataExclusivityPeriod");
      this.dataExclusivityPeriod = dataExclusivityPeriod.orElse(null);
      optBits |= OPT_BIT_DATA_EXCLUSIVITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} to internationalBirthDate.
     * @param internationalBirthDate The value for internationalBirthDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder internationalBirthDate(com.fhir.dateTime internationalBirthDate) {
      checkNotIsSet(internationalBirthDateIsSet(), "internationalBirthDate");
      this.internationalBirthDate = java.util.Objects.requireNonNull(internationalBirthDate, "internationalBirthDate");
      optBits |= OPT_BIT_INTERNATIONAL_BIRTH_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} to internationalBirthDate.
     * @param internationalBirthDate The value for internationalBirthDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("internationalBirthDate")
    public final Builder internationalBirthDate(java.util.Optional<? extends com.fhir.dateTime> internationalBirthDate) {
      checkNotIsSet(internationalBirthDateIsSet(), "internationalBirthDate");
      this.internationalBirthDate = internationalBirthDate.orElse(null);
      optBits |= OPT_BIT_INTERNATIONAL_BIRTH_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} to dateOfFirstAuthorization.
     * @param dateOfFirstAuthorization The value for dateOfFirstAuthorization
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateOfFirstAuthorization(com.fhir.dateTime dateOfFirstAuthorization) {
      checkNotIsSet(dateOfFirstAuthorizationIsSet(), "dateOfFirstAuthorization");
      this.dateOfFirstAuthorization = java.util.Objects.requireNonNull(dateOfFirstAuthorization, "dateOfFirstAuthorization");
      optBits |= OPT_BIT_DATE_OF_FIRST_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} to dateOfFirstAuthorization.
     * @param dateOfFirstAuthorization The value for dateOfFirstAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateOfFirstAuthorization")
    public final Builder dateOfFirstAuthorization(java.util.Optional<? extends com.fhir.dateTime> dateOfFirstAuthorization) {
      checkNotIsSet(dateOfFirstAuthorizationIsSet(), "dateOfFirstAuthorization");
      this.dateOfFirstAuthorization = dateOfFirstAuthorization.orElse(null);
      optBits |= OPT_BIT_DATE_OF_FIRST_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusDate(com.fhir.dateTime statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = java.util.Objects.requireNonNull(statusDate, "statusDate");
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
    public final Builder statusDate(java.util.Optional<? extends com.fhir.dateTime> statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = statusDate.orElse(null);
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#holder() holder} to holder.
     * @param holder The value for holder
     * @return {@code this} builder for chained invocation
     */
    public final Builder holder(com.fhir.Reference holder) {
      checkNotIsSet(holderIsSet(), "holder");
      this.holder = java.util.Objects.requireNonNull(holder, "holder");
      optBits |= OPT_BIT_HOLDER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#holder() holder} to holder.
     * @param holder The value for holder
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("holder")
    public final Builder holder(java.util.Optional<? extends com.fhir.Reference> holder) {
      checkNotIsSet(holderIsSet(), "holder");
      this.holder = holder.orElse(null);
      optBits |= OPT_BIT_HOLDER;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductAuthorization#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder restoreDate(com.fhir.dateTime restoreDate) {
      checkNotIsSet(restoreDateIsSet(), "restoreDate");
      this.restoreDate = java.util.Objects.requireNonNull(restoreDate, "restoreDate");
      optBits |= OPT_BIT_RESTORE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restoreDate")
    public final Builder restoreDate(java.util.Optional<? extends com.fhir.dateTime> restoreDate) {
      checkNotIsSet(restoreDateIsSet(), "restoreDate");
      this.restoreDate = restoreDate.orElse(null);
      optBits |= OPT_BIT_RESTORE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} to jurisdictionalAuthorization.
     * @param jurisdictionalAuthorization The value for jurisdictionalAuthorization
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdictionalAuthorization(java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization) {
      checkNotIsSet(jurisdictionalAuthorizationIsSet(), "jurisdictionalAuthorization");
      this.jurisdictionalAuthorization = java.util.Objects.requireNonNull(jurisdictionalAuthorization, "jurisdictionalAuthorization");
      optBits |= OPT_BIT_JURISDICTIONAL_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} to jurisdictionalAuthorization.
     * @param jurisdictionalAuthorization The value for jurisdictionalAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdictionalAuthorization")
    public final Builder jurisdictionalAuthorization(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization) {
      checkNotIsSet(jurisdictionalAuthorizationIsSet(), "jurisdictionalAuthorization");
      this.jurisdictionalAuthorization = jurisdictionalAuthorization.orElse(null);
      optBits |= OPT_BIT_JURISDICTIONAL_AUTHORIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedure(com.fhir.MedicinalProductAuthorization_Procedure procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = java.util.Objects.requireNonNull(procedure, "procedure");
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procedure")
    public final Builder procedure(java.util.Optional<? extends com.fhir.MedicinalProductAuthorization_Procedure> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = procedure.orElse(null);
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for chained invocation
     */
    public final Builder regulator(com.fhir.Reference regulator) {
      checkNotIsSet(regulatorIsSet(), "regulator");
      this.regulator = java.util.Objects.requireNonNull(regulator, "regulator");
      optBits |= OPT_BIT_REGULATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regulator")
    public final Builder regulator(java.util.Optional<? extends com.fhir.Reference> regulator) {
      checkNotIsSet(regulatorIsSet(), "regulator");
      this.regulator = regulator.orElse(null);
      optBits |= OPT_BIT_REGULATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization#legalBasis() legalBasis} to legalBasis.
     * @param legalBasis The value for legalBasis
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalBasis(com.fhir.CodeableConcept legalBasis) {
      checkNotIsSet(legalBasisIsSet(), "legalBasis");
      this.legalBasis = java.util.Objects.requireNonNull(legalBasis, "legalBasis");
      optBits |= OPT_BIT_LEGAL_BASIS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#legalBasis() legalBasis} to legalBasis.
     * @param legalBasis The value for legalBasis
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("legalBasis")
    public final Builder legalBasis(java.util.Optional<? extends com.fhir.CodeableConcept> legalBasis) {
      checkNotIsSet(legalBasisIsSet(), "legalBasis");
      this.legalBasis = legalBasis.orElse(null);
      optBits |= OPT_BIT_LEGAL_BASIS;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductAuthorization MedicinalProductAuthorization}.
     * @return An immutable instance of MedicinalProductAuthorization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProductAuthorization build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductAuthorization(
          identifier,
          validityPeriod,
          implicitRules,
          country,
          subject,
          jurisdiction,
          contained,
          dataExclusivityPeriod,
          internationalBirthDate,
          text,
          dateOfFirstAuthorization,
          statusDate,
          holder,
          resourceType,
          status,
          restoreDate,
          jurisdictionalAuthorization,
          id,
          modifierExtension,
          procedure,
          regulator,
          language,
          meta,
          extension,
          legalBasis);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean validityPeriodIsSet() {
      return (optBits & OPT_BIT_VALIDITY_PERIOD) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean countryIsSet() {
      return (optBits & OPT_BIT_COUNTRY) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean dataExclusivityPeriodIsSet() {
      return (optBits & OPT_BIT_DATA_EXCLUSIVITY_PERIOD) != 0;
    }

    private boolean internationalBirthDateIsSet() {
      return (optBits & OPT_BIT_INTERNATIONAL_BIRTH_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean dateOfFirstAuthorizationIsSet() {
      return (optBits & OPT_BIT_DATE_OF_FIRST_AUTHORIZATION) != 0;
    }

    private boolean statusDateIsSet() {
      return (optBits & OPT_BIT_STATUS_DATE) != 0;
    }

    private boolean holderIsSet() {
      return (optBits & OPT_BIT_HOLDER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean restoreDateIsSet() {
      return (optBits & OPT_BIT_RESTORE_DATE) != 0;
    }

    private boolean jurisdictionalAuthorizationIsSet() {
      return (optBits & OPT_BIT_JURISDICTIONAL_AUTHORIZATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean procedureIsSet() {
      return (optBits & OPT_BIT_PROCEDURE) != 0;
    }

    private boolean regulatorIsSet() {
      return (optBits & OPT_BIT_REGULATOR) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean legalBasisIsSet() {
      return (optBits & OPT_BIT_LEGAL_BASIS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProductAuthorization is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductAuthorization, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductAuthorization#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProductAuthorization", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validityPeriod(com.fhir.Period validityPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validityPeriod(java.util.Optional<? extends com.fhir.Period> validityPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    BuildFinal country(java.util.List<com.fhir.CodeableConcept> country);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal country(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> country);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} to dataExclusivityPeriod.
     * @param dataExclusivityPeriod The value for dataExclusivityPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataExclusivityPeriod(com.fhir.Period dataExclusivityPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dataExclusivityPeriod() dataExclusivityPeriod} to dataExclusivityPeriod.
     * @param dataExclusivityPeriod The value for dataExclusivityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataExclusivityPeriod(java.util.Optional<? extends com.fhir.Period> dataExclusivityPeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} to internationalBirthDate.
     * @param internationalBirthDate The value for internationalBirthDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal internationalBirthDate(com.fhir.dateTime internationalBirthDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#internationalBirthDate() internationalBirthDate} to internationalBirthDate.
     * @param internationalBirthDate The value for internationalBirthDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal internationalBirthDate(java.util.Optional<? extends com.fhir.dateTime> internationalBirthDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} to dateOfFirstAuthorization.
     * @param dateOfFirstAuthorization The value for dateOfFirstAuthorization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateOfFirstAuthorization(com.fhir.dateTime dateOfFirstAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#dateOfFirstAuthorization() dateOfFirstAuthorization} to dateOfFirstAuthorization.
     * @param dateOfFirstAuthorization The value for dateOfFirstAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateOfFirstAuthorization(java.util.Optional<? extends com.fhir.dateTime> dateOfFirstAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusDate(com.fhir.dateTime statusDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusDate(java.util.Optional<? extends com.fhir.dateTime> statusDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#holder() holder} to holder.
     * @param holder The value for holder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal holder(com.fhir.Reference holder);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#holder() holder} to holder.
     * @param holder The value for holder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal holder(java.util.Optional<? extends com.fhir.Reference> holder);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.CodeableConcept status);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.CodeableConcept> status);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal restoreDate(com.fhir.dateTime restoreDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#restoreDate() restoreDate} to restoreDate.
     * @param restoreDate The value for restoreDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal restoreDate(java.util.Optional<? extends com.fhir.dateTime> restoreDate);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} to jurisdictionalAuthorization.
     * @param jurisdictionalAuthorization The value for jurisdictionalAuthorization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdictionalAuthorization(java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization> jurisdictionalAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#jurisdictionalAuthorization() jurisdictionalAuthorization} to jurisdictionalAuthorization.
     * @param jurisdictionalAuthorization The value for jurisdictionalAuthorization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdictionalAuthorization(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProductAuthorization_JurisdictionalAuthorization>> jurisdictionalAuthorization);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal procedure(com.fhir.MedicinalProductAuthorization_Procedure procedure);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal procedure(java.util.Optional<? extends com.fhir.MedicinalProductAuthorization_Procedure> procedure);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal regulator(com.fhir.Reference regulator);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal regulator(java.util.Optional<? extends com.fhir.Reference> regulator);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#legalBasis() legalBasis} to legalBasis.
     * @param legalBasis The value for legalBasis
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legalBasis(com.fhir.CodeableConcept legalBasis);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization#legalBasis() legalBasis} to legalBasis.
     * @param legalBasis The value for legalBasis
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legalBasis(java.util.Optional<? extends com.fhir.CodeableConcept> legalBasis);

    /**
     * Builds a new {@link MedicinalProductAuthorization MedicinalProductAuthorization}.
     * @return An immutable instance of MedicinalProductAuthorization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductAuthorization build();
  }
}
