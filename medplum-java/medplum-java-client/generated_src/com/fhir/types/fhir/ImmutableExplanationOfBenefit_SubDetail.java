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
 * Immutable implementation of {@link ExplanationOfBenefit_SubDetail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_SubDetail.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_SubDetail
    implements ExplanationOfBenefit_SubDetail {
  private final @Nullable List<CodeableConcept> programCode;
  private final @Nullable CodeableConcept revenue;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable PositiveInt sequence;
  private final CodeableConcept productOrService;
  private final @Nullable Money net;
  private final @Nullable CodeableConcept category;
  private final @Nullable Money unitPrice;
  private final @Nullable Decimal factor;
  private final @Nullable List<Reference> udi;
  private final @Nullable List<Extension> extension;
  private final @Nullable Quantity quantity;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;
  private final @Nullable String id;

  private ImmutableExplanationOfBenefit_SubDetail(
      @Nullable List<CodeableConcept> programCode,
      @Nullable CodeableConcept revenue,
      @Nullable List<CodeableConcept> modifier,
      @Nullable List<Extension> modifierExtension,
      @Nullable PositiveInt sequence,
      CodeableConcept productOrService,
      @Nullable Money net,
      @Nullable CodeableConcept category,
      @Nullable Money unitPrice,
      @Nullable Decimal factor,
      @Nullable List<Reference> udi,
      @Nullable List<Extension> extension,
      @Nullable Quantity quantity,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable List<ExplanationOfBenefit_Adjudication> adjudication,
      @Nullable String id) {
    this.programCode = programCode;
    this.revenue = revenue;
    this.modifier = modifier;
    this.modifierExtension = modifierExtension;
    this.sequence = sequence;
    this.productOrService = productOrService;
    this.net = net;
    this.category = category;
    this.unitPrice = unitPrice;
    this.factor = factor;
    this.udi = udi;
    this.extension = extension;
    this.quantity = quantity;
    this.noteNumber = noteNumber;
    this.adjudication = adjudication;
    this.id = id;
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
   * @return The value of the {@code revenue} attribute
   */
  @JsonProperty("revenue")
  @Override
  public Optional<CodeableConcept> revenue() {
    return Optional.ofNullable(revenue);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code net} attribute
   */
  @JsonProperty("net")
  @Override
  public Optional<Money> net() {
    return Optional.ofNullable(net);
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
   * @return The value of the {@code unitPrice} attribute
   */
  @JsonProperty("unitPrice")
  @Override
  public Optional<Money> unitPrice() {
    return Optional.ofNullable(unitPrice);
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
   * @return The value of the {@code udi} attribute
   */
  @JsonProperty("udi")
  @Override
  public Optional<List<Reference>> udi() {
    return Optional.ofNullable(udi);
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
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code noteNumber} attribute
   */
  @JsonProperty("noteNumber")
  @Override
  public Optional<List<PositiveInt>> noteNumber() {
    return Optional.ofNullable(noteNumber);
  }

  /**
   * @return The value of the {@code adjudication} attribute
   */
  @JsonProperty("adjudication")
  @Override
  public Optional<List<ExplanationOfBenefit_Adjudication>> adjudication() {
    return Optional.ofNullable(adjudication);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#programCode() programCode} attribute.
   * @param value The value for programCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withProgramCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "programCode");
    if (this.programCode == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        newValue,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#programCode() programCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for programCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withProgramCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.programCode == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        value,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#revenue() revenue} attribute.
   * @param value The value for revenue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withRevenue(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "revenue");
    if (this.revenue == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        newValue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#revenue() revenue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for revenue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withRevenue(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.revenue == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        value,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        newValue,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        value,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        newValue,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        value,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        newValue,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        value,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_SubDetail#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withProductOrService(CodeableConcept value) {
    if (this.productOrService == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        newValue,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        newValue,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        value,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        newValue,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        value,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        newValue,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        value,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        newValue,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        value,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#udi() udi} attribute.
   * @param value The value for udi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withUdi(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "udi");
    if (this.udi == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        newValue,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#udi() udi} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udi
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withUdi(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.udi == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        value,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        newValue,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        value,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        newValue,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        value,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withNoteNumber(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        newValue,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withNoteNumber(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        value,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withAdjudication(List<ExplanationOfBenefit_Adjudication> value) {
    @Nullable List<ExplanationOfBenefit_Adjudication> newValue = Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail withAdjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> optional) {
    @Nullable List<ExplanationOfBenefit_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_SubDetail(
        this.programCode,
        this.revenue,
        this.modifier,
        this.modifierExtension,
        this.sequence,
        this.productOrService,
        this.net,
        this.category,
        this.unitPrice,
        this.factor,
        this.udi,
        this.extension,
        this.quantity,
        this.noteNumber,
        this.adjudication,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_SubDetail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_SubDetail
        && equalTo((ImmutableExplanationOfBenefit_SubDetail) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_SubDetail another) {
    return Objects.equals(programCode, another.programCode)
        && Objects.equals(revenue, another.revenue)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(sequence, another.sequence)
        && productOrService.equals(another.productOrService)
        && Objects.equals(net, another.net)
        && Objects.equals(category, another.category)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(factor, another.factor)
        && Objects.equals(udi, another.udi)
        && Objects.equals(extension, another.extension)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(adjudication, another.adjudication)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code programCode}, {@code revenue}, {@code modifier}, {@code modifierExtension}, {@code sequence}, {@code productOrService}, {@code net}, {@code category}, {@code unitPrice}, {@code factor}, {@code udi}, {@code extension}, {@code quantity}, {@code noteNumber}, {@code adjudication}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(programCode);
    h += (h << 5) + Objects.hashCode(revenue);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + Objects.hashCode(net);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(udi);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(adjudication);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_SubDetail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_SubDetail{");
    if (programCode != null) {
      builder.append("programCode=").append(programCode);
    }
    if (revenue != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("revenue=").append(revenue);
    }
    if (modifier != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (sequence != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (builder.length() > 31) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (net != null) {
      builder.append(", ");
      builder.append("net=").append(net);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (unitPrice != null) {
      builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (udi != null) {
      builder.append(", ");
      builder.append("udi=").append(udi);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (noteNumber != null) {
      builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
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
  @Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_SubDetail {
    @Nullable Optional<List<CodeableConcept>> programCode = Optional.empty();
    boolean programCodeIsSet;
    @Nullable Optional<CodeableConcept> revenue = Optional.empty();
    boolean revenueIsSet;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable CodeableConcept productOrService;
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<List<Reference>> udi = Optional.empty();
    boolean udiIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Adjudication>> adjudication = Optional.empty();
    boolean adjudicationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("programCode")
    public void setProgramCode(Optional<List<CodeableConcept>> programCode) {
      this.programCode = programCode;
      this.programCodeIsSet = true;
    }
    @JsonProperty("revenue")
    public void setRevenue(Optional<CodeableConcept> revenue) {
      this.revenue = revenue;
      this.revenueIsSet = true;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @JsonProperty("net")
    public void setNet(Optional<Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("unitPrice")
    public void setUnitPrice(Optional<Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @JsonProperty("udi")
    public void setUdi(Optional<List<Reference>> udi) {
      this.udi = udi;
      this.udiIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("noteNumber")
    public void setNoteNumber(Optional<List<PositiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(Optional<List<ExplanationOfBenefit_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> programCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> revenue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> udi() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_SubDetail fromJson(Json json) {
    ImmutableExplanationOfBenefit_SubDetail.Builder builder = ((ImmutableExplanationOfBenefit_SubDetail.Builder) ImmutableExplanationOfBenefit_SubDetail.builder());
    if (json.programCodeIsSet) {
      builder.programCode(json.programCode);
    }
    if (json.revenueIsSet) {
      builder.revenue(json.revenue);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.udiIsSet) {
      builder.udi(json.udi);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableExplanationOfBenefit_SubDetail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_SubDetail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_SubDetail instance
   */
  public static ExplanationOfBenefit_SubDetail copyOf(ExplanationOfBenefit_SubDetail instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_SubDetail) {
      return (ImmutableExplanationOfBenefit_SubDetail) instance;
    }
    return ((ImmutableExplanationOfBenefit_SubDetail.Builder) ImmutableExplanationOfBenefit_SubDetail.builder())
        .programCode(instance.programCode())
        .revenue(instance.revenue())
        .modifier(instance.modifier())
        .modifierExtension(instance.modifierExtension())
        .sequence(instance.sequence())
        .productOrService(instance.productOrService())
        .net(instance.net())
        .category(instance.category())
        .unitPrice(instance.unitPrice())
        .factor(instance.factor())
        .udi(instance.udi())
        .extension(instance.extension())
        .quantity(instance.quantity())
        .noteNumber(instance.noteNumber())
        .adjudication(instance.adjudication())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_SubDetail ExplanationOfBenefit_SubDetail}.
   * <pre>
   * ImmutableExplanationOfBenefit_SubDetail.builder()
   *    .programCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#programCode() programCode}
   *    .revenue(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_SubDetail#revenue() revenue}
   *    .modifier(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#modifier() modifier}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension}
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link ExplanationOfBenefit_SubDetail#sequence() sequence}
   *    .productOrService(com.fhir.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_SubDetail#productOrService() productOrService}
   *    .net(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_SubDetail#net() net}
   *    .category(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_SubDetail#category() category}
   *    .unitPrice(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice}
   *    .factor(com.fhir.types.fhir.Decimal) // optional {@link ExplanationOfBenefit_SubDetail#factor() factor}
   *    .udi(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#udi() udi}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#extension() extension}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link ExplanationOfBenefit_SubDetail#quantity() quantity}
   *    .noteNumber(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber}
   *    .adjudication(List&amp;lt;com.fhir.types.fhir.ExplanationOfBenefit_Adjudication&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication}
   *    .id(String) // optional {@link ExplanationOfBenefit_SubDetail#id() id}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_SubDetail builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableExplanationOfBenefit_SubDetail.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_SubDetail ExplanationOfBenefit_SubDetail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_PROGRAM_CODE = 0x1L;
    private static final long OPT_BIT_REVENUE = 0x2L;
    private static final long OPT_BIT_MODIFIER = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_SEQUENCE = 0x10L;
    private static final long OPT_BIT_NET = 0x20L;
    private static final long OPT_BIT_CATEGORY = 0x40L;
    private static final long OPT_BIT_UNIT_PRICE = 0x80L;
    private static final long OPT_BIT_FACTOR = 0x100L;
    private static final long OPT_BIT_UDI = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_QUANTITY = 0x800L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x1000L;
    private static final long OPT_BIT_ADJUDICATION = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<CodeableConcept> programCode;
    private @Nullable CodeableConcept revenue;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable PositiveInt sequence;
    private @Nullable CodeableConcept productOrService;
    private @Nullable Money net;
    private @Nullable CodeableConcept category;
    private @Nullable Money unitPrice;
    private @Nullable Decimal factor;
    private @Nullable List<Reference> udi;
    private @Nullable List<Extension> extension;
    private @Nullable Quantity quantity;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#programCode() programCode} to programCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#programCode() programCode} to programCode.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#revenue() revenue} to revenue.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#revenue() revenue} to revenue.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#sequence() sequence} to sequence.
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
     * Initializes the value for the {@link ExplanationOfBenefit_SubDetail#productOrService() productOrService} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#category() category} to category.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#category() category} to category.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#udi() udi} to udi.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#udi() udi} to udi.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder noteNumber(List<PositiveInt> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = Objects.requireNonNull(noteNumber, "noteNumber");
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("noteNumber")
    public final Builder noteNumber(Optional<? extends List<PositiveInt>> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = noteNumber.orElse(null);
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjudication(List<ExplanationOfBenefit_Adjudication> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = Objects.requireNonNull(adjudication, "adjudication");
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("adjudication")
    public final Builder adjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = adjudication.orElse(null);
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#id() id} to id.
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
     * Builds a new {@link ExplanationOfBenefit_SubDetail ExplanationOfBenefit_SubDetail}.
     * @return An immutable instance of ExplanationOfBenefit_SubDetail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_SubDetail build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_SubDetail(
          programCode,
          revenue,
          modifier,
          modifierExtension,
          sequence,
          productOrService,
          net,
          category,
          unitPrice,
          factor,
          udi,
          extension,
          quantity,
          noteNumber,
          adjudication,
          id);
    }

    private boolean programCodeIsSet() {
      return (optBits & OPT_BIT_PROGRAM_CODE) != 0;
    }

    private boolean revenueIsSet() {
      return (optBits & OPT_BIT_REVENUE) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean udiIsSet() {
      return (optBits & OPT_BIT_UDI) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_SubDetail is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ExplanationOfBenefit_SubDetail, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_SubDetail#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(CodeableConcept productOrService);
  }

  @Generated(from = "ExplanationOfBenefit_SubDetail", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal programCode(List<CodeableConcept> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#programCode() programCode} to programCode.
     * @param programCode The value for programCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal programCode(Optional<? extends List<CodeableConcept>> programCode);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal revenue(CodeableConcept revenue);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#revenue() revenue} to revenue.
     * @param revenue The value for revenue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal revenue(Optional<? extends CodeableConcept> revenue);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(List<CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(Optional<? extends List<CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(Money net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(Optional<? extends Money> net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(Money unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(Optional<? extends Money> unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(Decimal factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(Optional<? extends Decimal> factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    BuildFinal udi(List<Reference> udi);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal udi(Optional<? extends List<Reference>> udi);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(List<PositiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(Optional<? extends List<PositiveInt>> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(List<ExplanationOfBenefit_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link ExplanationOfBenefit_SubDetail ExplanationOfBenefit_SubDetail}.
     * @return An immutable instance of ExplanationOfBenefit_SubDetail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_SubDetail build();
  }
}
