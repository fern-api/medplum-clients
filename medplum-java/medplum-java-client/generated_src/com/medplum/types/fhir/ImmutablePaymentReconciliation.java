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
 * Immutable implementation of {@link PaymentReconciliation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePaymentReconciliation.builder()}.
 */
@Generated(from = "PaymentReconciliation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePaymentReconciliation implements PaymentReconciliation {
  private final @Nullable Narrative text;
  private final @Nullable List<PaymentReconciliation_ProcessNote> processNote;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Code language;
  private final @Nullable Reference request;
  private final @Nullable DateTime created;
  private final @Nullable Code status;
  private final @Nullable String disposition;
  private final String resourceType;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference paymentIssuer;
  private final Money paymentAmount;
  private final @Nullable CodeableConcept formCode;
  private final @Nullable Period period;
  private final @Nullable Identifier paymentIdentifier;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<PaymentReconciliation_Detail> detail;
  private final @Nullable Date paymentDate;
  private final @Nullable Reference requestor;
  private final @Nullable PaymentreconciliationOutcome outcome;

  private ImmutablePaymentReconciliation(
      @Nullable Narrative text,
      @Nullable List<PaymentReconciliation_ProcessNote> processNote,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable Code language,
      @Nullable Reference request,
      @Nullable DateTime created,
      @Nullable Code status,
      @Nullable String disposition,
      String resourceType,
      @Nullable List<Identifier> identifier,
      @Nullable Uri implicitRules,
      @Nullable Reference paymentIssuer,
      Money paymentAmount,
      @Nullable CodeableConcept formCode,
      @Nullable Period period,
      @Nullable Identifier paymentIdentifier,
      @Nullable List<Extension> extension,
      @Nullable List<PaymentReconciliation_Detail> detail,
      @Nullable Date paymentDate,
      @Nullable Reference requestor,
      @Nullable PaymentreconciliationOutcome outcome) {
    this.text = text;
    this.processNote = processNote;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.meta = meta;
    this.contained = contained;
    this.language = language;
    this.request = request;
    this.created = created;
    this.status = status;
    this.disposition = disposition;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.paymentIssuer = paymentIssuer;
    this.paymentAmount = paymentAmount;
    this.formCode = formCode;
    this.period = period;
    this.paymentIdentifier = paymentIdentifier;
    this.extension = extension;
    this.detail = detail;
    this.paymentDate = paymentDate;
    this.requestor = requestor;
    this.outcome = outcome;
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
   * @return The value of the {@code processNote} attribute
   */
  @JsonProperty("processNote")
  @Override
  public Optional<List<PaymentReconciliation_ProcessNote>> processNote() {
    return Optional.ofNullable(processNote);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<Reference> request() {
    return Optional.ofNullable(request);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code disposition} attribute
   */
  @JsonProperty("disposition")
  @Override
  public Optional<String> disposition() {
    return Optional.ofNullable(disposition);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code paymentIssuer} attribute
   */
  @JsonProperty("paymentIssuer")
  @Override
  public Optional<Reference> paymentIssuer() {
    return Optional.ofNullable(paymentIssuer);
  }

  /**
   * @return The value of the {@code paymentAmount} attribute
   */
  @JsonProperty("paymentAmount")
  @Override
  public Money paymentAmount() {
    return paymentAmount;
  }

  /**
   * @return The value of the {@code formCode} attribute
   */
  @JsonProperty("formCode")
  @Override
  public Optional<CodeableConcept> formCode() {
    return Optional.ofNullable(formCode);
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
   * @return The value of the {@code paymentIdentifier} attribute
   */
  @JsonProperty("paymentIdentifier")
  @Override
  public Optional<Identifier> paymentIdentifier() {
    return Optional.ofNullable(paymentIdentifier);
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
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<List<PaymentReconciliation_Detail>> detail() {
    return Optional.ofNullable(detail);
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
   * @return The value of the {@code requestor} attribute
   */
  @JsonProperty("requestor")
  @Override
  public Optional<Reference> requestor() {
    return Optional.ofNullable(requestor);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<PaymentreconciliationOutcome> outcome() {
    return Optional.ofNullable(outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePaymentReconciliation(
        newValue,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePaymentReconciliation(
        value,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#processNote() processNote} attribute.
   * @param value The value for processNote
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withProcessNote(List<PaymentReconciliation_ProcessNote> value) {
    @Nullable List<PaymentReconciliation_ProcessNote> newValue = Objects.requireNonNull(value, "processNote");
    if (this.processNote == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        newValue,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#processNote() processNote} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for processNote
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withProcessNote(Optional<? extends List<PaymentReconciliation_ProcessNote>> optional) {
    @Nullable List<PaymentReconciliation_ProcessNote> value = optional.orElse(null);
    if (this.processNote == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        value,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        newValue,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        value,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        newValue,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        value,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        newValue,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        value,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        newValue,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        value,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        newValue,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        value,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withRequest(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        newValue,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withRequest(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        value,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        newValue,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        value,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        newValue,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        value,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#disposition() disposition} attribute.
   * @param value The value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withDisposition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "disposition");
    if (Objects.equals(this.disposition, newValue)) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        newValue,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#disposition() disposition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disposition
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withDisposition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.disposition, value)) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        value,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentReconciliation#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentReconciliation withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        newValue,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        newValue,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        value,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        newValue,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        value,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#paymentIssuer() paymentIssuer} attribute.
   * @param value The value for paymentIssuer
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withPaymentIssuer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "paymentIssuer");
    if (this.paymentIssuer == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        newValue,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#paymentIssuer() paymentIssuer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentIssuer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withPaymentIssuer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.paymentIssuer == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        value,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PaymentReconciliation#paymentAmount() paymentAmount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for paymentAmount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePaymentReconciliation withPaymentAmount(Money value) {
    if (this.paymentAmount == value) return this;
    Money newValue = Objects.requireNonNull(value, "paymentAmount");
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        newValue,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#formCode() formCode} attribute.
   * @param value The value for formCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withFormCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "formCode");
    if (this.formCode == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        newValue,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#formCode() formCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for formCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withFormCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.formCode == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        value,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        newValue,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        value,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} attribute.
   * @param value The value for paymentIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withPaymentIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "paymentIdentifier");
    if (this.paymentIdentifier == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        newValue,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withPaymentIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.paymentIdentifier == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        value,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        newValue,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        value,
        this.detail,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withDetail(List<PaymentReconciliation_Detail> value) {
    @Nullable List<PaymentReconciliation_Detail> newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        newValue,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withDetail(Optional<? extends List<PaymentReconciliation_Detail>> optional) {
    @Nullable List<PaymentReconciliation_Detail> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        value,
        this.paymentDate,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#paymentDate() paymentDate} attribute.
   * @param value The value for paymentDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withPaymentDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "paymentDate");
    if (this.paymentDate == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        newValue,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#paymentDate() paymentDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withPaymentDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.paymentDate == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        value,
        this.requestor,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#requestor() requestor} attribute.
   * @param value The value for requestor
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withRequestor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requestor");
    if (this.requestor == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        newValue,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#requestor() requestor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withRequestor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requestor == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        value,
        this.outcome);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PaymentReconciliation#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePaymentReconciliation withOutcome(PaymentreconciliationOutcome value) {
    @Nullable PaymentreconciliationOutcome newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PaymentReconciliation#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePaymentReconciliation withOutcome(Optional<? extends PaymentreconciliationOutcome> optional) {
    @Nullable PaymentreconciliationOutcome value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutablePaymentReconciliation(
        this.text,
        this.processNote,
        this.id,
        this.modifierExtension,
        this.meta,
        this.contained,
        this.language,
        this.request,
        this.created,
        this.status,
        this.disposition,
        this.resourceType,
        this.identifier,
        this.implicitRules,
        this.paymentIssuer,
        this.paymentAmount,
        this.formCode,
        this.period,
        this.paymentIdentifier,
        this.extension,
        this.detail,
        this.paymentDate,
        this.requestor,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePaymentReconciliation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePaymentReconciliation
        && equalTo((ImmutablePaymentReconciliation) another);
  }

  private boolean equalTo(ImmutablePaymentReconciliation another) {
    return Objects.equals(text, another.text)
        && Objects.equals(processNote, another.processNote)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(language, another.language)
        && Objects.equals(request, another.request)
        && Objects.equals(created, another.created)
        && Objects.equals(status, another.status)
        && Objects.equals(disposition, another.disposition)
        && resourceType.equals(another.resourceType)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(paymentIssuer, another.paymentIssuer)
        && paymentAmount.equals(another.paymentAmount)
        && Objects.equals(formCode, another.formCode)
        && Objects.equals(period, another.period)
        && Objects.equals(paymentIdentifier, another.paymentIdentifier)
        && Objects.equals(extension, another.extension)
        && Objects.equals(detail, another.detail)
        && Objects.equals(paymentDate, another.paymentDate)
        && Objects.equals(requestor, another.requestor)
        && Objects.equals(outcome, another.outcome);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code processNote}, {@code id}, {@code modifierExtension}, {@code meta}, {@code contained}, {@code language}, {@code request}, {@code created}, {@code status}, {@code disposition}, {@code resourceType}, {@code identifier}, {@code implicitRules}, {@code paymentIssuer}, {@code paymentAmount}, {@code formCode}, {@code period}, {@code paymentIdentifier}, {@code extension}, {@code detail}, {@code paymentDate}, {@code requestor}, {@code outcome}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(processNote);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(disposition);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(paymentIssuer);
    h += (h << 5) + paymentAmount.hashCode();
    h += (h << 5) + Objects.hashCode(formCode);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(paymentIdentifier);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(paymentDate);
    h += (h << 5) + Objects.hashCode(requestor);
    h += (h << 5) + Objects.hashCode(outcome);
    return h;
  }

  /**
   * Prints the immutable value {@code PaymentReconciliation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PaymentReconciliation{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (processNote != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("processNote=").append(processNote);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (meta != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (request != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("request=").append(request);
    }
    if (created != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("created=").append(created);
    }
    if (status != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (disposition != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("disposition=").append(disposition);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (paymentIssuer != null) {
      builder.append(", ");
      builder.append("paymentIssuer=").append(paymentIssuer);
    }
    builder.append(", ");
    builder.append("paymentAmount=").append(paymentAmount);
    if (formCode != null) {
      builder.append(", ");
      builder.append("formCode=").append(formCode);
    }
    if (period != null) {
      builder.append(", ");
      builder.append("period=").append(period);
    }
    if (paymentIdentifier != null) {
      builder.append(", ");
      builder.append("paymentIdentifier=").append(paymentIdentifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (detail != null) {
      builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (paymentDate != null) {
      builder.append(", ");
      builder.append("paymentDate=").append(paymentDate);
    }
    if (requestor != null) {
      builder.append(", ");
      builder.append("requestor=").append(requestor);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PaymentReconciliation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PaymentReconciliation {
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<PaymentReconciliation_ProcessNote>> processNote = Optional.empty();
    boolean processNoteIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Reference> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<String> disposition = Optional.empty();
    boolean dispositionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> paymentIssuer = Optional.empty();
    boolean paymentIssuerIsSet;
    @Nullable Money paymentAmount;
    @Nullable Optional<CodeableConcept> formCode = Optional.empty();
    boolean formCodeIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<Identifier> paymentIdentifier = Optional.empty();
    boolean paymentIdentifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<PaymentReconciliation_Detail>> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<Date> paymentDate = Optional.empty();
    boolean paymentDateIsSet;
    @Nullable Optional<Reference> requestor = Optional.empty();
    boolean requestorIsSet;
    @Nullable Optional<PaymentreconciliationOutcome> outcome = Optional.empty();
    boolean outcomeIsSet;
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("processNote")
    public void setProcessNote(Optional<List<PaymentReconciliation_ProcessNote>> processNote) {
      this.processNote = processNote;
      this.processNoteIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<Reference> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("disposition")
    public void setDisposition(Optional<String> disposition) {
      this.disposition = disposition;
      this.dispositionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("paymentIssuer")
    public void setPaymentIssuer(Optional<Reference> paymentIssuer) {
      this.paymentIssuer = paymentIssuer;
      this.paymentIssuerIsSet = true;
    }
    @JsonProperty("paymentAmount")
    public void setPaymentAmount(Money paymentAmount) {
      this.paymentAmount = paymentAmount;
    }
    @JsonProperty("formCode")
    public void setFormCode(Optional<CodeableConcept> formCode) {
      this.formCode = formCode;
      this.formCodeIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("paymentIdentifier")
    public void setPaymentIdentifier(Optional<Identifier> paymentIdentifier) {
      this.paymentIdentifier = paymentIdentifier;
      this.paymentIdentifierIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<List<PaymentReconciliation_Detail>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("paymentDate")
    public void setPaymentDate(Optional<Date> paymentDate) {
      this.paymentDate = paymentDate;
      this.paymentDateIsSet = true;
    }
    @JsonProperty("requestor")
    public void setRequestor(Optional<Reference> requestor) {
      this.requestor = requestor;
      this.requestorIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<PaymentreconciliationOutcome> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PaymentReconciliation_ProcessNote>> processNote() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> disposition() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> paymentIssuer() { throw new UnsupportedOperationException(); }
    @Override
    public Money paymentAmount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> formCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> paymentIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PaymentReconciliation_Detail>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> paymentDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requestor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PaymentreconciliationOutcome> outcome() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePaymentReconciliation fromJson(Json json) {
    ImmutablePaymentReconciliation.Builder builder = ((ImmutablePaymentReconciliation.Builder) ImmutablePaymentReconciliation.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.processNoteIsSet) {
      builder.processNote(json.processNote);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.dispositionIsSet) {
      builder.disposition(json.disposition);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.paymentIssuerIsSet) {
      builder.paymentIssuer(json.paymentIssuer);
    }
    if (json.paymentAmount != null) {
      builder.paymentAmount(json.paymentAmount);
    }
    if (json.formCodeIsSet) {
      builder.formCode(json.formCode);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.paymentIdentifierIsSet) {
      builder.paymentIdentifier(json.paymentIdentifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.paymentDateIsSet) {
      builder.paymentDate(json.paymentDate);
    }
    if (json.requestorIsSet) {
      builder.requestor(json.requestor);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    return (ImmutablePaymentReconciliation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PaymentReconciliation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PaymentReconciliation instance
   */
  public static PaymentReconciliation copyOf(PaymentReconciliation instance) {
    if (instance instanceof ImmutablePaymentReconciliation) {
      return (ImmutablePaymentReconciliation) instance;
    }
    return ((ImmutablePaymentReconciliation.Builder) ImmutablePaymentReconciliation.builder())
        .text(instance.text())
        .processNote(instance.processNote())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .meta(instance.meta())
        .contained(instance.contained())
        .language(instance.language())
        .request(instance.request())
        .created(instance.created())
        .status(instance.status())
        .disposition(instance.disposition())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .paymentIssuer(instance.paymentIssuer())
        .paymentAmount(instance.paymentAmount())
        .formCode(instance.formCode())
        .period(instance.period())
        .paymentIdentifier(instance.paymentIdentifier())
        .extension(instance.extension())
        .detail(instance.detail())
        .paymentDate(instance.paymentDate())
        .requestor(instance.requestor())
        .outcome(instance.outcome())
        .build();
  }

  /**
   * Creates a builder for {@link PaymentReconciliation PaymentReconciliation}.
   * <pre>
   * ImmutablePaymentReconciliation.builder()
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link PaymentReconciliation#text() text}
   *    .processNote(List&amp;lt;com.medplum.types.fhir.PaymentReconciliation_ProcessNote&amp;gt;) // optional {@link PaymentReconciliation#processNote() processNote}
   *    .id(com.medplum.types.fhir.Id) // optional {@link PaymentReconciliation#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation#modifierExtension() modifierExtension}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link PaymentReconciliation#meta() meta}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link PaymentReconciliation#contained() contained}
   *    .language(com.medplum.types.fhir.Code) // optional {@link PaymentReconciliation#language() language}
   *    .request(com.medplum.types.fhir.Reference) // optional {@link PaymentReconciliation#request() request}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link PaymentReconciliation#created() created}
   *    .status(com.medplum.types.fhir.Code) // optional {@link PaymentReconciliation#status() status}
   *    .disposition(String) // optional {@link PaymentReconciliation#disposition() disposition}
   *    .resourceType(String) // required {@link PaymentReconciliation#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link PaymentReconciliation#identifier() identifier}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link PaymentReconciliation#implicitRules() implicitRules}
   *    .paymentIssuer(com.medplum.types.fhir.Reference) // optional {@link PaymentReconciliation#paymentIssuer() paymentIssuer}
   *    .paymentAmount(com.medplum.types.fhir.Money) // required {@link PaymentReconciliation#paymentAmount() paymentAmount}
   *    .formCode(com.medplum.types.fhir.CodeableConcept) // optional {@link PaymentReconciliation#formCode() formCode}
   *    .period(com.medplum.types.fhir.Period) // optional {@link PaymentReconciliation#period() period}
   *    .paymentIdentifier(com.medplum.types.fhir.Identifier) // optional {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PaymentReconciliation#extension() extension}
   *    .detail(List&amp;lt;com.medplum.types.fhir.PaymentReconciliation_Detail&amp;gt;) // optional {@link PaymentReconciliation#detail() detail}
   *    .paymentDate(com.medplum.types.fhir.Date) // optional {@link PaymentReconciliation#paymentDate() paymentDate}
   *    .requestor(com.medplum.types.fhir.Reference) // optional {@link PaymentReconciliation#requestor() requestor}
   *    .outcome(com.medplum.types.fhir.PaymentreconciliationOutcome) // optional {@link PaymentReconciliation#outcome() outcome}
   *    .build();
   * </pre>
   * @return A new PaymentReconciliation builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutablePaymentReconciliation.Builder();
  }

  /**
   * Builds instances of type {@link PaymentReconciliation PaymentReconciliation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PaymentReconciliation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, PaymentAmountBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_PAYMENT_AMOUNT = 0x2L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_PROCESS_NOTE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_REQUEST = 0x80L;
    private static final long OPT_BIT_CREATED = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_DISPOSITION = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_PAYMENT_ISSUER = 0x2000L;
    private static final long OPT_BIT_FORM_CODE = 0x4000L;
    private static final long OPT_BIT_PERIOD = 0x8000L;
    private static final long OPT_BIT_PAYMENT_IDENTIFIER = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_DETAIL = 0x40000L;
    private static final long OPT_BIT_PAYMENT_DATE = 0x80000L;
    private static final long OPT_BIT_REQUESTOR = 0x100000L;
    private static final long OPT_BIT_OUTCOME = 0x200000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Narrative text;
    private @Nullable List<PaymentReconciliation_ProcessNote> processNote;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable Code language;
    private @Nullable Reference request;
    private @Nullable DateTime created;
    private @Nullable Code status;
    private @Nullable String disposition;
    private @Nullable String resourceType;
    private @Nullable List<Identifier> identifier;
    private @Nullable Uri implicitRules;
    private @Nullable Reference paymentIssuer;
    private @Nullable Money paymentAmount;
    private @Nullable CodeableConcept formCode;
    private @Nullable Period period;
    private @Nullable Identifier paymentIdentifier;
    private @Nullable List<Extension> extension;
    private @Nullable List<PaymentReconciliation_Detail> detail;
    private @Nullable Date paymentDate;
    private @Nullable Reference requestor;
    private @Nullable PaymentreconciliationOutcome outcome;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#text() text} to text.
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
     * Initializes the optional value {@link PaymentReconciliation#text() text} to text.
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
     * Initializes the optional value {@link PaymentReconciliation#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    public final Builder processNote(List<PaymentReconciliation_ProcessNote> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = Objects.requireNonNull(processNote, "processNote");
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("processNote")
    public final Builder processNote(Optional<? extends List<PaymentReconciliation_ProcessNote>> processNote) {
      checkNotIsSet(processNoteIsSet(), "processNote");
      this.processNote = processNote.orElse(null);
      optBits |= OPT_BIT_PROCESS_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation#id() id} to id.
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
     * Initializes the optional value {@link PaymentReconciliation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PaymentReconciliation#meta() meta} to meta.
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
     * Initializes the optional value {@link PaymentReconciliation#meta() meta} to meta.
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
     * Initializes the optional value {@link PaymentReconciliation#contained() contained} to contained.
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
     * Initializes the optional value {@link PaymentReconciliation#contained() contained} to contained.
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
     * Initializes the optional value {@link PaymentReconciliation#language() language} to language.
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
     * Initializes the optional value {@link PaymentReconciliation#language() language} to language.
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
     * Initializes the optional value {@link PaymentReconciliation#request() request} to request.
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
     * Initializes the optional value {@link PaymentReconciliation#request() request} to request.
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
     * Initializes the optional value {@link PaymentReconciliation#created() created} to created.
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
     * Initializes the optional value {@link PaymentReconciliation#created() created} to created.
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
     * Initializes the optional value {@link PaymentReconciliation#status() status} to status.
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
     * Initializes the optional value {@link PaymentReconciliation#status() status} to status.
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
     * Initializes the optional value {@link PaymentReconciliation#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    public final Builder disposition(String disposition) {
      checkNotIsSet(dispositionIsSet(), "disposition");
      this.disposition = Objects.requireNonNull(disposition, "disposition");
      optBits |= OPT_BIT_DISPOSITION;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("disposition")
    public final Builder disposition(Optional<String> disposition) {
      checkNotIsSet(dispositionIsSet(), "disposition");
      this.disposition = disposition.orElse(null);
      optBits |= OPT_BIT_DISPOSITION;
      return this;
    }

    /**
     * Initializes the value for the {@link PaymentReconciliation#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link PaymentReconciliation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PaymentReconciliation#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PaymentReconciliation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PaymentReconciliation#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PaymentReconciliation#paymentIssuer() paymentIssuer} to paymentIssuer.
     * @param paymentIssuer The value for paymentIssuer
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentIssuer(Reference paymentIssuer) {
      checkNotIsSet(paymentIssuerIsSet(), "paymentIssuer");
      this.paymentIssuer = Objects.requireNonNull(paymentIssuer, "paymentIssuer");
      optBits |= OPT_BIT_PAYMENT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIssuer() paymentIssuer} to paymentIssuer.
     * @param paymentIssuer The value for paymentIssuer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paymentIssuer")
    public final Builder paymentIssuer(Optional<? extends Reference> paymentIssuer) {
      checkNotIsSet(paymentIssuerIsSet(), "paymentIssuer");
      this.paymentIssuer = paymentIssuer.orElse(null);
      optBits |= OPT_BIT_PAYMENT_ISSUER;
      return this;
    }

    /**
     * Initializes the value for the {@link PaymentReconciliation#paymentAmount() paymentAmount} attribute.
     * @param paymentAmount The value for paymentAmount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paymentAmount")
    public final Builder paymentAmount(Money paymentAmount) {
      checkNotIsSet(paymentAmountIsSet(), "paymentAmount");
      this.paymentAmount = Objects.requireNonNull(paymentAmount, "paymentAmount");
      initBits &= ~INIT_BIT_PAYMENT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder formCode(CodeableConcept formCode) {
      checkNotIsSet(formCodeIsSet(), "formCode");
      this.formCode = Objects.requireNonNull(formCode, "formCode");
      optBits |= OPT_BIT_FORM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("formCode")
    public final Builder formCode(Optional<? extends CodeableConcept> formCode) {
      checkNotIsSet(formCodeIsSet(), "formCode");
      this.formCode = formCode.orElse(null);
      optBits |= OPT_BIT_FORM_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#period() period} to period.
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
     * Initializes the optional value {@link PaymentReconciliation#period() period} to period.
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
     * Initializes the optional value {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} to paymentIdentifier.
     * @param paymentIdentifier The value for paymentIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentIdentifier(Identifier paymentIdentifier) {
      checkNotIsSet(paymentIdentifierIsSet(), "paymentIdentifier");
      this.paymentIdentifier = Objects.requireNonNull(paymentIdentifier, "paymentIdentifier");
      optBits |= OPT_BIT_PAYMENT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} to paymentIdentifier.
     * @param paymentIdentifier The value for paymentIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paymentIdentifier")
    public final Builder paymentIdentifier(Optional<? extends Identifier> paymentIdentifier) {
      checkNotIsSet(paymentIdentifierIsSet(), "paymentIdentifier");
      this.paymentIdentifier = paymentIdentifier.orElse(null);
      optBits |= OPT_BIT_PAYMENT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation#extension() extension} to extension.
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
     * Initializes the optional value {@link PaymentReconciliation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(List<PaymentReconciliation_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends List<PaymentReconciliation_Detail>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentDate() paymentDate} to paymentDate.
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
     * Initializes the optional value {@link PaymentReconciliation#paymentDate() paymentDate} to paymentDate.
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
     * Initializes the optional value {@link PaymentReconciliation#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestor(Reference requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = Objects.requireNonNull(requestor, "requestor");
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestor")
    public final Builder requestor(Optional<? extends Reference> requestor) {
      checkNotIsSet(requestorIsSet(), "requestor");
      this.requestor = requestor.orElse(null);
      optBits |= OPT_BIT_REQUESTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(PaymentreconciliationOutcome outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link PaymentReconciliation#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends PaymentreconciliationOutcome> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Builds a new {@link PaymentReconciliation PaymentReconciliation}.
     * @return An immutable instance of PaymentReconciliation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PaymentReconciliation build() {
      checkRequiredAttributes();
      return new ImmutablePaymentReconciliation(
          text,
          processNote,
          id,
          modifierExtension,
          meta,
          contained,
          language,
          request,
          created,
          status,
          disposition,
          resourceType,
          identifier,
          implicitRules,
          paymentIssuer,
          paymentAmount,
          formCode,
          period,
          paymentIdentifier,
          extension,
          detail,
          paymentDate,
          requestor,
          outcome);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean processNoteIsSet() {
      return (optBits & OPT_BIT_PROCESS_NOTE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean dispositionIsSet() {
      return (optBits & OPT_BIT_DISPOSITION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean paymentIssuerIsSet() {
      return (optBits & OPT_BIT_PAYMENT_ISSUER) != 0;
    }

    private boolean formCodeIsSet() {
      return (optBits & OPT_BIT_FORM_CODE) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean paymentIdentifierIsSet() {
      return (optBits & OPT_BIT_PAYMENT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean paymentDateIsSet() {
      return (optBits & OPT_BIT_PAYMENT_DATE) != 0;
    }

    private boolean requestorIsSet() {
      return (optBits & OPT_BIT_REQUESTOR) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean paymentAmountIsSet() {
      return (initBits & INIT_BIT_PAYMENT_AMOUNT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PaymentReconciliation is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!paymentAmountIsSet()) attributes.add("paymentAmount");
      return "Cannot build PaymentReconciliation, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "PaymentReconciliation", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link PaymentReconciliation#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PaymentAmountBuildStage resourceType(String resourceType);
  }

  @Generated(from = "PaymentReconciliation", generator = "Immutables")
  public interface PaymentAmountBuildStage {
    /**
     * Initializes the value for the {@link PaymentReconciliation#paymentAmount() paymentAmount} attribute.
     * @param paymentAmount The value for paymentAmount 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentAmount(Money paymentAmount);
  }

  @Generated(from = "PaymentReconciliation", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PaymentReconciliation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link PaymentReconciliation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link PaymentReconciliation#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for chained invocation
     */
    BuildFinal processNote(List<PaymentReconciliation_ProcessNote> processNote);

    /**
     * Initializes the optional value {@link PaymentReconciliation#processNote() processNote} to processNote.
     * @param processNote The value for processNote
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal processNote(Optional<? extends List<PaymentReconciliation_ProcessNote>> processNote);

    /**
     * Initializes the optional value {@link PaymentReconciliation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link PaymentReconciliation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link PaymentReconciliation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentReconciliation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PaymentReconciliation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link PaymentReconciliation#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link PaymentReconciliation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link PaymentReconciliation#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link PaymentReconciliation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link PaymentReconciliation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link PaymentReconciliation#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    BuildFinal request(Reference request);

    /**
     * Initializes the optional value {@link PaymentReconciliation#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal request(Optional<? extends Reference> request);

    /**
     * Initializes the optional value {@link PaymentReconciliation#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link PaymentReconciliation#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link PaymentReconciliation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link PaymentReconciliation#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link PaymentReconciliation#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disposition(String disposition);

    /**
     * Initializes the optional value {@link PaymentReconciliation#disposition() disposition} to disposition.
     * @param disposition The value for disposition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disposition(Optional<String> disposition);

    /**
     * Initializes the optional value {@link PaymentReconciliation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link PaymentReconciliation#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIssuer() paymentIssuer} to paymentIssuer.
     * @param paymentIssuer The value for paymentIssuer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentIssuer(Reference paymentIssuer);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIssuer() paymentIssuer} to paymentIssuer.
     * @param paymentIssuer The value for paymentIssuer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentIssuer(Optional<? extends Reference> paymentIssuer);

    /**
     * Initializes the optional value {@link PaymentReconciliation#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal formCode(CodeableConcept formCode);

    /**
     * Initializes the optional value {@link PaymentReconciliation#formCode() formCode} to formCode.
     * @param formCode The value for formCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal formCode(Optional<? extends CodeableConcept> formCode);

    /**
     * Initializes the optional value {@link PaymentReconciliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link PaymentReconciliation#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} to paymentIdentifier.
     * @param paymentIdentifier The value for paymentIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentIdentifier(Identifier paymentIdentifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentIdentifier() paymentIdentifier} to paymentIdentifier.
     * @param paymentIdentifier The value for paymentIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentIdentifier(Optional<? extends Identifier> paymentIdentifier);

    /**
     * Initializes the optional value {@link PaymentReconciliation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link PaymentReconciliation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link PaymentReconciliation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detail(List<PaymentReconciliation_Detail> detail);

    /**
     * Initializes the optional value {@link PaymentReconciliation#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detail(Optional<? extends List<PaymentReconciliation_Detail>> detail);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentDate(Date paymentDate);

    /**
     * Initializes the optional value {@link PaymentReconciliation#paymentDate() paymentDate} to paymentDate.
     * @param paymentDate The value for paymentDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentDate(Optional<? extends Date> paymentDate);

    /**
     * Initializes the optional value {@link PaymentReconciliation#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestor(Reference requestor);

    /**
     * Initializes the optional value {@link PaymentReconciliation#requestor() requestor} to requestor.
     * @param requestor The value for requestor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestor(Optional<? extends Reference> requestor);

    /**
     * Initializes the optional value {@link PaymentReconciliation#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(PaymentreconciliationOutcome outcome);

    /**
     * Initializes the optional value {@link PaymentReconciliation#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends PaymentreconciliationOutcome> outcome);

    /**
     * Builds a new {@link PaymentReconciliation PaymentReconciliation}.
     * @return An immutable instance of PaymentReconciliation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PaymentReconciliation build();
  }
}
