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
 * Immutable implementation of {@link InsurancePlan}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan.builder()}.
 */
@Generated(from = "InsurancePlan", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan implements InsurancePlan {
  private final @Nullable Narrative text;
  private final @Nullable Reference administeredBy;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable String name;
  private final @Nullable InsuranceplanStatus status;
  private final @Nullable Meta meta;
  private final @Nullable Period period;
  private final @Nullable List<Reference> coverageArea;
  private final String resourceType;
  private final @Nullable List<InsurancePlan_Coverage> coverage;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<InsurancePlan_Plan> plan;
  private final @Nullable Code language;
  private final @Nullable List<InsurancePlan_Contact> contact;
  private final @Nullable List<Reference> endpoint;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<String> alias;
  private final @Nullable Reference ownedBy;
  private final @Nullable List<Reference> network;
  private final @Nullable Id id;

  private ImmutableInsurancePlan(
      @Nullable Narrative text,
      @Nullable Reference administeredBy,
      @Nullable List<ResourceList> contained,
      @Nullable String name,
      @Nullable InsuranceplanStatus status,
      @Nullable Meta meta,
      @Nullable Period period,
      @Nullable List<Reference> coverageArea,
      String resourceType,
      @Nullable List<InsurancePlan_Coverage> coverage,
      @Nullable List<CodeableConcept> type,
      @Nullable List<Identifier> identifier,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<InsurancePlan_Plan> plan,
      @Nullable Code language,
      @Nullable List<InsurancePlan_Contact> contact,
      @Nullable List<Reference> endpoint,
      @Nullable List<Extension> extension,
      @Nullable List<String> alias,
      @Nullable Reference ownedBy,
      @Nullable List<Reference> network,
      @Nullable Id id) {
    this.text = text;
    this.administeredBy = administeredBy;
    this.contained = contained;
    this.name = name;
    this.status = status;
    this.meta = meta;
    this.period = period;
    this.coverageArea = coverageArea;
    this.resourceType = resourceType;
    this.coverage = coverage;
    this.type = type;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.plan = plan;
    this.language = language;
    this.contact = contact;
    this.endpoint = endpoint;
    this.extension = extension;
    this.alias = alias;
    this.ownedBy = ownedBy;
    this.network = network;
    this.id = id;
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
   * @return The value of the {@code administeredBy} attribute
   */
  @JsonProperty("administeredBy")
  @Override
  public Optional<Reference> administeredBy() {
    return Optional.ofNullable(administeredBy);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<InsuranceplanStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code coverageArea} attribute
   */
  @JsonProperty("coverageArea")
  @Override
  public Optional<List<Reference>> coverageArea() {
    return Optional.ofNullable(coverageArea);
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
   * @return The value of the {@code coverage} attribute
   */
  @JsonProperty("coverage")
  @Override
  public Optional<List<InsurancePlan_Coverage>> coverage() {
    return Optional.ofNullable(coverage);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code plan} attribute
   */
  @JsonProperty("plan")
  @Override
  public Optional<List<InsurancePlan_Plan>> plan() {
    return Optional.ofNullable(plan);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<InsurancePlan_Contact>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<List<Reference>> endpoint() {
    return Optional.ofNullable(endpoint);
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
   * @return The value of the {@code alias} attribute
   */
  @JsonProperty("alias")
  @Override
  public Optional<List<String>> alias() {
    return Optional.ofNullable(alias);
  }

  /**
   * @return The value of the {@code ownedBy} attribute
   */
  @JsonProperty("ownedBy")
  @Override
  public Optional<Reference> ownedBy() {
    return Optional.ofNullable(ownedBy);
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("network")
  @Override
  public Optional<List<Reference>> network() {
    return Optional.ofNullable(network);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableInsurancePlan(
        newValue,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableInsurancePlan(
        value,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#administeredBy() administeredBy} attribute.
   * @param value The value for administeredBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withAdministeredBy(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "administeredBy");
    if (this.administeredBy == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        newValue,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#administeredBy() administeredBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for administeredBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withAdministeredBy(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.administeredBy == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        value,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        newValue,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        value,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        newValue,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        value,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withStatus(InsuranceplanStatus value) {
    @Nullable InsuranceplanStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        newValue,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withStatus(Optional<? extends InsuranceplanStatus> optional) {
    @Nullable InsuranceplanStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        value,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        newValue,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        value,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        newValue,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        value,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#coverageArea() coverageArea} attribute.
   * @param value The value for coverageArea
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withCoverageArea(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "coverageArea");
    if (this.coverageArea == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        newValue,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#coverageArea() coverageArea} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverageArea
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withCoverageArea(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.coverageArea == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        value,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InsurancePlan#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInsurancePlan withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        newValue,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#coverage() coverage} attribute.
   * @param value The value for coverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withCoverage(List<InsurancePlan_Coverage> value) {
    @Nullable List<InsurancePlan_Coverage> newValue = Objects.requireNonNull(value, "coverage");
    if (this.coverage == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        newValue,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#coverage() coverage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withCoverage(Optional<? extends List<InsurancePlan_Coverage>> optional) {
    @Nullable List<InsurancePlan_Coverage> value = optional.orElse(null);
    if (this.coverage == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        value,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        newValue,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        value,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        value,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        newValue,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        value,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#plan() plan} attribute.
   * @param value The value for plan
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withPlan(List<InsurancePlan_Plan> value) {
    @Nullable List<InsurancePlan_Plan> newValue = Objects.requireNonNull(value, "plan");
    if (this.plan == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#plan() plan} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for plan
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withPlan(Optional<? extends List<InsurancePlan_Plan>> optional) {
    @Nullable List<InsurancePlan_Plan> value = optional.orElse(null);
    if (this.plan == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        newValue,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        value,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withContact(List<InsurancePlan_Contact> value) {
    @Nullable List<InsurancePlan_Contact> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        newValue,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withContact(Optional<? extends List<InsurancePlan_Contact>> optional) {
    @Nullable List<InsurancePlan_Contact> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        value,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withEndpoint(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        newValue,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withEndpoint(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        value,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        newValue,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        value,
        this.alias,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withAlias(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "alias");
    if (this.alias == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        newValue,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#alias() alias} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withAlias(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.alias == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        value,
        this.ownedBy,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#ownedBy() ownedBy} attribute.
   * @param value The value for ownedBy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withOwnedBy(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "ownedBy");
    if (this.ownedBy == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        newValue,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#ownedBy() ownedBy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ownedBy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withOwnedBy(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.ownedBy == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        value,
        this.network,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withNetwork(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withNetwork(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableInsurancePlan(
        this.text,
        this.administeredBy,
        this.contained,
        this.name,
        this.status,
        this.meta,
        this.period,
        this.coverageArea,
        this.resourceType,
        this.coverage,
        this.type,
        this.identifier,
        this.implicitRules,
        this.modifierExtension,
        this.plan,
        this.language,
        this.contact,
        this.endpoint,
        this.extension,
        this.alias,
        this.ownedBy,
        this.network,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan
        && equalTo((ImmutableInsurancePlan) another);
  }

  private boolean equalTo(ImmutableInsurancePlan another) {
    return Objects.equals(text, another.text)
        && Objects.equals(administeredBy, another.administeredBy)
        && Objects.equals(contained, another.contained)
        && Objects.equals(name, another.name)
        && Objects.equals(status, another.status)
        && Objects.equals(meta, another.meta)
        && Objects.equals(period, another.period)
        && Objects.equals(coverageArea, another.coverageArea)
        && resourceType.equals(another.resourceType)
        && Objects.equals(coverage, another.coverage)
        && Objects.equals(type, another.type)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(plan, another.plan)
        && Objects.equals(language, another.language)
        && Objects.equals(contact, another.contact)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(extension, another.extension)
        && Objects.equals(alias, another.alias)
        && Objects.equals(ownedBy, another.ownedBy)
        && Objects.equals(network, another.network)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code administeredBy}, {@code contained}, {@code name}, {@code status}, {@code meta}, {@code period}, {@code coverageArea}, {@code resourceType}, {@code coverage}, {@code type}, {@code identifier}, {@code implicitRules}, {@code modifierExtension}, {@code plan}, {@code language}, {@code contact}, {@code endpoint}, {@code extension}, {@code alias}, {@code ownedBy}, {@code network}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(administeredBy);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(coverageArea);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(coverage);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(plan);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(alias);
    h += (h << 5) + Objects.hashCode(ownedBy);
    h += (h << 5) + Objects.hashCode(network);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (administeredBy != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("administeredBy=").append(administeredBy);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (name != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (status != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (meta != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (period != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (coverageArea != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("coverageArea=").append(coverageArea);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (coverage != null) {
      builder.append(", ");
      builder.append("coverage=").append(coverage);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (plan != null) {
      builder.append(", ");
      builder.append("plan=").append(plan);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (endpoint != null) {
      builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (alias != null) {
      builder.append(", ");
      builder.append("alias=").append(alias);
    }
    if (ownedBy != null) {
      builder.append(", ");
      builder.append("ownedBy=").append(ownedBy);
    }
    if (network != null) {
      builder.append(", ");
      builder.append("network=").append(network);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "InsurancePlan", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan {
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> administeredBy = Optional.empty();
    boolean administeredByIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<InsuranceplanStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<Reference>> coverageArea = Optional.empty();
    boolean coverageAreaIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<InsurancePlan_Coverage>> coverage = Optional.empty();
    boolean coverageIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<InsurancePlan_Plan>> plan = Optional.empty();
    boolean planIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<InsurancePlan_Contact>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<Reference>> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<String>> alias = Optional.empty();
    boolean aliasIsSet;
    @Nullable Optional<Reference> ownedBy = Optional.empty();
    boolean ownedByIsSet;
    @Nullable Optional<List<Reference>> network = Optional.empty();
    boolean networkIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("administeredBy")
    public void setAdministeredBy(Optional<Reference> administeredBy) {
      this.administeredBy = administeredBy;
      this.administeredByIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<InsuranceplanStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("coverageArea")
    public void setCoverageArea(Optional<List<Reference>> coverageArea) {
      this.coverageArea = coverageArea;
      this.coverageAreaIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("coverage")
    public void setCoverage(Optional<List<InsurancePlan_Coverage>> coverage) {
      this.coverage = coverage;
      this.coverageIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("plan")
    public void setPlan(Optional<List<InsurancePlan_Plan>> plan) {
      this.plan = plan;
      this.planIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<InsurancePlan_Contact>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<List<Reference>> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("alias")
    public void setAlias(Optional<List<String>> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @JsonProperty("ownedBy")
    public void setOwnedBy(Optional<Reference> ownedBy) {
      this.ownedBy = ownedBy;
      this.ownedByIsSet = true;
    }
    @JsonProperty("network")
    public void setNetwork(Optional<List<Reference>> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> administeredBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<InsuranceplanStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> coverageArea() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<InsurancePlan_Coverage>> coverage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<InsurancePlan_Plan>> plan() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<InsurancePlan_Contact>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> alias() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> ownedBy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> network() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInsurancePlan fromJson(Json json) {
    ImmutableInsurancePlan.Builder builder = ((ImmutableInsurancePlan.Builder) ImmutableInsurancePlan.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.administeredByIsSet) {
      builder.administeredBy(json.administeredBy);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.coverageAreaIsSet) {
      builder.coverageArea(json.coverageArea);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.coverageIsSet) {
      builder.coverage(json.coverage);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.planIsSet) {
      builder.plan(json.plan);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    if (json.ownedByIsSet) {
      builder.ownedBy(json.ownedBy);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .text(instance.text())
        .administeredBy(instance.administeredBy())
        .contained(instance.contained())
        .name(instance.name())
        .status(instance.status())
        .meta(instance.meta())
        .period(instance.period())
        .coverageArea(instance.coverageArea())
        .resourceType(instance.resourceType())
        .coverage(instance.coverage())
        .type(instance.type())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .plan(instance.plan())
        .language(instance.language())
        .contact(instance.contact())
        .endpoint(instance.endpoint())
        .extension(instance.extension())
        .alias(instance.alias())
        .ownedBy(instance.ownedBy())
        .network(instance.network())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan InsurancePlan}.
   * <pre>
   * ImmutableInsurancePlan.builder()
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link InsurancePlan#text() text}
   *    .administeredBy(com.fhir.types.fhir.Reference) // optional {@link InsurancePlan#administeredBy() administeredBy}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link InsurancePlan#contained() contained}
   *    .name(String) // optional {@link InsurancePlan#name() name}
   *    .status(com.fhir.types.fhir.InsuranceplanStatus) // optional {@link InsurancePlan#status() status}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link InsurancePlan#meta() meta}
   *    .period(com.fhir.types.fhir.Period) // optional {@link InsurancePlan#period() period}
   *    .coverageArea(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link InsurancePlan#coverageArea() coverageArea}
   *    .resourceType(String) // required {@link InsurancePlan#resourceType() resourceType}
   *    .coverage(List&amp;lt;com.fhir.types.fhir.InsurancePlan_Coverage&amp;gt;) // optional {@link InsurancePlan#coverage() coverage}
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link InsurancePlan#type() type}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link InsurancePlan#identifier() identifier}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link InsurancePlan#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan#modifierExtension() modifierExtension}
   *    .plan(List&amp;lt;com.fhir.types.fhir.InsurancePlan_Plan&amp;gt;) // optional {@link InsurancePlan#plan() plan}
   *    .language(com.fhir.types.fhir.Code) // optional {@link InsurancePlan#language() language}
   *    .contact(List&amp;lt;com.fhir.types.fhir.InsurancePlan_Contact&amp;gt;) // optional {@link InsurancePlan#contact() contact}
   *    .endpoint(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link InsurancePlan#endpoint() endpoint}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan#extension() extension}
   *    .alias(List&amp;lt;String&amp;gt;) // optional {@link InsurancePlan#alias() alias}
   *    .ownedBy(com.fhir.types.fhir.Reference) // optional {@link InsurancePlan#ownedBy() ownedBy}
   *    .network(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link InsurancePlan#network() network}
   *    .id(com.fhir.types.fhir.Id) // optional {@link InsurancePlan#id() id}
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
  @Generated(from = "InsurancePlan", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_ADMINISTERED_BY = 0x2L;
    private static final long OPT_BIT_CONTAINED = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_PERIOD = 0x40L;
    private static final long OPT_BIT_COVERAGE_AREA = 0x80L;
    private static final long OPT_BIT_COVERAGE = 0x100L;
    private static final long OPT_BIT_TYPE = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_PLAN = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_CONTACT = 0x8000L;
    private static final long OPT_BIT_ENDPOINT = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_ALIAS = 0x40000L;
    private static final long OPT_BIT_OWNED_BY = 0x80000L;
    private static final long OPT_BIT_NETWORK = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Narrative text;
    private @Nullable Reference administeredBy;
    private @Nullable List<ResourceList> contained;
    private @Nullable String name;
    private @Nullable InsuranceplanStatus status;
    private @Nullable Meta meta;
    private @Nullable Period period;
    private @Nullable List<Reference> coverageArea;
    private @Nullable String resourceType;
    private @Nullable List<InsurancePlan_Coverage> coverage;
    private @Nullable List<CodeableConcept> type;
    private @Nullable List<Identifier> identifier;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<InsurancePlan_Plan> plan;
    private @Nullable Code language;
    private @Nullable List<InsurancePlan_Contact> contact;
    private @Nullable List<Reference> endpoint;
    private @Nullable List<Extension> extension;
    private @Nullable List<String> alias;
    private @Nullable Reference ownedBy;
    private @Nullable List<Reference> network;
    private @Nullable Id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan#text() text} to text.
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
     * Initializes the optional value {@link InsurancePlan#text() text} to text.
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
     * Initializes the optional value {@link InsurancePlan#administeredBy() administeredBy} to administeredBy.
     * @param administeredBy The value for administeredBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder administeredBy(Reference administeredBy) {
      checkNotIsSet(administeredByIsSet(), "administeredBy");
      this.administeredBy = Objects.requireNonNull(administeredBy, "administeredBy");
      optBits |= OPT_BIT_ADMINISTERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#administeredBy() administeredBy} to administeredBy.
     * @param administeredBy The value for administeredBy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("administeredBy")
    public final Builder administeredBy(Optional<? extends Reference> administeredBy) {
      checkNotIsSet(administeredByIsSet(), "administeredBy");
      this.administeredBy = administeredBy.orElse(null);
      optBits |= OPT_BIT_ADMINISTERED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#contained() contained} to contained.
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
     * Initializes the optional value {@link InsurancePlan#contained() contained} to contained.
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
     * Initializes the optional value {@link InsurancePlan#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(InsuranceplanStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends InsuranceplanStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#meta() meta} to meta.
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
     * Initializes the optional value {@link InsurancePlan#meta() meta} to meta.
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
     * Initializes the optional value {@link InsurancePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverageArea(List<Reference> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = Objects.requireNonNull(coverageArea, "coverageArea");
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("coverageArea")
    public final Builder coverageArea(Optional<? extends List<Reference>> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = coverageArea.orElse(null);
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the value for the {@link InsurancePlan#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link InsurancePlan#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverage(List<InsurancePlan_Coverage> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = Objects.requireNonNull(coverage, "coverage");
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("coverage")
    public final Builder coverage(Optional<? extends List<InsurancePlan_Coverage>> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = coverage.orElse(null);
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link InsurancePlan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link InsurancePlan#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link InsurancePlan#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link InsurancePlan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan#plan() plan} to plan.
     * @param plan The value for plan
     * @return {@code this} builder for chained invocation
     */
    public final Builder plan(List<InsurancePlan_Plan> plan) {
      checkNotIsSet(planIsSet(), "plan");
      this.plan = Objects.requireNonNull(plan, "plan");
      optBits |= OPT_BIT_PLAN;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#plan() plan} to plan.
     * @param plan The value for plan
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("plan")
    public final Builder plan(Optional<? extends List<InsurancePlan_Plan>> plan) {
      checkNotIsSet(planIsSet(), "plan");
      this.plan = plan.orElse(null);
      optBits |= OPT_BIT_PLAN;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#language() language} to language.
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
     * Initializes the optional value {@link InsurancePlan#language() language} to language.
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
     * Initializes the optional value {@link InsurancePlan#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<InsurancePlan_Contact> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<InsurancePlan_Contact>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(List<Reference> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endpoint")
    public final Builder endpoint(Optional<? extends List<Reference>> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(List<String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alias")
    public final Builder alias(Optional<? extends List<String>> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#ownedBy() ownedBy} to ownedBy.
     * @param ownedBy The value for ownedBy
     * @return {@code this} builder for chained invocation
     */
    public final Builder ownedBy(Reference ownedBy) {
      checkNotIsSet(ownedByIsSet(), "ownedBy");
      this.ownedBy = Objects.requireNonNull(ownedBy, "ownedBy");
      optBits |= OPT_BIT_OWNED_BY;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#ownedBy() ownedBy} to ownedBy.
     * @param ownedBy The value for ownedBy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ownedBy")
    public final Builder ownedBy(Optional<? extends Reference> ownedBy) {
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
    public final Builder network(List<Reference> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("network")
    public final Builder network(Optional<? extends List<Reference>> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan#id() id} to id.
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
     * Builds a new {@link InsurancePlan InsurancePlan}.
     * @return An immutable instance of InsurancePlan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan build() {
      checkRequiredAttributes();
      return new ImmutableInsurancePlan(
          text,
          administeredBy,
          contained,
          name,
          status,
          meta,
          period,
          coverageArea,
          resourceType,
          coverage,
          type,
          identifier,
          implicitRules,
          modifierExtension,
          plan,
          language,
          contact,
          endpoint,
          extension,
          alias,
          ownedBy,
          network,
          id);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean administeredByIsSet() {
      return (optBits & OPT_BIT_ADMINISTERED_BY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean coverageAreaIsSet() {
      return (optBits & OPT_BIT_COVERAGE_AREA) != 0;
    }

    private boolean coverageIsSet() {
      return (optBits & OPT_BIT_COVERAGE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean planIsSet() {
      return (optBits & OPT_BIT_PLAN) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean ownedByIsSet() {
      return (optBits & OPT_BIT_OWNED_BY) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build InsurancePlan, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "InsurancePlan", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link InsurancePlan#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "InsurancePlan", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link InsurancePlan#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link InsurancePlan#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link InsurancePlan#administeredBy() administeredBy} to administeredBy.
     * @param administeredBy The value for administeredBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal administeredBy(Reference administeredBy);

    /**
     * Initializes the optional value {@link InsurancePlan#administeredBy() administeredBy} to administeredBy.
     * @param administeredBy The value for administeredBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal administeredBy(Optional<? extends Reference> administeredBy);

    /**
     * Initializes the optional value {@link InsurancePlan#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link InsurancePlan#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link InsurancePlan#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link InsurancePlan#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link InsurancePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(InsuranceplanStatus status);

    /**
     * Initializes the optional value {@link InsurancePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends InsuranceplanStatus> status);

    /**
     * Initializes the optional value {@link InsurancePlan#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link InsurancePlan#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link InsurancePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link InsurancePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link InsurancePlan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverageArea(List<Reference> coverageArea);

    /**
     * Initializes the optional value {@link InsurancePlan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverageArea(Optional<? extends List<Reference>> coverageArea);

    /**
     * Initializes the optional value {@link InsurancePlan#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverage(List<InsurancePlan_Coverage> coverage);

    /**
     * Initializes the optional value {@link InsurancePlan#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(Optional<? extends List<InsurancePlan_Coverage>> coverage);

    /**
     * Initializes the optional value {@link InsurancePlan#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(List<CodeableConcept> type);

    /**
     * Initializes the optional value {@link InsurancePlan#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends List<CodeableConcept>> type);

    /**
     * Initializes the optional value {@link InsurancePlan#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link InsurancePlan#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link InsurancePlan#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link InsurancePlan#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link InsurancePlan#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan#plan() plan} to plan.
     * @param plan The value for plan
     * @return {@code this} builder for chained invocation
     */
    BuildFinal plan(List<InsurancePlan_Plan> plan);

    /**
     * Initializes the optional value {@link InsurancePlan#plan() plan} to plan.
     * @param plan The value for plan
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal plan(Optional<? extends List<InsurancePlan_Plan>> plan);

    /**
     * Initializes the optional value {@link InsurancePlan#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link InsurancePlan#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link InsurancePlan#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<InsurancePlan_Contact> contact);

    /**
     * Initializes the optional value {@link InsurancePlan#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<InsurancePlan_Contact>> contact);

    /**
     * Initializes the optional value {@link InsurancePlan#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endpoint(List<Reference> endpoint);

    /**
     * Initializes the optional value {@link InsurancePlan#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endpoint(Optional<? extends List<Reference>> endpoint);

    /**
     * Initializes the optional value {@link InsurancePlan#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link InsurancePlan#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link InsurancePlan#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(List<String> alias);

    /**
     * Initializes the optional value {@link InsurancePlan#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(Optional<? extends List<String>> alias);

    /**
     * Initializes the optional value {@link InsurancePlan#ownedBy() ownedBy} to ownedBy.
     * @param ownedBy The value for ownedBy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal ownedBy(Reference ownedBy);

    /**
     * Initializes the optional value {@link InsurancePlan#ownedBy() ownedBy} to ownedBy.
     * @param ownedBy The value for ownedBy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal ownedBy(Optional<? extends Reference> ownedBy);

    /**
     * Initializes the optional value {@link InsurancePlan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    BuildFinal network(List<Reference> network);

    /**
     * Initializes the optional value {@link InsurancePlan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal network(Optional<? extends List<Reference>> network);

    /**
     * Initializes the optional value {@link InsurancePlan#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link InsurancePlan#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Builds a new {@link InsurancePlan InsurancePlan}.
     * @return An immutable instance of InsurancePlan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    InsurancePlan build();
  }
}
