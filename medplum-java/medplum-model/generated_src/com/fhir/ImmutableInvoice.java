//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Invoice}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInvoice.builder()}.
 */
@org.immutables.value.Generated(from = "Invoice", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInvoice implements com.fhir.Invoice {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.Reference account;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Money totalNet;
  private final @javax.annotation.Nullable java.lang.String cancelledReason;
  private final @javax.annotation.Nullable com.fhir.Reference issuer;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Invoice_LineItem> lineItem;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Reference recipient;
  private final @javax.annotation.Nullable com.fhir.Money totalGross;
  private final @javax.annotation.Nullable com.fhir.markdown paymentTerms;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.InvoiceStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> totalPriceComponent;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Invoice_Participant> participant;

  private ImmutableInvoice(
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.Reference account,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Money totalNet,
      @javax.annotation.Nullable java.lang.String cancelledReason,
      @javax.annotation.Nullable com.fhir.Reference issuer,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Invoice_LineItem> lineItem,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Reference recipient,
      @javax.annotation.Nullable com.fhir.Money totalGross,
      @javax.annotation.Nullable com.fhir.markdown paymentTerms,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.InvoiceStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> totalPriceComponent,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.Invoice_Participant> participant) {
    this.note = note;
    this.account = account;
    this.resourceType = resourceType;
    this.totalNet = totalNet;
    this.cancelledReason = cancelledReason;
    this.issuer = issuer;
    this.subject = subject;
    this.lineItem = lineItem;
    this.identifier = identifier;
    this.modifierExtension = modifierExtension;
    this.language = language;
    this.type = type;
    this.extension = extension;
    this.text = text;
    this.contained = contained;
    this.recipient = recipient;
    this.totalGross = totalGross;
    this.paymentTerms = paymentTerms;
    this.implicitRules = implicitRules;
    this.id = id;
    this.meta = meta;
    this.status = status;
    this.totalPriceComponent = totalPriceComponent;
    this.date = date;
    this.participant = participant;
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code account} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("account")
  @Override
  public java.util.Optional<com.fhir.Reference> account() {
    return java.util.Optional.ofNullable(account);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code totalNet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("totalNet")
  @Override
  public java.util.Optional<com.fhir.Money> totalNet() {
    return java.util.Optional.ofNullable(totalNet);
  }

  /**
   * @return The value of the {@code cancelledReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cancelledReason")
  @Override
  public java.util.Optional<java.lang.String> cancelledReason() {
    return java.util.Optional.ofNullable(cancelledReason);
  }

  /**
   * @return The value of the {@code issuer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issuer")
  @Override
  public java.util.Optional<com.fhir.Reference> issuer() {
    return java.util.Optional.ofNullable(issuer);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code lineItem} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lineItem")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Invoice_LineItem>> lineItem() {
    return java.util.Optional.ofNullable(lineItem);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recipient")
  @Override
  public java.util.Optional<com.fhir.Reference> recipient() {
    return java.util.Optional.ofNullable(recipient);
  }

  /**
   * @return The value of the {@code totalGross} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("totalGross")
  @Override
  public java.util.Optional<com.fhir.Money> totalGross() {
    return java.util.Optional.ofNullable(totalGross);
  }

  /**
   * @return The value of the {@code paymentTerms} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paymentTerms")
  @Override
  public java.util.Optional<com.fhir.markdown> paymentTerms() {
    return java.util.Optional.ofNullable(paymentTerms);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.InvoiceStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code totalPriceComponent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("totalPriceComponent")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Invoice_PriceComponent>> totalPriceComponent() {
    return java.util.Optional.ofNullable(totalPriceComponent);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Invoice_Participant>> participant() {
    return java.util.Optional.ofNullable(participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableInvoice(
        newValue,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableInvoice(
        value,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#account() account} attribute.
   * @param value The value for account
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withAccount(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "account");
    if (this.account == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        newValue,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#account() account} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for account
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withAccount(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.account == value) return this;
    return new ImmutableInvoice(
        this.note,
        value,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Invoice#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInvoice withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        newValue,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#totalNet() totalNet} attribute.
   * @param value The value for totalNet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withTotalNet(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "totalNet");
    if (this.totalNet == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        newValue,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#totalNet() totalNet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for totalNet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withTotalNet(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.totalNet == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        value,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#cancelledReason() cancelledReason} attribute.
   * @param value The value for cancelledReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withCancelledReason(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "cancelledReason");
    if (java.util.Objects.equals(this.cancelledReason, newValue)) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        newValue,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#cancelledReason() cancelledReason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cancelledReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withCancelledReason(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.cancelledReason, value)) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        value,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#issuer() issuer} attribute.
   * @param value The value for issuer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withIssuer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "issuer");
    if (this.issuer == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        newValue,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#issuer() issuer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issuer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withIssuer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.issuer == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        value,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        newValue,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        value,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#lineItem() lineItem} attribute.
   * @param value The value for lineItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withLineItem(java.util.List<com.fhir.Invoice_LineItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Invoice_LineItem> newValue = java.util.Objects.requireNonNull(value, "lineItem");
    if (this.lineItem == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        newValue,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#lineItem() lineItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lineItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withLineItem(java.util.Optional<? extends java.util.List<com.fhir.Invoice_LineItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Invoice_LineItem> value = optional.orElse(null);
    if (this.lineItem == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        value,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        newValue,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        value,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        newValue,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        value,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        newValue,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        value,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        newValue,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        value,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        newValue,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        value,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        newValue,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        value,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        newValue,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        value,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withRecipient(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        newValue,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withRecipient(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        value,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#totalGross() totalGross} attribute.
   * @param value The value for totalGross
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withTotalGross(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "totalGross");
    if (this.totalGross == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        newValue,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#totalGross() totalGross} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for totalGross
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withTotalGross(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.totalGross == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        value,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#paymentTerms() paymentTerms} attribute.
   * @param value The value for paymentTerms
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withPaymentTerms(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "paymentTerms");
    if (this.paymentTerms == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        newValue,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#paymentTerms() paymentTerms} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paymentTerms
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withPaymentTerms(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.paymentTerms == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        value,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        newValue,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        value,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        newValue,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        value,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        newValue,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        value,
        this.status,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withStatus(com.fhir.InvoiceStatus value) {
    @javax.annotation.Nullable com.fhir.InvoiceStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        newValue,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withStatus(java.util.Optional<? extends com.fhir.InvoiceStatus> optional) {
    @javax.annotation.Nullable com.fhir.InvoiceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        value,
        this.totalPriceComponent,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#totalPriceComponent() totalPriceComponent} attribute.
   * @param value The value for totalPriceComponent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withTotalPriceComponent(java.util.List<com.fhir.Invoice_PriceComponent> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> newValue = java.util.Objects.requireNonNull(value, "totalPriceComponent");
    if (this.totalPriceComponent == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        newValue,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#totalPriceComponent() totalPriceComponent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for totalPriceComponent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withTotalPriceComponent(java.util.Optional<? extends java.util.List<com.fhir.Invoice_PriceComponent>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> value = optional.orElse(null);
    if (this.totalPriceComponent == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        value,
        this.date,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        newValue,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        value,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice withParticipant(java.util.List<com.fhir.Invoice_Participant> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Invoice_Participant> newValue = java.util.Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice withParticipant(java.util.Optional<? extends java.util.List<com.fhir.Invoice_Participant>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Invoice_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableInvoice(
        this.note,
        this.account,
        this.resourceType,
        this.totalNet,
        this.cancelledReason,
        this.issuer,
        this.subject,
        this.lineItem,
        this.identifier,
        this.modifierExtension,
        this.language,
        this.type,
        this.extension,
        this.text,
        this.contained,
        this.recipient,
        this.totalGross,
        this.paymentTerms,
        this.implicitRules,
        this.id,
        this.meta,
        this.status,
        this.totalPriceComponent,
        this.date,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInvoice} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInvoice
        && equalTo((ImmutableInvoice) another);
  }

  private boolean equalTo(ImmutableInvoice another) {
    return java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(account, another.account)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(totalNet, another.totalNet)
        && java.util.Objects.equals(cancelledReason, another.cancelledReason)
        && java.util.Objects.equals(issuer, another.issuer)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(lineItem, another.lineItem)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(recipient, another.recipient)
        && java.util.Objects.equals(totalGross, another.totalGross)
        && java.util.Objects.equals(paymentTerms, another.paymentTerms)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(totalPriceComponent, another.totalPriceComponent)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(participant, another.participant);
  }

  /**
   * Computes a hash code from attributes: {@code note}, {@code account}, {@code resourceType}, {@code totalNet}, {@code cancelledReason}, {@code issuer}, {@code subject}, {@code lineItem}, {@code identifier}, {@code modifierExtension}, {@code language}, {@code type}, {@code extension}, {@code text}, {@code contained}, {@code recipient}, {@code totalGross}, {@code paymentTerms}, {@code implicitRules}, {@code id}, {@code meta}, {@code status}, {@code totalPriceComponent}, {@code date}, {@code participant}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(account);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(totalNet);
    h += (h << 5) + java.util.Objects.hashCode(cancelledReason);
    h += (h << 5) + java.util.Objects.hashCode(issuer);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(lineItem);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(recipient);
    h += (h << 5) + java.util.Objects.hashCode(totalGross);
    h += (h << 5) + java.util.Objects.hashCode(paymentTerms);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(totalPriceComponent);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(participant);
    return h;
  }

  /**
   * Prints the immutable value {@code Invoice} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Invoice{");
    if (note != null) {
      builder.append("note=").append(note);
    }
    if (account != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("account=").append(account);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (totalNet != null) {
      builder.append(", ");
      builder.append("totalNet=").append(totalNet);
    }
    if (cancelledReason != null) {
      builder.append(", ");
      builder.append("cancelledReason=").append(cancelledReason);
    }
    if (issuer != null) {
      builder.append(", ");
      builder.append("issuer=").append(issuer);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (lineItem != null) {
      builder.append(", ");
      builder.append("lineItem=").append(lineItem);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (recipient != null) {
      builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (totalGross != null) {
      builder.append(", ");
      builder.append("totalGross=").append(totalGross);
    }
    if (paymentTerms != null) {
      builder.append(", ");
      builder.append("paymentTerms=").append(paymentTerms);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (totalPriceComponent != null) {
      builder.append(", ");
      builder.append("totalPriceComponent=").append(totalPriceComponent);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (participant != null) {
      builder.append(", ");
      builder.append("participant=").append(participant);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Invoice", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Invoice {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> account = java.util.Optional.empty();
    boolean accountIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> totalNet = java.util.Optional.empty();
    boolean totalNetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> cancelledReason = java.util.Optional.empty();
    boolean cancelledReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> issuer = java.util.Optional.empty();
    boolean issuerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Invoice_LineItem>> lineItem = java.util.Optional.empty();
    boolean lineItemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> recipient = java.util.Optional.empty();
    boolean recipientIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> totalGross = java.util.Optional.empty();
    boolean totalGrossIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> paymentTerms = java.util.Optional.empty();
    boolean paymentTermsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.InvoiceStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Invoice_PriceComponent>> totalPriceComponent = java.util.Optional.empty();
    boolean totalPriceComponentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Invoice_Participant>> participant = java.util.Optional.empty();
    boolean participantIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("account")
    public void setAccount(java.util.Optional<com.fhir.Reference> account) {
      this.account = account;
      this.accountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("totalNet")
    public void setTotalNet(java.util.Optional<com.fhir.Money> totalNet) {
      this.totalNet = totalNet;
      this.totalNetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("cancelledReason")
    public void setCancelledReason(java.util.Optional<java.lang.String> cancelledReason) {
      this.cancelledReason = cancelledReason;
      this.cancelledReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    public void setIssuer(java.util.Optional<com.fhir.Reference> issuer) {
      this.issuer = issuer;
      this.issuerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lineItem")
    public void setLineItem(java.util.Optional<java.util.List<com.fhir.Invoice_LineItem>> lineItem) {
      this.lineItem = lineItem;
      this.lineItemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public void setRecipient(java.util.Optional<com.fhir.Reference> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("totalGross")
    public void setTotalGross(java.util.Optional<com.fhir.Money> totalGross) {
      this.totalGross = totalGross;
      this.totalGrossIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paymentTerms")
    public void setPaymentTerms(java.util.Optional<com.fhir.markdown> paymentTerms) {
      this.paymentTerms = paymentTerms;
      this.paymentTermsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.InvoiceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("totalPriceComponent")
    public void setTotalPriceComponent(java.util.Optional<java.util.List<com.fhir.Invoice_PriceComponent>> totalPriceComponent) {
      this.totalPriceComponent = totalPriceComponent;
      this.totalPriceComponentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public void setParticipant(java.util.Optional<java.util.List<com.fhir.Invoice_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> account() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> totalNet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> cancelledReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> issuer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Invoice_LineItem>> lineItem() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> totalGross() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> paymentTerms() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.InvoiceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Invoice_PriceComponent>> totalPriceComponent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Invoice_Participant>> participant() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableInvoice fromJson(Json json) {
    ImmutableInvoice.Builder builder = ((ImmutableInvoice.Builder) ImmutableInvoice.builder());
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.accountIsSet) {
      builder.account(json.account);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.totalNetIsSet) {
      builder.totalNet(json.totalNet);
    }
    if (json.cancelledReasonIsSet) {
      builder.cancelledReason(json.cancelledReason);
    }
    if (json.issuerIsSet) {
      builder.issuer(json.issuer);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.lineItemIsSet) {
      builder.lineItem(json.lineItem);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.totalGrossIsSet) {
      builder.totalGross(json.totalGross);
    }
    if (json.paymentTermsIsSet) {
      builder.paymentTerms(json.paymentTerms);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.totalPriceComponentIsSet) {
      builder.totalPriceComponent(json.totalPriceComponent);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
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
        .note(instance.note())
        .account(instance.account())
        .resourceType(instance.resourceType())
        .totalNet(instance.totalNet())
        .cancelledReason(instance.cancelledReason())
        .issuer(instance.issuer())
        .subject(instance.subject())
        .lineItem(instance.lineItem())
        .identifier(instance.identifier())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .type(instance.type())
        .extension(instance.extension())
        .text(instance.text())
        .contained(instance.contained())
        .recipient(instance.recipient())
        .totalGross(instance.totalGross())
        .paymentTerms(instance.paymentTerms())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .meta(instance.meta())
        .status(instance.status())
        .totalPriceComponent(instance.totalPriceComponent())
        .date(instance.date())
        .participant(instance.participant())
        .build();
  }

  /**
   * Creates a builder for {@link Invoice Invoice}.
   * <pre>
   * ImmutableInvoice.builder()
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Invoice#note() note}
   *    .account(com.fhir.Reference) // optional {@link Invoice#account() account}
   *    .resourceType(String) // required {@link Invoice#resourceType() resourceType}
   *    .totalNet(com.fhir.Money) // optional {@link Invoice#totalNet() totalNet}
   *    .cancelledReason(String) // optional {@link Invoice#cancelledReason() cancelledReason}
   *    .issuer(com.fhir.Reference) // optional {@link Invoice#issuer() issuer}
   *    .subject(com.fhir.Reference) // optional {@link Invoice#subject() subject}
   *    .lineItem(List&amp;lt;com.fhir.Invoice_LineItem&amp;gt;) // optional {@link Invoice#lineItem() lineItem}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Invoice#identifier() identifier}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Invoice#modifierExtension() modifierExtension}
   *    .language(com.fhir.code) // optional {@link Invoice#language() language}
   *    .type(com.fhir.CodeableConcept) // optional {@link Invoice#type() type}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Invoice#extension() extension}
   *    .text(com.fhir.Narrative) // optional {@link Invoice#text() text}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Invoice#contained() contained}
   *    .recipient(com.fhir.Reference) // optional {@link Invoice#recipient() recipient}
   *    .totalGross(com.fhir.Money) // optional {@link Invoice#totalGross() totalGross}
   *    .paymentTerms(com.fhir.markdown) // optional {@link Invoice#paymentTerms() paymentTerms}
   *    .implicitRules(com.fhir.uri) // optional {@link Invoice#implicitRules() implicitRules}
   *    .id(com.fhir.id) // optional {@link Invoice#id() id}
   *    .meta(com.fhir.Meta) // optional {@link Invoice#meta() meta}
   *    .status(com.fhir.InvoiceStatus) // optional {@link Invoice#status() status}
   *    .totalPriceComponent(List&amp;lt;com.fhir.Invoice_PriceComponent&amp;gt;) // optional {@link Invoice#totalPriceComponent() totalPriceComponent}
   *    .date(com.fhir.dateTime) // optional {@link Invoice#date() date}
   *    .participant(List&amp;lt;com.fhir.Invoice_Participant&amp;gt;) // optional {@link Invoice#participant() participant}
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
  @org.immutables.value.Generated(from = "Invoice", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_NOTE = 0x1L;
    private static final long OPT_BIT_ACCOUNT = 0x2L;
    private static final long OPT_BIT_TOTAL_NET = 0x4L;
    private static final long OPT_BIT_CANCELLED_REASON = 0x8L;
    private static final long OPT_BIT_ISSUER = 0x10L;
    private static final long OPT_BIT_SUBJECT = 0x20L;
    private static final long OPT_BIT_LINE_ITEM = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_TYPE = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_RECIPIENT = 0x4000L;
    private static final long OPT_BIT_TOTAL_GROSS = 0x8000L;
    private static final long OPT_BIT_PAYMENT_TERMS = 0x10000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_STATUS = 0x100000L;
    private static final long OPT_BIT_TOTAL_PRICE_COMPONENT = 0x200000L;
    private static final long OPT_BIT_DATE = 0x400000L;
    private static final long OPT_BIT_PARTICIPANT = 0x800000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.Reference account;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Money totalNet;
    private @javax.annotation.Nullable java.lang.String cancelledReason;
    private @javax.annotation.Nullable com.fhir.Reference issuer;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Invoice_LineItem> lineItem;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Reference recipient;
    private @javax.annotation.Nullable com.fhir.Money totalGross;
    private @javax.annotation.Nullable com.fhir.markdown paymentTerms;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.InvoiceStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> totalPriceComponent;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.Invoice_Participant> participant;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Invoice#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    public final Builder account(com.fhir.Reference account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = java.util.Objects.requireNonNull(account, "account");
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("account")
    public final Builder account(java.util.Optional<? extends com.fhir.Reference> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = account.orElse(null);
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link Invoice#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalNet() totalNet} to totalNet.
     * @param totalNet The value for totalNet
     * @return {@code this} builder for chained invocation
     */
    public final Builder totalNet(com.fhir.Money totalNet) {
      checkNotIsSet(totalNetIsSet(), "totalNet");
      this.totalNet = java.util.Objects.requireNonNull(totalNet, "totalNet");
      optBits |= OPT_BIT_TOTAL_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalNet() totalNet} to totalNet.
     * @param totalNet The value for totalNet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalNet")
    public final Builder totalNet(java.util.Optional<? extends com.fhir.Money> totalNet) {
      checkNotIsSet(totalNetIsSet(), "totalNet");
      this.totalNet = totalNet.orElse(null);
      optBits |= OPT_BIT_TOTAL_NET;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#cancelledReason() cancelledReason} to cancelledReason.
     * @param cancelledReason The value for cancelledReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder cancelledReason(java.lang.String cancelledReason) {
      checkNotIsSet(cancelledReasonIsSet(), "cancelledReason");
      this.cancelledReason = java.util.Objects.requireNonNull(cancelledReason, "cancelledReason");
      optBits |= OPT_BIT_CANCELLED_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#cancelledReason() cancelledReason} to cancelledReason.
     * @param cancelledReason The value for cancelledReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cancelledReason")
    public final Builder cancelledReason(java.util.Optional<java.lang.String> cancelledReason) {
      checkNotIsSet(cancelledReasonIsSet(), "cancelledReason");
      this.cancelledReason = cancelledReason.orElse(null);
      optBits |= OPT_BIT_CANCELLED_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for chained invocation
     */
    public final Builder issuer(com.fhir.Reference issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = java.util.Objects.requireNonNull(issuer, "issuer");
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    public final Builder issuer(java.util.Optional<? extends com.fhir.Reference> issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = issuer.orElse(null);
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends com.fhir.Reference> subject) {
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
    public final Builder lineItem(java.util.List<com.fhir.Invoice_LineItem> lineItem) {
      checkNotIsSet(lineItemIsSet(), "lineItem");
      this.lineItem = java.util.Objects.requireNonNull(lineItem, "lineItem");
      optBits |= OPT_BIT_LINE_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#lineItem() lineItem} to lineItem.
     * @param lineItem The value for lineItem
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lineItem")
    public final Builder lineItem(java.util.Optional<? extends java.util.List<com.fhir.Invoice_LineItem>> lineItem) {
      checkNotIsSet(lineItemIsSet(), "lineItem");
      this.lineItem = lineItem.orElse(null);
      optBits |= OPT_BIT_LINE_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(com.fhir.Reference recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = java.util.Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public final Builder recipient(java.util.Optional<? extends com.fhir.Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalGross() totalGross} to totalGross.
     * @param totalGross The value for totalGross
     * @return {@code this} builder for chained invocation
     */
    public final Builder totalGross(com.fhir.Money totalGross) {
      checkNotIsSet(totalGrossIsSet(), "totalGross");
      this.totalGross = java.util.Objects.requireNonNull(totalGross, "totalGross");
      optBits |= OPT_BIT_TOTAL_GROSS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalGross() totalGross} to totalGross.
     * @param totalGross The value for totalGross
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalGross")
    public final Builder totalGross(java.util.Optional<? extends com.fhir.Money> totalGross) {
      checkNotIsSet(totalGrossIsSet(), "totalGross");
      this.totalGross = totalGross.orElse(null);
      optBits |= OPT_BIT_TOTAL_GROSS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#paymentTerms() paymentTerms} to paymentTerms.
     * @param paymentTerms The value for paymentTerms
     * @return {@code this} builder for chained invocation
     */
    public final Builder paymentTerms(com.fhir.markdown paymentTerms) {
      checkNotIsSet(paymentTermsIsSet(), "paymentTerms");
      this.paymentTerms = java.util.Objects.requireNonNull(paymentTerms, "paymentTerms");
      optBits |= OPT_BIT_PAYMENT_TERMS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#paymentTerms() paymentTerms} to paymentTerms.
     * @param paymentTerms The value for paymentTerms
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentTerms")
    public final Builder paymentTerms(java.util.Optional<? extends com.fhir.markdown> paymentTerms) {
      checkNotIsSet(paymentTermsIsSet(), "paymentTerms");
      this.paymentTerms = paymentTerms.orElse(null);
      optBits |= OPT_BIT_PAYMENT_TERMS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.InvoiceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.InvoiceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalPriceComponent() totalPriceComponent} to totalPriceComponent.
     * @param totalPriceComponent The value for totalPriceComponent
     * @return {@code this} builder for chained invocation
     */
    public final Builder totalPriceComponent(java.util.List<com.fhir.Invoice_PriceComponent> totalPriceComponent) {
      checkNotIsSet(totalPriceComponentIsSet(), "totalPriceComponent");
      this.totalPriceComponent = java.util.Objects.requireNonNull(totalPriceComponent, "totalPriceComponent");
      optBits |= OPT_BIT_TOTAL_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#totalPriceComponent() totalPriceComponent} to totalPriceComponent.
     * @param totalPriceComponent The value for totalPriceComponent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalPriceComponent")
    public final Builder totalPriceComponent(java.util.Optional<? extends java.util.List<com.fhir.Invoice_PriceComponent>> totalPriceComponent) {
      checkNotIsSet(totalPriceComponentIsSet(), "totalPriceComponent");
      this.totalPriceComponent = totalPriceComponent.orElse(null);
      optBits |= OPT_BIT_TOTAL_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(java.util.List<com.fhir.Invoice_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = java.util.Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public final Builder participant(java.util.Optional<? extends java.util.List<com.fhir.Invoice_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Builds a new {@link Invoice Invoice}.
     * @return An immutable instance of Invoice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Invoice build() {
      checkRequiredAttributes();
      return new ImmutableInvoice(
          note,
          account,
          resourceType,
          totalNet,
          cancelledReason,
          issuer,
          subject,
          lineItem,
          identifier,
          modifierExtension,
          language,
          type,
          extension,
          text,
          contained,
          recipient,
          totalGross,
          paymentTerms,
          implicitRules,
          id,
          meta,
          status,
          totalPriceComponent,
          date,
          participant);
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean accountIsSet() {
      return (optBits & OPT_BIT_ACCOUNT) != 0;
    }

    private boolean totalNetIsSet() {
      return (optBits & OPT_BIT_TOTAL_NET) != 0;
    }

    private boolean cancelledReasonIsSet() {
      return (optBits & OPT_BIT_CANCELLED_REASON) != 0;
    }

    private boolean issuerIsSet() {
      return (optBits & OPT_BIT_ISSUER) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean lineItemIsSet() {
      return (optBits & OPT_BIT_LINE_ITEM) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean totalGrossIsSet() {
      return (optBits & OPT_BIT_TOTAL_GROSS) != 0;
    }

    private boolean paymentTermsIsSet() {
      return (optBits & OPT_BIT_PAYMENT_TERMS) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean totalPriceComponentIsSet() {
      return (optBits & OPT_BIT_TOTAL_PRICE_COMPONENT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Invoice is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Invoice, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Invoice", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Invoice#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Invoice", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Invoice#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Invoice#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Invoice#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    BuildFinal account(com.fhir.Reference account);

    /**
     * Initializes the optional value {@link Invoice#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal account(java.util.Optional<? extends com.fhir.Reference> account);

    /**
     * Initializes the optional value {@link Invoice#totalNet() totalNet} to totalNet.
     * @param totalNet The value for totalNet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal totalNet(com.fhir.Money totalNet);

    /**
     * Initializes the optional value {@link Invoice#totalNet() totalNet} to totalNet.
     * @param totalNet The value for totalNet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal totalNet(java.util.Optional<? extends com.fhir.Money> totalNet);

    /**
     * Initializes the optional value {@link Invoice#cancelledReason() cancelledReason} to cancelledReason.
     * @param cancelledReason The value for cancelledReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cancelledReason(java.lang.String cancelledReason);

    /**
     * Initializes the optional value {@link Invoice#cancelledReason() cancelledReason} to cancelledReason.
     * @param cancelledReason The value for cancelledReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cancelledReason(java.util.Optional<java.lang.String> cancelledReason);

    /**
     * Initializes the optional value {@link Invoice#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issuer(com.fhir.Reference issuer);

    /**
     * Initializes the optional value {@link Invoice#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issuer(java.util.Optional<? extends com.fhir.Reference> issuer);

    /**
     * Initializes the optional value {@link Invoice#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link Invoice#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Invoice#lineItem() lineItem} to lineItem.
     * @param lineItem The value for lineItem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lineItem(java.util.List<com.fhir.Invoice_LineItem> lineItem);

    /**
     * Initializes the optional value {@link Invoice#lineItem() lineItem} to lineItem.
     * @param lineItem The value for lineItem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lineItem(java.util.Optional<? extends java.util.List<com.fhir.Invoice_LineItem>> lineItem);

    /**
     * Initializes the optional value {@link Invoice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Invoice#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Invoice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Invoice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Invoice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Invoice#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Invoice#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link Invoice#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Invoice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Invoice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Invoice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Invoice#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Invoice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Invoice#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Invoice#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recipient(com.fhir.Reference recipient);

    /**
     * Initializes the optional value {@link Invoice#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(java.util.Optional<? extends com.fhir.Reference> recipient);

    /**
     * Initializes the optional value {@link Invoice#totalGross() totalGross} to totalGross.
     * @param totalGross The value for totalGross
     * @return {@code this} builder for chained invocation
     */
    BuildFinal totalGross(com.fhir.Money totalGross);

    /**
     * Initializes the optional value {@link Invoice#totalGross() totalGross} to totalGross.
     * @param totalGross The value for totalGross
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal totalGross(java.util.Optional<? extends com.fhir.Money> totalGross);

    /**
     * Initializes the optional value {@link Invoice#paymentTerms() paymentTerms} to paymentTerms.
     * @param paymentTerms The value for paymentTerms
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paymentTerms(com.fhir.markdown paymentTerms);

    /**
     * Initializes the optional value {@link Invoice#paymentTerms() paymentTerms} to paymentTerms.
     * @param paymentTerms The value for paymentTerms
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paymentTerms(java.util.Optional<? extends com.fhir.markdown> paymentTerms);

    /**
     * Initializes the optional value {@link Invoice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Invoice#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Invoice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Invoice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Invoice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Invoice#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Invoice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.InvoiceStatus status);

    /**
     * Initializes the optional value {@link Invoice#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.InvoiceStatus> status);

    /**
     * Initializes the optional value {@link Invoice#totalPriceComponent() totalPriceComponent} to totalPriceComponent.
     * @param totalPriceComponent The value for totalPriceComponent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal totalPriceComponent(java.util.List<com.fhir.Invoice_PriceComponent> totalPriceComponent);

    /**
     * Initializes the optional value {@link Invoice#totalPriceComponent() totalPriceComponent} to totalPriceComponent.
     * @param totalPriceComponent The value for totalPriceComponent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal totalPriceComponent(java.util.Optional<? extends java.util.List<com.fhir.Invoice_PriceComponent>> totalPriceComponent);

    /**
     * Initializes the optional value {@link Invoice#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link Invoice#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link Invoice#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(java.util.List<com.fhir.Invoice_Participant> participant);

    /**
     * Initializes the optional value {@link Invoice#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(java.util.Optional<? extends java.util.List<com.fhir.Invoice_Participant>> participant);

    /**
     * Builds a new {@link Invoice Invoice}.
     * @return An immutable instance of Invoice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Invoice build();
  }
}
