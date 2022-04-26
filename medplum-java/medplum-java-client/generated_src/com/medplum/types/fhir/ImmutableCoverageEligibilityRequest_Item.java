package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link CoverageEligibilityRequest_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityRequest_Item.builder()}.
 */
@Generated(from = "CoverageEligibilityRequest_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityRequest_Item
    implements CoverageEligibilityRequest_Item {
  private final @Nullable CodeableConcept category;
  private final @Nullable Reference provider;
  private final @Nullable String id;
  private final @Nullable Quantity quantity;
  private final @Nullable Reference facility;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> detail;
  private final @Nullable Money unitPrice;
  private final @Nullable CodeableConcept productOrService;
  private final @Nullable List<CoverageEligibilityRequest_Diagnosis> diagnosis;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable List<PositiveInt> supportingInfoSequence;

  private ImmutableCoverageEligibilityRequest_Item(
      @Nullable CodeableConcept category,
      @Nullable Reference provider,
      @Nullable String id,
      @Nullable Quantity quantity,
      @Nullable Reference facility,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> detail,
      @Nullable Money unitPrice,
      @Nullable CodeableConcept productOrService,
      @Nullable List<CoverageEligibilityRequest_Diagnosis> diagnosis,
      @Nullable List<CodeableConcept> modifier,
      @Nullable List<PositiveInt> supportingInfoSequence) {
    this.category = category;
    this.provider = provider;
    this.id = id;
    this.quantity = quantity;
    this.facility = facility;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.detail = detail;
    this.unitPrice = unitPrice;
    this.productOrService = productOrService;
    this.diagnosis = diagnosis;
    this.modifier = modifier;
    this.supportingInfoSequence = supportingInfoSequence;
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code provider} attribute
   */
  @JsonProperty("provider")
  @Override
  public Optional<Reference> provider() {
    return Optional.ofNullable(provider);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code facility} attribute
   */
  @JsonProperty("facility")
  @Override
  public Optional<Reference> facility() {
    return Optional.ofNullable(facility);
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
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<List<Reference>> detail() {
    return Optional.ofNullable(detail);
  }

  /**
   * @return The value of the {@code unitPrice} attribute
   */
  @JsonProperty("unitPrice")
  @Override
  public Optional<Money> unitPrice() {
    return Optional.ofNullable(unitPrice);
  }

  /**
   * @return The value of the {@code productOrService} attribute
   */
  @JsonProperty("productOrService")
  @Override
  public Optional<CodeableConcept> productOrService() {
    return Optional.ofNullable(productOrService);
  }

  /**
   * @return The value of the {@code diagnosis} attribute
   */
  @JsonProperty("diagnosis")
  @Override
  public Optional<List<CoverageEligibilityRequest_Diagnosis>> diagnosis() {
    return Optional.ofNullable(diagnosis);
  }

  /**
   * @return The value of the {@code modifier} attribute
   */
  @JsonProperty("modifier")
  @Override
  public Optional<List<CodeableConcept>> modifier() {
    return Optional.ofNullable(modifier);
  }

  /**
   * @return The value of the {@code supportingInfoSequence} attribute
   */
  @JsonProperty("supportingInfoSequence")
  @Override
  public Optional<List<PositiveInt>> supportingInfoSequence() {
    return Optional.ofNullable(supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        newValue,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        value,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withProvider(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        newValue,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withProvider(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        value,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        newValue,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        value,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        newValue,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        value,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#facility() facility} attribute.
   * @param value The value for facility
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withFacility(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "facility");
    if (this.facility == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        newValue,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#facility() facility} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for facility
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withFacility(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.facility == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        value,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        newValue,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        value,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        newValue,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        value,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withDetail(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        newValue,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withDetail(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        value,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        newValue,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        value,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#productOrService() productOrService} attribute.
   * @param value The value for productOrService
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withProductOrService(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    if (this.productOrService == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        newValue,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#productOrService() productOrService} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productOrService
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withProductOrService(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.productOrService == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        value,
        this.diagnosis,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#diagnosis() diagnosis} attribute.
   * @param value The value for diagnosis
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withDiagnosis(List<CoverageEligibilityRequest_Diagnosis> value) {
    @Nullable List<CoverageEligibilityRequest_Diagnosis> newValue = Objects.requireNonNull(value, "diagnosis");
    if (this.diagnosis == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        newValue,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#diagnosis() diagnosis} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosis
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withDiagnosis(Optional<? extends List<CoverageEligibilityRequest_Diagnosis>> optional) {
    @Nullable List<CoverageEligibilityRequest_Diagnosis> value = optional.orElse(null);
    if (this.diagnosis == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        value,
        this.modifier,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        newValue,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        value,
        this.supportingInfoSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_Item#supportingInfoSequence() supportingInfoSequence} attribute.
   * @param value The value for supportingInfoSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_Item withSupportingInfoSequence(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "supportingInfoSequence");
    if (this.supportingInfoSequence == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_Item#supportingInfoSequence() supportingInfoSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfoSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_Item withSupportingInfoSequence(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.supportingInfoSequence == value) return this;
    return new ImmutableCoverageEligibilityRequest_Item(
        this.category,
        this.provider,
        this.id,
        this.quantity,
        this.facility,
        this.extension,
        this.modifierExtension,
        this.detail,
        this.unitPrice,
        this.productOrService,
        this.diagnosis,
        this.modifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityRequest_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityRequest_Item
        && equalTo((ImmutableCoverageEligibilityRequest_Item) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityRequest_Item another) {
    return Objects.equals(category, another.category)
        && Objects.equals(provider, another.provider)
        && Objects.equals(id, another.id)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(facility, another.facility)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(detail, another.detail)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(productOrService, another.productOrService)
        && Objects.equals(diagnosis, another.diagnosis)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(supportingInfoSequence, another.supportingInfoSequence);
  }

  /**
   * Computes a hash code from attributes: {@code category}, {@code provider}, {@code id}, {@code quantity}, {@code facility}, {@code extension}, {@code modifierExtension}, {@code detail}, {@code unitPrice}, {@code productOrService}, {@code diagnosis}, {@code modifier}, {@code supportingInfoSequence}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(facility);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(productOrService);
    h += (h << 5) + Objects.hashCode(diagnosis);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(supportingInfoSequence);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityRequest_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityRequest_Item{");
    if (category != null) {
      builder.append("category=").append(category);
    }
    if (provider != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (quantity != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (facility != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("facility=").append(facility);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (detail != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (unitPrice != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (productOrService != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("productOrService=").append(productOrService);
    }
    if (diagnosis != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("diagnosis=").append(diagnosis);
    }
    if (modifier != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (supportingInfoSequence != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("supportingInfoSequence=").append(supportingInfoSequence);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CoverageEligibilityRequest_Item", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CoverageEligibilityRequest_Item {
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Reference> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<Reference> facility = Optional.empty();
    boolean facilityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<CodeableConcept> productOrService = Optional.empty();
    boolean productOrServiceIsSet;
    @Nullable Optional<List<CoverageEligibilityRequest_Diagnosis>> diagnosis = Optional.empty();
    boolean diagnosisIsSet;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<List<PositiveInt>> supportingInfoSequence = Optional.empty();
    boolean supportingInfoSequenceIsSet;
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("facility")
    public void setFacility(Optional<Reference> facility) {
      this.facility = facility;
      this.facilityIsSet = true;
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
    @JsonProperty("detail")
    public void setDetail(Optional<List<Reference>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("unitPrice")
    public void setUnitPrice(Optional<Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @JsonProperty("productOrService")
    public void setProductOrService(Optional<CodeableConcept> productOrService) {
      this.productOrService = productOrService;
      this.productOrServiceIsSet = true;
    }
    @JsonProperty("diagnosis")
    public void setDiagnosis(Optional<List<CoverageEligibilityRequest_Diagnosis>> diagnosis) {
      this.diagnosis = diagnosis;
      this.diagnosisIsSet = true;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("supportingInfoSequence")
    public void setSupportingInfoSequence(Optional<List<PositiveInt>> supportingInfoSequence) {
      this.supportingInfoSequence = supportingInfoSequence;
      this.supportingInfoSequenceIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> facility() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CoverageEligibilityRequest_Diagnosis>> diagnosis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> supportingInfoSequence() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityRequest_Item fromJson(Json json) {
    ImmutableCoverageEligibilityRequest_Item.Builder builder = ImmutableCoverageEligibilityRequest_Item.builder();
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.facilityIsSet) {
      builder.facility(json.facility);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.productOrServiceIsSet) {
      builder.productOrService(json.productOrService);
    }
    if (json.diagnosisIsSet) {
      builder.diagnosis(json.diagnosis);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.supportingInfoSequenceIsSet) {
      builder.supportingInfoSequence(json.supportingInfoSequence);
    }
    return (ImmutableCoverageEligibilityRequest_Item) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityRequest_Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityRequest_Item instance
   */
  public static CoverageEligibilityRequest_Item copyOf(CoverageEligibilityRequest_Item instance) {
    if (instance instanceof ImmutableCoverageEligibilityRequest_Item) {
      return (ImmutableCoverageEligibilityRequest_Item) instance;
    }
    return ImmutableCoverageEligibilityRequest_Item.builder()
        .category(instance.category())
        .provider(instance.provider())
        .id(instance.id())
        .quantity(instance.quantity())
        .facility(instance.facility())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .detail(instance.detail())
        .unitPrice(instance.unitPrice())
        .productOrService(instance.productOrService())
        .diagnosis(instance.diagnosis())
        .modifier(instance.modifier())
        .supportingInfoSequence(instance.supportingInfoSequence())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityRequest_Item CoverageEligibilityRequest_Item}.
   * <pre>
   * ImmutableCoverageEligibilityRequest_Item.builder()
   *    .category(com.medplum.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityRequest_Item#category() category}
   *    .provider(com.medplum.types.fhir.Reference) // optional {@link CoverageEligibilityRequest_Item#provider() provider}
   *    .id(String) // optional {@link CoverageEligibilityRequest_Item#id() id}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link CoverageEligibilityRequest_Item#quantity() quantity}
   *    .facility(com.medplum.types.fhir.Reference) // optional {@link CoverageEligibilityRequest_Item#facility() facility}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest_Item#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest_Item#modifierExtension() modifierExtension}
   *    .detail(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CoverageEligibilityRequest_Item#detail() detail}
   *    .unitPrice(com.medplum.types.fhir.Money) // optional {@link CoverageEligibilityRequest_Item#unitPrice() unitPrice}
   *    .productOrService(com.medplum.types.fhir.CodeableConcept) // optional {@link CoverageEligibilityRequest_Item#productOrService() productOrService}
   *    .diagnosis(List&amp;lt;com.medplum.types.fhir.CoverageEligibilityRequest_Diagnosis&amp;gt;) // optional {@link CoverageEligibilityRequest_Item#diagnosis() diagnosis}
   *    .modifier(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CoverageEligibilityRequest_Item#modifier() modifier}
   *    .supportingInfoSequence(List&amp;lt;com.medplum.types.fhir.PositiveInt&amp;gt;) // optional {@link CoverageEligibilityRequest_Item#supportingInfoSequence() supportingInfoSequence}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityRequest_Item builder
   */
  public static ImmutableCoverageEligibilityRequest_Item.Builder builder() {
    return new ImmutableCoverageEligibilityRequest_Item.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityRequest_Item CoverageEligibilityRequest_Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CoverageEligibilityRequest_Item", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_PROVIDER = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_QUANTITY = 0x8L;
    private static final long OPT_BIT_FACILITY = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_DETAIL = 0x80L;
    private static final long OPT_BIT_UNIT_PRICE = 0x100L;
    private static final long OPT_BIT_PRODUCT_OR_SERVICE = 0x200L;
    private static final long OPT_BIT_DIAGNOSIS = 0x400L;
    private static final long OPT_BIT_MODIFIER = 0x800L;
    private static final long OPT_BIT_SUPPORTING_INFO_SEQUENCE = 0x1000L;
    private long optBits;

    private @Nullable CodeableConcept category;
    private @Nullable Reference provider;
    private @Nullable String id;
    private @Nullable Quantity quantity;
    private @Nullable Reference facility;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> detail;
    private @Nullable Money unitPrice;
    private @Nullable CodeableConcept productOrService;
    private @Nullable List<CoverageEligibilityRequest_Diagnosis> diagnosis;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable List<PositiveInt> supportingInfoSequence;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    public final Builder provider(Reference provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = Objects.requireNonNull(provider, "provider");
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provider")
    public final Builder provider(Optional<? extends Reference> provider) {
      checkNotIsSet(providerIsSet(), "provider");
      this.provider = provider.orElse(null);
      optBits |= OPT_BIT_PROVIDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for chained invocation
     */
    public final Builder facility(Reference facility) {
      checkNotIsSet(facilityIsSet(), "facility");
      this.facility = Objects.requireNonNull(facility, "facility");
      optBits |= OPT_BIT_FACILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#facility() facility} to facility.
     * @param facility The value for facility
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("facility")
    public final Builder facility(Optional<? extends Reference> facility) {
      checkNotIsSet(facilityIsSet(), "facility");
      this.facility = facility.orElse(null);
      optBits |= OPT_BIT_FACILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(List<Reference> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends List<Reference>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    public final Builder unitPrice(Money unitPrice) {
      checkNotIsSet(unitPriceIsSet(), "unitPrice");
      this.unitPrice = Objects.requireNonNull(unitPrice, "unitPrice");
      optBits |= OPT_BIT_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unitPrice")
    public final Builder unitPrice(Optional<? extends Money> unitPrice) {
      checkNotIsSet(unitPriceIsSet(), "unitPrice");
      this.unitPrice = unitPrice.orElse(null);
      optBits |= OPT_BIT_UNIT_PRICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#productOrService() productOrService} to productOrService.
     * @param productOrService The value for productOrService
     * @return {@code this} builder for chained invocation
     */
    public final Builder productOrService(CodeableConcept productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = Objects.requireNonNull(productOrService, "productOrService");
      optBits |= OPT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#productOrService() productOrService} to productOrService.
     * @param productOrService The value for productOrService
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productOrService")
    public final Builder productOrService(Optional<? extends CodeableConcept> productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = productOrService.orElse(null);
      optBits |= OPT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosis(List<CoverageEligibilityRequest_Diagnosis> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = Objects.requireNonNull(diagnosis, "diagnosis");
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#diagnosis() diagnosis} to diagnosis.
     * @param diagnosis The value for diagnosis
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosis")
    public final Builder diagnosis(Optional<? extends List<CoverageEligibilityRequest_Diagnosis>> diagnosis) {
      checkNotIsSet(diagnosisIsSet(), "diagnosis");
      this.diagnosis = diagnosis.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifier(List<CodeableConcept> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = Objects.requireNonNull(modifier, "modifier");
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifier")
    public final Builder modifier(Optional<? extends List<CodeableConcept>> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = modifier.orElse(null);
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#supportingInfoSequence() supportingInfoSequence} to supportingInfoSequence.
     * @param supportingInfoSequence The value for supportingInfoSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfoSequence(List<PositiveInt> supportingInfoSequence) {
      checkNotIsSet(supportingInfoSequenceIsSet(), "supportingInfoSequence");
      this.supportingInfoSequence = Objects.requireNonNull(supportingInfoSequence, "supportingInfoSequence");
      optBits |= OPT_BIT_SUPPORTING_INFO_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_Item#supportingInfoSequence() supportingInfoSequence} to supportingInfoSequence.
     * @param supportingInfoSequence The value for supportingInfoSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfoSequence")
    public final Builder supportingInfoSequence(Optional<? extends List<PositiveInt>> supportingInfoSequence) {
      checkNotIsSet(supportingInfoSequenceIsSet(), "supportingInfoSequence");
      this.supportingInfoSequence = supportingInfoSequence.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO_SEQUENCE;
      return this;
    }

    /**
     * Builds a new {@link CoverageEligibilityRequest_Item CoverageEligibilityRequest_Item}.
     * @return An immutable instance of CoverageEligibilityRequest_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityRequest_Item build() {
      return new ImmutableCoverageEligibilityRequest_Item(
          category,
          provider,
          id,
          quantity,
          facility,
          extension,
          modifierExtension,
          detail,
          unitPrice,
          productOrService,
          diagnosis,
          modifier,
          supportingInfoSequence);
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean facilityIsSet() {
      return (optBits & OPT_BIT_FACILITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_OR_SERVICE) != 0;
    }

    private boolean diagnosisIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean supportingInfoSequenceIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO_SEQUENCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CoverageEligibilityRequest_Item is strict, attribute is already set: ".concat(name));
    }
  }
}
