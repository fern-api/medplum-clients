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
 * Immutable implementation of {@link ExplanationOfBenefit_SubDetail1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_SubDetail1.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_SubDetail1", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_SubDetail1
    implements ExplanationOfBenefit_SubDetail1 {
  private final CodeableConcept productOrService;
  private final @Nullable Money net;
  private final @Nullable Money unitPrice;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable Quantity quantity;
  private final @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> modifier;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Decimal factor;

  private ImmutableExplanationOfBenefit_SubDetail1(
      CodeableConcept productOrService,
      @Nullable Money net,
      @Nullable Money unitPrice,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable Quantity quantity,
      @Nullable List<ExplanationOfBenefit_Adjudication> adjudication,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> modifier,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Decimal factor) {
    this.productOrService = productOrService;
    this.net = net;
    this.unitPrice = unitPrice;
    this.noteNumber = noteNumber;
    this.quantity = quantity;
    this.adjudication = adjudication;
    this.extension = extension;
    this.modifier = modifier;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.factor = factor;
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
   * @return The value of the {@code unitPrice} attribute
   */
  @JsonProperty("unitPrice")
  @Override
  public Optional<Money> unitPrice() {
    return Optional.ofNullable(unitPrice);
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
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_SubDetail1#productOrService() productOrService} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for productOrService
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withProductOrService(CodeableConcept value) {
    if (this.productOrService == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "productOrService");
    return new ImmutableExplanationOfBenefit_SubDetail1(
        newValue,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        newValue,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        value,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        newValue,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        value,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withNoteNumber(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        newValue,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withNoteNumber(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        value,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        newValue,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        value,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withAdjudication(List<ExplanationOfBenefit_Adjudication> value) {
    @Nullable List<ExplanationOfBenefit_Adjudication> newValue = Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        newValue,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withAdjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> optional) {
    @Nullable List<ExplanationOfBenefit_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        value,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        newValue,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        value,
        this.modifier,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withModifier(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        newValue,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withModifier(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        value,
        this.modifierExtension,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        newValue,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        value,
        this.id,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        newValue,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        value,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_SubDetail1#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_SubDetail1 withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_SubDetail1#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_SubDetail1 withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableExplanationOfBenefit_SubDetail1(
        this.productOrService,
        this.net,
        this.unitPrice,
        this.noteNumber,
        this.quantity,
        this.adjudication,
        this.extension,
        this.modifier,
        this.modifierExtension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_SubDetail1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_SubDetail1
        && equalTo((ImmutableExplanationOfBenefit_SubDetail1) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_SubDetail1 another) {
    return productOrService.equals(another.productOrService)
        && Objects.equals(net, another.net)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(adjudication, another.adjudication)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(factor, another.factor);
  }

  /**
   * Computes a hash code from attributes: {@code productOrService}, {@code net}, {@code unitPrice}, {@code noteNumber}, {@code quantity}, {@code adjudication}, {@code extension}, {@code modifier}, {@code modifierExtension}, {@code id}, {@code factor}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + productOrService.hashCode();
    h += (h << 5) + Objects.hashCode(net);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(adjudication);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(factor);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_SubDetail1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_SubDetail1{");
    builder.append("productOrService=").append(productOrService);
    if (net != null) {
      builder.append(", ");
      builder.append("net=").append(net);
    }
    if (unitPrice != null) {
      builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (noteNumber != null) {
      builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (adjudication != null) {
      builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifier != null) {
      builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (factor != null) {
      builder.append(", ");
      builder.append("factor=").append(factor);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_SubDetail1", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_SubDetail1 {
    @Nullable CodeableConcept productOrService;
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Adjudication>> adjudication = Optional.empty();
    boolean adjudicationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @JsonProperty("productOrService")
    public void setProductOrService(CodeableConcept productOrService) {
      this.productOrService = productOrService;
    }
    @JsonProperty("net")
    public void setNet(Optional<Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @JsonProperty("unitPrice")
    public void setUnitPrice(Optional<Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @JsonProperty("noteNumber")
    public void setNoteNumber(Optional<List<PositiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(Optional<List<ExplanationOfBenefit_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @Override
    public CodeableConcept productOrService() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_SubDetail1 fromJson(Json json) {
    ImmutableExplanationOfBenefit_SubDetail1.Builder builder = ((ImmutableExplanationOfBenefit_SubDetail1.Builder) ImmutableExplanationOfBenefit_SubDetail1.builder());
    if (json.productOrService != null) {
      builder.productOrService(json.productOrService);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    return (ImmutableExplanationOfBenefit_SubDetail1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_SubDetail1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_SubDetail1 instance
   */
  public static ExplanationOfBenefit_SubDetail1 copyOf(ExplanationOfBenefit_SubDetail1 instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_SubDetail1) {
      return (ImmutableExplanationOfBenefit_SubDetail1) instance;
    }
    return ((ImmutableExplanationOfBenefit_SubDetail1.Builder) ImmutableExplanationOfBenefit_SubDetail1.builder())
        .productOrService(instance.productOrService())
        .net(instance.net())
        .unitPrice(instance.unitPrice())
        .noteNumber(instance.noteNumber())
        .quantity(instance.quantity())
        .adjudication(instance.adjudication())
        .extension(instance.extension())
        .modifier(instance.modifier())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .factor(instance.factor())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_SubDetail1 ExplanationOfBenefit_SubDetail1}.
   * <pre>
   * ImmutableExplanationOfBenefit_SubDetail1.builder()
   *    .productOrService(com.fhir.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_SubDetail1#productOrService() productOrService}
   *    .net(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_SubDetail1#net() net}
   *    .unitPrice(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_SubDetail1#unitPrice() unitPrice}
   *    .noteNumber(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail1#noteNumber() noteNumber}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link ExplanationOfBenefit_SubDetail1#quantity() quantity}
   *    .adjudication(List&amp;lt;com.fhir.types.fhir.ExplanationOfBenefit_Adjudication&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail1#adjudication() adjudication}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail1#extension() extension}
   *    .modifier(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail1#modifier() modifier}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_SubDetail1#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link ExplanationOfBenefit_SubDetail1#id() id}
   *    .factor(com.fhir.types.fhir.Decimal) // optional {@link ExplanationOfBenefit_SubDetail1#factor() factor}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_SubDetail1 builder
   */
  public static ProductOrServiceBuildStage builder() {
    return new ImmutableExplanationOfBenefit_SubDetail1.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_SubDetail1 ExplanationOfBenefit_SubDetail1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_SubDetail1", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProductOrServiceBuildStage, BuildFinal {
    private static final long INIT_BIT_PRODUCT_OR_SERVICE = 0x1L;
    private static final long OPT_BIT_NET = 0x1L;
    private static final long OPT_BIT_UNIT_PRICE = 0x2L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x4L;
    private static final long OPT_BIT_QUANTITY = 0x8L;
    private static final long OPT_BIT_ADJUDICATION = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_MODIFIER = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_FACTOR = 0x200L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept productOrService;
    private @Nullable Money net;
    private @Nullable Money unitPrice;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable Quantity quantity;
    private @Nullable List<ExplanationOfBenefit_Adjudication> adjudication;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> modifier;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Decimal factor;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit_SubDetail1#productOrService() productOrService} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#net() net} to net.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#adjudication() adjudication} to adjudication.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#adjudication() adjudication} to adjudication.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#modifier() modifier} to modifier.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#factor() factor} to factor.
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
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#factor() factor} to factor.
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
     * Builds a new {@link ExplanationOfBenefit_SubDetail1 ExplanationOfBenefit_SubDetail1}.
     * @return An immutable instance of ExplanationOfBenefit_SubDetail1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_SubDetail1 build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_SubDetail1(
          productOrService,
          net,
          unitPrice,
          noteNumber,
          quantity,
          adjudication,
          extension,
          modifier,
          modifierExtension,
          id,
          factor);
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean productOrServiceIsSet() {
      return (initBits & INIT_BIT_PRODUCT_OR_SERVICE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_SubDetail1 is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!productOrServiceIsSet()) attributes.add("productOrService");
      return "Cannot build ExplanationOfBenefit_SubDetail1, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_SubDetail1", generator = "Immutables")
  public interface ProductOrServiceBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_SubDetail1#productOrService() productOrService} attribute.
     * @param productOrService The value for productOrService 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productOrService(CodeableConcept productOrService);
  }

  @Generated(from = "ExplanationOfBenefit_SubDetail1", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for chained invocation
     */
    BuildFinal net(Money net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#net() net} to net.
     * @param net The value for net
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal net(Optional<? extends Money> net);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unitPrice(Money unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#unitPrice() unitPrice} to unitPrice.
     * @param unitPrice The value for unitPrice
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unitPrice(Optional<? extends Money> unitPrice);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal noteNumber(List<PositiveInt> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal noteNumber(Optional<? extends List<PositiveInt>> noteNumber);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjudication(List<ExplanationOfBenefit_Adjudication> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjudication(Optional<? extends List<ExplanationOfBenefit_Adjudication>> adjudication);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(List<CodeableConcept> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(Optional<? extends List<CodeableConcept>> modifier);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factor(Decimal factor);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_SubDetail1#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factor(Optional<? extends Decimal> factor);

    /**
     * Builds a new {@link ExplanationOfBenefit_SubDetail1 ExplanationOfBenefit_SubDetail1}.
     * @return An immutable instance of ExplanationOfBenefit_SubDetail1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_SubDetail1 build();
  }
}
