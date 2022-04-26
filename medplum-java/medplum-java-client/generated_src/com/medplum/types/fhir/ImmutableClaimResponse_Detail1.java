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
 * Immutable implementation of {@link ClaimResponse_Detail1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Detail1.builder()}.
 */
@Generated(from = "ClaimResponse_Detail1", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Detail1 implements ClaimResponse_Detail1 {
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable Money unitPrice;
  private final CodeableConcept productOrService;
  private final @Nullable String id;
  private final @Nullable Money net;
  private final List<ClaimResponse_Adjudication> adjudication;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable Decimal factor;
  private final @Nullable List<ClaimResponse_SubDetail1> subDetail;
  private final @Nullable Quantity quantity;
  private final @Nullable List<Extension> extension;

  private ImmutableClaimResponse_Detail1(
      @Nullable List<CodeableConcept> modifier,
      @Nullable Money unitPrice,
      CodeableConcept productOrService,
      @Nullable String id,
      @Nullable Money net,
      List<ClaimResponse_Adjudication> adjudication,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable Decimal factor,
      @Nullable List<ClaimResponse_SubDetail1> subDetail,
      @Nullable Quantity quantity,
      @Nullable List<Extension> extension) {
    this.modifier = modifier;
    this.unitPrice = unitPrice;
    this.productOrService = productOrService;
    this.id = id;
    this.net = net;
    this.adjudication = adjudication;
    this.modifierExtension = modifierExtension;
    this.noteNumber = noteNumber;
    this.factor = factor;
    this.subDetail = subDetail;
    this.quantity = quantity;
    this.extension = extension;
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
  public CodeableConcept productOrService() {
    return productOrService;
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
   * @return The value of the {@code adjudication} attribute
   */
  @JsonProperty("adjudication")
  @Override
  public List<ClaimResponse_Adjudication> adjudication() {
    return adjudication;
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
   * @return The value of the {@code noteNumber} attribute
   */
  @JsonProperty("noteNumber")
  @Override
  public Optional<List<PositiveInt>> noteNumber() {
    return Optional.ofNullable(noteNumber);
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
   * @return The value of the {@code subDetail} attribute
   */
  @JsonProperty("subDetail")
  @Override
  public Optional<List<ClaimResponse_SubDetail1>> subDetail() {
    return Optional.ofNullable(subDetail);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        newValue,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableClaimResponse_Detail1(
        value,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        newValue,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        value,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Detail1#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withProductOrService(CodeableConcept value) {
    if (this.productOrService == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        newValue,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        newValue,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        value,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        newValue,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        value,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_Detail1#adjudication() adjudication}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withAdjudication(ClaimResponse_Adjudication... elements) {
    List<ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        newValue,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_Detail1#adjudication() adjudication}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of adjudication elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withAdjudication(Iterable<? extends ClaimResponse_Adjudication> elements) {
    if (this.adjudication == elements) return this;
    List<ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        newValue,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        newValue,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        value,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withNoteNumber(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        newValue,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withNoteNumber(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        value,
        this.factor,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        newValue,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        value,
        this.subDetail,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#subDetail() subDetail} attribute.
   * @param value The value for subDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withSubDetail(List<ClaimResponse_SubDetail1> value) {
    @Nullable List<ClaimResponse_SubDetail1> newValue = Objects.requireNonNull(value, "subDetail");
    if (this.subDetail == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        newValue,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#subDetail() subDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withSubDetail(Optional<? extends List<ClaimResponse_SubDetail1>> optional) {
    @Nullable List<ClaimResponse_SubDetail1> value = optional.orElse(null);
    if (this.subDetail == value) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        value,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail1 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail1 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Detail1(
        this.modifier,
        this.unitPrice,
        this.productOrService,
        this.id,
        this.net,
        this.adjudication,
        this.modifierExtension,
        this.noteNumber,
        this.factor,
        this.subDetail,
        this.quantity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Detail1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Detail1
        && equalTo((ImmutableClaimResponse_Detail1) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Detail1 another) {
    return Objects.equals(modifier, another.modifier)
        && Objects.equals(unitPrice, another.unitPrice)
        && productOrService.equals(another.productOrService)
        && Objects.equals(id, another.id)
        && Objects.equals(net, another.net)
        && adjudication.equals(another.adjudication)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(factor, another.factor)
        && Objects.equals(subDetail, another.subDetail)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifier}, {@code unitPrice}, {@code productOrService}, {@code id}, {@code net}, {@code adjudication}, {@code modifierExtension}, {@code noteNumber}, {@code factor}, {@code subDetail}, {@code quantity}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(net);
    h += (h << 5) + adjudication.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(subDetail);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Detail1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_Detail1{");
    if (modifier != null) {
      builder.append("modifier=").append(modifier);
    }
    if (unitPrice != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("productOrService=").append(productOrService);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (net != null) {
      builder.append(", ");
      builder.append("net=").append(net);
    }
    builder.append(", ");
    builder.append("adjudication=").append(adjudication);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (noteNumber != null) {
      builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (subDetail != null) {
      builder.append(", ");
      builder.append("subDetail=").append(subDetail);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse_Detail1", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse_Detail1 {
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable CodeableConcept productOrService;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @Nullable List<ClaimResponse_Adjudication> adjudication = Collections.emptyList();
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<List<ClaimResponse_SubDetail1>> subDetail = Optional.empty();
    boolean subDetailIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifier")
    public void setModifier(Optional<List<CodeableConcept>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("unitPrice")
    public void setUnitPrice(Optional<Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
      this.productOrService = productOrService;
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
    @JsonProperty("adjudication")
    public void setAdjudication(List<ClaimResponse_Adjudication> adjudication) {
      this.adjudication = adjudication;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("noteNumber")
    public void setNoteNumber(Optional<List<PositiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @JsonProperty("subDetail")
    public void setSubDetail(Optional<List<ClaimResponse_SubDetail1>> subDetail) {
      this.subDetail = subDetail;
      this.subDetailIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public List<ClaimResponse_Adjudication> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_SubDetail1>> subDetail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Detail1 fromJson(Json json) {
    ImmutableClaimResponse_Detail1.Builder builder = ((ImmutableClaimResponse_Detail1.Builder) ImmutableClaimResponse_Detail1.builder());
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.adjudication != null) {
      builder.addAllAdjudication(json.adjudication);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.subDetailIsSet) {
      builder.subDetail(json.subDetail);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableClaimResponse_Detail1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Detail1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Detail1 instance
   */
  public static ClaimResponse_Detail1 copyOf(ClaimResponse_Detail1 instance) {
    if (instance instanceof ImmutableClaimResponse_Detail1) {
      return (ImmutableClaimResponse_Detail1) instance;
    }
    return ((ImmutableClaimResponse_Detail1.Builder) ImmutableClaimResponse_Detail1.builder())
        .modifier(instance.modifier())
        .unitPrice(instance.unitPrice())
        .productOrService(instance.productOrService())
        .id(instance.id())
        .net(instance.net())
        .addAllAdjudication(instance.adjudication())
        .modifierExtension(instance.modifierExtension())
        .noteNumber(instance.noteNumber())
        .factor(instance.factor())
        .subDetail(instance.subDetail())
        .quantity(instance.quantity())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Detail1 ClaimResponse_Detail1}.
   * <pre>
   * ImmutableClaimResponse_Detail1.builder()
   *    .modifier(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ClaimResponse_Detail1#modifier() modifier}
   *    .unitPrice(com.medplum.types.fhir.Money) // optional {@link ClaimResponse_Detail1#unitPrice() unitPrice}
   *    .productOrService(com.medplum.types.fhir.CodeableConcept) // required {@link ClaimResponse_Detail1#productOrService() productOrService}
   *    .id(String) // optional {@link ClaimResponse_Detail1#id() id}
   *    .net(com.medplum.types.fhir.Money) // optional {@link ClaimResponse_Detail1#net() net}
   *    .addAdjudication|addAllAdjudication(com.medplum.types.fhir.ClaimResponse_Adjudication) // {@link ClaimResponse_Detail1#adjudication() adjudication} elements
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Detail1#modifierExtension() modifierExtension}
   *    .noteNumber(List&amp;lt;com.medplum.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_Detail1#noteNumber() noteNumber}
   *    .factor(com.medplum.types.fhir.Decimal) // optional {@link ClaimResponse_Detail1#factor() factor}
   *    .subDetail(List&amp;lt;com.medplum.types.fhir.ClaimResponse_SubDetail1&amp;gt;) // optional {@link ClaimResponse_Detail1#subDetail() subDetail}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link ClaimResponse_Detail1#quantity() quantity}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Detail1#extension() extension}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Detail1 builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableClaimResponse_Detail1.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Detail1 ClaimResponse_Detail1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClaimResponse_Detail1", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_MODIFIER = 0x1L;
    private static final long OPT_BIT_UNIT_PRICE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_NET = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x20L;
    private static final long OPT_BIT_FACTOR = 0x40L;
    private static final long OPT_BIT_SUB_DETAIL = 0x80L;
    private static final long OPT_BIT_QUANTITY = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<CodeableConcept> modifier;
    private @Nullable Money unitPrice;
    private @Nullable CodeableConcept productOrService;
    private @Nullable String id;
    private @Nullable Money net;
    private final List<ClaimResponse_Adjudication> adjudication = new ArrayList<ClaimResponse_Adjudication>();
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable Decimal factor;
    private @Nullable List<ClaimResponse_SubDetail1> subDetail;
    private @Nullable Quantity quantity;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the value for the {@link ClaimResponse_Detail1#productOrService() productOrService} attribute.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#net() net} to net.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#net() net} to net.
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
     * Adds one element to {@link ClaimResponse_Detail1#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(ClaimResponse_Adjudication element) {
      this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      return this;
    }

    /**
     * Adds elements to {@link ClaimResponse_Detail1#adjudication() adjudication} list.
     * @param elements An array of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(ClaimResponse_Adjudication... elements) {
      for (ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ClaimResponse_Detail1#adjudication() adjudication} list.
     * @param elements An iterable of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAdjudication(Iterable<? extends ClaimResponse_Adjudication> elements) {
      for (ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#factor() factor} to factor.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#factor() factor} to factor.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#subDetail() subDetail} to subDetail.
     * @param subDetail The value for subDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder subDetail(List<ClaimResponse_SubDetail1> subDetail) {
      checkNotIsSet(subDetailIsSet(), "subDetail");
      this.subDetail = Objects.requireNonNull(subDetail, "subDetail");
      optBits |= OPT_BIT_SUB_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#subDetail() subDetail} to subDetail.
     * @param subDetail The value for subDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subDetail")
    public final Builder subDetail(Optional<? extends List<ClaimResponse_SubDetail1>> subDetail) {
      checkNotIsSet(subDetailIsSet(), "subDetail");
      this.subDetail = subDetail.orElse(null);
      optBits |= OPT_BIT_SUB_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Detail1#extension() extension} to extension.
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
     * Builds a new {@link ClaimResponse_Detail1 ClaimResponse_Detail1}.
     * @return An immutable instance of ClaimResponse_Detail1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_Detail1 build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_Detail1(
          modifier,
          unitPrice,
          productOrService,
          id,
          net,
          createUnmodifiableList(true, adjudication),
          modifierExtension,
          noteNumber,
          factor,
          subDetail,
          quantity,
          extension);
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean subDetailIsSet() {
      return (optBits & OPT_BIT_SUB_DETAIL) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse_Detail1 is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ClaimResponse_Detail1, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClaimResponse_Detail1", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Detail1#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(CodeableConcept productOrService);
  }

  @Generated(from = "ClaimResponse_Detail1", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(List<CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(Optional<? extends List<CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(Money unitPrice);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(Optional<? extends Money> unitPrice);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(Money net);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(Optional<? extends Money> net);

    /**
     * Adds one element to {@link ClaimResponse_Detail1#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAdjudication(ClaimResponse_Adjudication element);

    /**
     * Adds elements to {@link ClaimResponse_Detail1#adjudication() adjudication} list.
     * @param elements An array of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAdjudication(ClaimResponse_Adjudication... elements);

    /**
     * Adds elements to {@link ClaimResponse_Detail1#adjudication() adjudication} list.
     * @param elements An iterable of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllAdjudication(Iterable<? extends ClaimResponse_Adjudication> elements);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(List<PositiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(Optional<? extends List<PositiveInt>> noteNumber);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(Decimal factor);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(Optional<? extends Decimal> factor);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#subDetail() subDetail} to subDetail.
     * @param subDetail The value for subDetail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subDetail(List<ClaimResponse_SubDetail1> subDetail);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#subDetail() subDetail} to subDetail.
     * @param subDetail The value for subDetail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subDetail(Optional<? extends List<ClaimResponse_SubDetail1>> subDetail);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Detail1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link ClaimResponse_Detail1 ClaimResponse_Detail1}.
     * @return An immutable instance of ClaimResponse_Detail1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_Detail1 build();
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
