//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Coverage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverage.builder()}.
 */
@org.immutables.value.Generated(from = "Coverage", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverage implements com.fhir.Coverage {
  private final com.fhir.Reference beneficiary;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.Reference subscriber;
  private final @javax.annotation.Nullable com.fhir.Reference policyHolder;
  private final @javax.annotation.Nullable java.lang.String subscriberId;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coverage_CostToBeneficiary> costToBeneficiary;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept relationship;
  private final @javax.annotation.Nullable java.lang.String network;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.lang.Boolean subrogation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coverage_Class> _class;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.util.List<com.fhir.Reference> payor;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> contract;
  private final @javax.annotation.Nullable com.fhir.positiveInt order;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String dependent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

  private ImmutableCoverage(
      com.fhir.Reference beneficiary,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.Reference subscriber,
      @javax.annotation.Nullable com.fhir.Reference policyHolder,
      @javax.annotation.Nullable java.lang.String subscriberId,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Coverage_CostToBeneficiary> costToBeneficiary,
      @javax.annotation.Nullable com.fhir.CodeableConcept relationship,
      @javax.annotation.Nullable java.lang.String network,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.id id,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.lang.Boolean subrogation,
      @javax.annotation.Nullable java.util.List<com.fhir.Coverage_Class> _class,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.util.List<com.fhir.Reference> payor,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> contract,
      @javax.annotation.Nullable com.fhir.positiveInt order,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String dependent,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained) {
    this.beneficiary = beneficiary;
    this.period = period;
    this.subscriber = subscriber;
    this.policyHolder = policyHolder;
    this.subscriberId = subscriberId;
    this.meta = meta;
    this.costToBeneficiary = costToBeneficiary;
    this.relationship = relationship;
    this.network = network;
    this.extension = extension;
    this.id = id;
    this.resourceType = resourceType;
    this.status = status;
    this.subrogation = subrogation;
    this._class = _class;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.payor = payor;
    this.type = type;
    this.text = text;
    this.contract = contract;
    this.order = order;
    this.language = language;
    this.dependent = dependent;
    this.identifier = identifier;
    this.contained = contained;
  }

  /**
   * @return The value of the {@code beneficiary} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("beneficiary")
  @Override
  public com.fhir.Reference beneficiary() {
    return beneficiary;
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
   * @return The value of the {@code subscriber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subscriber")
  @Override
  public java.util.Optional<com.fhir.Reference> subscriber() {
    return java.util.Optional.ofNullable(subscriber);
  }

  /**
   * @return The value of the {@code policyHolder} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("policyHolder")
  @Override
  public java.util.Optional<com.fhir.Reference> policyHolder() {
    return java.util.Optional.ofNullable(policyHolder);
  }

  /**
   * @return The value of the {@code subscriberId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subscriberId")
  @Override
  public java.util.Optional<java.lang.String> subscriberId() {
    return java.util.Optional.ofNullable(subscriberId);
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
   * @return The value of the {@code costToBeneficiary} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("costToBeneficiary")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coverage_CostToBeneficiary>> costToBeneficiary() {
    return java.util.Optional.ofNullable(costToBeneficiary);
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relationship")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> relationship() {
    return java.util.Optional.ofNullable(relationship);
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("network")
  @Override
  public java.util.Optional<java.lang.String> network() {
    return java.util.Optional.ofNullable(network);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code subrogation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subrogation")
  @Override
  public java.util.Optional<java.lang.Boolean> subrogation() {
    return java.util.Optional.ofNullable(subrogation);
  }

  /**
   * @return The value of the {@code _class} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("class")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coverage_Class>> _class() {
    return java.util.Optional.ofNullable(_class);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code payor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payor")
  @Override
  public java.util.List<com.fhir.Reference> payor() {
    return payor;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code contract} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contract")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> contract() {
    return java.util.Optional.ofNullable(contract);
  }

  /**
   * @return The value of the {@code order} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("order")
  @Override
  public java.util.Optional<com.fhir.positiveInt> order() {
    return java.util.Optional.ofNullable(order);
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
   * @return The value of the {@code dependent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dependent")
  @Override
  public java.util.Optional<java.lang.String> dependent() {
    return java.util.Optional.ofNullable(dependent);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coverage#beneficiary() beneficiary} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for beneficiary
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverage withBeneficiary(com.fhir.Reference value) {
    if (this.beneficiary == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "beneficiary");
    return new ImmutableCoverage(
        newValue,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        newValue,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        value,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#subscriber() subscriber} attribute.
   * @param value The value for subscriber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubscriber(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subscriber");
    if (this.subscriber == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        newValue,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#subscriber() subscriber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subscriber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withSubscriber(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subscriber == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        value,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#policyHolder() policyHolder} attribute.
   * @param value The value for policyHolder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withPolicyHolder(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "policyHolder");
    if (this.policyHolder == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        newValue,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#policyHolder() policyHolder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policyHolder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withPolicyHolder(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.policyHolder == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        value,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#subscriberId() subscriberId} attribute.
   * @param value The value for subscriberId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubscriberId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subscriberId");
    if (java.util.Objects.equals(this.subscriberId, newValue)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        newValue,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#subscriberId() subscriberId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subscriberId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubscriberId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subscriberId, value)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        value,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        newValue,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        value,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#costToBeneficiary() costToBeneficiary} attribute.
   * @param value The value for costToBeneficiary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withCostToBeneficiary(java.util.List<com.fhir.Coverage_CostToBeneficiary> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coverage_CostToBeneficiary> newValue = java.util.Objects.requireNonNull(value, "costToBeneficiary");
    if (this.costToBeneficiary == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        newValue,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#costToBeneficiary() costToBeneficiary} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for costToBeneficiary
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withCostToBeneficiary(java.util.Optional<? extends java.util.List<com.fhir.Coverage_CostToBeneficiary>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coverage_CostToBeneficiary> value = optional.orElse(null);
    if (this.costToBeneficiary == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        value,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withRelationship(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        newValue,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withRelationship(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        value,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withNetwork(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "network");
    if (java.util.Objects.equals(this.network, newValue)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        newValue,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#network() network} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withNetwork(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.network, value)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        value,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        newValue,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        value,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        newValue,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        value,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coverage#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverage withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        newValue,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        newValue,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        value,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#subrogation() subrogation} attribute.
   * @param value The value for subrogation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubrogation(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.subrogation, newValue)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        newValue,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#subrogation() subrogation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subrogation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubrogation(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.subrogation, value)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        value,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#_class() _class} attribute.
   * @param value The value for _class
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage with_class(java.util.List<com.fhir.Coverage_Class> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coverage_Class> newValue = java.util.Objects.requireNonNull(value, "_class");
    if (this._class == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#_class() _class} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _class
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage with_class(java.util.Optional<? extends java.util.List<com.fhir.Coverage_Class>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coverage_Class> value = optional.orElse(null);
    if (this._class == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        newValue,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        value,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        newValue,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        value,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Coverage#payor() payor}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withPayor(com.fhir.Reference... elements) {
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Coverage#payor() payor}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of payor elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withPayor(Iterable<? extends com.fhir.Reference> elements) {
    if (this.payor == elements) return this;
    java.util.List<com.fhir.Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        newValue,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        value,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        newValue,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        value,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#contract() contract} attribute.
   * @param value The value for contract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withContract(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "contract");
    if (this.contract == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        newValue,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#contract() contract} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contract
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withContract(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.contract == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        value,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#order() order} attribute.
   * @param value The value for order
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withOrder(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "order");
    if (this.order == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        newValue,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#order() order} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for order
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withOrder(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.order == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        value,
        this.language,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        newValue,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        value,
        this.dependent,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#dependent() dependent} attribute.
   * @param value The value for dependent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withDependent(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "dependent");
    if (java.util.Objects.equals(this.dependent, newValue)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        newValue,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#dependent() dependent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dependent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withDependent(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.dependent, value)) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        value,
        this.identifier,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        newValue,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        value,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCoverage(
        this.beneficiary,
        this.period,
        this.subscriber,
        this.policyHolder,
        this.subscriberId,
        this.meta,
        this.costToBeneficiary,
        this.relationship,
        this.network,
        this.extension,
        this.id,
        this.resourceType,
        this.status,
        this.subrogation,
        this._class,
        this.implicitRules,
        this.modifierExtension,
        this.payor,
        this.type,
        this.text,
        this.contract,
        this.order,
        this.language,
        this.dependent,
        this.identifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverage
        && equalTo((ImmutableCoverage) another);
  }

  private boolean equalTo(ImmutableCoverage another) {
    return beneficiary.equals(another.beneficiary)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(subscriber, another.subscriber)
        && java.util.Objects.equals(policyHolder, another.policyHolder)
        && java.util.Objects.equals(subscriberId, another.subscriberId)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(costToBeneficiary, another.costToBeneficiary)
        && java.util.Objects.equals(relationship, another.relationship)
        && java.util.Objects.equals(network, another.network)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(subrogation, another.subrogation)
        && java.util.Objects.equals(_class, another._class)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && payor.equals(another.payor)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contract, another.contract)
        && java.util.Objects.equals(order, another.order)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(dependent, another.dependent)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(contained, another.contained);
  }

  /**
   * Computes a hash code from attributes: {@code beneficiary}, {@code period}, {@code subscriber}, {@code policyHolder}, {@code subscriberId}, {@code meta}, {@code costToBeneficiary}, {@code relationship}, {@code network}, {@code extension}, {@code id}, {@code resourceType}, {@code status}, {@code subrogation}, {@code _class}, {@code implicitRules}, {@code modifierExtension}, {@code payor}, {@code type}, {@code text}, {@code contract}, {@code order}, {@code language}, {@code dependent}, {@code identifier}, {@code contained}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + beneficiary.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(subscriber);
    h += (h << 5) + java.util.Objects.hashCode(policyHolder);
    h += (h << 5) + java.util.Objects.hashCode(subscriberId);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(costToBeneficiary);
    h += (h << 5) + java.util.Objects.hashCode(relationship);
    h += (h << 5) + java.util.Objects.hashCode(network);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(subrogation);
    h += (h << 5) + java.util.Objects.hashCode(_class);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + payor.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contract);
    h += (h << 5) + java.util.Objects.hashCode(order);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(dependent);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    return h;
  }

  /**
   * Prints the immutable value {@code Coverage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Coverage{");
    builder.append("beneficiary=").append(beneficiary);
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (subscriber != null) {
      builder.append(", ");
      builder.append("subscriber=").append(subscriber);
    }
    if (policyHolder != null) {
      builder.append(", ");
      builder.append("policyHolder=").append(policyHolder);
    }
    if (subscriberId != null) {
      builder.append(", ");
      builder.append("subscriberId=").append(subscriberId);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (costToBeneficiary != null) {
      builder.append(", ");
      builder.append("costToBeneficiary=").append(costToBeneficiary);
    }
    if (relationship != null) {
      builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (network != null) {
      builder.append(", ");
      builder.append("network=").append(network);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (subrogation != null) {
      builder.append(", ");
      builder.append("subrogation=").append(subrogation);
    }
    if (_class != null) {
      builder.append(", ");
      builder.append("_class=").append(_class);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("payor=").append(payor);
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contract != null) {
      builder.append(", ");
      builder.append("contract=").append(contract);
    }
    if (order != null) {
      builder.append(", ");
      builder.append("order=").append(order);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (dependent != null) {
      builder.append(", ");
      builder.append("dependent=").append(dependent);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Coverage", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Coverage {
    @javax.annotation.Nullable com.fhir.Reference beneficiary;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subscriber = java.util.Optional.empty();
    boolean subscriberIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> policyHolder = java.util.Optional.empty();
    boolean policyHolderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subscriberId = java.util.Optional.empty();
    boolean subscriberIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coverage_CostToBeneficiary>> costToBeneficiary = java.util.Optional.empty();
    boolean costToBeneficiaryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> relationship = java.util.Optional.empty();
    boolean relationshipIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> network = java.util.Optional.empty();
    boolean networkIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> subrogation = java.util.Optional.empty();
    boolean subrogationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coverage_Class>> _class = java.util.Optional.empty();
    boolean _classIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> payor = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> contract = java.util.Optional.empty();
    boolean contractIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> order = java.util.Optional.empty();
    boolean orderIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> dependent = java.util.Optional.empty();
    boolean dependentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("beneficiary")
    public void setBeneficiary(com.fhir.Reference beneficiary) {
      this.beneficiary = beneficiary;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subscriber")
    public void setSubscriber(java.util.Optional<com.fhir.Reference> subscriber) {
      this.subscriber = subscriber;
      this.subscriberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("policyHolder")
    public void setPolicyHolder(java.util.Optional<com.fhir.Reference> policyHolder) {
      this.policyHolder = policyHolder;
      this.policyHolderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subscriberId")
    public void setSubscriberId(java.util.Optional<java.lang.String> subscriberId) {
      this.subscriberId = subscriberId;
      this.subscriberIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("costToBeneficiary")
    public void setCostToBeneficiary(java.util.Optional<java.util.List<com.fhir.Coverage_CostToBeneficiary>> costToBeneficiary) {
      this.costToBeneficiary = costToBeneficiary;
      this.costToBeneficiaryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relationship")
    public void setRelationship(java.util.Optional<com.fhir.CodeableConcept> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    public void setNetwork(java.util.Optional<java.lang.String> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subrogation")
    public void setSubrogation(java.util.Optional<java.lang.Boolean> subrogation) {
      this.subrogation = subrogation;
      this.subrogationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    public void set_class(java.util.Optional<java.util.List<com.fhir.Coverage_Class>> _class) {
      this._class = _class;
      this._classIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payor")
    public void setPayor(java.util.List<com.fhir.Reference> payor) {
      this.payor = payor;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contract")
    public void setContract(java.util.Optional<java.util.List<com.fhir.Reference>> contract) {
      this.contract = contract;
      this.contractIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    public void setOrder(java.util.Optional<com.fhir.positiveInt> order) {
      this.order = order;
      this.orderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dependent")
    public void setDependent(java.util.Optional<java.lang.String> dependent) {
      this.dependent = dependent;
      this.dependentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @Override
    public com.fhir.Reference beneficiary() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subscriber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> policyHolder() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subscriberId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coverage_CostToBeneficiary>> costToBeneficiary() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> network() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> subrogation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coverage_Class>> _class() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Reference> payor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> contract() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> order() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> dependent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCoverage fromJson(Json json) {
    ImmutableCoverage.Builder builder = ((ImmutableCoverage.Builder) ImmutableCoverage.builder());
    if (json.beneficiary != null) {
      builder.beneficiary(json.beneficiary);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.subscriberIsSet) {
      builder.subscriber(json.subscriber);
    }
    if (json.policyHolderIsSet) {
      builder.policyHolder(json.policyHolder);
    }
    if (json.subscriberIdIsSet) {
      builder.subscriberId(json.subscriberId);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.costToBeneficiaryIsSet) {
      builder.costToBeneficiary(json.costToBeneficiary);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.subrogationIsSet) {
      builder.subrogation(json.subrogation);
    }
    if (json._classIsSet) {
      builder._class(json._class);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.payor != null) {
      builder.addAllPayor(json.payor);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.contractIsSet) {
      builder.contract(json.contract);
    }
    if (json.orderIsSet) {
      builder.order(json.order);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dependentIsSet) {
      builder.dependent(json.dependent);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    return (ImmutableCoverage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Coverage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Coverage instance
   */
  public static Coverage copyOf(Coverage instance) {
    if (instance instanceof ImmutableCoverage) {
      return (ImmutableCoverage) instance;
    }
    return ((ImmutableCoverage.Builder) ImmutableCoverage.builder())
        .beneficiary(instance.beneficiary())
        .period(instance.period())
        .subscriber(instance.subscriber())
        .policyHolder(instance.policyHolder())
        .subscriberId(instance.subscriberId())
        .meta(instance.meta())
        .costToBeneficiary(instance.costToBeneficiary())
        .relationship(instance.relationship())
        .network(instance.network())
        .extension(instance.extension())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .status(instance.status())
        .subrogation(instance.subrogation())
        ._class(instance._class())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .addAllPayor(instance.payor())
        .type(instance.type())
        .text(instance.text())
        .contract(instance.contract())
        .order(instance.order())
        .language(instance.language())
        .dependent(instance.dependent())
        .identifier(instance.identifier())
        .contained(instance.contained())
        .build();
  }

  /**
   * Creates a builder for {@link Coverage Coverage}.
   * <pre>
   * ImmutableCoverage.builder()
   *    .beneficiary(com.fhir.Reference) // required {@link Coverage#beneficiary() beneficiary}
   *    .period(com.fhir.Period) // optional {@link Coverage#period() period}
   *    .subscriber(com.fhir.Reference) // optional {@link Coverage#subscriber() subscriber}
   *    .policyHolder(com.fhir.Reference) // optional {@link Coverage#policyHolder() policyHolder}
   *    .subscriberId(String) // optional {@link Coverage#subscriberId() subscriberId}
   *    .meta(com.fhir.Meta) // optional {@link Coverage#meta() meta}
   *    .costToBeneficiary(List&amp;lt;com.fhir.Coverage_CostToBeneficiary&amp;gt;) // optional {@link Coverage#costToBeneficiary() costToBeneficiary}
   *    .relationship(com.fhir.CodeableConcept) // optional {@link Coverage#relationship() relationship}
   *    .network(String) // optional {@link Coverage#network() network}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Coverage#extension() extension}
   *    .id(com.fhir.id) // optional {@link Coverage#id() id}
   *    .resourceType(String) // required {@link Coverage#resourceType() resourceType}
   *    .status(com.fhir.code) // optional {@link Coverage#status() status}
   *    .subrogation(Boolean) // optional {@link Coverage#subrogation() subrogation}
   *    ._class(List&amp;lt;com.fhir.Coverage_Class&amp;gt;) // optional {@link Coverage#_class() _class}
   *    .implicitRules(com.fhir.uri) // optional {@link Coverage#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Coverage#modifierExtension() modifierExtension}
   *    .addPayor|addAllPayor(com.fhir.Reference) // {@link Coverage#payor() payor} elements
   *    .type(com.fhir.CodeableConcept) // optional {@link Coverage#type() type}
   *    .text(com.fhir.Narrative) // optional {@link Coverage#text() text}
   *    .contract(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Coverage#contract() contract}
   *    .order(com.fhir.positiveInt) // optional {@link Coverage#order() order}
   *    .language(com.fhir.code) // optional {@link Coverage#language() language}
   *    .dependent(String) // optional {@link Coverage#dependent() dependent}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Coverage#identifier() identifier}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Coverage#contained() contained}
   *    .build();
   * </pre>
   * @return A new Coverage builder
   */
  public static BeneficiaryBuildStage builder() {
    return new ImmutableCoverage.Builder();
  }

  /**
   * Builds instances of type {@link Coverage Coverage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Coverage", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements BeneficiaryBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_BENEFICIARY = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_PERIOD = 0x1L;
    private static final long OPT_BIT_SUBSCRIBER = 0x2L;
    private static final long OPT_BIT_POLICY_HOLDER = 0x4L;
    private static final long OPT_BIT_SUBSCRIBER_ID = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_COST_TO_BENEFICIARY = 0x20L;
    private static final long OPT_BIT_RELATIONSHIP = 0x40L;
    private static final long OPT_BIT_NETWORK = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_STATUS = 0x400L;
    private static final long OPT_BIT_SUBROGATION = 0x800L;
    private static final long OPT_BIT__CLASS = 0x1000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_TYPE = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_CONTRACT = 0x20000L;
    private static final long OPT_BIT_ORDER = 0x40000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000L;
    private static final long OPT_BIT_DEPENDENT = 0x100000L;
    private static final long OPT_BIT_IDENTIFIER = 0x200000L;
    private static final long OPT_BIT_CONTAINED = 0x400000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference beneficiary;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.Reference subscriber;
    private @javax.annotation.Nullable com.fhir.Reference policyHolder;
    private @javax.annotation.Nullable java.lang.String subscriberId;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coverage_CostToBeneficiary> costToBeneficiary;
    private @javax.annotation.Nullable com.fhir.CodeableConcept relationship;
    private @javax.annotation.Nullable java.lang.String network;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.lang.Boolean subrogation;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coverage_Class> _class;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private final java.util.List<com.fhir.Reference> payor = new java.util.ArrayList<com.fhir.Reference>();
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> contract;
    private @javax.annotation.Nullable com.fhir.positiveInt order;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String dependent;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Coverage#beneficiary() beneficiary} attribute.
     * @param beneficiary The value for beneficiary 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("beneficiary")
    public final Builder beneficiary(com.fhir.Reference beneficiary) {
      checkNotIsSet(beneficiaryIsSet(), "beneficiary");
      this.beneficiary = java.util.Objects.requireNonNull(beneficiary, "beneficiary");
      initBits &= ~INIT_BIT_BENEFICIARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#period() period} to period.
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
     * Initializes the optional value {@link Coverage#period() period} to period.
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
     * Initializes the optional value {@link Coverage#subscriber() subscriber} to subscriber.
     * @param subscriber The value for subscriber
     * @return {@code this} builder for chained invocation
     */
    public final Builder subscriber(com.fhir.Reference subscriber) {
      checkNotIsSet(subscriberIsSet(), "subscriber");
      this.subscriber = java.util.Objects.requireNonNull(subscriber, "subscriber");
      optBits |= OPT_BIT_SUBSCRIBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#subscriber() subscriber} to subscriber.
     * @param subscriber The value for subscriber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriber")
    public final Builder subscriber(java.util.Optional<? extends com.fhir.Reference> subscriber) {
      checkNotIsSet(subscriberIsSet(), "subscriber");
      this.subscriber = subscriber.orElse(null);
      optBits |= OPT_BIT_SUBSCRIBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#policyHolder() policyHolder} to policyHolder.
     * @param policyHolder The value for policyHolder
     * @return {@code this} builder for chained invocation
     */
    public final Builder policyHolder(com.fhir.Reference policyHolder) {
      checkNotIsSet(policyHolderIsSet(), "policyHolder");
      this.policyHolder = java.util.Objects.requireNonNull(policyHolder, "policyHolder");
      optBits |= OPT_BIT_POLICY_HOLDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#policyHolder() policyHolder} to policyHolder.
     * @param policyHolder The value for policyHolder
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policyHolder")
    public final Builder policyHolder(java.util.Optional<? extends com.fhir.Reference> policyHolder) {
      checkNotIsSet(policyHolderIsSet(), "policyHolder");
      this.policyHolder = policyHolder.orElse(null);
      optBits |= OPT_BIT_POLICY_HOLDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#subscriberId() subscriberId} to subscriberId.
     * @param subscriberId The value for subscriberId
     * @return {@code this} builder for chained invocation
     */
    public final Builder subscriberId(java.lang.String subscriberId) {
      checkNotIsSet(subscriberIdIsSet(), "subscriberId");
      this.subscriberId = java.util.Objects.requireNonNull(subscriberId, "subscriberId");
      optBits |= OPT_BIT_SUBSCRIBER_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#subscriberId() subscriberId} to subscriberId.
     * @param subscriberId The value for subscriberId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriberId")
    public final Builder subscriberId(java.util.Optional<java.lang.String> subscriberId) {
      checkNotIsSet(subscriberIdIsSet(), "subscriberId");
      this.subscriberId = subscriberId.orElse(null);
      optBits |= OPT_BIT_SUBSCRIBER_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#meta() meta} to meta.
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
     * Initializes the optional value {@link Coverage#meta() meta} to meta.
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
     * Initializes the optional value {@link Coverage#costToBeneficiary() costToBeneficiary} to costToBeneficiary.
     * @param costToBeneficiary The value for costToBeneficiary
     * @return {@code this} builder for chained invocation
     */
    public final Builder costToBeneficiary(java.util.List<com.fhir.Coverage_CostToBeneficiary> costToBeneficiary) {
      checkNotIsSet(costToBeneficiaryIsSet(), "costToBeneficiary");
      this.costToBeneficiary = java.util.Objects.requireNonNull(costToBeneficiary, "costToBeneficiary");
      optBits |= OPT_BIT_COST_TO_BENEFICIARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#costToBeneficiary() costToBeneficiary} to costToBeneficiary.
     * @param costToBeneficiary The value for costToBeneficiary
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("costToBeneficiary")
    public final Builder costToBeneficiary(java.util.Optional<? extends java.util.List<com.fhir.Coverage_CostToBeneficiary>> costToBeneficiary) {
      checkNotIsSet(costToBeneficiaryIsSet(), "costToBeneficiary");
      this.costToBeneficiary = costToBeneficiary.orElse(null);
      optBits |= OPT_BIT_COST_TO_BENEFICIARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(com.fhir.CodeableConcept relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = java.util.Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relationship")
    public final Builder relationship(java.util.Optional<? extends com.fhir.CodeableConcept> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(java.lang.String network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = java.util.Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("network")
    public final Builder network(java.util.Optional<java.lang.String> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#extension() extension} to extension.
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
     * Initializes the optional value {@link Coverage#extension() extension} to extension.
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
     * Initializes the optional value {@link Coverage#id() id} to id.
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
     * Initializes the optional value {@link Coverage#id() id} to id.
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
     * Initializes the value for the {@link Coverage#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Coverage#status() status} to status.
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
     * Initializes the optional value {@link Coverage#status() status} to status.
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
     * Initializes the optional value {@link Coverage#subrogation() subrogation} to subrogation.
     * @param subrogation The value for subrogation
     * @return {@code this} builder for chained invocation
     */
    public final Builder subrogation(boolean subrogation) {
      checkNotIsSet(subrogationIsSet(), "subrogation");
      this.subrogation = subrogation;
      optBits |= OPT_BIT_SUBROGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#subrogation() subrogation} to subrogation.
     * @param subrogation The value for subrogation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subrogation")
    public final Builder subrogation(java.util.Optional<java.lang.Boolean> subrogation) {
      checkNotIsSet(subrogationIsSet(), "subrogation");
      this.subrogation = subrogation.orElse(null);
      optBits |= OPT_BIT_SUBROGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    public final Builder _class(java.util.List<com.fhir.Coverage_Class> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = java.util.Objects.requireNonNull(_class, "_class");
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    public final Builder _class(java.util.Optional<? extends java.util.List<com.fhir.Coverage_Class>> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = _class.orElse(null);
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Coverage#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Coverage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Coverage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link Coverage#payor() payor} list.
     * @param element A payor element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPayor(com.fhir.Reference element) {
      this.payor.add(java.util.Objects.requireNonNull(element, "payor element"));
      return this;
    }

    /**
     * Adds elements to {@link Coverage#payor() payor} list.
     * @param elements An array of payor elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPayor(com.fhir.Reference... elements) {
      for (com.fhir.Reference element : elements) {
        this.payor.add(java.util.Objects.requireNonNull(element, "payor element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Coverage#payor() payor} list.
     * @param elements An iterable of payor elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPayor(Iterable<? extends com.fhir.Reference> elements) {
      for (com.fhir.Reference element : elements) {
        this.payor.add(java.util.Objects.requireNonNull(element, "payor element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#text() text} to text.
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
     * Initializes the optional value {@link Coverage#text() text} to text.
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
     * Initializes the optional value {@link Coverage#contract() contract} to contract.
     * @param contract The value for contract
     * @return {@code this} builder for chained invocation
     */
    public final Builder contract(java.util.List<com.fhir.Reference> contract) {
      checkNotIsSet(contractIsSet(), "contract");
      this.contract = java.util.Objects.requireNonNull(contract, "contract");
      optBits |= OPT_BIT_CONTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#contract() contract} to contract.
     * @param contract The value for contract
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contract")
    public final Builder contract(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contract) {
      checkNotIsSet(contractIsSet(), "contract");
      this.contract = contract.orElse(null);
      optBits |= OPT_BIT_CONTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for chained invocation
     */
    public final Builder order(com.fhir.positiveInt order) {
      checkNotIsSet(orderIsSet(), "order");
      this.order = java.util.Objects.requireNonNull(order, "order");
      optBits |= OPT_BIT_ORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    public final Builder order(java.util.Optional<? extends com.fhir.positiveInt> order) {
      checkNotIsSet(orderIsSet(), "order");
      this.order = order.orElse(null);
      optBits |= OPT_BIT_ORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#language() language} to language.
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
     * Initializes the optional value {@link Coverage#language() language} to language.
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
     * Initializes the optional value {@link Coverage#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for chained invocation
     */
    public final Builder dependent(java.lang.String dependent) {
      checkNotIsSet(dependentIsSet(), "dependent");
      this.dependent = java.util.Objects.requireNonNull(dependent, "dependent");
      optBits |= OPT_BIT_DEPENDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dependent")
    public final Builder dependent(java.util.Optional<java.lang.String> dependent) {
      checkNotIsSet(dependentIsSet(), "dependent");
      this.dependent = dependent.orElse(null);
      optBits |= OPT_BIT_DEPENDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Coverage#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Coverage#contained() contained} to contained.
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
     * Initializes the optional value {@link Coverage#contained() contained} to contained.
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
     * Builds a new {@link Coverage Coverage}.
     * @return An immutable instance of Coverage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Coverage build() {
      checkRequiredAttributes();
      return new ImmutableCoverage(
          beneficiary,
          period,
          subscriber,
          policyHolder,
          subscriberId,
          meta,
          costToBeneficiary,
          relationship,
          network,
          extension,
          id,
          resourceType,
          status,
          subrogation,
          _class,
          implicitRules,
          modifierExtension,
          createUnmodifiableList(true, payor),
          type,
          text,
          contract,
          order,
          language,
          dependent,
          identifier,
          contained);
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean subscriberIsSet() {
      return (optBits & OPT_BIT_SUBSCRIBER) != 0;
    }

    private boolean policyHolderIsSet() {
      return (optBits & OPT_BIT_POLICY_HOLDER) != 0;
    }

    private boolean subscriberIdIsSet() {
      return (optBits & OPT_BIT_SUBSCRIBER_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean costToBeneficiaryIsSet() {
      return (optBits & OPT_BIT_COST_TO_BENEFICIARY) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean subrogationIsSet() {
      return (optBits & OPT_BIT_SUBROGATION) != 0;
    }

    private boolean _classIsSet() {
      return (optBits & OPT_BIT__CLASS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean contractIsSet() {
      return (optBits & OPT_BIT_CONTRACT) != 0;
    }

    private boolean orderIsSet() {
      return (optBits & OPT_BIT_ORDER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dependentIsSet() {
      return (optBits & OPT_BIT_DEPENDENT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean beneficiaryIsSet() {
      return (initBits & INIT_BIT_BENEFICIARY) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Coverage is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!beneficiaryIsSet()) attributes.add("beneficiary");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Coverage, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Coverage", generator = "Immutables")
  public interface BeneficiaryBuildStage {
    /**
     * Initializes the value for the {@link Coverage#beneficiary() beneficiary} attribute.
     * @param beneficiary The value for beneficiary 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage beneficiary(com.fhir.Reference beneficiary);
  }

  @org.immutables.value.Generated(from = "Coverage", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Coverage#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Coverage", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Coverage#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link Coverage#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link Coverage#subscriber() subscriber} to subscriber.
     * @param subscriber The value for subscriber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subscriber(com.fhir.Reference subscriber);

    /**
     * Initializes the optional value {@link Coverage#subscriber() subscriber} to subscriber.
     * @param subscriber The value for subscriber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subscriber(java.util.Optional<? extends com.fhir.Reference> subscriber);

    /**
     * Initializes the optional value {@link Coverage#policyHolder() policyHolder} to policyHolder.
     * @param policyHolder The value for policyHolder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal policyHolder(com.fhir.Reference policyHolder);

    /**
     * Initializes the optional value {@link Coverage#policyHolder() policyHolder} to policyHolder.
     * @param policyHolder The value for policyHolder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal policyHolder(java.util.Optional<? extends com.fhir.Reference> policyHolder);

    /**
     * Initializes the optional value {@link Coverage#subscriberId() subscriberId} to subscriberId.
     * @param subscriberId The value for subscriberId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subscriberId(java.lang.String subscriberId);

    /**
     * Initializes the optional value {@link Coverage#subscriberId() subscriberId} to subscriberId.
     * @param subscriberId The value for subscriberId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subscriberId(java.util.Optional<java.lang.String> subscriberId);

    /**
     * Initializes the optional value {@link Coverage#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Coverage#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Coverage#costToBeneficiary() costToBeneficiary} to costToBeneficiary.
     * @param costToBeneficiary The value for costToBeneficiary
     * @return {@code this} builder for chained invocation
     */
    BuildFinal costToBeneficiary(java.util.List<com.fhir.Coverage_CostToBeneficiary> costToBeneficiary);

    /**
     * Initializes the optional value {@link Coverage#costToBeneficiary() costToBeneficiary} to costToBeneficiary.
     * @param costToBeneficiary The value for costToBeneficiary
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal costToBeneficiary(java.util.Optional<? extends java.util.List<com.fhir.Coverage_CostToBeneficiary>> costToBeneficiary);

    /**
     * Initializes the optional value {@link Coverage#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relationship(com.fhir.CodeableConcept relationship);

    /**
     * Initializes the optional value {@link Coverage#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relationship(java.util.Optional<? extends com.fhir.CodeableConcept> relationship);

    /**
     * Initializes the optional value {@link Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    BuildFinal network(java.lang.String network);

    /**
     * Initializes the optional value {@link Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal network(java.util.Optional<java.lang.String> network);

    /**
     * Initializes the optional value {@link Coverage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Coverage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Coverage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Coverage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Coverage#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link Coverage#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link Coverage#subrogation() subrogation} to subrogation.
     * @param subrogation The value for subrogation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subrogation(boolean subrogation);

    /**
     * Initializes the optional value {@link Coverage#subrogation() subrogation} to subrogation.
     * @param subrogation The value for subrogation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subrogation(java.util.Optional<java.lang.Boolean> subrogation);

    /**
     * Initializes the optional value {@link Coverage#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _class(java.util.List<com.fhir.Coverage_Class> _class);

    /**
     * Initializes the optional value {@link Coverage#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _class(java.util.Optional<? extends java.util.List<com.fhir.Coverage_Class>> _class);

    /**
     * Initializes the optional value {@link Coverage#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Coverage#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Coverage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Coverage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Adds one element to {@link Coverage#payor() payor} list.
     * @param element A payor element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPayor(com.fhir.Reference element);

    /**
     * Adds elements to {@link Coverage#payor() payor} list.
     * @param elements An array of payor elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPayor(com.fhir.Reference... elements);

    /**
     * Adds elements to {@link Coverage#payor() payor} list.
     * @param elements An iterable of payor elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllPayor(Iterable<? extends com.fhir.Reference> elements);

    /**
     * Initializes the optional value {@link Coverage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link Coverage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Coverage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Coverage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Coverage#contract() contract} to contract.
     * @param contract The value for contract
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contract(java.util.List<com.fhir.Reference> contract);

    /**
     * Initializes the optional value {@link Coverage#contract() contract} to contract.
     * @param contract The value for contract
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contract(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contract);

    /**
     * Initializes the optional value {@link Coverage#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for chained invocation
     */
    BuildFinal order(com.fhir.positiveInt order);

    /**
     * Initializes the optional value {@link Coverage#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal order(java.util.Optional<? extends com.fhir.positiveInt> order);

    /**
     * Initializes the optional value {@link Coverage#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Coverage#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Coverage#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dependent(java.lang.String dependent);

    /**
     * Initializes the optional value {@link Coverage#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dependent(java.util.Optional<java.lang.String> dependent);

    /**
     * Initializes the optional value {@link Coverage#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Coverage#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Coverage#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Coverage#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Builds a new {@link Coverage Coverage}.
     * @return An immutable instance of Coverage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Coverage build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
