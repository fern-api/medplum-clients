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
 * Immutable implementation of {@link Invoice}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInvoice.builder()}.
 */
@Generated(from = "Invoice", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInvoice implements Invoice {
  private final @Nullable List<Identifier> identifier;
  private final @Nullable DateTime date;
  private final @Nullable String cancelledReason;
  private final @Nullable Money totalNet;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Markdown paymentTerms;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable InvoiceStatus status;
  private final @Nullable Reference recipient;
  private final @Nullable Reference subject;
  private final @Nullable List<Invoice_LineItem> lineItem;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference account;
  private final @Nullable Meta meta;
  private final String resourceType;
  private final @Nullable List<Invoice_PriceComponent> totalPriceComponent;
  private final @Nullable List<Invoice_Participant> participant;
  private final @Nullable List<Annotation> note;
  private final @Nullable Reference issuer;
  private final @Nullable Money totalGross;

  private ImmutableInvoice(
      @Nullable List<Identifier> identifier,
      @Nullable DateTime date,
      @Nullable String cancelledReason,
      @Nullable Money totalNet,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> modifierExtension,
      @Nullable Markdown paymentTerms,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable InvoiceStatus status,
      @Nullable Reference recipient,
      @Nullable Reference subject,
      @Nullable List<Invoice_LineItem> lineItem,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable List<ResourceList> contained,
      @Nullable Uri implicitRules,
      @Nullable Reference account,
      @Nullable Meta meta,
      String resourceType,
      @Nullable List<Invoice_PriceComponent> totalPriceComponent,
      @Nullable List<Invoice_Participant> participant,
      @Nullable List<Annotation> note,
      @Nullable Reference issuer,
      @Nullable Money totalGross) {
    this.identifier = identifier;
    this.date = date;
    this.cancelledReason = cancelledReason;
    this.totalNet = totalNet;
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.paymentTerms = paymentTerms;
    this.id = id;
    this.text = text;
    this.status = status;
    this.recipient = recipient;
    this.subject = subject;
    this.lineItem = lineItem;
    this.extension = extension;
    this.language = language;
    this.contained = contained;
    this.implicitRules = implicitRules;
    this.account = account;
    this.meta = meta;
    this.resourceType = resourceType;
    this.totalPriceComponent = totalPriceComponent;
    this.participant = participant;
    this.note = note;
    this.issuer = issuer;
    this.totalGross = totalGross;
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code cancelledReason} attribute
   */
  @JsonProperty("cancelledReason")
  @Override
  public Optional<String> cancelledReason() {
    return Optional.ofNullable(cancelledReason);
  }

  /**
   * @return The value of the {@code totalNet} attribute
   */
  @JsonProperty("totalNet")
  @Override
  public Optional<Money> totalNet() {
    return Optional.ofNullable(totalNet);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code paymentTerms} attribute
   */
  @JsonProperty("paymentTerms")
  @Override
  public Optional<Markdown> paymentTerms() {
    return Optional.ofNullable(paymentTerms);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<InvoiceStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code lineItem} attribute
   */
  @JsonProperty("lineItem")
  @Override
  public Optional<List<Invoice_LineItem>> lineItem() {
    return Optional.ofNullable(lineItem);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code account} attribute
   */
  @JsonProperty("account")
  @Override
  public Optional<Reference> account() {
    return Optional.ofNullable(account);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code totalPriceComponent} attribute
   */
  @JsonProperty("totalPriceComponent")
  @Override
  public Optional<List<Invoice_PriceComponent>> totalPriceComponent() {
    return Optional.ofNullable(totalPriceComponent);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @JsonProperty("participant")
  @Override
  public Optional<List<Invoice_Participant>> participant() {
    return Optional.ofNullable(participant);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code issuer} attribute
   */
  @JsonProperty("issuer")
  @Override
  public Optional<Reference> issuer() {
    return Optional.ofNullable(issuer);
  }

  /**
   * @return The value of the {@code totalGross} attribute
   */
  @JsonProperty("totalGross")
  @Override
  public Optional<Money> totalGross() {
    return Optional.ofNullable(totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableInvoice(
        newValue,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableInvoice(
        value,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        newValue,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        value,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#cancelledReason() cancelledReason} attribute.
   * @param value The value for cancelledReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withCancelledReason(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "cancelledReason");
    if (Objects.equals(this.cancelledReason, newValue)) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        newValue,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#cancelledReason() cancelledReason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cancelledReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withCancelledReason(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.cancelledReason, value)) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        value,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#totalNet() totalNet} attribute.
   * @param value The value for totalNet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withTotalNet(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "totalNet");
    if (this.totalNet == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        newValue,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#totalNet() totalNet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for totalNet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withTotalNet(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.totalNet == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        value,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        newValue,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        value,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        newValue,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        value,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#paymentTerms() paymentTerms} attribute.
   * @param value The value for paymentTerms
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withPaymentTerms(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "paymentTerms");
    if (this.paymentTerms == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        newValue,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#paymentTerms() paymentTerms} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentTerms
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withPaymentTerms(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.paymentTerms == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        value,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        newValue,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        value,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        newValue,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        value,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withStatus(InvoiceStatus value) {
    @Nullable InvoiceStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        newValue,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withStatus(Optional<? extends InvoiceStatus> optional) {
    @Nullable InvoiceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        value,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withRecipient(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        newValue,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withRecipient(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        value,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        newValue,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        value,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#lineItem() lineItem} attribute.
   * @param value The value for lineItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withLineItem(List<Invoice_LineItem> value) {
    @Nullable List<Invoice_LineItem> newValue = Objects.requireNonNull(value, "lineItem");
    if (this.lineItem == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        newValue,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#lineItem() lineItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lineItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withLineItem(Optional<? extends List<Invoice_LineItem>> optional) {
    @Nullable List<Invoice_LineItem> value = optional.orElse(null);
    if (this.lineItem == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        value,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        newValue,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        value,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        newValue,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        value,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        newValue,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        value,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        newValue,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        value,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#account() account} attribute.
   * @param value The value for account
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withAccount(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "account");
    if (this.account == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        newValue,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#account() account} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for account
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withAccount(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.account == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        value,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        newValue,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        value,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Invoice#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInvoice withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        newValue,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#totalPriceComponent() totalPriceComponent} attribute.
   * @param value The value for totalPriceComponent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withTotalPriceComponent(List<Invoice_PriceComponent> value) {
    @Nullable List<Invoice_PriceComponent> newValue = Objects.requireNonNull(value, "totalPriceComponent");
    if (this.totalPriceComponent == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        newValue,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#totalPriceComponent() totalPriceComponent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for totalPriceComponent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withTotalPriceComponent(Optional<? extends List<Invoice_PriceComponent>> optional) {
    @Nullable List<Invoice_PriceComponent> value = optional.orElse(null);
    if (this.totalPriceComponent == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        value,
        this.participant,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withParticipant(List<Invoice_Participant> value) {
    @Nullable List<Invoice_Participant> newValue = Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        newValue,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withParticipant(Optional<? extends List<Invoice_Participant>> optional) {
    @Nullable List<Invoice_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        value,
        this.note,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        newValue,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        value,
        this.issuer,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#issuer() issuer} attribute.
   * @param value The value for issuer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withIssuer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "issuer");
    if (this.issuer == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        newValue,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#issuer() issuer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issuer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withIssuer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.issuer == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        value,
        this.totalGross);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#totalGross() totalGross} attribute.
   * @param value The value for totalGross
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withTotalGross(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "totalGross");
    if (this.totalGross == newValue) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#totalGross() totalGross} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for totalGross
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withTotalGross(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.totalGross == value) return this;
    return new ImmutableInvoice(
        this.identifier,
        this.date,
        this.cancelledReason,
        this.totalNet,
        this.type,
        this.modifierExtension,
        this.paymentTerms,
        this.id,
        this.text,
        this.status,
        this.recipient,
        this.subject,
        this.lineItem,
        this.extension,
        this.language,
        this.contained,
        this.implicitRules,
        this.account,
        this.meta,
        this.resourceType,
        this.totalPriceComponent,
        this.participant,
        this.note,
        this.issuer,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInvoice} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInvoice
        && equalTo((ImmutableInvoice) another);
  }

  private boolean equalTo(ImmutableInvoice another) {
    return Objects.equals(identifier, another.identifier)
        && Objects.equals(date, another.date)
        && Objects.equals(cancelledReason, another.cancelledReason)
        && Objects.equals(totalNet, another.totalNet)
        && Objects.equals(type, another.type)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(paymentTerms, another.paymentTerms)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(status, another.status)
        && Objects.equals(recipient, another.recipient)
        && Objects.equals(subject, another.subject)
        && Objects.equals(lineItem, another.lineItem)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(contained, another.contained)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(account, another.account)
        && Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && Objects.equals(totalPriceComponent, another.totalPriceComponent)
        && Objects.equals(participant, another.participant)
        && Objects.equals(note, another.note)
        && Objects.equals(issuer, another.issuer)
        && Objects.equals(totalGross, another.totalGross);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code date}, {@code cancelledReason}, {@code totalNet}, {@code type}, {@code modifierExtension}, {@code paymentTerms}, {@code id}, {@code text}, {@code status}, {@code recipient}, {@code subject}, {@code lineItem}, {@code extension}, {@code language}, {@code contained}, {@code implicitRules}, {@code account}, {@code meta}, {@code resourceType}, {@code totalPriceComponent}, {@code participant}, {@code note}, {@code issuer}, {@code totalGross}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(cancelledReason);
    h += (h << 5) + Objects.hashCode(totalNet);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(paymentTerms);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(recipient);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(lineItem);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(account);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(totalPriceComponent);
    h += (h << 5) + Objects.hashCode(participant);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(issuer);
    h += (h << 5) + Objects.hashCode(totalGross);
    return h;
  }

  /**
   * Prints the immutable value {@code Invoice} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Invoice{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (date != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (cancelledReason != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("cancelledReason=").append(cancelledReason);
    }
    if (totalNet != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("totalNet=").append(totalNet);
    }
    if (type != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (modifierExtension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (paymentTerms != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("paymentTerms=").append(paymentTerms);
    }
    if (id != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (status != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (recipient != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (subject != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (lineItem != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("lineItem=").append(lineItem);
    }
    if (extension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (implicitRules != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (account != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("account=").append(account);
    }
    if (meta != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (totalPriceComponent != null) {
      builder.append(", ");
      builder.append("totalPriceComponent=").append(totalPriceComponent);
    }
    if (participant != null) {
      builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (issuer != null) {
      builder.append(", ");
      builder.append("issuer=").append(issuer);
    }
    if (totalGross != null) {
      builder.append(", ");
      builder.append("totalGross=").append(totalGross);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Invoice", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Invoice {
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<String> cancelledReason = Optional.empty();
    boolean cancelledReasonIsSet;
    @Nullable Optional<Money> totalNet = Optional.empty();
    boolean totalNetIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Markdown> paymentTerms = Optional.empty();
    boolean paymentTermsIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<InvoiceStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> recipient = Optional.empty();
    boolean recipientIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<Invoice_LineItem>> lineItem = Optional.empty();
    boolean lineItemIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> account = Optional.empty();
    boolean accountIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Invoice_PriceComponent>> totalPriceComponent = Optional.empty();
    boolean totalPriceComponentIsSet;
    @Nullable Optional<List<Invoice_Participant>> participant = Optional.empty();
    boolean participantIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Reference> issuer = Optional.empty();
    boolean issuerIsSet;
    @Nullable Optional<Money> totalGross = Optional.empty();
    boolean totalGrossIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("cancelledReason")
    public void setCancelledReason(Optional<String> cancelledReason) {
      this.cancelledReason = cancelledReason;
      this.cancelledReasonIsSet = true;
    }
    @JsonProperty("totalNet")
    public void setTotalNet(Optional<Money> totalNet) {
      this.totalNet = totalNet;
      this.totalNetIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("paymentTerms")
    public void setPaymentTerms(Optional<Markdown> paymentTerms) {
      this.paymentTerms = paymentTerms;
      this.paymentTermsIsSet = true;
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
    @JsonProperty("status")
    public void setStatus(Optional<InvoiceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("recipient")
    public void setRecipient(Optional<Reference> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("lineItem")
    public void setLineItem(Optional<List<Invoice_LineItem>> lineItem) {
      this.lineItem = lineItem;
      this.lineItemIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("account")
    public void setAccount(Optional<Reference> account) {
      this.account = account;
      this.accountIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("totalPriceComponent")
    public void setTotalPriceComponent(Optional<List<Invoice_PriceComponent>> totalPriceComponent) {
      this.totalPriceComponent = totalPriceComponent;
      this.totalPriceComponentIsSet = true;
    }
    @JsonProperty("participant")
    public void setParticipant(Optional<List<Invoice_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("issuer")
    public void setIssuer(Optional<Reference> issuer) {
      this.issuer = issuer;
      this.issuerIsSet = true;
    }
    @JsonProperty("totalGross")
    public void setTotalGross(Optional<Money> totalGross) {
      this.totalGross = totalGross;
      this.totalGrossIsSet = true;
    }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> cancelledReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> totalNet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> paymentTerms() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<InvoiceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Invoice_LineItem>> lineItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> account() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Invoice_PriceComponent>> totalPriceComponent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Invoice_Participant>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> issuer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> totalGross() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInvoice fromJson(Json json) {
    ImmutableInvoice.Builder builder = ((ImmutableInvoice.Builder) ImmutableInvoice.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.cancelledReasonIsSet) {
      builder.cancelledReason(json.cancelledReason);
    }
    if (json.totalNetIsSet) {
      builder.totalNet(json.totalNet);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.paymentTermsIsSet) {
      builder.paymentTerms(json.paymentTerms);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.lineItemIsSet) {
      builder.lineItem(json.lineItem);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.accountIsSet) {
      builder.account(json.account);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.totalPriceComponentIsSet) {
      builder.totalPriceComponent(json.totalPriceComponent);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.issuerIsSet) {
      builder.issuer(json.issuer);
    }
    if (json.totalGrossIsSet) {
      builder.totalGross(json.totalGross);
    }
    return (ImmutableInvoice) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Invoice} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Invoice instance
   */
  public static Invoice copyOf(Invoice instance) {
    if (instance instanceof ImmutableInvoice) {
      return (ImmutableInvoice) instance;
    }
    return ((ImmutableInvoice.Builder) ImmutableInvoice.builder())
        .identifier(instance.identifier())
        .date(instance.date())
        .cancelledReason(instance.cancelledReason())
        .totalNet(instance.totalNet())
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .paymentTerms(instance.paymentTerms())
        .id(instance.id())
        .text(instance.text())
        .status(instance.status())
        .recipient(instance.recipient())
        .subject(instance.subject())
        .lineItem(instance.lineItem())
        .extension(instance.extension())
        .language(instance.language())
        .contained(instance.contained())
        .implicitRules(instance.implicitRules())
        .account(instance.account())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .totalPriceComponent(instance.totalPriceComponent())
        .participant(instance.participant())
        .note(instance.note())
        .issuer(instance.issuer())
        .totalGross(instance.totalGross())
        .build();
  }

  /**
   * Creates a builder for {@link Invoice Invoice}.
   * <pre>
   * ImmutableInvoice.builder()
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Invoice#identifier() identifier}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link Invoice#date() date}
   *    .cancelledReason(String) // optional {@link Invoice#cancelledReason() cancelledReason}
   *    .totalNet(com.fhir.types.fhir.Money) // optional {@link Invoice#totalNet() totalNet}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Invoice#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Invoice#modifierExtension() modifierExtension}
   *    .paymentTerms(com.fhir.types.fhir.Markdown) // optional {@link Invoice#paymentTerms() paymentTerms}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Invoice#id() id}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Invoice#text() text}
   *    .status(com.fhir.types.fhir.InvoiceStatus) // optional {@link Invoice#status() status}
   *    .recipient(com.fhir.types.fhir.Reference) // optional {@link Invoice#recipient() recipient}
   *    .subject(com.fhir.types.fhir.Reference) // optional {@link Invoice#subject() subject}
   *    .lineItem(List&amp;lt;com.fhir.types.fhir.Invoice_LineItem&amp;gt;) // optional {@link Invoice#lineItem() lineItem}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Invoice#extension() extension}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Invoice#language() language}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Invoice#contained() contained}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Invoice#implicitRules() implicitRules}
   *    .account(com.fhir.types.fhir.Reference) // optional {@link Invoice#account() account}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Invoice#meta() meta}
   *    .resourceType(String) // required {@link Invoice#resourceType() resourceType}
   *    .totalPriceComponent(List&amp;lt;com.fhir.types.fhir.Invoice_PriceComponent&amp;gt;) // optional {@link Invoice#totalPriceComponent() totalPriceComponent}
   *    .participant(List&amp;lt;com.fhir.types.fhir.Invoice_Participant&amp;gt;) // optional {@link Invoice#participant() participant}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Invoice#note() note}
   *    .issuer(com.fhir.types.fhir.Reference) // optional {@link Invoice#issuer() issuer}
   *    .totalGross(com.fhir.types.fhir.Money) // optional {@link Invoice#totalGross() totalGross}
   *    .build();
   * </pre>
   * @return A new Invoice builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableInvoice.Builder();
  }

  /**
   * Builds instances of type {@link Invoice Invoice}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Invoice", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_DATE = 0x2L;
    private static final long OPT_BIT_CANCELLED_REASON = 0x4L;
    private static final long OPT_BIT_TOTAL_NET = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_PAYMENT_TERMS = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_RECIPIENT = 0x400L;
    private static final long OPT_BIT_SUBJECT = 0x800L;
    private static final long OPT_BIT_LINE_ITEM = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_ACCOUNT = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private static final long OPT_BIT_TOTAL_PRICE_COMPONENT = 0x80000L;
    private static final long OPT_BIT_PARTICIPANT = 0x100000L;
    private static final long OPT_BIT_NOTE = 0x200000L;
    private static final long OPT_BIT_ISSUER = 0x400000L;
    private static final long OPT_BIT_TOTAL_GROSS = 0x800000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Identifier> identifier;
    private @Nullable DateTime date;
    private @Nullable String cancelledReason;
    private @Nullable Money totalNet;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Markdown paymentTerms;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable InvoiceStatus status;
    private @Nullable Reference recipient;
    private @Nullable Reference subject;
    private @Nullable List<Invoice_LineItem> lineItem;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable List<ResourceList> contained;
    private @Nullable Uri implicitRules;
    private @Nullable Reference account;
    private @Nullable Meta meta;
    private @Nullable String resourceType;
    private @Nullable List<Invoice_PriceComponent> totalPriceComponent;
    private @Nullable List<Invoice_Participant> participant;
    private @Nullable List<Annotation> note;
    private @Nullable Reference issuer;
    private @Nullable Money totalGross;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Invoice#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Invoice#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Invoice#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#cancelledReason() cancelledReason} to cancelledReason.
     * @param cancelledReason The value for cancelledReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder cancelledReason(String cancelledReason) {
      checkNotIsSet(cancelledReasonIsSet(), "cancelledReason");
      this.cancelledReason = Objects.requireNonNull(cancelledReason, "cancelledReason");
      optBits |= OPT_BIT_CANCELLED_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#cancelledReason() cancelledReason} to cancelledReason.
     * @param cancelledReason The value for cancelledReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cancelledReason")
    public final Builder cancelledReason(Optional<String> cancelledReason) {
      checkNotIsSet(cancelledReasonIsSet(), "cancelledReason");
      this.cancelledReason = cancelledReason.orElse(null);
      optBits |= OPT_BIT_CANCELLED_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalNet() totalNet} to totalNet.
     * @param totalNet The value for totalNet
     * @return {@code this} builder for chained invocation
     */
    public final Builder totalNet(Money totalNet) {
      checkNotIsSet(totalNetIsSet(), "totalNet");
      this.totalNet = Objects.requireNonNull(totalNet, "totalNet");
      optBits |= OPT_BIT_TOTAL_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalNet() totalNet} to totalNet.
     * @param totalNet The value for totalNet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("totalNet")
    public final Builder totalNet(Optional<? extends Money> totalNet) {
      checkNotIsSet(totalNetIsSet(), "totalNet");
      this.totalNet = totalNet.orElse(null);
      optBits |= OPT_BIT_TOTAL_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#type() type} to type.
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
     * Initializes the optional value {@link Invoice#type() type} to type.
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
     * Initializes the optional value {@link Invoice#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Invoice#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Invoice#paymentTerms() paymentTerms} to paymentTerms.
     * @param paymentTerms The value for paymentTerms
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentTerms(Markdown paymentTerms) {
      checkNotIsSet(paymentTermsIsSet(), "paymentTerms");
      this.paymentTerms = Objects.requireNonNull(paymentTerms, "paymentTerms");
      optBits |= OPT_BIT_PAYMENT_TERMS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#paymentTerms() paymentTerms} to paymentTerms.
     * @param paymentTerms The value for paymentTerms
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paymentTerms")
    public final Builder paymentTerms(Optional<? extends Markdown> paymentTerms) {
      checkNotIsSet(paymentTermsIsSet(), "paymentTerms");
      this.paymentTerms = paymentTerms.orElse(null);
      optBits |= OPT_BIT_PAYMENT_TERMS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#id() id} to id.
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
     * Initializes the optional value {@link Invoice#id() id} to id.
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
     * Initializes the optional value {@link Invoice#text() text} to text.
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
     * Initializes the optional value {@link Invoice#text() text} to text.
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
     * Initializes the optional value {@link Invoice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(InvoiceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends InvoiceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#recipient() recipient} to recipient.
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
     * Initializes the optional value {@link Invoice#recipient() recipient} to recipient.
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
     * Initializes the optional value {@link Invoice#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#lineItem() lineItem} to lineItem.
     * @param lineItem The value for lineItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder lineItem(List<Invoice_LineItem> lineItem) {
      checkNotIsSet(lineItemIsSet(), "lineItem");
      this.lineItem = Objects.requireNonNull(lineItem, "lineItem");
      optBits |= OPT_BIT_LINE_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#lineItem() lineItem} to lineItem.
     * @param lineItem The value for lineItem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lineItem")
    public final Builder lineItem(Optional<? extends List<Invoice_LineItem>> lineItem) {
      checkNotIsSet(lineItemIsSet(), "lineItem");
      this.lineItem = lineItem.orElse(null);
      optBits |= OPT_BIT_LINE_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#extension() extension} to extension.
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
     * Initializes the optional value {@link Invoice#extension() extension} to extension.
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
     * Initializes the optional value {@link Invoice#language() language} to language.
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
     * Initializes the optional value {@link Invoice#language() language} to language.
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
     * Initializes the optional value {@link Invoice#contained() contained} to contained.
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
     * Initializes the optional value {@link Invoice#contained() contained} to contained.
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
     * Initializes the optional value {@link Invoice#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Invoice#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Invoice#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    public final Builder account(Reference account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = Objects.requireNonNull(account, "account");
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("account")
    public final Builder account(Optional<? extends Reference> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = account.orElse(null);
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#meta() meta} to meta.
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
     * Initializes the optional value {@link Invoice#meta() meta} to meta.
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
     * Initializes the value for the {@link Invoice#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Invoice#totalPriceComponent() totalPriceComponent} to totalPriceComponent.
     * @param totalPriceComponent The value for totalPriceComponent
     * @return {@code this} builder for chained invocation
     */
    public final Builder totalPriceComponent(List<Invoice_PriceComponent> totalPriceComponent) {
      checkNotIsSet(totalPriceComponentIsSet(), "totalPriceComponent");
      this.totalPriceComponent = Objects.requireNonNull(totalPriceComponent, "totalPriceComponent");
      optBits |= OPT_BIT_TOTAL_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalPriceComponent() totalPriceComponent} to totalPriceComponent.
     * @param totalPriceComponent The value for totalPriceComponent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("totalPriceComponent")
    public final Builder totalPriceComponent(Optional<? extends List<Invoice_PriceComponent>> totalPriceComponent) {
      checkNotIsSet(totalPriceComponentIsSet(), "totalPriceComponent");
      this.totalPriceComponent = totalPriceComponent.orElse(null);
      optBits |= OPT_BIT_TOTAL_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(List<Invoice_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participant")
    public final Builder participant(Optional<? extends List<Invoice_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for chained invocation
     */
    public final Builder issuer(Reference issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = Objects.requireNonNull(issuer, "issuer");
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issuer")
    public final Builder issuer(Optional<? extends Reference> issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = issuer.orElse(null);
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalGross() totalGross} to totalGross.
     * @param totalGross The value for totalGross
     * @return {@code this} builder for chained invocation
     */
    public final Builder totalGross(Money totalGross) {
      checkNotIsSet(totalGrossIsSet(), "totalGross");
      this.totalGross = Objects.requireNonNull(totalGross, "totalGross");
      optBits |= OPT_BIT_TOTAL_GROSS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalGross() totalGross} to totalGross.
     * @param totalGross The value for totalGross
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("totalGross")
    public final Builder totalGross(Optional<? extends Money> totalGross) {
      checkNotIsSet(totalGrossIsSet(), "totalGross");
      this.totalGross = totalGross.orElse(null);
      optBits |= OPT_BIT_TOTAL_GROSS;
      return this;
    }

    /**
     * Builds a new {@link Invoice Invoice}.
     * @return An immutable instance of Invoice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Invoice build() {
      checkRequiredAttributes();
      return new ImmutableInvoice(
          identifier,
          date,
          cancelledReason,
          totalNet,
          type,
          modifierExtension,
          paymentTerms,
          id,
          text,
          status,
          recipient,
          subject,
          lineItem,
          extension,
          language,
          contained,
          implicitRules,
          account,
          meta,
          resourceType,
          totalPriceComponent,
          participant,
          note,
          issuer,
          totalGross);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean cancelledReasonIsSet() {
      return (optBits & OPT_BIT_CANCELLED_REASON) != 0;
    }

    private boolean totalNetIsSet() {
      return (optBits & OPT_BIT_TOTAL_NET) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean paymentTermsIsSet() {
      return (optBits & OPT_BIT_PAYMENT_TERMS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean lineItemIsSet() {
      return (optBits & OPT_BIT_LINE_ITEM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean accountIsSet() {
      return (optBits & OPT_BIT_ACCOUNT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean totalPriceComponentIsSet() {
      return (optBits & OPT_BIT_TOTAL_PRICE_COMPONENT) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean issuerIsSet() {
      return (optBits & OPT_BIT_ISSUER) != 0;
    }

    private boolean totalGrossIsSet() {
      return (optBits & OPT_BIT_TOTAL_GROSS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Invoice is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Invoice, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Invoice", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Invoice#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Invoice", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Invoice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Invoice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Invoice#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link Invoice#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link Invoice#cancelledReason() cancelledReason} to cancelledReason.
     * @param cancelledReason The value for cancelledReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cancelledReason(String cancelledReason);

    /**
     * Initializes the optional value {@link Invoice#cancelledReason() cancelledReason} to cancelledReason.
     * @param cancelledReason The value for cancelledReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cancelledReason(Optional<String> cancelledReason);

    /**
     * Initializes the optional value {@link Invoice#totalNet() totalNet} to totalNet.
     * @param totalNet The value for totalNet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal totalNet(Money totalNet);

    /**
     * Initializes the optional value {@link Invoice#totalNet() totalNet} to totalNet.
     * @param totalNet The value for totalNet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal totalNet(Optional<? extends Money> totalNet);

    /**
     * Initializes the optional value {@link Invoice#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Invoice#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link Invoice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Invoice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Invoice#paymentTerms() paymentTerms} to paymentTerms.
     * @param paymentTerms The value for paymentTerms
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentTerms(Markdown paymentTerms);

    /**
     * Initializes the optional value {@link Invoice#paymentTerms() paymentTerms} to paymentTerms.
     * @param paymentTerms The value for paymentTerms
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentTerms(Optional<? extends Markdown> paymentTerms);

    /**
     * Initializes the optional value {@link Invoice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Invoice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Invoice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Invoice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Invoice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(InvoiceStatus status);

    /**
     * Initializes the optional value {@link Invoice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends InvoiceStatus> status);

    /**
     * Initializes the optional value {@link Invoice#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recipient(Reference recipient);

    /**
     * Initializes the optional value {@link Invoice#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(Optional<? extends Reference> recipient);

    /**
     * Initializes the optional value {@link Invoice#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link Invoice#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link Invoice#lineItem() lineItem} to lineItem.
     * @param lineItem The value for lineItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lineItem(List<Invoice_LineItem> lineItem);

    /**
     * Initializes the optional value {@link Invoice#lineItem() lineItem} to lineItem.
     * @param lineItem The value for lineItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lineItem(Optional<? extends List<Invoice_LineItem>> lineItem);

    /**
     * Initializes the optional value {@link Invoice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Invoice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Invoice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Invoice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Invoice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Invoice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Invoice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Invoice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Invoice#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    BuildFinal account(Reference account);

    /**
     * Initializes the optional value {@link Invoice#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal account(Optional<? extends Reference> account);

    /**
     * Initializes the optional value {@link Invoice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Invoice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Invoice#totalPriceComponent() totalPriceComponent} to totalPriceComponent.
     * @param totalPriceComponent The value for totalPriceComponent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal totalPriceComponent(List<Invoice_PriceComponent> totalPriceComponent);

    /**
     * Initializes the optional value {@link Invoice#totalPriceComponent() totalPriceComponent} to totalPriceComponent.
     * @param totalPriceComponent The value for totalPriceComponent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal totalPriceComponent(Optional<? extends List<Invoice_PriceComponent>> totalPriceComponent);

    /**
     * Initializes the optional value {@link Invoice#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(List<Invoice_Participant> participant);

    /**
     * Initializes the optional value {@link Invoice#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(Optional<? extends List<Invoice_Participant>> participant);

    /**
     * Initializes the optional value {@link Invoice#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Invoice#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Invoice#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issuer(Reference issuer);

    /**
     * Initializes the optional value {@link Invoice#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issuer(Optional<? extends Reference> issuer);

    /**
     * Initializes the optional value {@link Invoice#totalGross() totalGross} to totalGross.
     * @param totalGross The value for totalGross
     * @return {@code this} builder for chained invocation
     */
    BuildFinal totalGross(Money totalGross);

    /**
     * Initializes the optional value {@link Invoice#totalGross() totalGross} to totalGross.
     * @param totalGross The value for totalGross
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal totalGross(Optional<? extends Money> totalGross);

    /**
     * Builds a new {@link Invoice Invoice}.
     * @return An immutable instance of Invoice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Invoice build();
  }
}
