//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ChargeItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeItem.builder()}.
 */
@org.immutables.value.Generated(from = "ChargeItem", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableChargeItem implements com.fhir.ChargeItem {
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Reference productReference;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable java.lang.String occurrenceDateTime;
  private final @javax.annotation.Nullable com.fhir.Reference performingOrganization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ChargeItem_Performer> performer;
  private final @javax.annotation.Nullable com.fhir.Reference requestingOrganization;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable com.fhir.ChargeitemStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodysite;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> service;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason;
  private final @javax.annotation.Nullable com.fhir.Reference enterer;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
  private final @javax.annotation.Nullable com.fhir.Money priceOverride;
  private final @javax.annotation.Nullable com.fhir.dateTime enteredDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> definitionUri;
  private final @javax.annotation.Nullable java.lang.String overrideReason;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> account;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference costCenter;
  private final com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.decimal factorOverride;
  private final @javax.annotation.Nullable com.fhir.Reference context;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> definitionCanonical;

  private ImmutableChargeItem(
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Reference productReference,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable java.lang.String occurrenceDateTime,
      @javax.annotation.Nullable com.fhir.Reference performingOrganization,
      @javax.annotation.Nullable java.util.List<com.fhir.ChargeItem_Performer> performer,
      @javax.annotation.Nullable com.fhir.Reference requestingOrganization,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      com.fhir.Reference subject,
      @javax.annotation.Nullable com.fhir.ChargeitemStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodysite,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> service,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason,
      @javax.annotation.Nullable com.fhir.Reference enterer,
      @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept,
      @javax.annotation.Nullable com.fhir.Timing occurrenceTiming,
      @javax.annotation.Nullable com.fhir.Money priceOverride,
      @javax.annotation.Nullable com.fhir.dateTime enteredDate,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> definitionUri,
      @javax.annotation.Nullable java.lang.String overrideReason,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> account,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference costCenter,
      com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.decimal factorOverride,
      @javax.annotation.Nullable com.fhir.Reference context,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Period occurrencePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> definitionCanonical) {
    this.implicitRules = implicitRules;
    this.productReference = productReference;
    this.text = text;
    this.contained = contained;
    this.meta = meta;
    this.quantity = quantity;
    this.occurrenceDateTime = occurrenceDateTime;
    this.performingOrganization = performingOrganization;
    this.performer = performer;
    this.requestingOrganization = requestingOrganization;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
    this.note = note;
    this.subject = subject;
    this.status = status;
    this.bodysite = bodysite;
    this.service = service;
    this.partOf = partOf;
    this.supportingInformation = supportingInformation;
    this.resourceType = resourceType;
    this.reason = reason;
    this.enterer = enterer;
    this.productCodeableConcept = productCodeableConcept;
    this.occurrenceTiming = occurrenceTiming;
    this.priceOverride = priceOverride;
    this.enteredDate = enteredDate;
    this.definitionUri = definitionUri;
    this.overrideReason = overrideReason;
    this.language = language;
    this.account = account;
    this.extension = extension;
    this.costCenter = costCenter;
    this.code = code;
    this.factorOverride = factorOverride;
    this.context = context;
    this.id = id;
    this.occurrencePeriod = occurrencePeriod;
    this.definitionCanonical = definitionCanonical;
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
   * @return The value of the {@code productReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productReference")
  @Override
  public java.util.Optional<com.fhir.Reference> productReference() {
    return java.util.Optional.ofNullable(productReference);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> quantity() {
    return java.util.Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
  @Override
  public java.util.Optional<java.lang.String> occurrenceDateTime() {
    return java.util.Optional.ofNullable(occurrenceDateTime);
  }

  /**
   * @return The value of the {@code performingOrganization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performingOrganization")
  @Override
  public java.util.Optional<com.fhir.Reference> performingOrganization() {
    return java.util.Optional.ofNullable(performingOrganization);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ChargeItem_Performer>> performer() {
    return java.util.Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code requestingOrganization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestingOrganization")
  @Override
  public java.util.Optional<com.fhir.Reference> requestingOrganization() {
    return java.util.Optional.ofNullable(requestingOrganization);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public com.fhir.Reference subject() {
    return subject;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ChargeitemStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code bodysite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodysite")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodysite() {
    return java.util.Optional.ofNullable(bodysite);
  }

  /**
   * @return The value of the {@code service} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("service")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> service() {
    return java.util.Optional.ofNullable(service);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code supportingInformation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation() {
    return java.util.Optional.ofNullable(supportingInformation);
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
   * @return The value of the {@code reason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason() {
    return java.util.Optional.ofNullable(reason);
  }

  /**
   * @return The value of the {@code enterer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enterer")
  @Override
  public java.util.Optional<com.fhir.Reference> enterer() {
    return java.util.Optional.ofNullable(enterer);
  }

  /**
   * @return The value of the {@code productCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept() {
    return java.util.Optional.ofNullable(productCodeableConcept);
  }

  /**
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> occurrenceTiming() {
    return java.util.Optional.ofNullable(occurrenceTiming);
  }

  /**
   * @return The value of the {@code priceOverride} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priceOverride")
  @Override
  public java.util.Optional<com.fhir.Money> priceOverride() {
    return java.util.Optional.ofNullable(priceOverride);
  }

  /**
   * @return The value of the {@code enteredDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enteredDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> enteredDate() {
    return java.util.Optional.ofNullable(enteredDate);
  }

  /**
   * @return The value of the {@code definitionUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definitionUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> definitionUri() {
    return java.util.Optional.ofNullable(definitionUri);
  }

  /**
   * @return The value of the {@code overrideReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("overrideReason")
  @Override
  public java.util.Optional<java.lang.String> overrideReason() {
    return java.util.Optional.ofNullable(overrideReason);
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
   * @return The value of the {@code account} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("account")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> account() {
    return java.util.Optional.ofNullable(account);
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
   * @return The value of the {@code costCenter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("costCenter")
  @Override
  public java.util.Optional<com.fhir.Reference> costCenter() {
    return java.util.Optional.ofNullable(costCenter);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public com.fhir.CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code factorOverride} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("factorOverride")
  @Override
  public java.util.Optional<com.fhir.decimal> factorOverride() {
    return java.util.Optional.ofNullable(factorOverride);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  @Override
  public java.util.Optional<com.fhir.Reference> context() {
    return java.util.Optional.ofNullable(context);
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
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> occurrencePeriod() {
    return java.util.Optional.ofNullable(occurrencePeriod);
  }

  /**
   * @return The value of the {@code definitionCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definitionCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> definitionCanonical() {
    return java.util.Optional.ofNullable(definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableChargeItem(
        newValue,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableChargeItem(
        value,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#productReference() productReference} attribute.
   * @param value The value for productReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withProductReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "productReference");
    if (this.productReference == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        newValue,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#productReference() productReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withProductReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.productReference == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        value,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        newValue,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        value,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        newValue,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        value,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        newValue,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        value,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        newValue,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        value,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOccurrenceDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (java.util.Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        newValue,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOccurrenceDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        value,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#performingOrganization() performingOrganization} attribute.
   * @param value The value for performingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withPerformingOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "performingOrganization");
    if (this.performingOrganization == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        newValue,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#performingOrganization() performingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withPerformingOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.performingOrganization == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        value,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withPerformer(java.util.List<com.fhir.ChargeItem_Performer> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ChargeItem_Performer> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        newValue,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withPerformer(java.util.Optional<? extends java.util.List<com.fhir.ChargeItem_Performer>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ChargeItem_Performer> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        value,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#requestingOrganization() requestingOrganization} attribute.
   * @param value The value for requestingOrganization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withRequestingOrganization(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requestingOrganization");
    if (this.requestingOrganization == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        newValue,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#requestingOrganization() requestingOrganization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestingOrganization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withRequestingOrganization(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requestingOrganization == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        value,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        newValue,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        value,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        newValue,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        value,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        newValue,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        value,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeItem#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeItem withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        newValue,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withStatus(com.fhir.ChargeitemStatus value) {
    @javax.annotation.Nullable com.fhir.ChargeitemStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        newValue,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withStatus(java.util.Optional<? extends com.fhir.ChargeitemStatus> optional) {
    @javax.annotation.Nullable com.fhir.ChargeitemStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        value,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#bodysite() bodysite} attribute.
   * @param value The value for bodysite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withBodysite(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "bodysite");
    if (this.bodysite == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        newValue,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#bodysite() bodysite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodysite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withBodysite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.bodysite == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        value,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#service() service} attribute.
   * @param value The value for service
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withService(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "service");
    if (this.service == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        newValue,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#service() service} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for service
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withService(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.service == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        value,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        newValue,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        value,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#supportingInformation() supportingInformation} attribute.
   * @param value The value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withSupportingInformation(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInformation");
    if (this.supportingInformation == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        newValue,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#supportingInformation() supportingInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withSupportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInformation == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        value,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeItem#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeItem withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        newValue,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withReason(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        newValue,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withReason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        value,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#enterer() enterer} attribute.
   * @param value The value for enterer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withEnterer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "enterer");
    if (this.enterer == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        newValue,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#enterer() enterer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enterer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withEnterer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.enterer == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        value,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#productCodeableConcept() productCodeableConcept} attribute.
   * @param value The value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withProductCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productCodeableConcept");
    if (this.productCodeableConcept == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        newValue,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#productCodeableConcept() productCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withProductCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.productCodeableConcept == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        value,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOccurrenceTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        newValue,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withOccurrenceTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        value,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#priceOverride() priceOverride} attribute.
   * @param value The value for priceOverride
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withPriceOverride(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "priceOverride");
    if (this.priceOverride == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        newValue,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#priceOverride() priceOverride} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priceOverride
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withPriceOverride(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.priceOverride == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        value,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#enteredDate() enteredDate} attribute.
   * @param value The value for enteredDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withEnteredDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "enteredDate");
    if (this.enteredDate == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        newValue,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#enteredDate() enteredDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enteredDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withEnteredDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.enteredDate == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        value,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#definitionUri() definitionUri} attribute.
   * @param value The value for definitionUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withDefinitionUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "definitionUri");
    if (this.definitionUri == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        newValue,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#definitionUri() definitionUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withDefinitionUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.definitionUri == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        value,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#overrideReason() overrideReason} attribute.
   * @param value The value for overrideReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOverrideReason(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "overrideReason");
    if (java.util.Objects.equals(this.overrideReason, newValue)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        newValue,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#overrideReason() overrideReason} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for overrideReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOverrideReason(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.overrideReason, value)) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        value,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        newValue,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        value,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#account() account} attribute.
   * @param value The value for account
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withAccount(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "account");
    if (this.account == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        newValue,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#account() account} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for account
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withAccount(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.account == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        value,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        newValue,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        value,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#costCenter() costCenter} attribute.
   * @param value The value for costCenter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withCostCenter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "costCenter");
    if (this.costCenter == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        newValue,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#costCenter() costCenter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for costCenter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withCostCenter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.costCenter == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        value,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeItem#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeItem withCode(com.fhir.CodeableConcept value) {
    if (this.code == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        newValue,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#factorOverride() factorOverride} attribute.
   * @param value The value for factorOverride
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withFactorOverride(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "factorOverride");
    if (this.factorOverride == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        newValue,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#factorOverride() factorOverride} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factorOverride
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withFactorOverride(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.factorOverride == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        value,
        this.context,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withContext(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        newValue,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withContext(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        value,
        this.id,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        newValue,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        value,
        this.occurrencePeriod,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withOccurrencePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        newValue,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withOccurrencePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        value,
        this.definitionCanonical);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItem#definitionCanonical() definitionCanonical} attribute.
   * @param value The value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItem withDefinitionCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "definitionCanonical");
    if (this.definitionCanonical == newValue) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItem#definitionCanonical() definitionCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definitionCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItem withDefinitionCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.definitionCanonical == value) return this;
    return new ImmutableChargeItem(
        this.implicitRules,
        this.productReference,
        this.text,
        this.contained,
        this.meta,
        this.quantity,
        this.occurrenceDateTime,
        this.performingOrganization,
        this.performer,
        this.requestingOrganization,
        this.modifierExtension,
        this.identifier,
        this.note,
        this.subject,
        this.status,
        this.bodysite,
        this.service,
        this.partOf,
        this.supportingInformation,
        this.resourceType,
        this.reason,
        this.enterer,
        this.productCodeableConcept,
        this.occurrenceTiming,
        this.priceOverride,
        this.enteredDate,
        this.definitionUri,
        this.overrideReason,
        this.language,
        this.account,
        this.extension,
        this.costCenter,
        this.code,
        this.factorOverride,
        this.context,
        this.id,
        this.occurrencePeriod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeItem
        && equalTo((ImmutableChargeItem) another);
  }

  private boolean equalTo(ImmutableChargeItem another) {
    return java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(productReference, another.productReference)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && java.util.Objects.equals(performingOrganization, another.performingOrganization)
        && java.util.Objects.equals(performer, another.performer)
        && java.util.Objects.equals(requestingOrganization, another.requestingOrganization)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(note, another.note)
        && subject.equals(another.subject)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(bodysite, another.bodysite)
        && java.util.Objects.equals(service, another.service)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(supportingInformation, another.supportingInformation)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(reason, another.reason)
        && java.util.Objects.equals(enterer, another.enterer)
        && java.util.Objects.equals(productCodeableConcept, another.productCodeableConcept)
        && java.util.Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && java.util.Objects.equals(priceOverride, another.priceOverride)
        && java.util.Objects.equals(enteredDate, another.enteredDate)
        && java.util.Objects.equals(definitionUri, another.definitionUri)
        && java.util.Objects.equals(overrideReason, another.overrideReason)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(account, another.account)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(costCenter, another.costCenter)
        && code.equals(another.code)
        && java.util.Objects.equals(factorOverride, another.factorOverride)
        && java.util.Objects.equals(context, another.context)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && java.util.Objects.equals(definitionCanonical, another.definitionCanonical);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code productReference}, {@code text}, {@code contained}, {@code meta}, {@code quantity}, {@code occurrenceDateTime}, {@code performingOrganization}, {@code performer}, {@code requestingOrganization}, {@code modifierExtension}, {@code identifier}, {@code note}, {@code subject}, {@code status}, {@code bodysite}, {@code service}, {@code partOf}, {@code supportingInformation}, {@code resourceType}, {@code reason}, {@code enterer}, {@code productCodeableConcept}, {@code occurrenceTiming}, {@code priceOverride}, {@code enteredDate}, {@code definitionUri}, {@code overrideReason}, {@code language}, {@code account}, {@code extension}, {@code costCenter}, {@code code}, {@code factorOverride}, {@code context}, {@code id}, {@code occurrencePeriod}, {@code definitionCanonical}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(productReference);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + java.util.Objects.hashCode(performingOrganization);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    h += (h << 5) + java.util.Objects.hashCode(requestingOrganization);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(bodysite);
    h += (h << 5) + java.util.Objects.hashCode(service);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(supportingInformation);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(reason);
    h += (h << 5) + java.util.Objects.hashCode(enterer);
    h += (h << 5) + java.util.Objects.hashCode(productCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceTiming);
    h += (h << 5) + java.util.Objects.hashCode(priceOverride);
    h += (h << 5) + java.util.Objects.hashCode(enteredDate);
    h += (h << 5) + java.util.Objects.hashCode(definitionUri);
    h += (h << 5) + java.util.Objects.hashCode(overrideReason);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(account);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(costCenter);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(factorOverride);
    h += (h << 5) + java.util.Objects.hashCode(context);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(occurrencePeriod);
    h += (h << 5) + java.util.Objects.hashCode(definitionCanonical);
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ChargeItem{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (productReference != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("productReference=").append(productReference);
    }
    if (text != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (quantity != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (occurrenceDateTime != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (performingOrganization != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("performingOrganization=").append(performingOrganization);
    }
    if (performer != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (requestingOrganization != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("requestingOrganization=").append(requestingOrganization);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (note != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("subject=").append(subject);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (bodysite != null) {
      builder.append(", ");
      builder.append("bodysite=").append(bodysite);
    }
    if (service != null) {
      builder.append(", ");
      builder.append("service=").append(service);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (supportingInformation != null) {
      builder.append(", ");
      builder.append("supportingInformation=").append(supportingInformation);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (enterer != null) {
      builder.append(", ");
      builder.append("enterer=").append(enterer);
    }
    if (productCodeableConcept != null) {
      builder.append(", ");
      builder.append("productCodeableConcept=").append(productCodeableConcept);
    }
    if (occurrenceTiming != null) {
      builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (priceOverride != null) {
      builder.append(", ");
      builder.append("priceOverride=").append(priceOverride);
    }
    if (enteredDate != null) {
      builder.append(", ");
      builder.append("enteredDate=").append(enteredDate);
    }
    if (definitionUri != null) {
      builder.append(", ");
      builder.append("definitionUri=").append(definitionUri);
    }
    if (overrideReason != null) {
      builder.append(", ");
      builder.append("overrideReason=").append(overrideReason);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (account != null) {
      builder.append(", ");
      builder.append("account=").append(account);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (costCenter != null) {
      builder.append(", ");
      builder.append("costCenter=").append(costCenter);
    }
    builder.append(", ");
    builder.append("code=").append(code);
    if (factorOverride != null) {
      builder.append(", ");
      builder.append("factorOverride=").append(factorOverride);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (definitionCanonical != null) {
      builder.append(", ");
      builder.append("definitionCanonical=").append(definitionCanonical);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ChargeItem", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ChargeItem {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> productReference = java.util.Optional.empty();
    boolean productReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> performingOrganization = java.util.Optional.empty();
    boolean performingOrganizationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ChargeItem_Performer>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requestingOrganization = java.util.Optional.empty();
    boolean requestingOrganizationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ChargeitemStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodysite = java.util.Optional.empty();
    boolean bodysiteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> service = java.util.Optional.empty();
    boolean serviceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation = java.util.Optional.empty();
    boolean supportingInformationIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason = java.util.Optional.empty();
    boolean reasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> enterer = java.util.Optional.empty();
    boolean entererIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept = java.util.Optional.empty();
    boolean productCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> occurrenceTiming = java.util.Optional.empty();
    boolean occurrenceTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> priceOverride = java.util.Optional.empty();
    boolean priceOverrideIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> enteredDate = java.util.Optional.empty();
    boolean enteredDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> definitionUri = java.util.Optional.empty();
    boolean definitionUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> overrideReason = java.util.Optional.empty();
    boolean overrideReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> account = java.util.Optional.empty();
    boolean accountIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> costCenter = java.util.Optional.empty();
    boolean costCenterIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept code;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> factorOverride = java.util.Optional.empty();
    boolean factorOverrideIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> context = java.util.Optional.empty();
    boolean contextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> occurrencePeriod = java.util.Optional.empty();
    boolean occurrencePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> definitionCanonical = java.util.Optional.empty();
    boolean definitionCanonicalIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productReference")
    public void setProductReference(java.util.Optional<com.fhir.Reference> productReference) {
      this.productReference = productReference;
      this.productReferenceIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performingOrganization")
    public void setPerformingOrganization(java.util.Optional<com.fhir.Reference> performingOrganization) {
      this.performingOrganization = performingOrganization;
      this.performingOrganizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.ChargeItem_Performer>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestingOrganization")
    public void setRequestingOrganization(java.util.Optional<com.fhir.Reference> requestingOrganization) {
      this.requestingOrganization = requestingOrganization;
      this.requestingOrganizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ChargeitemStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodysite")
    public void setBodysite(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodysite) {
      this.bodysite = bodysite;
      this.bodysiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    public void setService(java.util.Optional<java.util.List<com.fhir.Reference>> service) {
      this.service = service;
      this.serviceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
    public void setSupportingInformation(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation) {
      this.supportingInformation = supportingInformation;
      this.supportingInformationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enterer")
    public void setEnterer(java.util.Optional<com.fhir.Reference> enterer) {
      this.enterer = enterer;
      this.entererIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productCodeableConcept")
    public void setProductCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept) {
      this.productCodeableConcept = productCodeableConcept;
      this.productCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(java.util.Optional<com.fhir.Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priceOverride")
    public void setPriceOverride(java.util.Optional<com.fhir.Money> priceOverride) {
      this.priceOverride = priceOverride;
      this.priceOverrideIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enteredDate")
    public void setEnteredDate(java.util.Optional<com.fhir.dateTime> enteredDate) {
      this.enteredDate = enteredDate;
      this.enteredDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definitionUri")
    public void setDefinitionUri(java.util.Optional<java.util.List<com.fhir.uri>> definitionUri) {
      this.definitionUri = definitionUri;
      this.definitionUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("overrideReason")
    public void setOverrideReason(java.util.Optional<java.lang.String> overrideReason) {
      this.overrideReason = overrideReason;
      this.overrideReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("account")
    public void setAccount(java.util.Optional<java.util.List<com.fhir.Reference>> account) {
      this.account = account;
      this.accountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("costCenter")
    public void setCostCenter(java.util.Optional<com.fhir.Reference> costCenter) {
      this.costCenter = costCenter;
      this.costCenterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(com.fhir.CodeableConcept code) {
      this.code = code;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("factorOverride")
    public void setFactorOverride(java.util.Optional<com.fhir.decimal> factorOverride) {
      this.factorOverride = factorOverride;
      this.factorOverrideIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Optional<com.fhir.Reference> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(java.util.Optional<com.fhir.Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definitionCanonical")
    public void setDefinitionCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> definitionCanonical) {
      this.definitionCanonical = definitionCanonical;
      this.definitionCanonicalIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> productReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> performingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ChargeItem_Performer>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requestingOrganization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ChargeitemStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodysite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> service() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInformation() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> enterer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> priceOverride() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> enteredDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> definitionUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> overrideReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> account() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> costCenter() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> factorOverride() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> context() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> definitionCanonical() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableChargeItem fromJson(Json json) {
    ImmutableChargeItem.Builder builder = ((ImmutableChargeItem.Builder) ImmutableChargeItem.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.productReferenceIsSet) {
      builder.productReference(json.productReference);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.performingOrganizationIsSet) {
      builder.performingOrganization(json.performingOrganization);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.requestingOrganizationIsSet) {
      builder.requestingOrganization(json.requestingOrganization);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.bodysiteIsSet) {
      builder.bodysite(json.bodysite);
    }
    if (json.serviceIsSet) {
      builder.service(json.service);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.supportingInformationIsSet) {
      builder.supportingInformation(json.supportingInformation);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.entererIsSet) {
      builder.enterer(json.enterer);
    }
    if (json.productCodeableConceptIsSet) {
      builder.productCodeableConcept(json.productCodeableConcept);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.priceOverrideIsSet) {
      builder.priceOverride(json.priceOverride);
    }
    if (json.enteredDateIsSet) {
      builder.enteredDate(json.enteredDate);
    }
    if (json.definitionUriIsSet) {
      builder.definitionUri(json.definitionUri);
    }
    if (json.overrideReasonIsSet) {
      builder.overrideReason(json.overrideReason);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.accountIsSet) {
      builder.account(json.account);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.costCenterIsSet) {
      builder.costCenter(json.costCenter);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.factorOverrideIsSet) {
      builder.factorOverride(json.factorOverride);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.definitionCanonicalIsSet) {
      builder.definitionCanonical(json.definitionCanonical);
    }
    return (ImmutableChargeItem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ChargeItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeItem instance
   */
  public static ChargeItem copyOf(ChargeItem instance) {
    if (instance instanceof ImmutableChargeItem) {
      return (ImmutableChargeItem) instance;
    }
    return ((ImmutableChargeItem.Builder) ImmutableChargeItem.builder())
        .implicitRules(instance.implicitRules())
        .productReference(instance.productReference())
        .text(instance.text())
        .contained(instance.contained())
        .meta(instance.meta())
        .quantity(instance.quantity())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .performingOrganization(instance.performingOrganization())
        .performer(instance.performer())
        .requestingOrganization(instance.requestingOrganization())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .note(instance.note())
        .subject(instance.subject())
        .status(instance.status())
        .bodysite(instance.bodysite())
        .service(instance.service())
        .partOf(instance.partOf())
        .supportingInformation(instance.supportingInformation())
        .resourceType(instance.resourceType())
        .reason(instance.reason())
        .enterer(instance.enterer())
        .productCodeableConcept(instance.productCodeableConcept())
        .occurrenceTiming(instance.occurrenceTiming())
        .priceOverride(instance.priceOverride())
        .enteredDate(instance.enteredDate())
        .definitionUri(instance.definitionUri())
        .overrideReason(instance.overrideReason())
        .language(instance.language())
        .account(instance.account())
        .extension(instance.extension())
        .costCenter(instance.costCenter())
        .code(instance.code())
        .factorOverride(instance.factorOverride())
        .context(instance.context())
        .id(instance.id())
        .occurrencePeriod(instance.occurrencePeriod())
        .definitionCanonical(instance.definitionCanonical())
        .build();
  }

  /**
   * Creates a builder for {@link ChargeItem ChargeItem}.
   * <pre>
   * ImmutableChargeItem.builder()
   *    .implicitRules(com.fhir.uri) // optional {@link ChargeItem#implicitRules() implicitRules}
   *    .productReference(com.fhir.Reference) // optional {@link ChargeItem#productReference() productReference}
   *    .text(com.fhir.Narrative) // optional {@link ChargeItem#text() text}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ChargeItem#contained() contained}
   *    .meta(com.fhir.Meta) // optional {@link ChargeItem#meta() meta}
   *    .quantity(com.fhir.Quantity) // optional {@link ChargeItem#quantity() quantity}
   *    .occurrenceDateTime(String) // optional {@link ChargeItem#occurrenceDateTime() occurrenceDateTime}
   *    .performingOrganization(com.fhir.Reference) // optional {@link ChargeItem#performingOrganization() performingOrganization}
   *    .performer(List&amp;lt;com.fhir.ChargeItem_Performer&amp;gt;) // optional {@link ChargeItem#performer() performer}
   *    .requestingOrganization(com.fhir.Reference) // optional {@link ChargeItem#requestingOrganization() requestingOrganization}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ChargeItem#modifierExtension() modifierExtension}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ChargeItem#identifier() identifier}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link ChargeItem#note() note}
   *    .subject(com.fhir.Reference) // required {@link ChargeItem#subject() subject}
   *    .status(com.fhir.ChargeitemStatus) // optional {@link ChargeItem#status() status}
   *    .bodysite(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ChargeItem#bodysite() bodysite}
   *    .service(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ChargeItem#service() service}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ChargeItem#partOf() partOf}
   *    .supportingInformation(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ChargeItem#supportingInformation() supportingInformation}
   *    .resourceType(String) // required {@link ChargeItem#resourceType() resourceType}
   *    .reason(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ChargeItem#reason() reason}
   *    .enterer(com.fhir.Reference) // optional {@link ChargeItem#enterer() enterer}
   *    .productCodeableConcept(com.fhir.CodeableConcept) // optional {@link ChargeItem#productCodeableConcept() productCodeableConcept}
   *    .occurrenceTiming(com.fhir.Timing) // optional {@link ChargeItem#occurrenceTiming() occurrenceTiming}
   *    .priceOverride(com.fhir.Money) // optional {@link ChargeItem#priceOverride() priceOverride}
   *    .enteredDate(com.fhir.dateTime) // optional {@link ChargeItem#enteredDate() enteredDate}
   *    .definitionUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link ChargeItem#definitionUri() definitionUri}
   *    .overrideReason(String) // optional {@link ChargeItem#overrideReason() overrideReason}
   *    .language(com.fhir.code) // optional {@link ChargeItem#language() language}
   *    .account(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ChargeItem#account() account}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ChargeItem#extension() extension}
   *    .costCenter(com.fhir.Reference) // optional {@link ChargeItem#costCenter() costCenter}
   *    .code(com.fhir.CodeableConcept) // required {@link ChargeItem#code() code}
   *    .factorOverride(com.fhir.decimal) // optional {@link ChargeItem#factorOverride() factorOverride}
   *    .context(com.fhir.Reference) // optional {@link ChargeItem#context() context}
   *    .id(com.fhir.id) // optional {@link ChargeItem#id() id}
   *    .occurrencePeriod(com.fhir.Period) // optional {@link ChargeItem#occurrencePeriod() occurrencePeriod}
   *    .definitionCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ChargeItem#definitionCanonical() definitionCanonical}
   *    .build();
   * </pre>
   * @return A new ChargeItem builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableChargeItem.Builder();
  }

  /**
   * Builds instances of type {@link ChargeItem ChargeItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ChargeItem", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long INIT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_PRODUCT_REFERENCE = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_CONTAINED = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_QUANTITY = 0x20L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x40L;
    private static final long OPT_BIT_PERFORMING_ORGANIZATION = 0x80L;
    private static final long OPT_BIT_PERFORMER = 0x100L;
    private static final long OPT_BIT_REQUESTING_ORGANIZATION = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_NOTE = 0x1000L;
    private static final long OPT_BIT_STATUS = 0x2000L;
    private static final long OPT_BIT_BODYSITE = 0x4000L;
    private static final long OPT_BIT_SERVICE = 0x8000L;
    private static final long OPT_BIT_PART_OF = 0x10000L;
    private static final long OPT_BIT_SUPPORTING_INFORMATION = 0x20000L;
    private static final long OPT_BIT_REASON = 0x40000L;
    private static final long OPT_BIT_ENTERER = 0x80000L;
    private static final long OPT_BIT_PRODUCT_CODEABLE_CONCEPT = 0x100000L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x200000L;
    private static final long OPT_BIT_PRICE_OVERRIDE = 0x400000L;
    private static final long OPT_BIT_ENTERED_DATE = 0x800000L;
    private static final long OPT_BIT_DEFINITION_URI = 0x1000000L;
    private static final long OPT_BIT_OVERRIDE_REASON = 0x2000000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000000L;
    private static final long OPT_BIT_ACCOUNT = 0x8000000L;
    private static final long OPT_BIT_EXTENSION = 0x10000000L;
    private static final long OPT_BIT_COST_CENTER = 0x20000000L;
    private static final long OPT_BIT_FACTOR_OVERRIDE = 0x40000000L;
    private static final long OPT_BIT_CONTEXT = 0x80000000L;
    private static final long OPT_BIT_ID = 0x100000000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x200000000L;
    private static final long OPT_BIT_DEFINITION_CANONICAL = 0x400000000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Reference productReference;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable java.lang.String occurrenceDateTime;
    private @javax.annotation.Nullable com.fhir.Reference performingOrganization;
    private @javax.annotation.Nullable java.util.List<com.fhir.ChargeItem_Performer> performer;
    private @javax.annotation.Nullable com.fhir.Reference requestingOrganization;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable com.fhir.ChargeitemStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodysite;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> service;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInformation;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reason;
    private @javax.annotation.Nullable com.fhir.Reference enterer;
    private @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
    private @javax.annotation.Nullable com.fhir.Money priceOverride;
    private @javax.annotation.Nullable com.fhir.dateTime enteredDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> definitionUri;
    private @javax.annotation.Nullable java.lang.String overrideReason;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> account;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference costCenter;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.decimal factorOverride;
    private @javax.annotation.Nullable com.fhir.Reference context;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> definitionCanonical;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ChargeItem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ChargeItem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ChargeItem#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder productReference(com.fhir.Reference productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = java.util.Objects.requireNonNull(productReference, "productReference");
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productReference")
    public final Builder productReference(java.util.Optional<? extends com.fhir.Reference> productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = productReference.orElse(null);
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#text() text} to text.
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
     * Initializes the optional value {@link ChargeItem#text() text} to text.
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
     * Initializes the optional value {@link ChargeItem#contained() contained} to contained.
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
     * Initializes the optional value {@link ChargeItem#contained() contained} to contained.
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
     * Initializes the optional value {@link ChargeItem#meta() meta} to meta.
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
     * Initializes the optional value {@link ChargeItem#meta() meta} to meta.
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
     * Initializes the optional value {@link ChargeItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(com.fhir.Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(java.util.Optional<? extends com.fhir.Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(java.lang.String occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = java.util.Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#performingOrganization() performingOrganization} to performingOrganization.
     * @param performingOrganization The value for performingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder performingOrganization(com.fhir.Reference performingOrganization) {
      checkNotIsSet(performingOrganizationIsSet(), "performingOrganization");
      this.performingOrganization = java.util.Objects.requireNonNull(performingOrganization, "performingOrganization");
      optBits |= OPT_BIT_PERFORMING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#performingOrganization() performingOrganization} to performingOrganization.
     * @param performingOrganization The value for performingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performingOrganization")
    public final Builder performingOrganization(java.util.Optional<? extends com.fhir.Reference> performingOrganization) {
      checkNotIsSet(performingOrganizationIsSet(), "performingOrganization");
      this.performingOrganization = performingOrganization.orElse(null);
      optBits |= OPT_BIT_PERFORMING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.ChargeItem_Performer> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.ChargeItem_Performer>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#requestingOrganization() requestingOrganization} to requestingOrganization.
     * @param requestingOrganization The value for requestingOrganization
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestingOrganization(com.fhir.Reference requestingOrganization) {
      checkNotIsSet(requestingOrganizationIsSet(), "requestingOrganization");
      this.requestingOrganization = java.util.Objects.requireNonNull(requestingOrganization, "requestingOrganization");
      optBits |= OPT_BIT_REQUESTING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#requestingOrganization() requestingOrganization} to requestingOrganization.
     * @param requestingOrganization The value for requestingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestingOrganization")
    public final Builder requestingOrganization(java.util.Optional<? extends com.fhir.Reference> requestingOrganization) {
      checkNotIsSet(requestingOrganizationIsSet(), "requestingOrganization");
      this.requestingOrganization = requestingOrganization.orElse(null);
      optBits |= OPT_BIT_REQUESTING_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ChargeItem#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ChargeItem#note() note} to note.
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
     * Initializes the optional value {@link ChargeItem#note() note} to note.
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
     * Initializes the value for the {@link ChargeItem#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ChargeitemStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ChargeitemStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#bodysite() bodysite} to bodysite.
     * @param bodysite The value for bodysite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodysite(java.util.List<com.fhir.CodeableConcept> bodysite) {
      checkNotIsSet(bodysiteIsSet(), "bodysite");
      this.bodysite = java.util.Objects.requireNonNull(bodysite, "bodysite");
      optBits |= OPT_BIT_BODYSITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#bodysite() bodysite} to bodysite.
     * @param bodysite The value for bodysite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodysite")
    public final Builder bodysite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodysite) {
      checkNotIsSet(bodysiteIsSet(), "bodysite");
      this.bodysite = bodysite.orElse(null);
      optBits |= OPT_BIT_BODYSITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for chained invocation
     */
    public final Builder service(java.util.List<com.fhir.Reference> service) {
      checkNotIsSet(serviceIsSet(), "service");
      this.service = java.util.Objects.requireNonNull(service, "service");
      optBits |= OPT_BIT_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    public final Builder service(java.util.Optional<? extends java.util.List<com.fhir.Reference>> service) {
      checkNotIsSet(serviceIsSet(), "service");
      this.service = service.orElse(null);
      optBits |= OPT_BIT_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(java.util.List<com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInformation(java.util.List<com.fhir.Reference> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = java.util.Objects.requireNonNull(supportingInformation, "supportingInformation");
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInformation")
    public final Builder supportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInformation) {
      checkNotIsSet(supportingInformationIsSet(), "supportingInformation");
      this.supportingInformation = supportingInformation.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFORMATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeItem#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ChargeItem#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(java.util.List<com.fhir.CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = java.util.Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public final Builder reason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    public final Builder enterer(com.fhir.Reference enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = java.util.Objects.requireNonNull(enterer, "enterer");
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enterer")
    public final Builder enterer(java.util.Optional<? extends com.fhir.Reference> enterer) {
      checkNotIsSet(entererIsSet(), "enterer");
      this.enterer = enterer.orElse(null);
      optBits |= OPT_BIT_ENTERER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCodeableConcept(com.fhir.CodeableConcept productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = java.util.Objects.requireNonNull(productCodeableConcept, "productCodeableConcept");
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productCodeableConcept")
    public final Builder productCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = productCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceTiming(com.fhir.Timing occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = java.util.Objects.requireNonNull(occurrenceTiming, "occurrenceTiming");
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
    public final Builder occurrenceTiming(java.util.Optional<? extends com.fhir.Timing> occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = occurrenceTiming.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#priceOverride() priceOverride} to priceOverride.
     * @param priceOverride The value for priceOverride
     * @return {@code this} builder for chained invocation
     */
    public final Builder priceOverride(com.fhir.Money priceOverride) {
      checkNotIsSet(priceOverrideIsSet(), "priceOverride");
      this.priceOverride = java.util.Objects.requireNonNull(priceOverride, "priceOverride");
      optBits |= OPT_BIT_PRICE_OVERRIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#priceOverride() priceOverride} to priceOverride.
     * @param priceOverride The value for priceOverride
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priceOverride")
    public final Builder priceOverride(java.util.Optional<? extends com.fhir.Money> priceOverride) {
      checkNotIsSet(priceOverrideIsSet(), "priceOverride");
      this.priceOverride = priceOverride.orElse(null);
      optBits |= OPT_BIT_PRICE_OVERRIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#enteredDate() enteredDate} to enteredDate.
     * @param enteredDate The value for enteredDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder enteredDate(com.fhir.dateTime enteredDate) {
      checkNotIsSet(enteredDateIsSet(), "enteredDate");
      this.enteredDate = java.util.Objects.requireNonNull(enteredDate, "enteredDate");
      optBits |= OPT_BIT_ENTERED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#enteredDate() enteredDate} to enteredDate.
     * @param enteredDate The value for enteredDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enteredDate")
    public final Builder enteredDate(java.util.Optional<? extends com.fhir.dateTime> enteredDate) {
      checkNotIsSet(enteredDateIsSet(), "enteredDate");
      this.enteredDate = enteredDate.orElse(null);
      optBits |= OPT_BIT_ENTERED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionUri(java.util.List<com.fhir.uri> definitionUri) {
      checkNotIsSet(definitionUriIsSet(), "definitionUri");
      this.definitionUri = java.util.Objects.requireNonNull(definitionUri, "definitionUri");
      optBits |= OPT_BIT_DEFINITION_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definitionUri")
    public final Builder definitionUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> definitionUri) {
      checkNotIsSet(definitionUriIsSet(), "definitionUri");
      this.definitionUri = definitionUri.orElse(null);
      optBits |= OPT_BIT_DEFINITION_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#overrideReason() overrideReason} to overrideReason.
     * @param overrideReason The value for overrideReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder overrideReason(java.lang.String overrideReason) {
      checkNotIsSet(overrideReasonIsSet(), "overrideReason");
      this.overrideReason = java.util.Objects.requireNonNull(overrideReason, "overrideReason");
      optBits |= OPT_BIT_OVERRIDE_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#overrideReason() overrideReason} to overrideReason.
     * @param overrideReason The value for overrideReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overrideReason")
    public final Builder overrideReason(java.util.Optional<java.lang.String> overrideReason) {
      checkNotIsSet(overrideReasonIsSet(), "overrideReason");
      this.overrideReason = overrideReason.orElse(null);
      optBits |= OPT_BIT_OVERRIDE_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#language() language} to language.
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
     * Initializes the optional value {@link ChargeItem#language() language} to language.
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
     * Initializes the optional value {@link ChargeItem#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    public final Builder account(java.util.List<com.fhir.Reference> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = java.util.Objects.requireNonNull(account, "account");
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("account")
    public final Builder account(java.util.Optional<? extends java.util.List<com.fhir.Reference>> account) {
      checkNotIsSet(accountIsSet(), "account");
      this.account = account.orElse(null);
      optBits |= OPT_BIT_ACCOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItem#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItem#costCenter() costCenter} to costCenter.
     * @param costCenter The value for costCenter
     * @return {@code this} builder for chained invocation
     */
    public final Builder costCenter(com.fhir.Reference costCenter) {
      checkNotIsSet(costCenterIsSet(), "costCenter");
      this.costCenter = java.util.Objects.requireNonNull(costCenter, "costCenter");
      optBits |= OPT_BIT_COST_CENTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#costCenter() costCenter} to costCenter.
     * @param costCenter The value for costCenter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("costCenter")
    public final Builder costCenter(java.util.Optional<? extends com.fhir.Reference> costCenter) {
      checkNotIsSet(costCenterIsSet(), "costCenter");
      this.costCenter = costCenter.orElse(null);
      optBits |= OPT_BIT_COST_CENTER;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeItem#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#factorOverride() factorOverride} to factorOverride.
     * @param factorOverride The value for factorOverride
     * @return {@code this} builder for chained invocation
     */
    public final Builder factorOverride(com.fhir.decimal factorOverride) {
      checkNotIsSet(factorOverrideIsSet(), "factorOverride");
      this.factorOverride = java.util.Objects.requireNonNull(factorOverride, "factorOverride");
      optBits |= OPT_BIT_FACTOR_OVERRIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#factorOverride() factorOverride} to factorOverride.
     * @param factorOverride The value for factorOverride
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("factorOverride")
    public final Builder factorOverride(java.util.Optional<? extends com.fhir.decimal> factorOverride) {
      checkNotIsSet(factorOverrideIsSet(), "factorOverride");
      this.factorOverride = factorOverride.orElse(null);
      optBits |= OPT_BIT_FACTOR_OVERRIDE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(com.fhir.Reference context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = java.util.Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public final Builder context(java.util.Optional<? extends com.fhir.Reference> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#id() id} to id.
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
     * Initializes the optional value {@link ChargeItem#id() id} to id.
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
     * Initializes the optional value {@link ChargeItem#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrencePeriod(com.fhir.Period occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = java.util.Objects.requireNonNull(occurrencePeriod, "occurrencePeriod");
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public final Builder occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = occurrencePeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder definitionCanonical(java.util.List<com.fhir.canonical> definitionCanonical) {
      checkNotIsSet(definitionCanonicalIsSet(), "definitionCanonical");
      this.definitionCanonical = java.util.Objects.requireNonNull(definitionCanonical, "definitionCanonical");
      optBits |= OPT_BIT_DEFINITION_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItem#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definitionCanonical")
    public final Builder definitionCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> definitionCanonical) {
      checkNotIsSet(definitionCanonicalIsSet(), "definitionCanonical");
      this.definitionCanonical = definitionCanonical.orElse(null);
      optBits |= OPT_BIT_DEFINITION_CANONICAL;
      return this;
    }

    /**
     * Builds a new {@link ChargeItem ChargeItem}.
     * @return An immutable instance of ChargeItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ChargeItem build() {
      checkRequiredAttributes();
      return new ImmutableChargeItem(
          implicitRules,
          productReference,
          text,
          contained,
          meta,
          quantity,
          occurrenceDateTime,
          performingOrganization,
          performer,
          requestingOrganization,
          modifierExtension,
          identifier,
          note,
          subject,
          status,
          bodysite,
          service,
          partOf,
          supportingInformation,
          resourceType,
          reason,
          enterer,
          productCodeableConcept,
          occurrenceTiming,
          priceOverride,
          enteredDate,
          definitionUri,
          overrideReason,
          language,
          account,
          extension,
          costCenter,
          code,
          factorOverride,
          context,
          id,
          occurrencePeriod,
          definitionCanonical);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean productReferenceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_REFERENCE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean performingOrganizationIsSet() {
      return (optBits & OPT_BIT_PERFORMING_ORGANIZATION) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean requestingOrganizationIsSet() {
      return (optBits & OPT_BIT_REQUESTING_ORGANIZATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean bodysiteIsSet() {
      return (optBits & OPT_BIT_BODYSITE) != 0;
    }

    private boolean serviceIsSet() {
      return (optBits & OPT_BIT_SERVICE) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean supportingInformationIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFORMATION) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean entererIsSet() {
      return (optBits & OPT_BIT_ENTERER) != 0;
    }

    private boolean productCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CODEABLE_CONCEPT) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean priceOverrideIsSet() {
      return (optBits & OPT_BIT_PRICE_OVERRIDE) != 0;
    }

    private boolean enteredDateIsSet() {
      return (optBits & OPT_BIT_ENTERED_DATE) != 0;
    }

    private boolean definitionUriIsSet() {
      return (optBits & OPT_BIT_DEFINITION_URI) != 0;
    }

    private boolean overrideReasonIsSet() {
      return (optBits & OPT_BIT_OVERRIDE_REASON) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean accountIsSet() {
      return (optBits & OPT_BIT_ACCOUNT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean costCenterIsSet() {
      return (optBits & OPT_BIT_COST_CENTER) != 0;
    }

    private boolean factorOverrideIsSet() {
      return (optBits & OPT_BIT_FACTOR_OVERRIDE) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean definitionCanonicalIsSet() {
      return (optBits & OPT_BIT_DEFINITION_CANONICAL) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ChargeItem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build ChargeItem, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ChargeItem", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link ChargeItem#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "ChargeItem", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ChargeItem#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    CodeBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ChargeItem", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link ChargeItem#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);
  }

  @org.immutables.value.Generated(from = "ChargeItem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ChargeItem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ChargeItem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ChargeItem#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productReference(com.fhir.Reference productReference);

    /**
     * Initializes the optional value {@link ChargeItem#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productReference(java.util.Optional<? extends com.fhir.Reference> productReference);

    /**
     * Initializes the optional value {@link ChargeItem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ChargeItem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ChargeItem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ChargeItem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ChargeItem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ChargeItem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ChargeItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link ChargeItem#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(java.lang.String occurrenceDateTime);

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link ChargeItem#performingOrganization() performingOrganization} to performingOrganization.
     * @param performingOrganization The value for performingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performingOrganization(com.fhir.Reference performingOrganization);

    /**
     * Initializes the optional value {@link ChargeItem#performingOrganization() performingOrganization} to performingOrganization.
     * @param performingOrganization The value for performingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performingOrganization(java.util.Optional<? extends com.fhir.Reference> performingOrganization);

    /**
     * Initializes the optional value {@link ChargeItem#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.ChargeItem_Performer> performer);

    /**
     * Initializes the optional value {@link ChargeItem#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.ChargeItem_Performer>> performer);

    /**
     * Initializes the optional value {@link ChargeItem#requestingOrganization() requestingOrganization} to requestingOrganization.
     * @param requestingOrganization The value for requestingOrganization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestingOrganization(com.fhir.Reference requestingOrganization);

    /**
     * Initializes the optional value {@link ChargeItem#requestingOrganization() requestingOrganization} to requestingOrganization.
     * @param requestingOrganization The value for requestingOrganization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestingOrganization(java.util.Optional<? extends com.fhir.Reference> requestingOrganization);

    /**
     * Initializes the optional value {@link ChargeItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ChargeItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ChargeItem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ChargeItem#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ChargeItem#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link ChargeItem#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link ChargeItem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ChargeitemStatus status);

    /**
     * Initializes the optional value {@link ChargeItem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ChargeitemStatus> status);

    /**
     * Initializes the optional value {@link ChargeItem#bodysite() bodysite} to bodysite.
     * @param bodysite The value for bodysite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodysite(java.util.List<com.fhir.CodeableConcept> bodysite);

    /**
     * Initializes the optional value {@link ChargeItem#bodysite() bodysite} to bodysite.
     * @param bodysite The value for bodysite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodysite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodysite);

    /**
     * Initializes the optional value {@link ChargeItem#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for chained invocation
     */
    BuildFinal service(java.util.List<com.fhir.Reference> service);

    /**
     * Initializes the optional value {@link ChargeItem#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal service(java.util.Optional<? extends java.util.List<com.fhir.Reference>> service);

    /**
     * Initializes the optional value {@link ChargeItem#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link ChargeItem#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link ChargeItem#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInformation(java.util.List<com.fhir.Reference> supportingInformation);

    /**
     * Initializes the optional value {@link ChargeItem#supportingInformation() supportingInformation} to supportingInformation.
     * @param supportingInformation The value for supportingInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInformation(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInformation);

    /**
     * Initializes the optional value {@link ChargeItem#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(java.util.List<com.fhir.CodeableConcept> reason);

    /**
     * Initializes the optional value {@link ChargeItem#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reason);

    /**
     * Initializes the optional value {@link ChargeItem#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enterer(com.fhir.Reference enterer);

    /**
     * Initializes the optional value {@link ChargeItem#enterer() enterer} to enterer.
     * @param enterer The value for enterer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enterer(java.util.Optional<? extends com.fhir.Reference> enterer);

    /**
     * Initializes the optional value {@link ChargeItem#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productCodeableConcept(com.fhir.CodeableConcept productCodeableConcept);

    /**
     * Initializes the optional value {@link ChargeItem#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> productCodeableConcept);

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(com.fhir.Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link ChargeItem#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(java.util.Optional<? extends com.fhir.Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link ChargeItem#priceOverride() priceOverride} to priceOverride.
     * @param priceOverride The value for priceOverride
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priceOverride(com.fhir.Money priceOverride);

    /**
     * Initializes the optional value {@link ChargeItem#priceOverride() priceOverride} to priceOverride.
     * @param priceOverride The value for priceOverride
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priceOverride(java.util.Optional<? extends com.fhir.Money> priceOverride);

    /**
     * Initializes the optional value {@link ChargeItem#enteredDate() enteredDate} to enteredDate.
     * @param enteredDate The value for enteredDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enteredDate(com.fhir.dateTime enteredDate);

    /**
     * Initializes the optional value {@link ChargeItem#enteredDate() enteredDate} to enteredDate.
     * @param enteredDate The value for enteredDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enteredDate(java.util.Optional<? extends com.fhir.dateTime> enteredDate);

    /**
     * Initializes the optional value {@link ChargeItem#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definitionUri(java.util.List<com.fhir.uri> definitionUri);

    /**
     * Initializes the optional value {@link ChargeItem#definitionUri() definitionUri} to definitionUri.
     * @param definitionUri The value for definitionUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definitionUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> definitionUri);

    /**
     * Initializes the optional value {@link ChargeItem#overrideReason() overrideReason} to overrideReason.
     * @param overrideReason The value for overrideReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal overrideReason(java.lang.String overrideReason);

    /**
     * Initializes the optional value {@link ChargeItem#overrideReason() overrideReason} to overrideReason.
     * @param overrideReason The value for overrideReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal overrideReason(java.util.Optional<java.lang.String> overrideReason);

    /**
     * Initializes the optional value {@link ChargeItem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ChargeItem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ChargeItem#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for chained invocation
     */
    BuildFinal account(java.util.List<com.fhir.Reference> account);

    /**
     * Initializes the optional value {@link ChargeItem#account() account} to account.
     * @param account The value for account
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal account(java.util.Optional<? extends java.util.List<com.fhir.Reference>> account);

    /**
     * Initializes the optional value {@link ChargeItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ChargeItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ChargeItem#costCenter() costCenter} to costCenter.
     * @param costCenter The value for costCenter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal costCenter(com.fhir.Reference costCenter);

    /**
     * Initializes the optional value {@link ChargeItem#costCenter() costCenter} to costCenter.
     * @param costCenter The value for costCenter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal costCenter(java.util.Optional<? extends com.fhir.Reference> costCenter);

    /**
     * Initializes the optional value {@link ChargeItem#factorOverride() factorOverride} to factorOverride.
     * @param factorOverride The value for factorOverride
     * @return {@code this} builder for chained invocation
     */
    BuildFinal factorOverride(com.fhir.decimal factorOverride);

    /**
     * Initializes the optional value {@link ChargeItem#factorOverride() factorOverride} to factorOverride.
     * @param factorOverride The value for factorOverride
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal factorOverride(java.util.Optional<? extends com.fhir.decimal> factorOverride);

    /**
     * Initializes the optional value {@link ChargeItem#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(com.fhir.Reference context);

    /**
     * Initializes the optional value {@link ChargeItem#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(java.util.Optional<? extends com.fhir.Reference> context);

    /**
     * Initializes the optional value {@link ChargeItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ChargeItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ChargeItem#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(com.fhir.Period occurrencePeriod);

    /**
     * Initializes the optional value {@link ChargeItem#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link ChargeItem#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definitionCanonical(java.util.List<com.fhir.canonical> definitionCanonical);

    /**
     * Initializes the optional value {@link ChargeItem#definitionCanonical() definitionCanonical} to definitionCanonical.
     * @param definitionCanonical The value for definitionCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definitionCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> definitionCanonical);

    /**
     * Builds a new {@link ChargeItem ChargeItem}.
     * @return An immutable instance of ChargeItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ChargeItem build();
  }
}
