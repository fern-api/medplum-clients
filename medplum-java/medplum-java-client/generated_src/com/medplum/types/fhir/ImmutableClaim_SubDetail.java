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
 * Immutable implementation of {@link Claim_SubDetail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_SubDetail.builder()}.
 */
@Generated(from = "Claim_SubDetail", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_SubDetail implements Claim_SubDetail {
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept category;
  private final @Nullable Quantity quantity;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable List<CodeableConcept> programCode;
  private final @Nullable List<Reference> udi;
  private final @Nullable CodeableConcept revenue;
  private final @Nullable Decimal factor;
  private final @Nullable Money unitPrice;
  private final @Nullable PositiveInt sequence;
  private final CodeableConcept productOrService;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Money net;

  private ImmutableClaim_SubDetail(
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept category,
      @Nullable Quantity quantity,
      @Nullable List<CodeableConcept> modifier,
      @Nullable List<CodeableConcept> programCode,
      @Nullable List<Reference> udi,
      @Nullable CodeableConcept revenue,
      @Nullable Decimal factor,
      @Nullable Money unitPrice,
      @Nullable PositiveInt sequence,
      CodeableConcept productOrService,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Money net) {
    this.extension = extension;
    this.category = category;
    this.quantity = quantity;
    this.modifier = modifier;
    this.programCode = programCode;
    this.udi = udi;
    this.revenue = revenue;
    this.factor = factor;
    this.unitPrice = unitPrice;
    this.sequence = sequence;
    this.productOrService = productOrService;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.net = net;
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code modifier} attribute
   */
  @JsonProperty("modifier")
  @Override
  public Optional<List<CodeableConcept>> modifier() {
    return Optional.ofNullable(modifier);
  }

  /**
   * @return The value of the {@code programCode} attribute
   */
  @JsonProperty("programCode")
  @Override
  public Optional<List<CodeableConcept>> programCode() {
    return Optional.ofNullable(programCode);
  }

  /**
   * @return The value of the {@code udi} attribute
   */
  @JsonProperty("udi")
  @Override
  public Optional<List<Reference>> udi() {
    return Optional.ofNullable(udi);
  }

  /**
   * @return The value of the {@code revenue} attribute
   */
  @JsonProperty("revenue")
  @Override
  public Optional<CodeableConcept> revenue() {
    return Optional.ofNullable(revenue);
  }

  /**
   * @return The value of the {@code factor} attribute
   */
  @JsonProperty("factor")
  @Override
  public Optional<Decimal> factor() {
    return Optional.ofNullable(factor);
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
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<PositiveInt> sequence() {
    return Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code productOrService} attribute
   */
  @JsonProperty("productOrService")
  @Override
  public CodeableConcept productOrService() {
    return productOrService;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code net} attribute
   */
  @JsonProperty("net")
  @Override
  public Optional<Money> net() {
    return Optional.ofNullable(net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_SubDetail(
        newValue,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_SubDetail(
        value,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        newValue,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        value,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        newValue,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        value,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        newValue,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        value,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#programCode() programCode} attribute.
   * @param value The value for programCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withProgramCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "programCode");
    if (this.programCode == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        newValue,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#programCode() programCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withProgramCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.programCode == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        value,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#udi() udi} attribute.
   * @param value The value for udi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withUdi(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "udi");
    if (this.udi == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        newValue,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#udi() udi} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udi
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withUdi(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.udi == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        value,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#revenue() revenue} attribute.
   * @param value The value for revenue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withRevenue(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "revenue");
    if (this.revenue == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        newValue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#revenue() revenue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for revenue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withRevenue(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.revenue == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        value,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        newValue,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        value,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        newValue,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        value,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        newValue,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        value,
        this.productOrService,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim_SubDetail#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim_SubDetail withProductOrService(CodeableConcept value) {
    if (this.productOrService == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        newValue,
        this.modifierExtension,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        newValue,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        value,
        this.id,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        newValue,
        this.net);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        value,
        this.net);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_SubDetail#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_SubDetail withNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_SubDetail#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_SubDetail withNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableClaim_SubDetail(
        this.extension,
        this.category,
        this.quantity,
        this.modifier,
        this.programCode,
        this.udi,
        this.revenue,
        this.factor,
        this.unitPrice,
        this.sequence,
        this.productOrService,
        this.modifierExtension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_SubDetail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_SubDetail
        && equalTo((ImmutableClaim_SubDetail) another);
  }

  private boolean equalTo(ImmutableClaim_SubDetail another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(category, another.category)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(programCode, another.programCode)
        && Objects.equals(udi, another.udi)
        && Objects.equals(revenue, another.revenue)
        && Objects.equals(factor, another.factor)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(sequence, another.sequence)
        && productOrService.equals(another.productOrService)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(net, another.net);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code category}, {@code quantity}, {@code modifier}, {@code programCode}, {@code udi}, {@code revenue}, {@code factor}, {@code unitPrice}, {@code sequence}, {@code productOrService}, {@code modifierExtension}, {@code id}, {@code net}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(programCode);
    h += (h << 5) + Objects.hashCode(udi);
    h += (h << 5) + Objects.hashCode(revenue);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(net);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_SubDetail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Claim_SubDetail{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (category != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (quantity != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (modifier != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (programCode != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("programCode=").append(programCode);
    }
    if (udi != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("udi=").append(udi);
    }
    if (revenue != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("revenue=").append(revenue);
    }
    if (factor != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (unitPrice != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (sequence != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (net != null) {
      builder.append(", ");
      builder.append("net=").append(net);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Claim_SubDetail", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Claim_SubDetail {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<List<CodeableConcept>> programCode = Optional.empty();
    boolean programCodeIsSet;
    @Nullable Optional<List<Reference>> udi = Optional.empty();
    boolean udiIsSet;
    @Nullable Optional<CodeableConcept> revenue = Optional.empty();
    boolean revenueIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable CodeableConcept productOrService;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("programCode")
    public void setProgramCode(Optional<List<CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
    }
    @JsonProperty("udi")
    public void setUdi(Optional<List<Reference>> udi) {
      this.udi = udi;
      this.udiIsSet = true;
    }
    @JsonProperty("revenue")
    public void setRevenue(Optional<CodeableConcept> revenue) {
      this.revenue = revenue;
      this.revenueIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @JsonProperty("unitPrice")
    public void setUnitPrice(Optional<Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("net")
    public void setNet(Optional<Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> udi() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> revenue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaim_SubDetail fromJson(Json json) {
    ImmutableClaim_SubDetail.Builder builder = ((ImmutableClaim_SubDetail.Builder) ImmutableClaim_SubDetail.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.udiIsSet) {
      builder.udi(json.udi);
    }
    if (json.revenueIsSet) {
      builder.revenue(json.revenue);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    return (ImmutableClaim_SubDetail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_SubDetail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_SubDetail instance
   */
  public static Claim_SubDetail copyOf(Claim_SubDetail instance) {
    if (instance instanceof ImmutableClaim_SubDetail) {
      return (ImmutableClaim_SubDetail) instance;
    }
    return ((ImmutableClaim_SubDetail.Builder) ImmutableClaim_SubDetail.builder())
        .extension(instance.extension())
        .category(instance.category())
        .quantity(instance.quantity())
        .modifier(instance.modifier())
        .programCode(instance.programCode())
        .udi(instance.udi())
        .revenue(instance.revenue())
        .factor(instance.factor())
        .unitPrice(instance.unitPrice())
        .sequence(instance.sequence())
        .productOrService(instance.productOrService())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .net(instance.net())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_SubDetail Claim_SubDetail}.
   * <pre>
   * ImmutableClaim_SubDetail.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Claim_SubDetail#extension() extension}
   *    .category(com.medplum.types.fhir.CodeableConcept) // optional {@link Claim_SubDetail#category() category}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link Claim_SubDetail#quantity() quantity}
   *    .modifier(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Claim_SubDetail#modifier() modifier}
   *    .programCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Claim_SubDetail#programCode() programCode}
   *    .udi(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Claim_SubDetail#udi() udi}
   *    .revenue(com.medplum.types.fhir.CodeableConcept) // optional {@link Claim_SubDetail#revenue() revenue}
   *    .factor(com.medplum.types.fhir.Decimal) // optional {@link Claim_SubDetail#factor() factor}
   *    .unitPrice(com.medplum.types.fhir.Money) // optional {@link Claim_SubDetail#unitPrice() unitPrice}
   *    .sequence(com.medplum.types.fhir.PositiveInt) // optional {@link Claim_SubDetail#sequence() sequence}
   *    .productOrService(com.medplum.types.fhir.CodeableConcept) // required {@link Claim_SubDetail#productOrService() productOrService}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Claim_SubDetail#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Claim_SubDetail#id() id}
   *    .net(com.medplum.types.fhir.Money) // optional {@link Claim_SubDetail#net() net}
   *    .build();
   * </pre>
   * @return A new Claim_SubDetail builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableClaim_SubDetail.Builder();
  }

  /**
   * Builds instances of type {@link Claim_SubDetail Claim_SubDetail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Claim_SubDetail", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_CATEGORY = 0x2L;
    private static final long OPT_BIT_QUANTITY = 0x4L;
    private static final long OPT_BIT_MODIFIER = 0x8L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x10L;
    private static final long OPT_BIT_UDI = 0x20L;
    private static final long OPT_BIT_REVENUE = 0x40L;
    private static final long OPT_BIT_FACTOR = 0x80L;
    private static final long OPT_BIT_UNIT_PRICE = 0x100L;
    private static final long OPT_BIT_SEQUENCE = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_NET = 0x1000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept category;
    private @Nullable Quantity quantity;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable List<CodeableConcept> programCode;
    private @Nullable List<Reference> udi;
    private @Nullable CodeableConcept revenue;
    private @Nullable Decimal factor;
    private @Nullable Money unitPrice;
    private @Nullable PositiveInt sequence;
    private @Nullable CodeableConcept productOrService;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Money net;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_SubDetail#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_SubDetail#category() category} to category.
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
     * Initializes the optional value {@link Claim_SubDetail#category() category} to category.
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
     * Initializes the optional value {@link Claim_SubDetail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link Claim_SubDetail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link Claim_SubDetail#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link Claim_SubDetail#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link Claim_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder programCode(List<CodeableConcept> programCode) {
      checkNotIsSet(programCodeIsSet(), "programCode");
      this.programCode = Objects.requireNonNull(programCode, "programCode");
      optBits |= OPT_BIT_PROGRAM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("programCode")
    public final Builder programCode(Optional<? extends List<CodeableConcept>> programCode) {
      checkNotIsSet(programCodeIsSet(), "programCode");
      this.programCode = programCode.orElse(null);
      optBits |= OPT_BIT_PROGRAM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    public final Builder udi(List<Reference> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = Objects.requireNonNull(udi, "udi");
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("udi")
    public final Builder udi(Optional<? extends List<Reference>> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = udi.orElse(null);
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    public final Builder revenue(CodeableConcept revenue) {
      checkNotIsSet(revenueIsSet(), "revenue");
      this.revenue = Objects.requireNonNull(revenue, "revenue");
      optBits |= OPT_BIT_REVENUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("revenue")
    public final Builder revenue(Optional<? extends CodeableConcept> revenue) {
      checkNotIsSet(revenueIsSet(), "revenue");
      this.revenue = revenue.orElse(null);
      optBits |= OPT_BIT_REVENUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    public final Builder factor(Decimal factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = Objects.requireNonNull(factor, "factor");
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("factor")
    public final Builder factor(Optional<? extends Decimal> factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = factor.orElse(null);
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link Claim_SubDetail#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link Claim_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(PositiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<? extends PositiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link Claim_SubDetail#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productOrService")
    public final Builder productOrService(CodeableConcept productOrService) {
      checkNotIsSet(productOrServiceIsSet(), "productOrService");
      this.productOrService = Objects.requireNonNull(productOrService, "productOrService");
      initBits &= ~INIT_BIT_PRODUCT_OR_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_SubDetail#id() id} to id.
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
     * Initializes the optional value {@link Claim_SubDetail#id() id} to id.
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
     * Initializes the optional value {@link Claim_SubDetail#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    public final Builder net(Money net) {
      checkNotIsSet(netIsSet(), "net");
      this.net = Objects.requireNonNull(net, "net");
      optBits |= OPT_BIT_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_SubDetail#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("net")
    public final Builder net(Optional<? extends Money> net) {
      checkNotIsSet(netIsSet(), "net");
      this.net = net.orElse(null);
      optBits |= OPT_BIT_NET;
      return this;
    }

    /**
     * Builds a new {@link Claim_SubDetail Claim_SubDetail}.
     * @return An immutable instance of Claim_SubDetail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Claim_SubDetail build() {
      checkRequiredAttributes();
      return new ImmutableClaim_SubDetail(
          extension,
          category,
          quantity,
          modifier,
          programCode,
          udi,
          revenue,
          factor,
          unitPrice,
          sequence,
          productOrService,
          modifierExtension,
          id,
          net);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean udiIsSet() {
      return (optBits & OPT_BIT_UDI) != 0;
    }

    private boolean revenueIsSet() {
      return (optBits & OPT_BIT_REVENUE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Claim_SubDetail is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build Claim_SubDetail, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Claim_SubDetail", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link Claim_SubDetail#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(CodeableConcept productOrService);
  }

  @Generated(from = "Claim_SubDetail", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim_SubDetail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Claim_SubDetail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Claim_SubDetail#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link Claim_SubDetail#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link Claim_SubDetail#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link Claim_SubDetail#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link Claim_SubDetail#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(List<CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link Claim_SubDetail#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(Optional<? extends List<CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link Claim_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programCode(List<CodeableConcept> programCode);

    /**
     * Initializes the optional value {@link Claim_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programCode(Optional<? extends List<CodeableConcept>> programCode);

    /**
     * Initializes the optional value {@link Claim_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udi(List<Reference> udi);

    /**
     * Initializes the optional value {@link Claim_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udi(Optional<? extends List<Reference>> udi);

    /**
     * Initializes the optional value {@link Claim_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal revenue(CodeableConcept revenue);

    /**
     * Initializes the optional value {@link Claim_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal revenue(Optional<? extends CodeableConcept> revenue);

    /**
     * Initializes the optional value {@link Claim_SubDetail#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(Decimal factor);

    /**
     * Initializes the optional value {@link Claim_SubDetail#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(Optional<? extends Decimal> factor);

    /**
     * Initializes the optional value {@link Claim_SubDetail#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(Money unitPrice);

    /**
     * Initializes the optional value {@link Claim_SubDetail#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(Optional<? extends Money> unitPrice);

    /**
     * Initializes the optional value {@link Claim_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link Claim_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link Claim_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_SubDetail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Claim_SubDetail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Claim_SubDetail#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(Money net);

    /**
     * Initializes the optional value {@link Claim_SubDetail#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(Optional<? extends Money> net);

    /**
     * Builds a new {@link Claim_SubDetail Claim_SubDetail}.
     * @return An immutable instance of Claim_SubDetail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim_SubDetail build();
  }
}