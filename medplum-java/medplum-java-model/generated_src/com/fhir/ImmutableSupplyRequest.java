//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SupplyRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSupplyRequest.builder()}.
 */
@org.immutables.value.Generated(from = "SupplyRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSupplyRequest implements com.fhir.SupplyRequest {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept itemCodeableConcept;
  private final @javax.annotation.Nullable java.lang.String occurrenceDateTime;
  private final @javax.annotation.Nullable com.fhir.Reference deliverFrom;
  private final @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
  private final @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supplier;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SupplyRequest_Parameter> parameter;
  private final com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable com.fhir.dateTime authoredOn;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference deliverTo;
  private final @javax.annotation.Nullable com.fhir.SupplyrequestStatus status;
  private final @javax.annotation.Nullable com.fhir.Reference itemReference;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept category;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Reference requester;

  private ImmutableSupplyRequest(
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.CodeableConcept itemCodeableConcept,
      @javax.annotation.Nullable java.lang.String occurrenceDateTime,
      @javax.annotation.Nullable com.fhir.Reference deliverFrom,
      @javax.annotation.Nullable com.fhir.Period occurrencePeriod,
      @javax.annotation.Nullable com.fhir.Timing occurrenceTiming,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supplier,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.SupplyRequest_Parameter> parameter,
      com.fhir.Quantity quantity,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable com.fhir.dateTime authoredOn,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference deliverTo,
      @javax.annotation.Nullable com.fhir.SupplyrequestStatus status,
      @javax.annotation.Nullable com.fhir.Reference itemReference,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept category,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Reference requester) {
    this.identifier = identifier;
    this.itemCodeableConcept = itemCodeableConcept;
    this.occurrenceDateTime = occurrenceDateTime;
    this.deliverFrom = deliverFrom;
    this.occurrencePeriod = occurrencePeriod;
    this.occurrenceTiming = occurrenceTiming;
    this.supplier = supplier;
    this.language = language;
    this.reasonReference = reasonReference;
    this.implicitRules = implicitRules;
    this.parameter = parameter;
    this.quantity = quantity;
    this.reasonCode = reasonCode;
    this.authoredOn = authoredOn;
    this.resourceType = resourceType;
    this.text = text;
    this.extension = extension;
    this.deliverTo = deliverTo;
    this.status = status;
    this.itemReference = itemReference;
    this.priority = priority;
    this.modifierExtension = modifierExtension;
    this.category = category;
    this.id = id;
    this.meta = meta;
    this.contained = contained;
    this.requester = requester;
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
   * @return The value of the {@code itemCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("itemCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> itemCodeableConcept() {
    return java.util.Optional.ofNullable(itemCodeableConcept);
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
   * @return The value of the {@code deliverFrom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deliverFrom")
  @Override
  public java.util.Optional<com.fhir.Reference> deliverFrom() {
    return java.util.Optional.ofNullable(deliverFrom);
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
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> occurrenceTiming() {
    return java.util.Optional.ofNullable(occurrenceTiming);
  }

  /**
   * @return The value of the {@code supplier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supplier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> supplier() {
    return java.util.Optional.ofNullable(supplier);
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
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code parameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parameter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SupplyRequest_Parameter>> parameter() {
    return java.util.Optional.ofNullable(parameter);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public com.fhir.Quantity quantity() {
    return quantity;
  }

  /**
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code authoredOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
  @Override
  public java.util.Optional<com.fhir.dateTime> authoredOn() {
    return java.util.Optional.ofNullable(authoredOn);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code deliverTo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("deliverTo")
  @Override
  public java.util.Optional<com.fhir.Reference> deliverTo() {
    return java.util.Optional.ofNullable(deliverTo);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.SupplyrequestStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code itemReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("itemReference")
  @Override
  public java.util.Optional<com.fhir.Reference> itemReference() {
    return java.util.Optional.ofNullable(itemReference);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code requester} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requester")
  @Override
  public java.util.Optional<com.fhir.Reference> requester() {
    return java.util.Optional.ofNullable(requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSupplyRequest(
        newValue,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSupplyRequest(
        value,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} attribute.
   * @param value The value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withItemCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "itemCodeableConcept");
    if (this.itemCodeableConcept == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        newValue,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withItemCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.itemCodeableConcept == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        value,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withOccurrenceDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (java.util.Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        newValue,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withOccurrenceDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        value,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#deliverFrom() deliverFrom} attribute.
   * @param value The value for deliverFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withDeliverFrom(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "deliverFrom");
    if (this.deliverFrom == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        newValue,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#deliverFrom() deliverFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deliverFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withDeliverFrom(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.deliverFrom == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        value,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withOccurrencePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        newValue,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withOccurrencePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        value,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withOccurrenceTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        newValue,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withOccurrenceTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        value,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#supplier() supplier} attribute.
   * @param value The value for supplier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withSupplier(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supplier");
    if (this.supplier == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        newValue,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#supplier() supplier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withSupplier(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supplier == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        value,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        newValue,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        value,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        newValue,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        value,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        newValue,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        value,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withParameter(java.util.List<com.fhir.SupplyRequest_Parameter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SupplyRequest_Parameter> newValue = java.util.Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        newValue,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withParameter(java.util.Optional<? extends java.util.List<com.fhir.SupplyRequest_Parameter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SupplyRequest_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        value,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SupplyRequest#quantity() quantity} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quantity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSupplyRequest withQuantity(com.fhir.Quantity value) {
    if (this.quantity == value) return this;
    com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        newValue,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        newValue,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        value,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withAuthoredOn(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        newValue,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withAuthoredOn(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        value,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SupplyRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSupplyRequest withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        newValue,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        newValue,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        value,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        newValue,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        value,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#deliverTo() deliverTo} attribute.
   * @param value The value for deliverTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withDeliverTo(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "deliverTo");
    if (this.deliverTo == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        newValue,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#deliverTo() deliverTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deliverTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withDeliverTo(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.deliverTo == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        value,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withStatus(com.fhir.SupplyrequestStatus value) {
    @javax.annotation.Nullable com.fhir.SupplyrequestStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        newValue,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withStatus(java.util.Optional<? extends com.fhir.SupplyrequestStatus> optional) {
    @javax.annotation.Nullable com.fhir.SupplyrequestStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        value,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#itemReference() itemReference} attribute.
   * @param value The value for itemReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withItemReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "itemReference");
    if (this.itemReference == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        newValue,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#itemReference() itemReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withItemReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.itemReference == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        value,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        newValue,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        value,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        newValue,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        value,
        this.category,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withCategory(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        newValue,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withCategory(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        value,
        this.id,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        newValue,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        value,
        this.meta,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        newValue,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        value,
        this.contained,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        newValue,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        value,
        this.requester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SupplyRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSupplyRequest withRequester(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SupplyRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSupplyRequest withRequester(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableSupplyRequest(
        this.identifier,
        this.itemCodeableConcept,
        this.occurrenceDateTime,
        this.deliverFrom,
        this.occurrencePeriod,
        this.occurrenceTiming,
        this.supplier,
        this.language,
        this.reasonReference,
        this.implicitRules,
        this.parameter,
        this.quantity,
        this.reasonCode,
        this.authoredOn,
        this.resourceType,
        this.text,
        this.extension,
        this.deliverTo,
        this.status,
        this.itemReference,
        this.priority,
        this.modifierExtension,
        this.category,
        this.id,
        this.meta,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSupplyRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSupplyRequest
        && equalTo((ImmutableSupplyRequest) another);
  }

  private boolean equalTo(ImmutableSupplyRequest another) {
    return java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(itemCodeableConcept, another.itemCodeableConcept)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && java.util.Objects.equals(deliverFrom, another.deliverFrom)
        && java.util.Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && java.util.Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && java.util.Objects.equals(supplier, another.supplier)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(parameter, another.parameter)
        && quantity.equals(another.quantity)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(authoredOn, another.authoredOn)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(deliverTo, another.deliverTo)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(itemReference, another.itemReference)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(requester, another.requester);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code itemCodeableConcept}, {@code occurrenceDateTime}, {@code deliverFrom}, {@code occurrencePeriod}, {@code occurrenceTiming}, {@code supplier}, {@code language}, {@code reasonReference}, {@code implicitRules}, {@code parameter}, {@code quantity}, {@code reasonCode}, {@code authoredOn}, {@code resourceType}, {@code text}, {@code extension}, {@code deliverTo}, {@code status}, {@code itemReference}, {@code priority}, {@code modifierExtension}, {@code category}, {@code id}, {@code meta}, {@code contained}, {@code requester}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(itemCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + java.util.Objects.hashCode(deliverFrom);
    h += (h << 5) + java.util.Objects.hashCode(occurrencePeriod);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceTiming);
    h += (h << 5) + java.util.Objects.hashCode(supplier);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(parameter);
    h += (h << 5) + quantity.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(authoredOn);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(deliverTo);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(itemReference);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(requester);
    return h;
  }

  /**
   * Prints the immutable value {@code SupplyRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SupplyRequest{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (itemCodeableConcept != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("itemCodeableConcept=").append(itemCodeableConcept);
    }
    if (occurrenceDateTime != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (deliverFrom != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("deliverFrom=").append(deliverFrom);
    }
    if (occurrencePeriod != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (occurrenceTiming != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (supplier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("supplier=").append(supplier);
    }
    if (language != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (reasonReference != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (implicitRules != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (parameter != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("quantity=").append(quantity);
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (authoredOn != null) {
      builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (deliverTo != null) {
      builder.append(", ");
      builder.append("deliverTo=").append(deliverTo);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (itemReference != null) {
      builder.append(", ");
      builder.append("itemReference=").append(itemReference);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (requester != null) {
      builder.append(", ");
      builder.append("requester=").append(requester);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SupplyRequest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SupplyRequest {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> itemCodeableConcept = java.util.Optional.empty();
    boolean itemCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> deliverFrom = java.util.Optional.empty();
    boolean deliverFromIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> occurrencePeriod = java.util.Optional.empty();
    boolean occurrencePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> occurrenceTiming = java.util.Optional.empty();
    boolean occurrenceTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supplier = java.util.Optional.empty();
    boolean supplierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SupplyRequest_Parameter>> parameter = java.util.Optional.empty();
    boolean parameterIsSet;
    @javax.annotation.Nullable com.fhir.Quantity quantity;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> authoredOn = java.util.Optional.empty();
    boolean authoredOnIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> deliverTo = java.util.Optional.empty();
    boolean deliverToIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SupplyrequestStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> itemReference = java.util.Optional.empty();
    boolean itemReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requester = java.util.Optional.empty();
    boolean requesterIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("itemCodeableConcept")
    public void setItemCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> itemCodeableConcept) {
      this.itemCodeableConcept = itemCodeableConcept;
      this.itemCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deliverFrom")
    public void setDeliverFrom(java.util.Optional<com.fhir.Reference> deliverFrom) {
      this.deliverFrom = deliverFrom;
      this.deliverFromIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(java.util.Optional<com.fhir.Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(java.util.Optional<com.fhir.Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supplier")
    public void setSupplier(java.util.Optional<java.util.List<com.fhir.Reference>> supplier) {
      this.supplier = supplier;
      this.supplierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(java.util.Optional<java.util.List<com.fhir.SupplyRequest_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(com.fhir.Quantity quantity) {
      this.quantity = quantity;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public void setAuthoredOn(java.util.Optional<com.fhir.dateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("deliverTo")
    public void setDeliverTo(java.util.Optional<com.fhir.Reference> deliverTo) {
      this.deliverTo = deliverTo;
      this.deliverToIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.SupplyrequestStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("itemReference")
    public void setItemReference(java.util.Optional<com.fhir.Reference> itemReference) {
      this.itemReference = itemReference;
      this.itemReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<com.fhir.CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requester")
    public void setRequester(java.util.Optional<com.fhir.Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> itemCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> deliverFrom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supplier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SupplyRequest_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Quantity quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> deliverTo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SupplyrequestStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> itemReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requester() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSupplyRequest fromJson(Json json) {
    ImmutableSupplyRequest.Builder builder = ((ImmutableSupplyRequest.Builder) ImmutableSupplyRequest.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.itemCodeableConceptIsSet) {
      builder.itemCodeableConcept(json.itemCodeableConcept);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.deliverFromIsSet) {
      builder.deliverFrom(json.deliverFrom);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.supplierIsSet) {
      builder.supplier(json.supplier);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.quantity != null) {
      builder.quantity(json.quantity);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.deliverToIsSet) {
      builder.deliverTo(json.deliverTo);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.itemReferenceIsSet) {
      builder.itemReference(json.itemReference);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    return (ImmutableSupplyRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SupplyRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SupplyRequest instance
   */
  public static SupplyRequest copyOf(SupplyRequest instance) {
    if (instance instanceof ImmutableSupplyRequest) {
      return (ImmutableSupplyRequest) instance;
    }
    return ((ImmutableSupplyRequest.Builder) ImmutableSupplyRequest.builder())
        .identifier(instance.identifier())
        .itemCodeableConcept(instance.itemCodeableConcept())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .deliverFrom(instance.deliverFrom())
        .occurrencePeriod(instance.occurrencePeriod())
        .occurrenceTiming(instance.occurrenceTiming())
        .supplier(instance.supplier())
        .language(instance.language())
        .reasonReference(instance.reasonReference())
        .implicitRules(instance.implicitRules())
        .parameter(instance.parameter())
        .quantity(instance.quantity())
        .reasonCode(instance.reasonCode())
        .authoredOn(instance.authoredOn())
        .resourceType(instance.resourceType())
        .text(instance.text())
        .extension(instance.extension())
        .deliverTo(instance.deliverTo())
        .status(instance.status())
        .itemReference(instance.itemReference())
        .priority(instance.priority())
        .modifierExtension(instance.modifierExtension())
        .category(instance.category())
        .id(instance.id())
        .meta(instance.meta())
        .contained(instance.contained())
        .requester(instance.requester())
        .build();
  }

  /**
   * Creates a builder for {@link SupplyRequest SupplyRequest}.
   * <pre>
   * ImmutableSupplyRequest.builder()
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link SupplyRequest#identifier() identifier}
   *    .itemCodeableConcept(com.fhir.CodeableConcept) // optional {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept}
   *    .occurrenceDateTime(String) // optional {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime}
   *    .deliverFrom(com.fhir.Reference) // optional {@link SupplyRequest#deliverFrom() deliverFrom}
   *    .occurrencePeriod(com.fhir.Period) // optional {@link SupplyRequest#occurrencePeriod() occurrencePeriod}
   *    .occurrenceTiming(com.fhir.Timing) // optional {@link SupplyRequest#occurrenceTiming() occurrenceTiming}
   *    .supplier(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SupplyRequest#supplier() supplier}
   *    .language(com.fhir.code) // optional {@link SupplyRequest#language() language}
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SupplyRequest#reasonReference() reasonReference}
   *    .implicitRules(com.fhir.uri) // optional {@link SupplyRequest#implicitRules() implicitRules}
   *    .parameter(List&amp;lt;com.fhir.SupplyRequest_Parameter&amp;gt;) // optional {@link SupplyRequest#parameter() parameter}
   *    .quantity(com.fhir.Quantity) // required {@link SupplyRequest#quantity() quantity}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link SupplyRequest#reasonCode() reasonCode}
   *    .authoredOn(com.fhir.dateTime) // optional {@link SupplyRequest#authoredOn() authoredOn}
   *    .resourceType(String) // required {@link SupplyRequest#resourceType() resourceType}
   *    .text(com.fhir.Narrative) // optional {@link SupplyRequest#text() text}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SupplyRequest#extension() extension}
   *    .deliverTo(com.fhir.Reference) // optional {@link SupplyRequest#deliverTo() deliverTo}
   *    .status(com.fhir.SupplyrequestStatus) // optional {@link SupplyRequest#status() status}
   *    .itemReference(com.fhir.Reference) // optional {@link SupplyRequest#itemReference() itemReference}
   *    .priority(com.fhir.code) // optional {@link SupplyRequest#priority() priority}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SupplyRequest#modifierExtension() modifierExtension}
   *    .category(com.fhir.CodeableConcept) // optional {@link SupplyRequest#category() category}
   *    .id(com.fhir.id) // optional {@link SupplyRequest#id() id}
   *    .meta(com.fhir.Meta) // optional {@link SupplyRequest#meta() meta}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SupplyRequest#contained() contained}
   *    .requester(com.fhir.Reference) // optional {@link SupplyRequest#requester() requester}
   *    .build();
   * </pre>
   * @return A new SupplyRequest builder
   */
  public static QuantityBuildStage builder() {
    return new ImmutableSupplyRequest.Builder();
  }

  /**
   * Builds instances of type {@link SupplyRequest SupplyRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SupplyRequest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements QuantityBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_QUANTITY = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_ITEM_CODEABLE_CONCEPT = 0x2L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x4L;
    private static final long OPT_BIT_DELIVER_FROM = 0x8L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x10L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x20L;
    private static final long OPT_BIT_SUPPLIER = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_PARAMETER = 0x400L;
    private static final long OPT_BIT_REASON_CODE = 0x800L;
    private static final long OPT_BIT_AUTHORED_ON = 0x1000L;
    private static final long OPT_BIT_TEXT = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_DELIVER_TO = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_ITEM_REFERENCE = 0x20000L;
    private static final long OPT_BIT_PRIORITY = 0x40000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000L;
    private static final long OPT_BIT_CATEGORY = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_META = 0x400000L;
    private static final long OPT_BIT_CONTAINED = 0x800000L;
    private static final long OPT_BIT_REQUESTER = 0x1000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept itemCodeableConcept;
    private @javax.annotation.Nullable java.lang.String occurrenceDateTime;
    private @javax.annotation.Nullable com.fhir.Reference deliverFrom;
    private @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
    private @javax.annotation.Nullable com.fhir.Timing occurrenceTiming;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supplier;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.SupplyRequest_Parameter> parameter;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable com.fhir.dateTime authoredOn;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference deliverTo;
    private @javax.annotation.Nullable com.fhir.SupplyrequestStatus status;
    private @javax.annotation.Nullable com.fhir.Reference itemReference;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept category;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Reference requester;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SupplyRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SupplyRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemCodeableConcept(com.fhir.CodeableConcept itemCodeableConcept) {
      checkNotIsSet(itemCodeableConceptIsSet(), "itemCodeableConcept");
      this.itemCodeableConcept = java.util.Objects.requireNonNull(itemCodeableConcept, "itemCodeableConcept");
      optBits |= OPT_BIT_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("itemCodeableConcept")
    public final Builder itemCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> itemCodeableConcept) {
      checkNotIsSet(itemCodeableConceptIsSet(), "itemCodeableConcept");
      this.itemCodeableConcept = itemCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link SupplyRequest#deliverFrom() deliverFrom} to deliverFrom.
     * @param deliverFrom The value for deliverFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder deliverFrom(com.fhir.Reference deliverFrom) {
      checkNotIsSet(deliverFromIsSet(), "deliverFrom");
      this.deliverFrom = java.util.Objects.requireNonNull(deliverFrom, "deliverFrom");
      optBits |= OPT_BIT_DELIVER_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#deliverFrom() deliverFrom} to deliverFrom.
     * @param deliverFrom The value for deliverFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deliverFrom")
    public final Builder deliverFrom(java.util.Optional<? extends com.fhir.Reference> deliverFrom) {
      checkNotIsSet(deliverFromIsSet(), "deliverFrom");
      this.deliverFrom = deliverFrom.orElse(null);
      optBits |= OPT_BIT_DELIVER_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link SupplyRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link SupplyRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link SupplyRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link SupplyRequest#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplier(java.util.List<com.fhir.Reference> supplier) {
      checkNotIsSet(supplierIsSet(), "supplier");
      this.supplier = java.util.Objects.requireNonNull(supplier, "supplier");
      optBits |= OPT_BIT_SUPPLIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supplier")
    public final Builder supplier(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supplier) {
      checkNotIsSet(supplierIsSet(), "supplier");
      this.supplier = supplier.orElse(null);
      optBits |= OPT_BIT_SUPPLIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#language() language} to language.
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
     * Initializes the optional value {@link SupplyRequest#language() language} to language.
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
     * Initializes the optional value {@link SupplyRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(java.util.List<com.fhir.Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = java.util.Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public final Builder reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SupplyRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SupplyRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(java.util.List<com.fhir.SupplyRequest_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = java.util.Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public final Builder parameter(java.util.Optional<? extends java.util.List<com.fhir.SupplyRequest_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the value for the {@link SupplyRequest#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(com.fhir.Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      initBits &= ~INIT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = java.util.Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public final Builder reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(com.fhir.dateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = java.util.Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public final Builder authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the value for the {@link SupplyRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SupplyRequest#text() text} to text.
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
     * Initializes the optional value {@link SupplyRequest#text() text} to text.
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
     * Initializes the optional value {@link SupplyRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link SupplyRequest#deliverTo() deliverTo} to deliverTo.
     * @param deliverTo The value for deliverTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder deliverTo(com.fhir.Reference deliverTo) {
      checkNotIsSet(deliverToIsSet(), "deliverTo");
      this.deliverTo = java.util.Objects.requireNonNull(deliverTo, "deliverTo");
      optBits |= OPT_BIT_DELIVER_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#deliverTo() deliverTo} to deliverTo.
     * @param deliverTo The value for deliverTo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deliverTo")
    public final Builder deliverTo(java.util.Optional<? extends com.fhir.Reference> deliverTo) {
      checkNotIsSet(deliverToIsSet(), "deliverTo");
      this.deliverTo = deliverTo.orElse(null);
      optBits |= OPT_BIT_DELIVER_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.SupplyrequestStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.SupplyrequestStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemReference(com.fhir.Reference itemReference) {
      checkNotIsSet(itemReferenceIsSet(), "itemReference");
      this.itemReference = java.util.Objects.requireNonNull(itemReference, "itemReference");
      optBits |= OPT_BIT_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("itemReference")
    public final Builder itemReference(java.util.Optional<? extends com.fhir.Reference> itemReference) {
      checkNotIsSet(itemReferenceIsSet(), "itemReference");
      this.itemReference = itemReference.orElse(null);
      optBits |= OPT_BIT_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SupplyRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(com.fhir.CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#id() id} to id.
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
     * Initializes the optional value {@link SupplyRequest#id() id} to id.
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
     * Initializes the optional value {@link SupplyRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link SupplyRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link SupplyRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link SupplyRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link SupplyRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(com.fhir.Reference requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = java.util.Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link SupplyRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requester")
    public final Builder requester(java.util.Optional<? extends com.fhir.Reference> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = requester.orElse(null);
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Builds a new {@link SupplyRequest SupplyRequest}.
     * @return An immutable instance of SupplyRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SupplyRequest build() {
      checkRequiredAttributes();
      return new ImmutableSupplyRequest(
          identifier,
          itemCodeableConcept,
          occurrenceDateTime,
          deliverFrom,
          occurrencePeriod,
          occurrenceTiming,
          supplier,
          language,
          reasonReference,
          implicitRules,
          parameter,
          quantity,
          reasonCode,
          authoredOn,
          resourceType,
          text,
          extension,
          deliverTo,
          status,
          itemReference,
          priority,
          modifierExtension,
          category,
          id,
          meta,
          contained,
          requester);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean itemCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ITEM_CODEABLE_CONCEPT) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean deliverFromIsSet() {
      return (optBits & OPT_BIT_DELIVER_FROM) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean supplierIsSet() {
      return (optBits & OPT_BIT_SUPPLIER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean deliverToIsSet() {
      return (optBits & OPT_BIT_DELIVER_TO) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean itemReferenceIsSet() {
      return (optBits & OPT_BIT_ITEM_REFERENCE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean quantityIsSet() {
      return (initBits & INIT_BIT_QUANTITY) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SupplyRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!quantityIsSet()) attributes.add("quantity");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SupplyRequest, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SupplyRequest", generator = "Immutables")
  public interface QuantityBuildStage {
    /**
     * Initializes the value for the {@link SupplyRequest#quantity() quantity} attribute.
     * @param quantity The value for quantity 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage quantity(com.fhir.Quantity quantity);
  }

  @org.immutables.value.Generated(from = "SupplyRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SupplyRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SupplyRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SupplyRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link SupplyRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal itemCodeableConcept(com.fhir.CodeableConcept itemCodeableConcept);

    /**
     * Initializes the optional value {@link SupplyRequest#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal itemCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> itemCodeableConcept);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(java.lang.String occurrenceDateTime);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link SupplyRequest#deliverFrom() deliverFrom} to deliverFrom.
     * @param deliverFrom The value for deliverFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deliverFrom(com.fhir.Reference deliverFrom);

    /**
     * Initializes the optional value {@link SupplyRequest#deliverFrom() deliverFrom} to deliverFrom.
     * @param deliverFrom The value for deliverFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deliverFrom(java.util.Optional<? extends com.fhir.Reference> deliverFrom);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(com.fhir.Period occurrencePeriod);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(com.fhir.Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link SupplyRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(java.util.Optional<? extends com.fhir.Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link SupplyRequest#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplier(java.util.List<com.fhir.Reference> supplier);

    /**
     * Initializes the optional value {@link SupplyRequest#supplier() supplier} to supplier.
     * @param supplier The value for supplier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplier(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supplier);

    /**
     * Initializes the optional value {@link SupplyRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SupplyRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link SupplyRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link SupplyRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link SupplyRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SupplyRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SupplyRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(java.util.List<com.fhir.SupplyRequest_Parameter> parameter);

    /**
     * Initializes the optional value {@link SupplyRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(java.util.Optional<? extends java.util.List<com.fhir.SupplyRequest_Parameter>> parameter);

    /**
     * Initializes the optional value {@link SupplyRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link SupplyRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link SupplyRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(com.fhir.dateTime authoredOn);

    /**
     * Initializes the optional value {@link SupplyRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn);

    /**
     * Initializes the optional value {@link SupplyRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SupplyRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SupplyRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SupplyRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SupplyRequest#deliverTo() deliverTo} to deliverTo.
     * @param deliverTo The value for deliverTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal deliverTo(com.fhir.Reference deliverTo);

    /**
     * Initializes the optional value {@link SupplyRequest#deliverTo() deliverTo} to deliverTo.
     * @param deliverTo The value for deliverTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal deliverTo(java.util.Optional<? extends com.fhir.Reference> deliverTo);

    /**
     * Initializes the optional value {@link SupplyRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.SupplyrequestStatus status);

    /**
     * Initializes the optional value {@link SupplyRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.SupplyrequestStatus> status);

    /**
     * Initializes the optional value {@link SupplyRequest#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal itemReference(com.fhir.Reference itemReference);

    /**
     * Initializes the optional value {@link SupplyRequest#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal itemReference(java.util.Optional<? extends com.fhir.Reference> itemReference);

    /**
     * Initializes the optional value {@link SupplyRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link SupplyRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

    /**
     * Initializes the optional value {@link SupplyRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SupplyRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SupplyRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(com.fhir.CodeableConcept category);

    /**
     * Initializes the optional value {@link SupplyRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link SupplyRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SupplyRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SupplyRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SupplyRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link SupplyRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SupplyRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SupplyRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(com.fhir.Reference requester);

    /**
     * Initializes the optional value {@link SupplyRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(java.util.Optional<? extends com.fhir.Reference> requester);

    /**
     * Builds a new {@link SupplyRequest SupplyRequest}.
     * @return An immutable instance of SupplyRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SupplyRequest build();
  }
}
