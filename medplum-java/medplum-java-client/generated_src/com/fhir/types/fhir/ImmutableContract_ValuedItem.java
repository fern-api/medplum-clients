package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Contract_ValuedItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_ValuedItem.builder()}.
 */
@Generated(from = "Contract_ValuedItem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_ValuedItem implements Contract_ValuedItem {
  private final @Nullable Reference responsible;
  private final @Nullable Decimal points;
  private final @Nullable Quantity quantity;
  private final @Nullable List<String> linkId;
  private final @Nullable Money unitPrice;
  private final @Nullable String payment;
  private final @Nullable DateTime paymentDate;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept entityCodeableConcept;
  private final @Nullable Reference entityReference;
  private final @Nullable Reference recipient;
  private final @Nullable String id;
  private final @Nullable Identifier identifier;
  private final @Nullable Money net;
  private final @Nullable DateTime effectiveTime;
  private final @Nullable List<UnsignedInt> securityLabelNumber;
  private final @Nullable Decimal factor;
  private final @Nullable List<Extension> extension;

  private ImmutableContract_ValuedItem(
      @Nullable Reference responsible,
      @Nullable Decimal points,
      @Nullable Quantity quantity,
      @Nullable List<String> linkId,
      @Nullable Money unitPrice,
      @Nullable String payment,
      @Nullable DateTime paymentDate,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept entityCodeableConcept,
      @Nullable Reference entityReference,
      @Nullable Reference recipient,
      @Nullable String id,
      @Nullable Identifier identifier,
      @Nullable Money net,
      @Nullable DateTime effectiveTime,
      @Nullable List<UnsignedInt> securityLabelNumber,
      @Nullable Decimal factor,
      @Nullable List<Extension> extension) {
    this.responsible = responsible;
    this.points = points;
    this.quantity = quantity;
    this.linkId = linkId;
    this.unitPrice = unitPrice;
    this.payment = payment;
    this.paymentDate = paymentDate;
    this.modifierExtension = modifierExtension;
    this.entityCodeableConcept = entityCodeableConcept;
    this.entityReference = entityReference;
    this.recipient = recipient;
    this.id = id;
    this.identifier = identifier;
    this.net = net;
    this.effectiveTime = effectiveTime;
    this.securityLabelNumber = securityLabelNumber;
    this.factor = factor;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code responsible} attribute
   */
  @JsonProperty("responsible")
  @Override
  public Optional<Reference> responsible() {
    return Optional.ofNullable(responsible);
  }

  /**
   * @return The value of the {@code points} attribute
   */
  @JsonProperty("points")
  @Override
  public Optional<Decimal> points() {
    return Optional.ofNullable(points);
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
   * @return The value of the {@code linkId} attribute
   */
  @JsonProperty("linkId")
  @Override
  public Optional<List<String>> linkId() {
    return Optional.ofNullable(linkId);
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
   * @return The value of the {@code payment} attribute
   */
  @JsonProperty("payment")
  @Override
  public Optional<String> payment() {
    return Optional.ofNullable(payment);
  }

  /**
   * @return The value of the {@code paymentDate} attribute
   */
  @JsonProperty("paymentDate")
  @Override
  public Optional<DateTime> paymentDate() {
    return Optional.ofNullable(paymentDate);
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
   * @return The value of the {@code entityCodeableConcept} attribute
   */
  @JsonProperty("entityCodeableConcept")
  @Override
  public Optional<CodeableConcept> entityCodeableConcept() {
    return Optional.ofNullable(entityCodeableConcept);
  }

  /**
   * @return The value of the {@code entityReference} attribute
   */
  @JsonProperty("entityReference")
  @Override
  public Optional<Reference> entityReference() {
    return Optional.ofNullable(entityReference);
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @JsonProperty("recipient")
  @Override
  public Optional<Reference> recipient() {
    return Optional.ofNullable(recipient);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code effectiveTime} attribute
   */
  @JsonProperty("effectiveTime")
  @Override
  public Optional<DateTime> effectiveTime() {
    return Optional.ofNullable(effectiveTime);
  }

  /**
   * @return The value of the {@code securityLabelNumber} attribute
   */
  @JsonProperty("securityLabelNumber")
  @Override
  public Optional<List<UnsignedInt>> securityLabelNumber() {
    return Optional.ofNullable(securityLabelNumber);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withResponsible(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "responsible");
    if (this.responsible == newValue) return this;
    return new ImmutableContract_ValuedItem(
        newValue,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#responsible() responsible} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withResponsible(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.responsible == value) return this;
    return new ImmutableContract_ValuedItem(
        value,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#points() points} attribute.
   * @param value The value for points
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withPoints(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "points");
    if (this.points == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        newValue,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#points() points} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for points
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withPoints(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.points == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        value,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        newValue,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        value,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withLinkId(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "linkId");
    if (this.linkId == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        newValue,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#linkId() linkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withLinkId(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.linkId == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        value,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#unitPrice() unitPrice} attribute.
   * @param value The value for unitPrice
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withUnitPrice(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "unitPrice");
    if (this.unitPrice == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        newValue,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#unitPrice() unitPrice} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unitPrice
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withUnitPrice(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.unitPrice == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        value,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#payment() payment} attribute.
   * @param value The value for payment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withPayment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "payment");
    if (Objects.equals(this.payment, newValue)) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        newValue,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#payment() payment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withPayment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.payment, value)) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        value,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#paymentDate() paymentDate} attribute.
   * @param value The value for paymentDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withPaymentDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "paymentDate");
    if (this.paymentDate == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        newValue,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#paymentDate() paymentDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withPaymentDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.paymentDate == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        value,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        newValue,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        value,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept} attribute.
   * @param value The value for entityCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withEntityCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "entityCodeableConcept");
    if (this.entityCodeableConcept == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        newValue,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entityCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withEntityCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.entityCodeableConcept == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        value,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#entityReference() entityReference} attribute.
   * @param value The value for entityReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withEntityReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "entityReference");
    if (this.entityReference == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        newValue,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#entityReference() entityReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for entityReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withEntityReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.entityReference == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        value,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withRecipient(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        newValue,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withRecipient(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        value,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        newValue,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        value,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        newValue,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        value,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#net() net} attribute.
   * @param value The value for net
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "net");
    if (this.net == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        newValue,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#net() net} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for net
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.net == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        value,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#effectiveTime() effectiveTime} attribute.
   * @param value The value for effectiveTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withEffectiveTime(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "effectiveTime");
    if (this.effectiveTime == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        newValue,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#effectiveTime() effectiveTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withEffectiveTime(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.effectiveTime == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        value,
        this.securityLabelNumber,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber} attribute.
   * @param value The value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withSecurityLabelNumber(List<UnsignedInt> value) {
    @Nullable List<UnsignedInt> newValue = Objects.requireNonNull(value, "securityLabelNumber");
    if (this.securityLabelNumber == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        newValue,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withSecurityLabelNumber(Optional<? extends List<UnsignedInt>> optional) {
    @Nullable List<UnsignedInt> value = optional.orElse(null);
    if (this.securityLabelNumber == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        value,
        this.factor,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ValuedItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ValuedItem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ValuedItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ValuedItem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_ValuedItem(
        this.responsible,
        this.points,
        this.quantity,
        this.linkId,
        this.unitPrice,
        this.payment,
        this.paymentDate,
        this.modifierExtension,
        this.entityCodeableConcept,
        this.entityReference,
        this.recipient,
        this.id,
        this.identifier,
        this.net,
        this.effectiveTime,
        this.securityLabelNumber,
        this.factor,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_ValuedItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_ValuedItem
        && equalTo((ImmutableContract_ValuedItem) another);
  }

  private boolean equalTo(ImmutableContract_ValuedItem another) {
    return Objects.equals(responsible, another.responsible)
        && Objects.equals(points, another.points)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(linkId, another.linkId)
        && Objects.equals(unitPrice, another.unitPrice)
        && Objects.equals(payment, another.payment)
        && Objects.equals(paymentDate, another.paymentDate)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(entityCodeableConcept, another.entityCodeableConcept)
        && Objects.equals(entityReference, another.entityReference)
        && Objects.equals(recipient, another.recipient)
        && Objects.equals(id, another.id)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(net, another.net)
        && Objects.equals(effectiveTime, another.effectiveTime)
        && Objects.equals(securityLabelNumber, another.securityLabelNumber)
        && Objects.equals(factor, another.factor)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code responsible}, {@code points}, {@code quantity}, {@code linkId}, {@code unitPrice}, {@code payment}, {@code paymentDate}, {@code modifierExtension}, {@code entityCodeableConcept}, {@code entityReference}, {@code recipient}, {@code id}, {@code identifier}, {@code net}, {@code effectiveTime}, {@code securityLabelNumber}, {@code factor}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(responsible);
    h += (h << 5) + Objects.hashCode(points);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(linkId);
    h += (h << 5) + Objects.hashCode(unitPrice);
    h += (h << 5) + Objects.hashCode(payment);
    h += (h << 5) + Objects.hashCode(paymentDate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(entityCodeableConcept);
    h += (h << 5) + Objects.hashCode(entityReference);
    h += (h << 5) + Objects.hashCode(recipient);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(net);
    h += (h << 5) + Objects.hashCode(effectiveTime);
    h += (h << 5) + Objects.hashCode(securityLabelNumber);
    h += (h << 5) + Objects.hashCode(factor);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_ValuedItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_ValuedItem{");
    if (responsible != null) {
      builder.append("responsible=").append(responsible);
    }
    if (points != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("points=").append(points);
    }
    if (quantity != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (linkId != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (unitPrice != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("unitPrice=").append(unitPrice);
    }
    if (payment != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("payment=").append(payment);
    }
    if (paymentDate != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("paymentDate=").append(paymentDate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (entityCodeableConcept != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("entityCodeableConcept=").append(entityCodeableConcept);
    }
    if (entityReference != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("entityReference=").append(entityReference);
    }
    if (recipient != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (net != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("net=").append(net);
    }
    if (effectiveTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("effectiveTime=").append(effectiveTime);
    }
    if (securityLabelNumber != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("securityLabelNumber=").append(securityLabelNumber);
    }
    if (factor != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("factor=").append(factor);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_ValuedItem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_ValuedItem {
    @Nullable Optional<Reference> responsible = Optional.empty();
    boolean responsibleIsSet;
    @Nullable Optional<Decimal> points = Optional.empty();
    boolean pointsIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<String>> linkId = Optional.empty();
    boolean linkIdIsSet;
    @Nullable Optional<Money> unitPrice = Optional.empty();
    boolean unitPriceIsSet;
    @Nullable Optional<String> payment = Optional.empty();
    boolean paymentIsSet;
    @Nullable Optional<DateTime> paymentDate = Optional.empty();
    boolean paymentDateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> entityCodeableConcept = Optional.empty();
    boolean entityCodeableConceptIsSet;
    @Nullable Optional<Reference> entityReference = Optional.empty();
    boolean entityReferenceIsSet;
    @Nullable Optional<Reference> recipient = Optional.empty();
    boolean recipientIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Money> net = Optional.empty();
    boolean netIsSet;
    @Nullable Optional<DateTime> effectiveTime = Optional.empty();
    boolean effectiveTimeIsSet;
    @Nullable Optional<List<UnsignedInt>> securityLabelNumber = Optional.empty();
    boolean securityLabelNumberIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("responsible")
    public void setResponsible(Optional<Reference> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @JsonProperty("points")
    public void setPoints(Optional<Decimal> points) {
      this.points = points;
      this.pointsIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("linkId")
    public void setLinkId(Optional<List<String>> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @JsonProperty("unitPrice")
    public void setUnitPrice(Optional<Money> unitPrice) {
      this.unitPrice = unitPrice;
      this.unitPriceIsSet = true;
    }
    @JsonProperty("payment")
    public void setPayment(Optional<String> payment) {
      this.payment = payment;
      this.paymentIsSet = true;
    }
    @JsonProperty("paymentDate")
    public void setPaymentDate(Optional<DateTime> paymentDate) {
      this.paymentDate = paymentDate;
      this.paymentDateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("entityCodeableConcept")
    public void setEntityCodeableConcept(Optional<CodeableConcept> entityCodeableConcept) {
      this.entityCodeableConcept = entityCodeableConcept;
      this.entityCodeableConceptIsSet = true;
    }
    @JsonProperty("entityReference")
    public void setEntityReference(Optional<Reference> entityReference) {
      this.entityReference = entityReference;
      this.entityReferenceIsSet = true;
    }
    @JsonProperty("recipient")
    public void setRecipient(Optional<Reference> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("net")
    public void setNet(Optional<Money> net) {
      this.net = net;
      this.netIsSet = true;
    }
    @JsonProperty("effectiveTime")
    public void setEffectiveTime(Optional<DateTime> effectiveTime) {
      this.effectiveTime = effectiveTime;
      this.effectiveTimeIsSet = true;
    }
    @JsonProperty("securityLabelNumber")
    public void setSecurityLabelNumber(Optional<List<UnsignedInt>> securityLabelNumber) {
      this.securityLabelNumber = securityLabelNumber;
      this.securityLabelNumberIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Reference> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> points() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> unitPrice() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> payment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> paymentDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> entityCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> entityReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> net() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> effectiveTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UnsignedInt>> securityLabelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
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
  static ImmutableContract_ValuedItem fromJson(Json json) {
    ImmutableContract_ValuedItem.Builder builder = ImmutableContract_ValuedItem.builder();
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.pointsIsSet) {
      builder.points(json.points);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.unitPriceIsSet) {
      builder.unitPrice(json.unitPrice);
    }
    if (json.paymentIsSet) {
      builder.payment(json.payment);
    }
    if (json.paymentDateIsSet) {
      builder.paymentDate(json.paymentDate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.entityCodeableConceptIsSet) {
      builder.entityCodeableConcept(json.entityCodeableConcept);
    }
    if (json.entityReferenceIsSet) {
      builder.entityReference(json.entityReference);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.netIsSet) {
      builder.net(json.net);
    }
    if (json.effectiveTimeIsSet) {
      builder.effectiveTime(json.effectiveTime);
    }
    if (json.securityLabelNumberIsSet) {
      builder.securityLabelNumber(json.securityLabelNumber);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableContract_ValuedItem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_ValuedItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_ValuedItem instance
   */
  public static Contract_ValuedItem copyOf(Contract_ValuedItem instance) {
    if (instance instanceof ImmutableContract_ValuedItem) {
      return (ImmutableContract_ValuedItem) instance;
    }
    return ImmutableContract_ValuedItem.builder()
        .responsible(instance.responsible())
        .points(instance.points())
        .quantity(instance.quantity())
        .linkId(instance.linkId())
        .unitPrice(instance.unitPrice())
        .payment(instance.payment())
        .paymentDate(instance.paymentDate())
        .modifierExtension(instance.modifierExtension())
        .entityCodeableConcept(instance.entityCodeableConcept())
        .entityReference(instance.entityReference())
        .recipient(instance.recipient())
        .id(instance.id())
        .identifier(instance.identifier())
        .net(instance.net())
        .effectiveTime(instance.effectiveTime())
        .securityLabelNumber(instance.securityLabelNumber())
        .factor(instance.factor())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_ValuedItem Contract_ValuedItem}.
   * <pre>
   * ImmutableContract_ValuedItem.builder()
   *    .responsible(com.fhir.types.fhir.Reference) // optional {@link Contract_ValuedItem#responsible() responsible}
   *    .points(com.fhir.types.fhir.Decimal) // optional {@link Contract_ValuedItem#points() points}
   *    .quantity(com.fhir.types.fhir.Quantity) // optional {@link Contract_ValuedItem#quantity() quantity}
   *    .linkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_ValuedItem#linkId() linkId}
   *    .unitPrice(com.fhir.types.fhir.Money) // optional {@link Contract_ValuedItem#unitPrice() unitPrice}
   *    .payment(String) // optional {@link Contract_ValuedItem#payment() payment}
   *    .paymentDate(com.fhir.types.fhir.DateTime) // optional {@link Contract_ValuedItem#paymentDate() paymentDate}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_ValuedItem#modifierExtension() modifierExtension}
   *    .entityCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept}
   *    .entityReference(com.fhir.types.fhir.Reference) // optional {@link Contract_ValuedItem#entityReference() entityReference}
   *    .recipient(com.fhir.types.fhir.Reference) // optional {@link Contract_ValuedItem#recipient() recipient}
   *    .id(String) // optional {@link Contract_ValuedItem#id() id}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link Contract_ValuedItem#identifier() identifier}
   *    .net(com.fhir.types.fhir.Money) // optional {@link Contract_ValuedItem#net() net}
   *    .effectiveTime(com.fhir.types.fhir.DateTime) // optional {@link Contract_ValuedItem#effectiveTime() effectiveTime}
   *    .securityLabelNumber(List&amp;lt;com.fhir.types.fhir.UnsignedInt&amp;gt;) // optional {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber}
   *    .factor(com.fhir.types.fhir.Decimal) // optional {@link Contract_ValuedItem#factor() factor}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_ValuedItem#extension() extension}
   *    .build();
   * </pre>
   * @return A new Contract_ValuedItem builder
   */
  public static ImmutableContract_ValuedItem.Builder builder() {
    return new ImmutableContract_ValuedItem.Builder();
  }

  /**
   * Builds instances of type {@link Contract_ValuedItem Contract_ValuedItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_ValuedItem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RESPONSIBLE = 0x1L;
    private static final long OPT_BIT_POINTS = 0x2L;
    private static final long OPT_BIT_QUANTITY = 0x4L;
    private static final long OPT_BIT_LINK_ID = 0x8L;
    private static final long OPT_BIT_UNIT_PRICE = 0x10L;
    private static final long OPT_BIT_PAYMENT = 0x20L;
    private static final long OPT_BIT_PAYMENT_DATE = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_ENTITY_CODEABLE_CONCEPT = 0x100L;
    private static final long OPT_BIT_ENTITY_REFERENCE = 0x200L;
    private static final long OPT_BIT_RECIPIENT = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_NET = 0x2000L;
    private static final long OPT_BIT_EFFECTIVE_TIME = 0x4000L;
    private static final long OPT_BIT_SECURITY_LABEL_NUMBER = 0x8000L;
    private static final long OPT_BIT_FACTOR = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private long optBits;

    private @Nullable Reference responsible;
    private @Nullable Decimal points;
    private @Nullable Quantity quantity;
    private @Nullable List<String> linkId;
    private @Nullable Money unitPrice;
    private @Nullable String payment;
    private @Nullable DateTime paymentDate;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept entityCodeableConcept;
    private @Nullable Reference entityReference;
    private @Nullable Reference recipient;
    private @Nullable String id;
    private @Nullable Identifier identifier;
    private @Nullable Money net;
    private @Nullable DateTime effectiveTime;
    private @Nullable List<UnsignedInt> securityLabelNumber;
    private @Nullable Decimal factor;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    public final Builder responsible(Reference responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = Objects.requireNonNull(responsible, "responsible");
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("responsible")
    public final Builder responsible(Optional<? extends Reference> responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#points() points} to points.
     * @param points The value for points
     * @return {@code this} builder for chained invocation
     */
    public final Builder points(Decimal points) {
      checkNotIsSet(pointsIsSet(), "points");
      this.points = Objects.requireNonNull(points, "points");
      optBits |= OPT_BIT_POINTS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#points() points} to points.
     * @param points The value for points
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("points")
    public final Builder points(Optional<? extends Decimal> points) {
      checkNotIsSet(pointsIsSet(), "points");
      this.points = points.orElse(null);
      optBits |= OPT_BIT_POINTS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link Contract_ValuedItem#quantity() quantity} to quantity.
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
     * Initializes the optional value {@link Contract_ValuedItem#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkId(List<String> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = Objects.requireNonNull(linkId, "linkId");
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("linkId")
    public final Builder linkId(Optional<? extends List<String>> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = linkId.orElse(null);
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link Contract_ValuedItem#unitPrice() unitPrice} to unitPrice.
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
     * Initializes the optional value {@link Contract_ValuedItem#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for chained invocation
     */
    public final Builder payment(String payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = Objects.requireNonNull(payment, "payment");
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#payment() payment} to payment.
     * @param payment The value for payment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payment")
    public final Builder payment(Optional<String> payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = payment.orElse(null);
      optBits |= OPT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentDate(DateTime paymentDate) {
      checkNotIsSet(paymentDateIsSet(), "paymentDate");
      this.paymentDate = Objects.requireNonNull(paymentDate, "paymentDate");
      optBits |= OPT_BIT_PAYMENT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paymentDate")
    public final Builder paymentDate(Optional<? extends DateTime> paymentDate) {
      checkNotIsSet(paymentDateIsSet(), "paymentDate");
      this.paymentDate = paymentDate.orElse(null);
      optBits |= OPT_BIT_PAYMENT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_ValuedItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept} to entityCodeableConcept.
     * @param entityCodeableConcept The value for entityCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder entityCodeableConcept(CodeableConcept entityCodeableConcept) {
      checkNotIsSet(entityCodeableConceptIsSet(), "entityCodeableConcept");
      this.entityCodeableConcept = Objects.requireNonNull(entityCodeableConcept, "entityCodeableConcept");
      optBits |= OPT_BIT_ENTITY_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#entityCodeableConcept() entityCodeableConcept} to entityCodeableConcept.
     * @param entityCodeableConcept The value for entityCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityCodeableConcept")
    public final Builder entityCodeableConcept(Optional<? extends CodeableConcept> entityCodeableConcept) {
      checkNotIsSet(entityCodeableConceptIsSet(), "entityCodeableConcept");
      this.entityCodeableConcept = entityCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ENTITY_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#entityReference() entityReference} to entityReference.
     * @param entityReference The value for entityReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder entityReference(Reference entityReference) {
      checkNotIsSet(entityReferenceIsSet(), "entityReference");
      this.entityReference = Objects.requireNonNull(entityReference, "entityReference");
      optBits |= OPT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#entityReference() entityReference} to entityReference.
     * @param entityReference The value for entityReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("entityReference")
    public final Builder entityReference(Optional<? extends Reference> entityReference) {
      checkNotIsSet(entityReferenceIsSet(), "entityReference");
      this.entityReference = entityReference.orElse(null);
      optBits |= OPT_BIT_ENTITY_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(Reference recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recipient")
    public final Builder recipient(Optional<? extends Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#id() id} to id.
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
     * Initializes the optional value {@link Contract_ValuedItem#id() id} to id.
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
     * Initializes the optional value {@link Contract_ValuedItem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#net() net} to net.
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
     * Initializes the optional value {@link Contract_ValuedItem#net() net} to net.
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
     * Initializes the optional value {@link Contract_ValuedItem#effectiveTime() effectiveTime} to effectiveTime.
     * @param effectiveTime The value for effectiveTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveTime(DateTime effectiveTime) {
      checkNotIsSet(effectiveTimeIsSet(), "effectiveTime");
      this.effectiveTime = Objects.requireNonNull(effectiveTime, "effectiveTime");
      optBits |= OPT_BIT_EFFECTIVE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#effectiveTime() effectiveTime} to effectiveTime.
     * @param effectiveTime The value for effectiveTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectiveTime")
    public final Builder effectiveTime(Optional<? extends DateTime> effectiveTime) {
      checkNotIsSet(effectiveTimeIsSet(), "effectiveTime");
      this.effectiveTime = effectiveTime.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabelNumber(List<UnsignedInt> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = Objects.requireNonNull(securityLabelNumber, "securityLabelNumber");
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityLabelNumber")
    public final Builder securityLabelNumber(Optional<? extends List<UnsignedInt>> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = securityLabelNumber.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ValuedItem#factor() factor} to factor.
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
     * Initializes the optional value {@link Contract_ValuedItem#factor() factor} to factor.
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
     * Initializes the optional value {@link Contract_ValuedItem#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_ValuedItem#extension() extension} to extension.
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
     * Builds a new {@link Contract_ValuedItem Contract_ValuedItem}.
     * @return An immutable instance of Contract_ValuedItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_ValuedItem build() {
      return new ImmutableContract_ValuedItem(
          responsible,
          points,
          quantity,
          linkId,
          unitPrice,
          payment,
          paymentDate,
          modifierExtension,
          entityCodeableConcept,
          entityReference,
          recipient,
          id,
          identifier,
          net,
          effectiveTime,
          securityLabelNumber,
          factor,
          extension);
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean pointsIsSet() {
      return (optBits & OPT_BIT_POINTS) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean unitPriceIsSet() {
      return (optBits & OPT_BIT_UNIT_PRICE) != 0;
    }

    private boolean paymentIsSet() {
      return (optBits & OPT_BIT_PAYMENT) != 0;
    }

    private boolean paymentDateIsSet() {
      return (optBits & OPT_BIT_PAYMENT_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean entityCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ENTITY_CODEABLE_CONCEPT) != 0;
    }

    private boolean entityReferenceIsSet() {
      return (optBits & OPT_BIT_ENTITY_REFERENCE) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean netIsSet() {
      return (optBits & OPT_BIT_NET) != 0;
    }

    private boolean effectiveTimeIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_TIME) != 0;
    }

    private boolean securityLabelNumberIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL_NUMBER) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_ValuedItem is strict, attribute is already set: ".concat(name));
    }
  }
}
