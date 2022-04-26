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
 * Immutable implementation of {@link PaymentReconciliation_Detail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePaymentReconciliation_Detail.builder()}.
 */
@Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePaymentReconciliation_Detail
    implements PaymentReconciliation_Detail {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Date date;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Identifier predecessor;
  private final @Nullable Identifier identifier;
  private final @Nullable Reference payee;
  private final @Nullable Reference submitter;
  private final CodeableConcept type;
  private final @Nullable Reference request;
  private final @Nullable Reference responsible;
  private final @Nullable Reference response;
  private final @Nullable Money amount;

  private ImmutablePaymentReconciliation_Detail(
      @Nullable List<Extension> modifierExtension,
      @Nullable Date date,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Identifier predecessor,
      @Nullable Identifier identifier,
      @Nullable Reference payee,
      @Nullable Reference submitter,
      CodeableConcept type,
      @Nullable Reference request,
      @Nullable Reference responsible,
      @Nullable Reference response,
      @Nullable Money amount) {
    this.modifierExtension = modifierExtension;
    this.date = date;
    this.extension = extension;
    this.id = id;
    this.predecessor = predecessor;
    this.identifier = identifier;
    this.payee = payee;
    this.submitter = submitter;
    this.type = type;
    this.request = request;
    this.responsible = responsible;
    this.response = response;
    this.amount = amount;
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<Date> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code predecessor} attribute
   */
  @JsonProperty("predecessor")
  @Override
  public Optional<Identifier> predecessor() {
    return Optional.ofNullable(predecessor);
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
   * @return The value of the {@code payee} attribute
   */
  @JsonProperty("payee")
  @Override
  public Optional<Reference> payee() {
    return Optional.ofNullable(payee);
  }

  /**
   * @return The value of the {@code submitter} attribute
   */
  @JsonProperty("submitter")
  @Override
  public Optional<Reference> submitter() {
    return Optional.ofNullable(submitter);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<Reference> request() {
    return Optional.ofNullable(request);
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
   * @return The value of the {@code response} attribute
   */
  @JsonProperty("response")
  @Override
  public Optional<Reference> response() {
    return Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<Money> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        newValue,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        value,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        newValue,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        value,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        newValue,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        value,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        newValue,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        value,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#predecessor() predecessor} attribute.
   * @param value The value for predecessor
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withPredecessor(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "predecessor");
    if (this.predecessor == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        newValue,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#predecessor() predecessor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for predecessor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withPredecessor(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.predecessor == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        value,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        newValue,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        value,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#payee() payee} attribute.
   * @param value The value for payee
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withPayee(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "payee");
    if (this.payee == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        newValue,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#payee() payee} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payee
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withPayee(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.payee == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        value,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#submitter() submitter} attribute.
   * @param value The value for submitter
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withSubmitter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "submitter");
    if (this.submitter == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        newValue,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#submitter() submitter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for submitter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withSubmitter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.submitter == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        value,
        this.type,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentReconciliation_Detail#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        newValue,
        this.request,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withRequest(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        newValue,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withRequest(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        value,
        this.responsible,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withResponsible(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "responsible");
    if (this.responsible == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        newValue,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#responsible() responsible} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withResponsible(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.responsible == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        value,
        this.response,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withResponse(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        newValue,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withResponse(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        value,
        this.amount);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation_Detail#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation_Detail withAmount(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation_Detail#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation_Detail withAmount(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutablePaymentReconciliation_Detail(
        this.modifierExtension,
        this.date,
        this.extension,
        this.id,
        this.predecessor,
        this.identifier,
        this.payee,
        this.submitter,
        this.type,
        this.request,
        this.responsible,
        this.response,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePaymentReconciliation_Detail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePaymentReconciliation_Detail
        && equalTo((ImmutablePaymentReconciliation_Detail) another);
  }

  private boolean equalTo(ImmutablePaymentReconciliation_Detail another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(date, another.date)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(predecessor, another.predecessor)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(payee, another.payee)
        && Objects.equals(submitter, another.submitter)
        && type.equals(another.type)
        && Objects.equals(request, another.request)
        && Objects.equals(responsible, another.responsible)
        && Objects.equals(response, another.response)
        && Objects.equals(amount, another.amount);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code date}, {@code extension}, {@code id}, {@code predecessor}, {@code identifier}, {@code payee}, {@code submitter}, {@code type}, {@code request}, {@code responsible}, {@code response}, {@code amount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(predecessor);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(payee);
    h += (h << 5) + Objects.hashCode(submitter);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(responsible);
    h += (h << 5) + Objects.hashCode(response);
    h += (h << 5) + Objects.hashCode(amount);
    return h;
  }

  /**
   * Prints the immutable value {@code PaymentReconciliation_Detail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PaymentReconciliation_Detail{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (date != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (predecessor != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("predecessor=").append(predecessor);
    }
    if (identifier != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (payee != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("payee=").append(payee);
    }
    if (submitter != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("submitter=").append(submitter);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("type=").append(type);
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    if (responsible != null) {
      builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    if (response != null) {
      builder.append(", ");
      builder.append("response=").append(response);
    }
    if (amount != null) {
      builder.append(", ");
      builder.append("amount=").append(amount);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PaymentReconciliation_Detail {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Date> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Identifier> predecessor = Optional.empty();
    boolean predecessorIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Reference> payee = Optional.empty();
    boolean payeeIsSet;
    @Nullable Optional<Reference> submitter = Optional.empty();
    boolean submitterIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Reference> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<Reference> responsible = Optional.empty();
    boolean responsibleIsSet;
    @Nullable Optional<Reference> response = Optional.empty();
    boolean responseIsSet;
    @Nullable Optional<Money> amount = Optional.empty();
    boolean amountIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<Date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("predecessor")
    public void setPredecessor(Optional<Identifier> predecessor) {
      this.predecessor = predecessor;
      this.predecessorIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("payee")
    public void setPayee(Optional<Reference> payee) {
      this.payee = payee;
      this.payeeIsSet = true;
    }
    @JsonProperty("submitter")
    public void setSubmitter(Optional<Reference> submitter) {
      this.submitter = submitter;
      this.submitterIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("request")
    public void setRequest(Optional<Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("responsible")
    public void setResponsible(Optional<Reference> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @JsonProperty("response")
    public void setResponse(Optional<Reference> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Optional<Money> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> predecessor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> payee() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> submitter() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> response() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> amount() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePaymentReconciliation_Detail fromJson(Json json) {
    ImmutablePaymentReconciliation_Detail.Builder builder = ((ImmutablePaymentReconciliation_Detail.Builder) ImmutablePaymentReconciliation_Detail.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.predecessorIsSet) {
      builder.predecessor(json.predecessor);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.payeeIsSet) {
      builder.payee(json.payee);
    }
    if (json.submitterIsSet) {
      builder.submitter(json.submitter);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    return (ImmutablePaymentReconciliation_Detail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PaymentReconciliation_Detail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PaymentReconciliation_Detail instance
   */
  public static PaymentReconciliation_Detail copyOf(PaymentReconciliation_Detail instance) {
    if (instance instanceof ImmutablePaymentReconciliation_Detail) {
      return (ImmutablePaymentReconciliation_Detail) instance;
    }
    return ((ImmutablePaymentReconciliation_Detail.Builder) ImmutablePaymentReconciliation_Detail.builder())
        .modifierExtension(instance.modifierExtension())
        .date(instance.date())
        .extension(instance.extension())
        .id(instance.id())
        .predecessor(instance.predecessor())
        .identifier(instance.identifier())
        .payee(instance.payee())
        .submitter(instance.submitter())
        .type(instance.type())
        .request(instance.request())
        .responsible(instance.responsible())
        .response(instance.response())
        .amount(instance.amount())
        .build();
  }

  /**
   * Creates a builder for {@link PaymentReconciliation_Detail PaymentReconciliation_Detail}.
   * <pre>
   * ImmutablePaymentReconciliation_Detail.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension}
   *    .date(com.fhir.types.fhir.Date) // optional {@link PaymentReconciliation_Detail#date() date}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation_Detail#extension() extension}
   *    .id(String) // optional {@link PaymentReconciliation_Detail#id() id}
   *    .predecessor(com.fhir.types.fhir.Identifier) // optional {@link PaymentReconciliation_Detail#predecessor() predecessor}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link PaymentReconciliation_Detail#identifier() identifier}
   *    .payee(com.fhir.types.fhir.Reference) // optional {@link PaymentReconciliation_Detail#payee() payee}
   *    .submitter(com.fhir.types.fhir.Reference) // optional {@link PaymentReconciliation_Detail#submitter() submitter}
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link PaymentReconciliation_Detail#type() type}
   *    .request(com.fhir.types.fhir.Reference) // optional {@link PaymentReconciliation_Detail#request() request}
   *    .responsible(com.fhir.types.fhir.Reference) // optional {@link PaymentReconciliation_Detail#responsible() responsible}
   *    .response(com.fhir.types.fhir.Reference) // optional {@link PaymentReconciliation_Detail#response() response}
   *    .amount(com.fhir.types.fhir.Money) // optional {@link PaymentReconciliation_Detail#amount() amount}
   *    .build();
   * </pre>
   * @return A new PaymentReconciliation_Detail builder
   */
  public static TypeBuildStage builder() {
    return new ImmutablePaymentReconciliation_Detail.Builder();
  }

  /**
   * Builds instances of type {@link PaymentReconciliation_Detail PaymentReconciliation_Detail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_DATE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_PREDECESSOR = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_PAYEE = 0x40L;
    private static final long OPT_BIT_SUBMITTER = 0x80L;
    private static final long OPT_BIT_REQUEST = 0x100L;
    private static final long OPT_BIT_RESPONSIBLE = 0x200L;
    private static final long OPT_BIT_RESPONSE = 0x400L;
    private static final long OPT_BIT_AMOUNT = 0x800L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Date date;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Identifier predecessor;
    private @Nullable Identifier identifier;
    private @Nullable Reference payee;
    private @Nullable Reference submitter;
    private @Nullable CodeableConcept type;
    private @Nullable Reference request;
    private @Nullable Reference responsible;
    private @Nullable Reference response;
    private @Nullable Money amount;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(Date date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends Date> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#predecessor() predecessor} to predecessor.
     * @param predecessor The value for predecessor
     * @return {@code this} builder for chained invocation
     */
    public final Builder predecessor(Identifier predecessor) {
      checkNotIsSet(predecessorIsSet(), "predecessor");
      this.predecessor = Objects.requireNonNull(predecessor, "predecessor");
      optBits |= OPT_BIT_PREDECESSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#predecessor() predecessor} to predecessor.
     * @param predecessor The value for predecessor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("predecessor")
    public final Builder predecessor(Optional<? extends Identifier> predecessor) {
      checkNotIsSet(predecessorIsSet(), "predecessor");
      this.predecessor = predecessor.orElse(null);
      optBits |= OPT_BIT_PREDECESSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    public final Builder payee(Reference payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = Objects.requireNonNull(payee, "payee");
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payee")
    public final Builder payee(Optional<? extends Reference> payee) {
      checkNotIsSet(payeeIsSet(), "payee");
      this.payee = payee.orElse(null);
      optBits |= OPT_BIT_PAYEE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#submitter() submitter} to submitter.
     * @param submitter The value for submitter
     * @return {@code this} builder for chained invocation
     */
    public final Builder submitter(Reference submitter) {
      checkNotIsSet(submitterIsSet(), "submitter");
      this.submitter = Objects.requireNonNull(submitter, "submitter");
      optBits |= OPT_BIT_SUBMITTER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#submitter() submitter} to submitter.
     * @param submitter The value for submitter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("submitter")
    public final Builder submitter(Optional<? extends Reference> submitter) {
      checkNotIsSet(submitterIsSet(), "submitter");
      this.submitter = submitter.orElse(null);
      optBits |= OPT_BIT_SUBMITTER;
      return this;
    }

    /**
     * Initializes the value for the {@link PaymentReconciliation_Detail#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(Reference request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Optional<? extends Reference> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#responsible() responsible} to responsible.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#responsible() responsible} to responsible.
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
     * Initializes the optional value {@link PaymentReconciliation_Detail#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(Reference response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("response")
    public final Builder response(Optional<? extends Reference> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(Money amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends Money> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Builds a new {@link PaymentReconciliation_Detail PaymentReconciliation_Detail}.
     * @return An immutable instance of PaymentReconciliation_Detail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PaymentReconciliation_Detail build() {
      checkRequiredAttributes();
      return new ImmutablePaymentReconciliation_Detail(
          modifierExtension,
          date,
          extension,
          id,
          predecessor,
          identifier,
          payee,
          submitter,
          type,
          request,
          responsible,
          response,
          amount);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean predecessorIsSet() {
      return (optBits & OPT_BIT_PREDECESSOR) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean payeeIsSet() {
      return (optBits & OPT_BIT_PAYEE) != 0;
    }

    private boolean submitterIsSet() {
      return (optBits & OPT_BIT_SUBMITTER) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PaymentReconciliation_Detail is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build PaymentReconciliation_Detail, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link PaymentReconciliation_Detail#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "PaymentReconciliation_Detail", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(Date date);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends Date> date);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#predecessor() predecessor} to predecessor.
     * @param predecessor The value for predecessor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal predecessor(Identifier predecessor);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#predecessor() predecessor} to predecessor.
     * @param predecessor The value for predecessor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal predecessor(Optional<? extends Identifier> predecessor);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payee(Reference payee);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payee(Optional<? extends Reference> payee);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#submitter() submitter} to submitter.
     * @param submitter The value for submitter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal submitter(Reference submitter);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#submitter() submitter} to submitter.
     * @param submitter The value for submitter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal submitter(Optional<? extends Reference> submitter);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(Reference request);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(Optional<? extends Reference> request);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responsible(Reference responsible);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responsible(Optional<? extends Reference> responsible);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    BuildFinal response(Reference response);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal response(Optional<? extends Reference> response);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal amount(Money amount);

    /**
     * Initializes the optional value {@link PaymentReconciliation_Detail#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(Optional<? extends Money> amount);

    /**
     * Builds a new {@link PaymentReconciliation_Detail PaymentReconciliation_Detail}.
     * @return An immutable instance of PaymentReconciliation_Detail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PaymentReconciliation_Detail build();
  }
}
