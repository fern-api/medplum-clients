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
 * Immutable implementation of {@link PaymentNotice}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePaymentNotice.builder()}.
 */
@Generated(from = "PaymentNotice", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePaymentNotice implements PaymentNotice {
  private final @Nullable List<Identifier> identifier;
  private final Money amount;
  private final @Nullable Code language;
  private final @Nullable Code status;
  private final @Nullable Reference provider;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference payee;
  private final @Nullable Meta meta;
  private final @Nullable Reference request;
  private final Reference payment;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DateTime created;
  private final String resourceType;
  private final @Nullable Reference response;
  private final Reference recipient;
  private final @Nullable Date paymentDate;
  private final @Nullable CodeableConcept paymentStatus;
  private final @Nullable Id id;
  private final @Nullable Narrative text;

  private ImmutablePaymentNotice(
      @Nullable List<Identifier> identifier,
      Money amount,
      @Nullable Code language,
      @Nullable Code status,
      @Nullable Reference provider,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable Reference payee,
      @Nullable Meta meta,
      @Nullable Reference request,
      Reference payment,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      @Nullable DateTime created,
      String resourceType,
      @Nullable Reference response,
      Reference recipient,
      @Nullable Date paymentDate,
      @Nullable CodeableConcept paymentStatus,
      @Nullable Id id,
      @Nullable Narrative text) {
    this.identifier = identifier;
    this.amount = amount;
    this.language = language;
    this.status = status;
    this.provider = provider;
    this.contained = contained;
    this.extension = extension;
    this.payee = payee;
    this.meta = meta;
    this.request = request;
    this.payment = payment;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.created = created;
    this.resourceType = resourceType;
    this.response = response;
    this.recipient = recipient;
    this.paymentDate = paymentDate;
    this.paymentStatus = paymentStatus;
    this.id = id;
    this.text = text;
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
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Money amount() {
    return amount;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code payee} attribute
   */
  @JsonProperty("payee")
  @Override
  public Optional<Reference> payee() {
    return Optional.ofNullable(payee);
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
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<Reference> request() {
    return Optional.ofNullable(request);
  }

  /**
   * @return The value of the {@code payment} attribute
   */
  @JsonProperty("payment")
  @Override
  public Reference payment() {
    return payment;
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
   * @return The value of the {@code created} attribute
   */
  @JsonProperty("created")
  @Override
  public Optional<DateTime> created() {
    return Optional.ofNullable(created);
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
   * @return The value of the {@code response} attribute
   */
  @JsonProperty("response")
  @Override
  public Optional<Reference> response() {
    return Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @JsonProperty("recipient")
  @Override
  public Reference recipient() {
    return recipient;
  }

  /**
   * @return The value of the {@code paymentDate} attribute
   */
  @JsonProperty("paymentDate")
  @Override
  public Optional<Date> paymentDate() {
    return Optional.ofNullable(paymentDate);
  }

  /**
   * @return The value of the {@code paymentStatus} attribute
   */
  @JsonProperty("paymentStatus")
  @Override
  public Optional<CodeableConcept> paymentStatus() {
    return Optional.ofNullable(paymentStatus);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePaymentNotice(
        newValue,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePaymentNotice(
        value,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentNotice#amount() amount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentNotice withAmount(Money value) {
    if (this.amount == value) return this;
    Money newValue = Objects.requireNonNull(value, "amount");
    return new ImmutablePaymentNotice(
        this.identifier,
        newValue,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        newValue,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        value,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        newValue,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        value,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#provider() provider} attribute.
   * @param value The value for provider
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withProvider(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "provider");
    if (this.provider == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        newValue,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#provider() provider} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provider
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withProvider(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.provider == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        value,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        newValue,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        value,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        newValue,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        value,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#payee() payee} attribute.
   * @param value The value for payee
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withPayee(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "payee");
    if (this.payee == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        newValue,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#payee() payee} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payee
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withPayee(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.payee == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        value,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        newValue,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        value,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withRequest(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        newValue,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withRequest(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        value,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentNotice#payment() payment} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for payment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentNotice withPayment(Reference value) {
    if (this.payment == value) return this;
    Reference newValue = Objects.requireNonNull(value, "payment");
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        newValue,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        value,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        newValue,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        value,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentNotice#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentNotice withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        newValue,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withResponse(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        newValue,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withResponse(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        value,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentNotice#recipient() recipient} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for recipient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentNotice withRecipient(Reference value) {
    if (this.recipient == value) return this;
    Reference newValue = Objects.requireNonNull(value, "recipient");
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        newValue,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#paymentDate() paymentDate} attribute.
   * @param value The value for paymentDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withPaymentDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "paymentDate");
    if (this.paymentDate == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        newValue,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#paymentDate() paymentDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withPaymentDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.paymentDate == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        value,
        this.paymentStatus,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#paymentStatus() paymentStatus} attribute.
   * @param value The value for paymentStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withPaymentStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "paymentStatus");
    if (this.paymentStatus == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        newValue,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#paymentStatus() paymentStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withPaymentStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.paymentStatus == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        value,
        this.id,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentNotice#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentNotice withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentNotice#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentNotice withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePaymentNotice(
        this.identifier,
        this.amount,
        this.language,
        this.status,
        this.provider,
        this.contained,
        this.extension,
        this.payee,
        this.meta,
        this.request,
        this.payment,
        this.implicitRules,
        this.modifierExtension,
        this.created,
        this.resourceType,
        this.response,
        this.recipient,
        this.paymentDate,
        this.paymentStatus,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePaymentNotice} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePaymentNotice
        && equalTo((ImmutablePaymentNotice) another);
  }

  private boolean equalTo(ImmutablePaymentNotice another) {
    return Objects.equals(identifier, another.identifier)
        && amount.equals(another.amount)
        && Objects.equals(language, another.language)
        && Objects.equals(status, another.status)
        && Objects.equals(provider, another.provider)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(payee, another.payee)
        && Objects.equals(meta, another.meta)
        && Objects.equals(request, another.request)
        && payment.equals(another.payment)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(created, another.created)
        && resourceType.equals(another.resourceType)
        && Objects.equals(response, another.response)
        && recipient.equals(another.recipient)
        && Objects.equals(paymentDate, another.paymentDate)
        && Objects.equals(paymentStatus, another.paymentStatus)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code amount}, {@code language}, {@code status}, {@code provider}, {@code contained}, {@code extension}, {@code payee}, {@code meta}, {@code request}, {@code payment}, {@code implicitRules}, {@code modifierExtension}, {@code created}, {@code resourceType}, {@code response}, {@code recipient}, {@code paymentDate}, {@code paymentStatus}, {@code id}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(provider);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(payee);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + payment.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(response);
    h += (h << 5) + recipient.hashCode();
    h += (h << 5) + Objects.hashCode(paymentDate);
    h += (h << 5) + Objects.hashCode(paymentStatus);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code PaymentNotice} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PaymentNotice{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("amount=").append(amount);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (provider != null) {
      builder.append(", ");
      builder.append("provider=").append(provider);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (payee != null) {
      builder.append(", ");
      builder.append("payee=").append(payee);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (request != null) {
      builder.append(", ");
      builder.append("request=").append(request);
    }
    builder.append(", ");
    builder.append("payment=").append(payment);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (response != null) {
      builder.append(", ");
      builder.append("response=").append(response);
    }
    builder.append(", ");
    builder.append("recipient=").append(recipient);
    if (paymentDate != null) {
      builder.append(", ");
      builder.append("paymentDate=").append(paymentDate);
    }
    if (paymentStatus != null) {
      builder.append(", ");
      builder.append("paymentStatus=").append(paymentStatus);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PaymentNotice", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PaymentNotice {
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Money amount;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> provider = Optional.empty();
    boolean providerIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> payee = Optional.empty();
    boolean payeeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Reference> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Reference payment;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Reference> response = Optional.empty();
    boolean responseIsSet;
    @Nullable Reference recipient;
    @Nullable Optional<Date> paymentDate = Optional.empty();
    boolean paymentDateIsSet;
    @Nullable Optional<CodeableConcept> paymentStatus = Optional.empty();
    boolean paymentStatusIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Money amount) {
      this.amount = amount;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("provider")
    public void setProvider(Optional<Reference> provider) {
      this.provider = provider;
      this.providerIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("payee")
    public void setPayee(Optional<Reference> payee) {
      this.payee = payee;
      this.payeeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("payment")
    public void setPayment(Reference payment) {
      this.payment = payment;
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
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("response")
    public void setResponse(Optional<Reference> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @JsonProperty("recipient")
    public void setRecipient(Reference recipient) {
      this.recipient = recipient;
    }
    @JsonProperty("paymentDate")
    public void setPaymentDate(Optional<Date> paymentDate) {
      this.paymentDate = paymentDate;
      this.paymentDateIsSet = true;
    }
    @JsonProperty("paymentStatus")
    public void setPaymentStatus(Optional<CodeableConcept> paymentStatus) {
      this.paymentStatus = paymentStatus;
      this.paymentStatusIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Money amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> provider() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> payee() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public Reference payment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> response() { throw new UnsupportedOperationException(); }
    @Override
    public Reference recipient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> paymentDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> paymentStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePaymentNotice fromJson(Json json) {
    ImmutablePaymentNotice.Builder builder = ((ImmutablePaymentNotice.Builder) ImmutablePaymentNotice.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.amount != null) {
      builder.amount(json.amount);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.providerIsSet) {
      builder.provider(json.provider);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.payeeIsSet) {
      builder.payee(json.payee);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.payment != null) {
      builder.payment(json.payment);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.recipient != null) {
      builder.recipient(json.recipient);
    }
    if (json.paymentDateIsSet) {
      builder.paymentDate(json.paymentDate);
    }
    if (json.paymentStatusIsSet) {
      builder.paymentStatus(json.paymentStatus);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    return (ImmutablePaymentNotice) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PaymentNotice} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PaymentNotice instance
   */
  public static PaymentNotice copyOf(PaymentNotice instance) {
    if (instance instanceof ImmutablePaymentNotice) {
      return (ImmutablePaymentNotice) instance;
    }
    return ((ImmutablePaymentNotice.Builder) ImmutablePaymentNotice.builder())
        .identifier(instance.identifier())
        .amount(instance.amount())
        .language(instance.language())
        .status(instance.status())
        .provider(instance.provider())
        .contained(instance.contained())
        .extension(instance.extension())
        .payee(instance.payee())
        .meta(instance.meta())
        .request(instance.request())
        .payment(instance.payment())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .created(instance.created())
        .resourceType(instance.resourceType())
        .response(instance.response())
        .recipient(instance.recipient())
        .paymentDate(instance.paymentDate())
        .paymentStatus(instance.paymentStatus())
        .id(instance.id())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link PaymentNotice PaymentNotice}.
   * <pre>
   * ImmutablePaymentNotice.builder()
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link PaymentNotice#identifier() identifier}
   *    .amount(com.medplum.types.fhir.Money) // required {@link PaymentNotice#amount() amount}
   *    .language(com.medplum.types.fhir.Code) // optional {@link PaymentNotice#language() language}
   *    .status(com.medplum.types.fhir.Code) // optional {@link PaymentNotice#status() status}
   *    .provider(com.medplum.types.fhir.Reference) // optional {@link PaymentNotice#provider() provider}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link PaymentNotice#contained() contained}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PaymentNotice#extension() extension}
   *    .payee(com.medplum.types.fhir.Reference) // optional {@link PaymentNotice#payee() payee}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link PaymentNotice#meta() meta}
   *    .request(com.medplum.types.fhir.Reference) // optional {@link PaymentNotice#request() request}
   *    .payment(com.medplum.types.fhir.Reference) // required {@link PaymentNotice#payment() payment}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link PaymentNotice#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PaymentNotice#modifierExtension() modifierExtension}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link PaymentNotice#created() created}
   *    .resourceType(String) // required {@link PaymentNotice#resourceType() resourceType}
   *    .response(com.medplum.types.fhir.Reference) // optional {@link PaymentNotice#response() response}
   *    .recipient(com.medplum.types.fhir.Reference) // required {@link PaymentNotice#recipient() recipient}
   *    .paymentDate(com.medplum.types.fhir.Date) // optional {@link PaymentNotice#paymentDate() paymentDate}
   *    .paymentStatus(com.medplum.types.fhir.CodeableConcept) // optional {@link PaymentNotice#paymentStatus() paymentStatus}
   *    .id(com.medplum.types.fhir.Id) // optional {@link PaymentNotice#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link PaymentNotice#text() text}
   *    .build();
   * </pre>
   * @return A new PaymentNotice builder
   */
  public static AmountBuildStage builder() {
    return new ImmutablePaymentNotice.Builder();
  }

  /**
   * Builds instances of type {@link PaymentNotice PaymentNotice}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PaymentNotice", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements AmountBuildStage, PaymentBuildStage, ResourceTypeBuildStage, RecipientBuildStage, BuildFinal {
    private static final long INIT_BIT_AMOUNT = 0x1L;
    private static final long INIT_BIT_PAYMENT = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long INIT_BIT_RECIPIENT = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_PROVIDER = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_PAYEE = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_REQUEST = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_CREATED = 0x800L;
    private static final long OPT_BIT_RESPONSE = 0x1000L;
    private static final long OPT_BIT_PAYMENT_DATE = 0x2000L;
    private static final long OPT_BIT_PAYMENT_STATUS = 0x4000L;
    private static final long OPT_BIT_ID = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private long initBits = 0xfL;
    private long optBits;

    private @Nullable List<Identifier> identifier;
    private @Nullable Money amount;
    private @Nullable Code language;
    private @Nullable Code status;
    private @Nullable Reference provider;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable Reference payee;
    private @Nullable Meta meta;
    private @Nullable Reference request;
    private @Nullable Reference payment;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable DateTime created;
    private @Nullable String resourceType;
    private @Nullable Reference response;
    private @Nullable Reference recipient;
    private @Nullable Date paymentDate;
    private @Nullable CodeableConcept paymentStatus;
    private @Nullable Id id;
    private @Nullable Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PaymentNotice#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PaymentNotice#identifier() identifier} to identifier.
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
     * Initializes the value for the {@link PaymentNotice#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Money amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#language() language} to language.
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
     * Initializes the optional value {@link PaymentNotice#language() language} to language.
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
     * Initializes the optional value {@link PaymentNotice#status() status} to status.
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
     * Initializes the optional value {@link PaymentNotice#status() status} to status.
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
     * Initializes the optional value {@link PaymentNotice#provider() provider} to provider.
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
     * Initializes the optional value {@link PaymentNotice#provider() provider} to provider.
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
     * Initializes the optional value {@link PaymentNotice#contained() contained} to contained.
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
     * Initializes the optional value {@link PaymentNotice#contained() contained} to contained.
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
     * Initializes the optional value {@link PaymentNotice#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentNotice#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentNotice#payee() payee} to payee.
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
     * Initializes the optional value {@link PaymentNotice#payee() payee} to payee.
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
     * Initializes the optional value {@link PaymentNotice#meta() meta} to meta.
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
     * Initializes the optional value {@link PaymentNotice#meta() meta} to meta.
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
     * Initializes the optional value {@link PaymentNotice#request() request} to request.
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
     * Initializes the optional value {@link PaymentNotice#request() request} to request.
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
     * Initializes the value for the {@link PaymentNotice#payment() payment} attribute.
     * @param payment The value for payment 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payment")
    public final Builder payment(Reference payment) {
      checkNotIsSet(paymentIsSet(), "payment");
      this.payment = Objects.requireNonNull(payment, "payment");
      initBits &= ~INIT_BIT_PAYMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PaymentNotice#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PaymentNotice#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentNotice#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentNotice#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(DateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("created")
    public final Builder created(Optional<? extends DateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the value for the {@link PaymentNotice#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link PaymentNotice#response() response} to response.
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
     * Initializes the optional value {@link PaymentNotice#response() response} to response.
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
     * Initializes the value for the {@link PaymentNotice#recipient() recipient} attribute.
     * @param recipient The value for recipient 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recipient")
    public final Builder recipient(Reference recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = Objects.requireNonNull(recipient, "recipient");
      initBits &= ~INIT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentDate(Date paymentDate) {
      checkNotIsSet(paymentDateIsSet(), "paymentDate");
      this.paymentDate = Objects.requireNonNull(paymentDate, "paymentDate");
      optBits |= OPT_BIT_PAYMENT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paymentDate")
    public final Builder paymentDate(Optional<? extends Date> paymentDate) {
      checkNotIsSet(paymentDateIsSet(), "paymentDate");
      this.paymentDate = paymentDate.orElse(null);
      optBits |= OPT_BIT_PAYMENT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#paymentStatus() paymentStatus} to paymentStatus.
     * @param paymentStatus The value for paymentStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentStatus(CodeableConcept paymentStatus) {
      checkNotIsSet(paymentStatusIsSet(), "paymentStatus");
      this.paymentStatus = Objects.requireNonNull(paymentStatus, "paymentStatus");
      optBits |= OPT_BIT_PAYMENT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#paymentStatus() paymentStatus} to paymentStatus.
     * @param paymentStatus The value for paymentStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paymentStatus")
    public final Builder paymentStatus(Optional<? extends CodeableConcept> paymentStatus) {
      checkNotIsSet(paymentStatusIsSet(), "paymentStatus");
      this.paymentStatus = paymentStatus.orElse(null);
      optBits |= OPT_BIT_PAYMENT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentNotice#id() id} to id.
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
     * Initializes the optional value {@link PaymentNotice#id() id} to id.
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
     * Initializes the optional value {@link PaymentNotice#text() text} to text.
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
     * Initializes the optional value {@link PaymentNotice#text() text} to text.
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
     * Builds a new {@link PaymentNotice PaymentNotice}.
     * @return An immutable instance of PaymentNotice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PaymentNotice build() {
      checkRequiredAttributes();
      return new ImmutablePaymentNotice(
          identifier,
          amount,
          language,
          status,
          provider,
          contained,
          extension,
          payee,
          meta,
          request,
          payment,
          implicitRules,
          modifierExtension,
          created,
          resourceType,
          response,
          recipient,
          paymentDate,
          paymentStatus,
          id,
          text);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean providerIsSet() {
      return (optBits & OPT_BIT_PROVIDER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean payeeIsSet() {
      return (optBits & OPT_BIT_PAYEE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean paymentDateIsSet() {
      return (optBits & OPT_BIT_PAYMENT_DATE) != 0;
    }

    private boolean paymentStatusIsSet() {
      return (optBits & OPT_BIT_PAYMENT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean amountIsSet() {
      return (initBits & INIT_BIT_AMOUNT) == 0;
    }

    private boolean paymentIsSet() {
      return (initBits & INIT_BIT_PAYMENT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean recipientIsSet() {
      return (initBits & INIT_BIT_RECIPIENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PaymentNotice is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!amountIsSet()) attributes.add("amount");
      if (!paymentIsSet()) attributes.add("payment");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!recipientIsSet()) attributes.add("recipient");
      return "Cannot build PaymentNotice, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "PaymentNotice", generator = "Immutables")
  public interface AmountBuildStage {
    /**
     * Initializes the value for the {@link PaymentNotice#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    PaymentBuildStage amount(Money amount);
  }

  @Generated(from = "PaymentNotice", generator = "Immutables")
  public interface PaymentBuildStage {
    /**
     * Initializes the value for the {@link PaymentNotice#payment() payment} attribute.
     * @param payment The value for payment 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage payment(Reference payment);
  }

  @Generated(from = "PaymentNotice", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link PaymentNotice#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    RecipientBuildStage resourceType(String resourceType);
  }

  @Generated(from = "PaymentNotice", generator = "Immutables")
  public interface RecipientBuildStage {
    /**
     * Initializes the value for the {@link PaymentNotice#recipient() recipient} attribute.
     * @param recipient The value for recipient 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(Reference recipient);
  }

  @Generated(from = "PaymentNotice", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PaymentNotice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link PaymentNotice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link PaymentNotice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link PaymentNotice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link PaymentNotice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link PaymentNotice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link PaymentNotice#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provider(Reference provider);

    /**
     * Initializes the optional value {@link PaymentNotice#provider() provider} to provider.
     * @param provider The value for provider
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provider(Optional<? extends Reference> provider);

    /**
     * Initializes the optional value {@link PaymentNotice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link PaymentNotice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link PaymentNotice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link PaymentNotice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link PaymentNotice#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payee(Reference payee);

    /**
     * Initializes the optional value {@link PaymentNotice#payee() payee} to payee.
     * @param payee The value for payee
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payee(Optional<? extends Reference> payee);

    /**
     * Initializes the optional value {@link PaymentNotice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link PaymentNotice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link PaymentNotice#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(Reference request);

    /**
     * Initializes the optional value {@link PaymentNotice#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(Optional<? extends Reference> request);

    /**
     * Initializes the optional value {@link PaymentNotice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link PaymentNotice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link PaymentNotice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentNotice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentNotice#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link PaymentNotice#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link PaymentNotice#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    BuildFinal response(Reference response);

    /**
     * Initializes the optional value {@link PaymentNotice#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal response(Optional<? extends Reference> response);

    /**
     * Initializes the optional value {@link PaymentNotice#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentDate(Date paymentDate);

    /**
     * Initializes the optional value {@link PaymentNotice#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentDate(Optional<? extends Date> paymentDate);

    /**
     * Initializes the optional value {@link PaymentNotice#paymentStatus() paymentStatus} to paymentStatus.
     * @param paymentStatus The value for paymentStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentStatus(CodeableConcept paymentStatus);

    /**
     * Initializes the optional value {@link PaymentNotice#paymentStatus() paymentStatus} to paymentStatus.
     * @param paymentStatus The value for paymentStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentStatus(Optional<? extends CodeableConcept> paymentStatus);

    /**
     * Initializes the optional value {@link PaymentNotice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link PaymentNotice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link PaymentNotice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link PaymentNotice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Builds a new {@link PaymentNotice PaymentNotice}.
     * @return An immutable instance of PaymentNotice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PaymentNotice build();
  }
}