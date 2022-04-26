package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Coverage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverage.builder()}.
 */
@Generated(from = "Coverage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverage implements Coverage {
  private final @Nullable List<Coverage_Class> _class;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> contract;
  private final @Nullable Meta meta;
  private final @Nullable Reference policyHolder;
  private final @Nullable String dependent;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String network;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable PositiveInt order;
  private final @Nullable String subscriberId;
  private final @Nullable CodeableConcept type;
  private final @Nullable Reference subscriber;
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable CodeableConcept relationship;
  private final List<Reference> payor;
  private final String resourceType;
  private final @Nullable Uri implicitRules;
  private final Reference beneficiary;
  private final @Nullable Period period;
  private final @Nullable Code status;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Coverage_CostToBeneficiary> costToBeneficiary;
  private final @Nullable Boolean subrogation;

  private ImmutableCoverage(
      @Nullable List<Coverage_Class> _class,
      @Nullable Narrative text,
      @Nullable List<Reference> contract,
      @Nullable Meta meta,
      @Nullable Reference policyHolder,
      @Nullable String dependent,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String network,
      @Nullable List<ResourceList> contained,
      @Nullable PositiveInt order,
      @Nullable String subscriberId,
      @Nullable CodeableConcept type,
      @Nullable Reference subscriber,
      @Nullable Id id,
      @Nullable Code language,
      @Nullable CodeableConcept relationship,
      List<Reference> payor,
      String resourceType,
      @Nullable Uri implicitRules,
      Reference beneficiary,
      @Nullable Period period,
      @Nullable Code status,
      @Nullable List<Identifier> identifier,
      @Nullable List<Coverage_CostToBeneficiary> costToBeneficiary,
      @Nullable Boolean subrogation) {
    this._class = _class;
    this.text = text;
    this.contract = contract;
    this.meta = meta;
    this.policyHolder = policyHolder;
    this.dependent = dependent;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.network = network;
    this.contained = contained;
    this.order = order;
    this.subscriberId = subscriberId;
    this.type = type;
    this.subscriber = subscriber;
    this.id = id;
    this.language = language;
    this.relationship = relationship;
    this.payor = payor;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.beneficiary = beneficiary;
    this.period = period;
    this.status = status;
    this.identifier = identifier;
    this.costToBeneficiary = costToBeneficiary;
    this.subrogation = subrogation;
  }

  /**
   * @return The value of the {@code _class} attribute
   */
  @JsonProperty("class")
  @Override
  public Optional<List<Coverage_Class>> _class() {
    return Optional.ofNullable(_class);
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
   * @return The value of the {@code contract} attribute
   */
  @JsonProperty("contract")
  @Override
  public Optional<List<Reference>> contract() {
    return Optional.ofNullable(contract);
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
   * @return The value of the {@code policyHolder} attribute
   */
  @JsonProperty("policyHolder")
  @Override
  public Optional<Reference> policyHolder() {
    return Optional.ofNullable(policyHolder);
  }

  /**
   * @return The value of the {@code dependent} attribute
   */
  @JsonProperty("dependent")
  @Override
  public Optional<String> dependent() {
    return Optional.ofNullable(dependent);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("network")
  @Override
  public Optional<String> network() {
    return Optional.ofNullable(network);
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
   * @return The value of the {@code order} attribute
   */
  @JsonProperty("order")
  @Override
  public Optional<PositiveInt> order() {
    return Optional.ofNullable(order);
  }

  /**
   * @return The value of the {@code subscriberId} attribute
   */
  @JsonProperty("subscriberId")
  @Override
  public Optional<String> subscriberId() {
    return Optional.ofNullable(subscriberId);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code subscriber} attribute
   */
  @JsonProperty("subscriber")
  @Override
  public Optional<Reference> subscriber() {
    return Optional.ofNullable(subscriber);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Optional<CodeableConcept> relationship() {
    return Optional.ofNullable(relationship);
  }

  /**
   * @return The value of the {@code payor} attribute
   */
  @JsonProperty("payor")
  @Override
  public List<Reference> payor() {
    return payor;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code beneficiary} attribute
   */
  @JsonProperty("beneficiary")
  @Override
  public Reference beneficiary() {
    return beneficiary;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code costToBeneficiary} attribute
   */
  @JsonProperty("costToBeneficiary")
  @Override
  public Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary() {
    return Optional.ofNullable(costToBeneficiary);
  }

  /**
   * @return The value of the {@code subrogation} attribute
   */
  @JsonProperty("subrogation")
  @Override
  public Optional<Boolean> subrogation() {
    return Optional.ofNullable(subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#_class() _class} attribute.
   * @param value The value for _class
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage with_class(List<Coverage_Class> value) {
    @Nullable List<Coverage_Class> newValue = Objects.requireNonNull(value, "_class");
    if (this._class == newValue) return this;
    return new ImmutableCoverage(
        newValue,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#_class() _class} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _class
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage with_class(Optional<? extends List<Coverage_Class>> optional) {
    @Nullable List<Coverage_Class> value = optional.orElse(null);
    if (this._class == value) return this;
    return new ImmutableCoverage(
        value,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        newValue,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCoverage(
        this._class,
        value,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#contract() contract} attribute.
   * @param value The value for contract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withContract(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "contract");
    if (this.contract == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        newValue,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#contract() contract} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contract
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withContract(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.contract == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        value,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        newValue,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        value,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#policyHolder() policyHolder} attribute.
   * @param value The value for policyHolder
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withPolicyHolder(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "policyHolder");
    if (this.policyHolder == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        newValue,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#policyHolder() policyHolder} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policyHolder
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withPolicyHolder(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.policyHolder == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        value,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#dependent() dependent} attribute.
   * @param value The value for dependent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withDependent(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "dependent");
    if (Objects.equals(this.dependent, newValue)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        newValue,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#dependent() dependent} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dependent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withDependent(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.dependent, value)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        value,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        newValue,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        value,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        newValue,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        value,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withNetwork(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "network");
    if (Objects.equals(this.network, newValue)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        newValue,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#network() network} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withNetwork(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.network, value)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        value,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        newValue,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        value,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#order() order} attribute.
   * @param value The value for order
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withOrder(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "order");
    if (this.order == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        newValue,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#order() order} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for order
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withOrder(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.order == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        value,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#subscriberId() subscriberId} attribute.
   * @param value The value for subscriberId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubscriberId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "subscriberId");
    if (Objects.equals(this.subscriberId, newValue)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        newValue,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#subscriberId() subscriberId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subscriberId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubscriberId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.subscriberId, value)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        value,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        newValue,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        value,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#subscriber() subscriber} attribute.
   * @param value The value for subscriber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubscriber(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subscriber");
    if (this.subscriber == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        newValue,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#subscriber() subscriber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subscriber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withSubscriber(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subscriber == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        value,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        newValue,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        value,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        newValue,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        value,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withRelationship(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        newValue,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withRelationship(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        value,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Coverage#payor() payor}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withPayor(Reference... elements) {
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Coverage#payor() payor}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of payor elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withPayor(Iterable<? extends Reference> elements) {
    if (this.payor == elements) return this;
    List<Reference> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coverage#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverage withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        newValue,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        newValue,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        value,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Coverage#beneficiary() beneficiary} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for beneficiary
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverage withBeneficiary(Reference value) {
    if (this.beneficiary == value) return this;
    Reference newValue = Objects.requireNonNull(value, "beneficiary");
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        newValue,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        value,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        newValue,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        value,
        this.identifier,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        newValue,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        value,
        this.costToBeneficiary,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#costToBeneficiary() costToBeneficiary} attribute.
   * @param value The value for costToBeneficiary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withCostToBeneficiary(List<Coverage_CostToBeneficiary> value) {
    @Nullable List<Coverage_CostToBeneficiary> newValue = Objects.requireNonNull(value, "costToBeneficiary");
    if (this.costToBeneficiary == newValue) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        newValue,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#costToBeneficiary() costToBeneficiary} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for costToBeneficiary
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage withCostToBeneficiary(Optional<? extends List<Coverage_CostToBeneficiary>> optional) {
    @Nullable List<Coverage_CostToBeneficiary> value = optional.orElse(null);
    if (this.costToBeneficiary == value) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        value,
        this.subrogation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage#subrogation() subrogation} attribute.
   * @param value The value for subrogation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubrogation(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.subrogation, newValue)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage#subrogation() subrogation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subrogation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage withSubrogation(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.subrogation, value)) return this;
    return new ImmutableCoverage(
        this._class,
        this.text,
        this.contract,
        this.meta,
        this.policyHolder,
        this.dependent,
        this.extension,
        this.modifierExtension,
        this.network,
        this.contained,
        this.order,
        this.subscriberId,
        this.type,
        this.subscriber,
        this.id,
        this.language,
        this.relationship,
        this.payor,
        this.resourceType,
        this.implicitRules,
        this.beneficiary,
        this.period,
        this.status,
        this.identifier,
        this.costToBeneficiary,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverage
        && equalTo((ImmutableCoverage) another);
  }

  private boolean equalTo(ImmutableCoverage another) {
    return Objects.equals(_class, another._class)
        && Objects.equals(text, another.text)
        && Objects.equals(contract, another.contract)
        && Objects.equals(meta, another.meta)
        && Objects.equals(policyHolder, another.policyHolder)
        && Objects.equals(dependent, another.dependent)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(network, another.network)
        && Objects.equals(contained, another.contained)
        && Objects.equals(order, another.order)
        && Objects.equals(subscriberId, another.subscriberId)
        && Objects.equals(type, another.type)
        && Objects.equals(subscriber, another.subscriber)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(relationship, another.relationship)
        && payor.equals(another.payor)
        && resourceType.equals(another.resourceType)
        && Objects.equals(implicitRules, another.implicitRules)
        && beneficiary.equals(another.beneficiary)
        && Objects.equals(period, another.period)
        && Objects.equals(status, another.status)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(costToBeneficiary, another.costToBeneficiary)
        && Objects.equals(subrogation, another.subrogation);
  }

  /**
   * Computes a hash code from attributes: {@code _class}, {@code text}, {@code contract}, {@code meta}, {@code policyHolder}, {@code dependent}, {@code extension}, {@code modifierExtension}, {@code network}, {@code contained}, {@code order}, {@code subscriberId}, {@code type}, {@code subscriber}, {@code id}, {@code language}, {@code relationship}, {@code payor}, {@code resourceType}, {@code implicitRules}, {@code beneficiary}, {@code period}, {@code status}, {@code identifier}, {@code costToBeneficiary}, {@code subrogation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(_class);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contract);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(policyHolder);
    h += (h << 5) + Objects.hashCode(dependent);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(network);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(order);
    h += (h << 5) + Objects.hashCode(subscriberId);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(subscriber);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + payor.hashCode();
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + beneficiary.hashCode();
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(costToBeneficiary);
    h += (h << 5) + Objects.hashCode(subrogation);
    return h;
  }

  /**
   * Prints the immutable value {@code Coverage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Coverage{");
    if (_class != null) {
      builder.append("_class=").append(_class);
    }
    if (text != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contract != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("contract=").append(contract);
    }
    if (meta != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (policyHolder != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("policyHolder=").append(policyHolder);
    }
    if (dependent != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("dependent=").append(dependent);
    }
    if (extension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (network != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("network=").append(network);
    }
    if (contained != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (order != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("order=").append(order);
    }
    if (subscriberId != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("subscriberId=").append(subscriberId);
    }
    if (type != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (subscriber != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("subscriber=").append(subscriber);
    }
    if (id != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (relationship != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("payor=").append(payor);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("beneficiary=").append(beneficiary);
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (costToBeneficiary != null) {
      builder.append(", ");
      builder.append("costToBeneficiary=").append(costToBeneficiary);
    }
    if (subrogation != null) {
      builder.append(", ");
      builder.append("subrogation=").append(subrogation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Coverage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Coverage {
    @Nullable Optional<List<Coverage_Class>> _class = Optional.empty();
    boolean _classIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> contract = Optional.empty();
    boolean contractIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Reference> policyHolder = Optional.empty();
    boolean policyHolderIsSet;
    @Nullable Optional<String> dependent = Optional.empty();
    boolean dependentIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> network = Optional.empty();
    boolean networkIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<PositiveInt> order = Optional.empty();
    boolean orderIsSet;
    @Nullable Optional<String> subscriberId = Optional.empty();
    boolean subscriberIdIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Reference> subscriber = Optional.empty();
    boolean subscriberIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<CodeableConcept> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable List<Reference> payor = Collections.emptyList();
    @Nullable String resourceType;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Reference beneficiary;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary = Optional.empty();
    boolean costToBeneficiaryIsSet;
    @Nullable Optional<Boolean> subrogation = Optional.empty();
    boolean subrogationIsSet;
    @JsonProperty("class")
    public void set_class(Optional<List<Coverage_Class>> _class) {
      this._class = _class;
      this._classIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("contract")
    public void setContract(Optional<List<Reference>> contract) {
      this.contract = contract;
      this.contractIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("policyHolder")
    public void setPolicyHolder(Optional<Reference> policyHolder) {
      this.policyHolder = policyHolder;
      this.policyHolderIsSet = true;
    }
    @JsonProperty("dependent")
    public void setDependent(Optional<String> dependent) {
      this.dependent = dependent;
      this.dependentIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("network")
    public void setNetwork(Optional<String> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("order")
    public void setOrder(Optional<PositiveInt> order) {
      this.order = order;
      this.orderIsSet = true;
    }
    @JsonProperty("subscriberId")
    public void setSubscriberId(Optional<String> subscriberId) {
      this.subscriberId = subscriberId;
      this.subscriberIdIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("subscriber")
    public void setSubscriber(Optional<Reference> subscriber) {
      this.subscriber = subscriber;
      this.subscriberIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("relationship")
    public void setRelationship(Optional<CodeableConcept> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("payor")
    public void setPayor(List<Reference> payor) {
      this.payor = payor;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("beneficiary")
    public void setBeneficiary(Reference beneficiary) {
      this.beneficiary = beneficiary;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("costToBeneficiary")
    public void setCostToBeneficiary(Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary) {
      this.costToBeneficiary = costToBeneficiary;
      this.costToBeneficiaryIsSet = true;
    }
    @JsonProperty("subrogation")
    public void setSubrogation(Optional<Boolean> subrogation) {
      this.subrogation = subrogation;
      this.subrogationIsSet = true;
    }
    @Override
    public Optional<List<Coverage_Class>> _class() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> contract() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> policyHolder() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> dependent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> network() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> order() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> subscriberId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subscriber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public List<Reference> payor() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Reference beneficiary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> subrogation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverage fromJson(Json json) {
    ImmutableCoverage.Builder builder = ((ImmutableCoverage.Builder) ImmutableCoverage.builder());
    if (json._classIsSet) {
      builder._class(json._class);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.contractIsSet) {
      builder.contract(json.contract);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.policyHolderIsSet) {
      builder.policyHolder(json.policyHolder);
    }
    if (json.dependentIsSet) {
      builder.dependent(json.dependent);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.orderIsSet) {
      builder.order(json.order);
    }
    if (json.subscriberIdIsSet) {
      builder.subscriberId(json.subscriberId);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.subscriberIsSet) {
      builder.subscriber(json.subscriber);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.payor != null) {
      builder.addAllPayor(json.payor);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.beneficiary != null) {
      builder.beneficiary(json.beneficiary);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.costToBeneficiaryIsSet) {
      builder.costToBeneficiary(json.costToBeneficiary);
    }
    if (json.subrogationIsSet) {
      builder.subrogation(json.subrogation);
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
        ._class(instance._class())
        .text(instance.text())
        .contract(instance.contract())
        .meta(instance.meta())
        .policyHolder(instance.policyHolder())
        .dependent(instance.dependent())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .network(instance.network())
        .contained(instance.contained())
        .order(instance.order())
        .subscriberId(instance.subscriberId())
        .type(instance.type())
        .subscriber(instance.subscriber())
        .id(instance.id())
        .language(instance.language())
        .relationship(instance.relationship())
        .addAllPayor(instance.payor())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .beneficiary(instance.beneficiary())
        .period(instance.period())
        .status(instance.status())
        .identifier(instance.identifier())
        .costToBeneficiary(instance.costToBeneficiary())
        .subrogation(instance.subrogation())
        .build();
  }

  /**
   * Creates a builder for {@link Coverage Coverage}.
   * <pre>
   * ImmutableCoverage.builder()
   *    ._class(List&amp;lt;com.medplum.types.fhir.Coverage_Class&amp;gt;) // optional {@link Coverage#_class() _class}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Coverage#text() text}
   *    .contract(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Coverage#contract() contract}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Coverage#meta() meta}
   *    .policyHolder(com.medplum.types.fhir.Reference) // optional {@link Coverage#policyHolder() policyHolder}
   *    .dependent(String) // optional {@link Coverage#dependent() dependent}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Coverage#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Coverage#modifierExtension() modifierExtension}
   *    .network(String) // optional {@link Coverage#network() network}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Coverage#contained() contained}
   *    .order(com.medplum.types.fhir.PositiveInt) // optional {@link Coverage#order() order}
   *    .subscriberId(String) // optional {@link Coverage#subscriberId() subscriberId}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Coverage#type() type}
   *    .subscriber(com.medplum.types.fhir.Reference) // optional {@link Coverage#subscriber() subscriber}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Coverage#id() id}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Coverage#language() language}
   *    .relationship(com.medplum.types.fhir.CodeableConcept) // optional {@link Coverage#relationship() relationship}
   *    .addPayor|addAllPayor(com.medplum.types.fhir.Reference) // {@link Coverage#payor() payor} elements
   *    .resourceType(String) // required {@link Coverage#resourceType() resourceType}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Coverage#implicitRules() implicitRules}
   *    .beneficiary(com.medplum.types.fhir.Reference) // required {@link Coverage#beneficiary() beneficiary}
   *    .period(com.medplum.types.fhir.Period) // optional {@link Coverage#period() period}
   *    .status(com.medplum.types.fhir.Code) // optional {@link Coverage#status() status}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Coverage#identifier() identifier}
   *    .costToBeneficiary(List&amp;lt;com.medplum.types.fhir.Coverage_CostToBeneficiary&amp;gt;) // optional {@link Coverage#costToBeneficiary() costToBeneficiary}
   *    .subrogation(Boolean) // optional {@link Coverage#subrogation() subrogation}
   *    .build();
   * </pre>
   * @return A new Coverage builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCoverage.Builder();
  }

  /**
   * Builds instances of type {@link Coverage Coverage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Coverage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BeneficiaryBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_BENEFICIARY = 0x2L;
    private static final long OPT_BIT__CLASS = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_CONTRACT = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_POLICY_HOLDER = 0x10L;
    private static final long OPT_BIT_DEPENDENT = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_NETWORK = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_ORDER = 0x400L;
    private static final long OPT_BIT_SUBSCRIBER_ID = 0x800L;
    private static final long OPT_BIT_TYPE = 0x1000L;
    private static final long OPT_BIT_SUBSCRIBER = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_RELATIONSHIP = 0x10000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000L;
    private static final long OPT_BIT_PERIOD = 0x40000L;
    private static final long OPT_BIT_STATUS = 0x80000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_COST_TO_BENEFICIARY = 0x200000L;
    private static final long OPT_BIT_SUBROGATION = 0x400000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Coverage_Class> _class;
    private @Nullable Narrative text;
    private @Nullable List<Reference> contract;
    private @Nullable Meta meta;
    private @Nullable Reference policyHolder;
    private @Nullable String dependent;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String network;
    private @Nullable List<ResourceList> contained;
    private @Nullable PositiveInt order;
    private @Nullable String subscriberId;
    private @Nullable CodeableConcept type;
    private @Nullable Reference subscriber;
    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable CodeableConcept relationship;
    private final List<Reference> payor = new ArrayList<Reference>();
    private @Nullable String resourceType;
    private @Nullable Uri implicitRules;
    private @Nullable Reference beneficiary;
    private @Nullable Period period;
    private @Nullable Code status;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Coverage_CostToBeneficiary> costToBeneficiary;
    private @Nullable Boolean subrogation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Coverage#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    public final Builder _class(List<Coverage_Class> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = Objects.requireNonNull(_class, "_class");
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("class")
    public final Builder _class(Optional<? extends List<Coverage_Class>> _class) {
      checkNotIsSet(_classIsSet(), "_class");
      this._class = _class.orElse(null);
      optBits |= OPT_BIT__CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#text() text} to text.
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
     * Initializes the optional value {@link Coverage#text() text} to text.
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
     * Initializes the optional value {@link Coverage#contract() contract} to contract.
     * @param contract The value for contract
     * @return {@code this} builder for chained invocation
     */
    public final Builder contract(List<Reference> contract) {
      checkNotIsSet(contractIsSet(), "contract");
      this.contract = Objects.requireNonNull(contract, "contract");
      optBits |= OPT_BIT_CONTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#contract() contract} to contract.
     * @param contract The value for contract
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contract")
    public final Builder contract(Optional<? extends List<Reference>> contract) {
      checkNotIsSet(contractIsSet(), "contract");
      this.contract = contract.orElse(null);
      optBits |= OPT_BIT_CONTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#meta() meta} to meta.
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
     * Initializes the optional value {@link Coverage#meta() meta} to meta.
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
     * Initializes the optional value {@link Coverage#policyHolder() policyHolder} to policyHolder.
     * @param policyHolder The value for policyHolder
     * @return {@code this} builder for chained invocation
     */
    public final Builder policyHolder(Reference policyHolder) {
      checkNotIsSet(policyHolderIsSet(), "policyHolder");
      this.policyHolder = Objects.requireNonNull(policyHolder, "policyHolder");
      optBits |= OPT_BIT_POLICY_HOLDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#policyHolder() policyHolder} to policyHolder.
     * @param policyHolder The value for policyHolder
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("policyHolder")
    public final Builder policyHolder(Optional<? extends Reference> policyHolder) {
      checkNotIsSet(policyHolderIsSet(), "policyHolder");
      this.policyHolder = policyHolder.orElse(null);
      optBits |= OPT_BIT_POLICY_HOLDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for chained invocation
     */
    public final Builder dependent(String dependent) {
      checkNotIsSet(dependentIsSet(), "dependent");
      this.dependent = Objects.requireNonNull(dependent, "dependent");
      optBits |= OPT_BIT_DEPENDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dependent")
    public final Builder dependent(Optional<String> dependent) {
      checkNotIsSet(dependentIsSet(), "dependent");
      this.dependent = dependent.orElse(null);
      optBits |= OPT_BIT_DEPENDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#extension() extension} to extension.
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
     * Initializes the optional value {@link Coverage#extension() extension} to extension.
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
     * Initializes the optional value {@link Coverage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Coverage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(String network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("network")
    public final Builder network(Optional<String> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#contained() contained} to contained.
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
     * Initializes the optional value {@link Coverage#contained() contained} to contained.
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
     * Initializes the optional value {@link Coverage#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for chained invocation
     */
    public final Builder order(PositiveInt order) {
      checkNotIsSet(orderIsSet(), "order");
      this.order = Objects.requireNonNull(order, "order");
      optBits |= OPT_BIT_ORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("order")
    public final Builder order(Optional<? extends PositiveInt> order) {
      checkNotIsSet(orderIsSet(), "order");
      this.order = order.orElse(null);
      optBits |= OPT_BIT_ORDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#subscriberId() subscriberId} to subscriberId.
     * @param subscriberId The value for subscriberId
     * @return {@code this} builder for chained invocation
     */
    public final Builder subscriberId(String subscriberId) {
      checkNotIsSet(subscriberIdIsSet(), "subscriberId");
      this.subscriberId = Objects.requireNonNull(subscriberId, "subscriberId");
      optBits |= OPT_BIT_SUBSCRIBER_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#subscriberId() subscriberId} to subscriberId.
     * @param subscriberId The value for subscriberId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subscriberId")
    public final Builder subscriberId(Optional<String> subscriberId) {
      checkNotIsSet(subscriberIdIsSet(), "subscriberId");
      this.subscriberId = subscriberId.orElse(null);
      optBits |= OPT_BIT_SUBSCRIBER_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#subscriber() subscriber} to subscriber.
     * @param subscriber The value for subscriber
     * @return {@code this} builder for chained invocation
     */
    public final Builder subscriber(Reference subscriber) {
      checkNotIsSet(subscriberIsSet(), "subscriber");
      this.subscriber = Objects.requireNonNull(subscriber, "subscriber");
      optBits |= OPT_BIT_SUBSCRIBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#subscriber() subscriber} to subscriber.
     * @param subscriber The value for subscriber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subscriber")
    public final Builder subscriber(Optional<? extends Reference> subscriber) {
      checkNotIsSet(subscriberIsSet(), "subscriber");
      this.subscriber = subscriber.orElse(null);
      optBits |= OPT_BIT_SUBSCRIBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#id() id} to id.
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
     * Initializes the optional value {@link Coverage#id() id} to id.
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
     * Initializes the optional value {@link Coverage#language() language} to language.
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
     * Initializes the optional value {@link Coverage#language() language} to language.
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
     * Initializes the optional value {@link Coverage#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(CodeableConcept relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends CodeableConcept> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Adds one element to {@link Coverage#payor() payor} list.
     * @param element A payor element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPayor(Reference element) {
      this.payor.add(Objects.requireNonNull(element, "payor element"));
      return this;
    }

    /**
     * Adds elements to {@link Coverage#payor() payor} list.
     * @param elements An array of payor elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPayor(Reference... elements) {
      for (Reference element : elements) {
        this.payor.add(Objects.requireNonNull(element, "payor element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Coverage#payor() payor} list.
     * @param elements An iterable of payor elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPayor(Iterable<? extends Reference> elements) {
      for (Reference element : elements) {
        this.payor.add(Objects.requireNonNull(element, "payor element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Coverage#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Coverage#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Coverage#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link Coverage#beneficiary() beneficiary} attribute.
     * @param beneficiary The value for beneficiary 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("beneficiary")
    public final Builder beneficiary(Reference beneficiary) {
      checkNotIsSet(beneficiaryIsSet(), "beneficiary");
      this.beneficiary = Objects.requireNonNull(beneficiary, "beneficiary");
      initBits &= ~INIT_BIT_BENEFICIARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#period() period} to period.
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
     * Initializes the optional value {@link Coverage#period() period} to period.
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
     * Initializes the optional value {@link Coverage#status() status} to status.
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
     * Initializes the optional value {@link Coverage#status() status} to status.
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
     * Initializes the optional value {@link Coverage#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Coverage#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Coverage#costToBeneficiary() costToBeneficiary} to costToBeneficiary.
     * @param costToBeneficiary The value for costToBeneficiary
     * @return {@code this} builder for chained invocation
     */
    public final Builder costToBeneficiary(List<Coverage_CostToBeneficiary> costToBeneficiary) {
      checkNotIsSet(costToBeneficiaryIsSet(), "costToBeneficiary");
      this.costToBeneficiary = Objects.requireNonNull(costToBeneficiary, "costToBeneficiary");
      optBits |= OPT_BIT_COST_TO_BENEFICIARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage#costToBeneficiary() costToBeneficiary} to costToBeneficiary.
     * @param costToBeneficiary The value for costToBeneficiary
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("costToBeneficiary")
    public final Builder costToBeneficiary(Optional<? extends List<Coverage_CostToBeneficiary>> costToBeneficiary) {
      checkNotIsSet(costToBeneficiaryIsSet(), "costToBeneficiary");
      this.costToBeneficiary = costToBeneficiary.orElse(null);
      optBits |= OPT_BIT_COST_TO_BENEFICIARY;
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
    @JsonProperty("subrogation")
    public final Builder subrogation(Optional<Boolean> subrogation) {
      checkNotIsSet(subrogationIsSet(), "subrogation");
      this.subrogation = subrogation.orElse(null);
      optBits |= OPT_BIT_SUBROGATION;
      return this;
    }

    /**
     * Builds a new {@link Coverage Coverage}.
     * @return An immutable instance of Coverage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Coverage build() {
      checkRequiredAttributes();
      return new ImmutableCoverage(
          _class,
          text,
          contract,
          meta,
          policyHolder,
          dependent,
          extension,
          modifierExtension,
          network,
          contained,
          order,
          subscriberId,
          type,
          subscriber,
          id,
          language,
          relationship,
          createUnmodifiableList(true, payor),
          resourceType,
          implicitRules,
          beneficiary,
          period,
          status,
          identifier,
          costToBeneficiary,
          subrogation);
    }

    private boolean _classIsSet() {
      return (optBits & OPT_BIT__CLASS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean contractIsSet() {
      return (optBits & OPT_BIT_CONTRACT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean policyHolderIsSet() {
      return (optBits & OPT_BIT_POLICY_HOLDER) != 0;
    }

    private boolean dependentIsSet() {
      return (optBits & OPT_BIT_DEPENDENT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean orderIsSet() {
      return (optBits & OPT_BIT_ORDER) != 0;
    }

    private boolean subscriberIdIsSet() {
      return (optBits & OPT_BIT_SUBSCRIBER_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean subscriberIsSet() {
      return (optBits & OPT_BIT_SUBSCRIBER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean costToBeneficiaryIsSet() {
      return (optBits & OPT_BIT_COST_TO_BENEFICIARY) != 0;
    }

    private boolean subrogationIsSet() {
      return (optBits & OPT_BIT_SUBROGATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean beneficiaryIsSet() {
      return (initBits & INIT_BIT_BENEFICIARY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Coverage is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!beneficiaryIsSet()) attributes.add("beneficiary");
      return "Cannot build Coverage, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Coverage", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Coverage#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BeneficiaryBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Coverage", generator = "Immutables")
  public interface BeneficiaryBuildStage {
    /**
     * Initializes the value for the {@link Coverage#beneficiary() beneficiary} attribute.
     * @param beneficiary The value for beneficiary 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal beneficiary(Reference beneficiary);
  }

  @Generated(from = "Coverage", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Coverage#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _class(List<Coverage_Class> _class);

    /**
     * Initializes the optional value {@link Coverage#_class() _class} to _class.
     * @param _class The value for _class
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _class(Optional<? extends List<Coverage_Class>> _class);

    /**
     * Initializes the optional value {@link Coverage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Coverage#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Coverage#contract() contract} to contract.
     * @param contract The value for contract
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contract(List<Reference> contract);

    /**
     * Initializes the optional value {@link Coverage#contract() contract} to contract.
     * @param contract The value for contract
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contract(Optional<? extends List<Reference>> contract);

    /**
     * Initializes the optional value {@link Coverage#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Coverage#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Coverage#policyHolder() policyHolder} to policyHolder.
     * @param policyHolder The value for policyHolder
     * @return {@code this} builder for chained invocation
     */
    BuildFinal policyHolder(Reference policyHolder);

    /**
     * Initializes the optional value {@link Coverage#policyHolder() policyHolder} to policyHolder.
     * @param policyHolder The value for policyHolder
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal policyHolder(Optional<? extends Reference> policyHolder);

    /**
     * Initializes the optional value {@link Coverage#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dependent(String dependent);

    /**
     * Initializes the optional value {@link Coverage#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dependent(Optional<String> dependent);

    /**
     * Initializes the optional value {@link Coverage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Coverage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Coverage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Coverage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    BuildFinal network(String network);

    /**
     * Initializes the optional value {@link Coverage#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal network(Optional<String> network);

    /**
     * Initializes the optional value {@link Coverage#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Coverage#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Coverage#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for chained invocation
     */
    BuildFinal order(PositiveInt order);

    /**
     * Initializes the optional value {@link Coverage#order() order} to order.
     * @param order The value for order
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal order(Optional<? extends PositiveInt> order);

    /**
     * Initializes the optional value {@link Coverage#subscriberId() subscriberId} to subscriberId.
     * @param subscriberId The value for subscriberId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subscriberId(String subscriberId);

    /**
     * Initializes the optional value {@link Coverage#subscriberId() subscriberId} to subscriberId.
     * @param subscriberId The value for subscriberId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subscriberId(Optional<String> subscriberId);

    /**
     * Initializes the optional value {@link Coverage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Coverage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link Coverage#subscriber() subscriber} to subscriber.
     * @param subscriber The value for subscriber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subscriber(Reference subscriber);

    /**
     * Initializes the optional value {@link Coverage#subscriber() subscriber} to subscriber.
     * @param subscriber The value for subscriber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subscriber(Optional<? extends Reference> subscriber);

    /**
     * Initializes the optional value {@link Coverage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Coverage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Coverage#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Coverage#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Coverage#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relationship(CodeableConcept relationship);

    /**
     * Initializes the optional value {@link Coverage#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relationship(Optional<? extends CodeableConcept> relationship);

    /**
     * Adds one element to {@link Coverage#payor() payor} list.
     * @param element A payor element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPayor(Reference element);

    /**
     * Adds elements to {@link Coverage#payor() payor} list.
     * @param elements An array of payor elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addPayor(Reference... elements);

    /**
     * Adds elements to {@link Coverage#payor() payor} list.
     * @param elements An iterable of payor elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllPayor(Iterable<? extends Reference> elements);

    /**
     * Initializes the optional value {@link Coverage#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Coverage#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Coverage#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link Coverage#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link Coverage#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link Coverage#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link Coverage#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Coverage#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Coverage#costToBeneficiary() costToBeneficiary} to costToBeneficiary.
     * @param costToBeneficiary The value for costToBeneficiary
     * @return {@code this} builder for chained invocation
     */
    BuildFinal costToBeneficiary(List<Coverage_CostToBeneficiary> costToBeneficiary);

    /**
     * Initializes the optional value {@link Coverage#costToBeneficiary() costToBeneficiary} to costToBeneficiary.
     * @param costToBeneficiary The value for costToBeneficiary
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal costToBeneficiary(Optional<? extends List<Coverage_CostToBeneficiary>> costToBeneficiary);

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
    BuildFinal subrogation(Optional<Boolean> subrogation);

    /**
     * Builds a new {@link Coverage Coverage}.
     * @return An immutable instance of Coverage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Coverage build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
