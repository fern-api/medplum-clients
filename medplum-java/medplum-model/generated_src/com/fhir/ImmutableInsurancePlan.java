//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link InsurancePlan}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan.builder()}.
 */
@org.immutables.value.Generated(from = "InsurancePlan", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan implements com.fhir.InsurancePlan {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.Reference administeredBy;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> coverageArea;
  private final @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Coverage> coverage;
  private final @javax.annotation.Nullable com.fhir.Reference ownedBy;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> network;
  private final @javax.annotation.Nullable com.fhir.InsuranceplanStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Plan> plan;
  private final @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Contact> contact;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> alias;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;

  private ImmutableInsurancePlan(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.Reference administeredBy,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> coverageArea,
      @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Coverage> coverage,
      @javax.annotation.Nullable com.fhir.Reference ownedBy,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> network,
      @javax.annotation.Nullable com.fhir.InsuranceplanStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Plan> plan,
      @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Contact> contact,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<java.lang.String> alias,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type) {
    this.language = language;
    this.text = text;
    this.identifier = identifier;
    this.period = period;
    this.administeredBy = administeredBy;
    this.resourceType = resourceType;
    this.coverageArea = coverageArea;
    this.coverage = coverage;
    this.ownedBy = ownedBy;
    this.network = network;
    this.status = status;
    this.modifierExtension = modifierExtension;
    this.plan = plan;
    this.contact = contact;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.alias = alias;
    this.endpoint = endpoint;
    this.contained = contained;
    this.name = name;
    this.id = id;
    this.type = type;
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code administeredBy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("administeredBy")
  @Override
  public java.util.Optional<com.fhir.Reference> administeredBy() {
    return java.util.Optional.ofNullable(administeredBy);
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
   * @return The value of the {@code coverageArea} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("coverageArea")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> coverageArea() {
    return java.util.Optional.ofNullable(coverageArea);
  }

  /**
   * @return The value of the {@code coverage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("coverage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.InsurancePlan_Coverage>> coverage() {
    return java.util.Optional.ofNullable(coverage);
  }

  /**
   * @return The value of the {@code ownedBy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("ownedBy")
  @Override
  public java.util.Optional<com.fhir.Reference> ownedBy() {
    return java.util.Optional.ofNullable(ownedBy);
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("network")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> network() {
    return java.util.Optional.ofNullable(network);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.InsuranceplanStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code plan} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("plan")
  @Override
  public java.util.Optional<java.util.List<com.fhir.InsurancePlan_Plan>> plan() {
    return java.util.Optional.ofNullable(plan);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.InsurancePlan_Contact>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code alias} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("alias")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> alias() {
    return java.util.Optional.ofNullable(alias);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() {
    return java.util.Optional.ofNullable(endpoint);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableInsurancePlan(
        newValue,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableInsurancePlan(
        value,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        newValue,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        value,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        newValue,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        value,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        newValue,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        value,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#administeredBy() administeredBy} attribute.
   * @param value The value for administeredBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withAdministeredBy(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "administeredBy");
    if (this.administeredBy == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        newValue,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#administeredBy() administeredBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for administeredBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withAdministeredBy(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.administeredBy == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        value,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InsurancePlan#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInsurancePlan withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        newValue,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#coverageArea() coverageArea} attribute.
   * @param value The value for coverageArea
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withCoverageArea(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "coverageArea");
    if (this.coverageArea == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        newValue,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#coverageArea() coverageArea} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverageArea
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withCoverageArea(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.coverageArea == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        value,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#coverage() coverage} attribute.
   * @param value The value for coverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withCoverage(java.util.List<com.fhir.InsurancePlan_Coverage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Coverage> newValue = java.util.Objects.requireNonNull(value, "coverage");
    if (this.coverage == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        newValue,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#coverage() coverage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withCoverage(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Coverage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Coverage> value = optional.orElse(null);
    if (this.coverage == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        value,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#ownedBy() ownedBy} attribute.
   * @param value The value for ownedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withOwnedBy(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "ownedBy");
    if (this.ownedBy == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        newValue,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#ownedBy() ownedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ownedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withOwnedBy(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.ownedBy == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        value,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withNetwork(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        newValue,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withNetwork(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        value,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withStatus(com.fhir.InsuranceplanStatus value) {
    @javax.annotation.Nullable com.fhir.InsuranceplanStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        newValue,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withStatus(java.util.Optional<? extends com.fhir.InsuranceplanStatus> optional) {
    @javax.annotation.Nullable com.fhir.InsuranceplanStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        value,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        newValue,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        value,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#plan() plan} attribute.
   * @param value The value for plan
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withPlan(java.util.List<com.fhir.InsurancePlan_Plan> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Plan> newValue = java.util.Objects.requireNonNull(value, "plan");
    if (this.plan == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        newValue,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#plan() plan} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for plan
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withPlan(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Plan>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Plan> value = optional.orElse(null);
    if (this.plan == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        value,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withContact(java.util.List<com.fhir.InsurancePlan_Contact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Contact> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        newValue,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withContact(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Contact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Contact> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        value,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        newValue,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        value,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        newValue,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        value,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        newValue,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        value,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withAlias(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "alias");
    if (this.alias == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        newValue,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#alias() alias} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withAlias(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.alias == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        value,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withEndpoint(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        newValue,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withEndpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        value,
        this.contained,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        newValue,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        value,
        this.name,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        newValue,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        value,
        this.id,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableInsurancePlan(
        this.language,
        this.text,
        this.identifier,
        this.period,
        this.administeredBy,
        this.resourceType,
        this.coverageArea,
        this.coverage,
        this.ownedBy,
        this.network,
        this.status,
        this.modifierExtension,
        this.plan,
        this.contact,
        this.meta,
        this.implicitRules,
        this.extension,
        this.alias,
        this.endpoint,
        this.contained,
        this.name,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan
        && equalTo((ImmutableInsurancePlan) another);
  }

  private boolean equalTo(ImmutableInsurancePlan another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(administeredBy, another.administeredBy)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(coverageArea, another.coverageArea)
        && java.util.Objects.equals(coverage, another.coverage)
        && java.util.Objects.equals(ownedBy, another.ownedBy)
        && java.util.Objects.equals(network, another.network)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(plan, another.plan)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(alias, another.alias)
        && java.util.Objects.equals(endpoint, another.endpoint)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code text}, {@code identifier}, {@code period}, {@code administeredBy}, {@code resourceType}, {@code coverageArea}, {@code coverage}, {@code ownedBy}, {@code network}, {@code status}, {@code modifierExtension}, {@code plan}, {@code contact}, {@code meta}, {@code implicitRules}, {@code extension}, {@code alias}, {@code endpoint}, {@code contained}, {@code name}, {@code id}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(administeredBy);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(coverageArea);
    h += (h << 5) + java.util.Objects.hashCode(coverage);
    h += (h << 5) + java.util.Objects.hashCode(ownedBy);
    h += (h << 5) + java.util.Objects.hashCode(network);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(plan);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(alias);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("InsurancePlan{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (identifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (period != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (administeredBy != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("administeredBy=").append(administeredBy);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (coverageArea != null) {
      builder.append(", ");
      builder.append("coverageArea=").append(coverageArea);
    }
    if (coverage != null) {
      builder.append(", ");
      builder.append("coverage=").append(coverage);
    }
    if (ownedBy != null) {
      builder.append(", ");
      builder.append("ownedBy=").append(ownedBy);
    }
    if (network != null) {
      builder.append(", ");
      builder.append("network=").append(network);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (plan != null) {
      builder.append(", ");
      builder.append("plan=").append(plan);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (alias != null) {
      builder.append(", ");
      builder.append("alias=").append(alias);
    }
    if (endpoint != null) {
      builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "InsurancePlan", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.InsurancePlan {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> administeredBy = java.util.Optional.empty();
    boolean administeredByIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> coverageArea = java.util.Optional.empty();
    boolean coverageAreaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.InsurancePlan_Coverage>> coverage = java.util.Optional.empty();
    boolean coverageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> ownedBy = java.util.Optional.empty();
    boolean ownedByIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> network = java.util.Optional.empty();
    boolean networkIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.InsuranceplanStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.InsurancePlan_Plan>> plan = java.util.Optional.empty();
    boolean planIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.InsurancePlan_Contact>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> alias = java.util.Optional.empty();
    boolean aliasIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("administeredBy")
    public void setAdministeredBy(java.util.Optional<com.fhir.Reference> administeredBy) {
      this.administeredBy = administeredBy;
      this.administeredByIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("coverageArea")
    public void setCoverageArea(java.util.Optional<java.util.List<com.fhir.Reference>> coverageArea) {
      this.coverageArea = coverageArea;
      this.coverageAreaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("coverage")
    public void setCoverage(java.util.Optional<java.util.List<com.fhir.InsurancePlan_Coverage>> coverage) {
      this.coverage = coverage;
      this.coverageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("ownedBy")
    public void setOwnedBy(java.util.Optional<com.fhir.Reference> ownedBy) {
      this.ownedBy = ownedBy;
      this.ownedByIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    public void setNetwork(java.util.Optional<java.util.List<com.fhir.Reference>> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.InsuranceplanStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("plan")
    public void setPlan(java.util.Optional<java.util.List<com.fhir.InsurancePlan_Plan>> plan) {
      this.plan = plan;
      this.planIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.InsurancePlan_Contact>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public void setAlias(java.util.Optional<java.util.List<java.lang.String>> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<java.util.List<com.fhir.Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> administeredBy() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> coverageArea() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.InsurancePlan_Coverage>> coverage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> ownedBy() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> network() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.InsuranceplanStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.InsurancePlan_Plan>> plan() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.InsurancePlan_Contact>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> alias() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableInsurancePlan fromJson(Json json) {
    ImmutableInsurancePlan.Builder builder = ((ImmutableInsurancePlan.Builder) ImmutableInsurancePlan.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.administeredByIsSet) {
      builder.administeredBy(json.administeredBy);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.coverageAreaIsSet) {
      builder.coverageArea(json.coverageArea);
    }
    if (json.coverageIsSet) {
      builder.coverage(json.coverage);
    }
    if (json.ownedByIsSet) {
      builder.ownedBy(json.ownedBy);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.planIsSet) {
      builder.plan(json.plan);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableInsurancePlan) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan instance
   */
  public static InsurancePlan copyOf(InsurancePlan instance) {
    if (instance instanceof ImmutableInsurancePlan) {
      return (ImmutableInsurancePlan) instance;
    }
    return ((ImmutableInsurancePlan.Builder) ImmutableInsurancePlan.builder())
        .language(instance.language())
        .text(instance.text())
        .identifier(instance.identifier())
        .period(instance.period())
        .administeredBy(instance.administeredBy())
        .resourceType(instance.resourceType())
        .coverageArea(instance.coverageArea())
        .coverage(instance.coverage())
        .ownedBy(instance.ownedBy())
        .network(instance.network())
        .status(instance.status())
        .modifierExtension(instance.modifierExtension())
        .plan(instance.plan())
        .contact(instance.contact())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .alias(instance.alias())
        .endpoint(instance.endpoint())
        .contained(instance.contained())
        .name(instance.name())
        .id(instance.id())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan InsurancePlan}.
   * <pre>
   * ImmutableInsurancePlan.builder()
   *    .language(com.fhir.code) // optional {@link InsurancePlan#language() language}
   *    .text(com.fhir.Narrative) // optional {@link InsurancePlan#text() text}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link InsurancePlan#identifier() identifier}
   *    .period(com.fhir.Period) // optional {@link InsurancePlan#period() period}
   *    .administeredBy(com.fhir.Reference) // optional {@link InsurancePlan#administeredBy() administeredBy}
   *    .resourceType(String) // required {@link InsurancePlan#resourceType() resourceType}
   *    .coverageArea(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link InsurancePlan#coverageArea() coverageArea}
   *    .coverage(List&amp;lt;com.fhir.InsurancePlan_Coverage&amp;gt;) // optional {@link InsurancePlan#coverage() coverage}
   *    .ownedBy(com.fhir.Reference) // optional {@link InsurancePlan#ownedBy() ownedBy}
   *    .network(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link InsurancePlan#network() network}
   *    .status(com.fhir.InsuranceplanStatus) // optional {@link InsurancePlan#status() status}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan#modifierExtension() modifierExtension}
   *    .plan(List&amp;lt;com.fhir.InsurancePlan_Plan&amp;gt;) // optional {@link InsurancePlan#plan() plan}
   *    .contact(List&amp;lt;com.fhir.InsurancePlan_Contact&amp;gt;) // optional {@link InsurancePlan#contact() contact}
   *    .meta(com.fhir.Meta) // optional {@link InsurancePlan#meta() meta}
   *    .implicitRules(com.fhir.uri) // optional {@link InsurancePlan#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan#extension() extension}
   *    .alias(List&amp;lt;String&amp;gt;) // optional {@link InsurancePlan#alias() alias}
   *    .endpoint(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link InsurancePlan#endpoint() endpoint}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link InsurancePlan#contained() contained}
   *    .name(String) // optional {@link InsurancePlan#name() name}
   *    .id(com.fhir.id) // optional {@link InsurancePlan#id() id}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link InsurancePlan#type() type}
   *    .build();
   * </pre>
   * @return A new InsurancePlan builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableInsurancePlan.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan InsurancePlan}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "InsurancePlan", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_PERIOD = 0x8L;
    private static final long OPT_BIT_ADMINISTERED_BY = 0x10L;
    private static final long OPT_BIT_COVERAGE_AREA = 0x20L;
    private static final long OPT_BIT_COVERAGE = 0x40L;
    private static final long OPT_BIT_OWNED_BY = 0x80L;
    private static final long OPT_BIT_NETWORK = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_PLAN = 0x800L;
    private static final long OPT_BIT_CONTACT = 0x1000L;
    private static final long OPT_BIT_META = 0x2000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4000L;
    private static final long OPT_BIT_EXTENSION = 0x8000L;
    private static final long OPT_BIT_ALIAS = 0x10000L;
    private static final long OPT_BIT_ENDPOINT = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private static final long OPT_BIT_NAME = 0x80000L;
    private static final long OPT_BIT_ID = 0x100000L;
    private static final long OPT_BIT_TYPE = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.Reference administeredBy;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> coverageArea;
    private @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Coverage> coverage;
    private @javax.annotation.Nullable com.fhir.Reference ownedBy;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> network;
    private @javax.annotation.Nullable com.fhir.InsuranceplanStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Plan> plan;
    private @javax.annotation.Nullable java.util.List<com.fhir.InsurancePlan_Contact> contact;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<java.lang.String> alias;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> endpoint;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan#language() language} to language.
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
     * Initializes the optional value {@link InsurancePlan#language() language} to language.
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
     * Initializes the optional value {@link InsurancePlan#text() text} to text.
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
     * Initializes the optional value {@link InsurancePlan#text() text} to text.
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
     * Initializes the optional value {@link InsurancePlan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link InsurancePlan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link InsurancePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#administeredBy() administeredBy} to administeredBy.
     * @param administeredBy The value for administeredBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder administeredBy(com.fhir.Reference administeredBy) {
      checkNotIsSet(administeredByIsSet(), "administeredBy");
      this.administeredBy = java.util.Objects.requireNonNull(administeredBy, "administeredBy");
      optBits |= OPT_BIT_ADMINISTERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#administeredBy() administeredBy} to administeredBy.
     * @param administeredBy The value for administeredBy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("administeredBy")
    public final Builder administeredBy(java.util.Optional<? extends com.fhir.Reference> administeredBy) {
      checkNotIsSet(administeredByIsSet(), "administeredBy");
      this.administeredBy = administeredBy.orElse(null);
      optBits |= OPT_BIT_ADMINISTERED_BY;
      return this;
    }

    /**
     * Initializes the value for the {@link InsurancePlan#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link InsurancePlan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverageArea(java.util.List<com.fhir.Reference> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = java.util.Objects.requireNonNull(coverageArea, "coverageArea");
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("coverageArea")
    public final Builder coverageArea(java.util.Optional<? extends java.util.List<com.fhir.Reference>> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = coverageArea.orElse(null);
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverage(java.util.List<com.fhir.InsurancePlan_Coverage> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = java.util.Objects.requireNonNull(coverage, "coverage");
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("coverage")
    public final Builder coverage(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Coverage>> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = coverage.orElse(null);
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#ownedBy() ownedBy} to ownedBy.
     * @param ownedBy The value for ownedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder ownedBy(com.fhir.Reference ownedBy) {
      checkNotIsSet(ownedByIsSet(), "ownedBy");
      this.ownedBy = java.util.Objects.requireNonNull(ownedBy, "ownedBy");
      optBits |= OPT_BIT_OWNED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#ownedBy() ownedBy} to ownedBy.
     * @param ownedBy The value for ownedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ownedBy")
    public final Builder ownedBy(java.util.Optional<? extends com.fhir.Reference> ownedBy) {
      checkNotIsSet(ownedByIsSet(), "ownedBy");
      this.ownedBy = ownedBy.orElse(null);
      optBits |= OPT_BIT_OWNED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(java.util.List<com.fhir.Reference> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = java.util.Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    public final Builder network(java.util.Optional<? extends java.util.List<com.fhir.Reference>> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.InsuranceplanStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.InsuranceplanStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan#plan() plan} to plan.
     * @param plan The value for plan
     * @return {@code this} builder for chained invocation
     */
    public final Builder plan(java.util.List<com.fhir.InsurancePlan_Plan> plan) {
      checkNotIsSet(planIsSet(), "plan");
      this.plan = java.util.Objects.requireNonNull(plan, "plan");
      optBits |= OPT_BIT_PLAN;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#plan() plan} to plan.
     * @param plan The value for plan
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("plan")
    public final Builder plan(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Plan>> plan) {
      checkNotIsSet(planIsSet(), "plan");
      this.plan = plan.orElse(null);
      optBits |= OPT_BIT_PLAN;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.InsurancePlan_Contact> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Contact>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#meta() meta} to meta.
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
     * Initializes the optional value {@link InsurancePlan#meta() meta} to meta.
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
     * Initializes the optional value {@link InsurancePlan#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link InsurancePlan#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link InsurancePlan#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(java.util.List<java.lang.String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = java.util.Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public final Builder alias(java.util.Optional<? extends java.util.List<java.lang.String>> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(java.util.List<com.fhir.Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public final Builder endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#contained() contained} to contained.
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
     * Initializes the optional value {@link InsurancePlan#contained() contained} to contained.
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
     * Initializes the optional value {@link InsurancePlan#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.util.List<com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link InsurancePlan InsurancePlan}.
     * @return An immutable instance of InsurancePlan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.InsurancePlan build() {
      checkRequiredAttributes();
      return new ImmutableInsurancePlan(
          language,
          text,
          identifier,
          period,
          administeredBy,
          resourceType,
          coverageArea,
          coverage,
          ownedBy,
          network,
          status,
          modifierExtension,
          plan,
          contact,
          meta,
          implicitRules,
          extension,
          alias,
          endpoint,
          contained,
          name,
          id,
          type);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean administeredByIsSet() {
      return (optBits & OPT_BIT_ADMINISTERED_BY) != 0;
    }

    private boolean coverageAreaIsSet() {
      return (optBits & OPT_BIT_COVERAGE_AREA) != 0;
    }

    private boolean coverageIsSet() {
      return (optBits & OPT_BIT_COVERAGE) != 0;
    }

    private boolean ownedByIsSet() {
      return (optBits & OPT_BIT_OWNED_BY) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean planIsSet() {
      return (optBits & OPT_BIT_PLAN) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of InsurancePlan is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build InsurancePlan, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "InsurancePlan", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link InsurancePlan#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "InsurancePlan", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link InsurancePlan#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link InsurancePlan#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link InsurancePlan#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link InsurancePlan#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link InsurancePlan#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link InsurancePlan#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link InsurancePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link InsurancePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link InsurancePlan#administeredBy() administeredBy} to administeredBy.
     * @param administeredBy The value for administeredBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal administeredBy(com.fhir.Reference administeredBy);

    /**
     * Initializes the optional value {@link InsurancePlan#administeredBy() administeredBy} to administeredBy.
     * @param administeredBy The value for administeredBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal administeredBy(java.util.Optional<? extends com.fhir.Reference> administeredBy);

    /**
     * Initializes the optional value {@link InsurancePlan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverageArea(java.util.List<com.fhir.Reference> coverageArea);

    /**
     * Initializes the optional value {@link InsurancePlan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverageArea(java.util.Optional<? extends java.util.List<com.fhir.Reference>> coverageArea);

    /**
     * Initializes the optional value {@link InsurancePlan#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverage(java.util.List<com.fhir.InsurancePlan_Coverage> coverage);

    /**
     * Initializes the optional value {@link InsurancePlan#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Coverage>> coverage);

    /**
     * Initializes the optional value {@link InsurancePlan#ownedBy() ownedBy} to ownedBy.
     * @param ownedBy The value for ownedBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ownedBy(com.fhir.Reference ownedBy);

    /**
     * Initializes the optional value {@link InsurancePlan#ownedBy() ownedBy} to ownedBy.
     * @param ownedBy The value for ownedBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ownedBy(java.util.Optional<? extends com.fhir.Reference> ownedBy);

    /**
     * Initializes the optional value {@link InsurancePlan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    BuildFinal network(java.util.List<com.fhir.Reference> network);

    /**
     * Initializes the optional value {@link InsurancePlan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal network(java.util.Optional<? extends java.util.List<com.fhir.Reference>> network);

    /**
     * Initializes the optional value {@link InsurancePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.InsuranceplanStatus status);

    /**
     * Initializes the optional value {@link InsurancePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.InsuranceplanStatus> status);

    /**
     * Initializes the optional value {@link InsurancePlan#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan#plan() plan} to plan.
     * @param plan The value for plan
     * @return {@code this} builder for chained invocation
     */
    BuildFinal plan(java.util.List<com.fhir.InsurancePlan_Plan> plan);

    /**
     * Initializes the optional value {@link InsurancePlan#plan() plan} to plan.
     * @param plan The value for plan
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal plan(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Plan>> plan);

    /**
     * Initializes the optional value {@link InsurancePlan#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.InsurancePlan_Contact> contact);

    /**
     * Initializes the optional value {@link InsurancePlan#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.InsurancePlan_Contact>> contact);

    /**
     * Initializes the optional value {@link InsurancePlan#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link InsurancePlan#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link InsurancePlan#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link InsurancePlan#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link InsurancePlan#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link InsurancePlan#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link InsurancePlan#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(java.util.List<java.lang.String> alias);

    /**
     * Initializes the optional value {@link InsurancePlan#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(java.util.Optional<? extends java.util.List<java.lang.String>> alias);

    /**
     * Initializes the optional value {@link InsurancePlan#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(java.util.List<com.fhir.Reference> endpoint);

    /**
     * Initializes the optional value {@link InsurancePlan#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(java.util.Optional<? extends java.util.List<com.fhir.Reference>> endpoint);

    /**
     * Initializes the optional value {@link InsurancePlan#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link InsurancePlan#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link InsurancePlan#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link InsurancePlan#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link InsurancePlan#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link InsurancePlan#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link InsurancePlan#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(java.util.List<com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link InsurancePlan#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type);

    /**
     * Builds a new {@link InsurancePlan InsurancePlan}.
     * @return An immutable instance of InsurancePlan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    InsurancePlan build();
  }
}
